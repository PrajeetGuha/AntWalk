import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import connector.JDBC;
import model.Student;
import repository.StudentRepository;

public class App {

    static Scanner sc;
    static StudentRepository studentRepository;

    public static void main(String[] args) throws Exception {

        JDBC jdbc = new JDBC();
        studentRepository = new StudentRepository(jdbc.setConnection().getConnection());

        int operationOption;
        sc = new Scanner(System.in);
        do {
            System.out.println("\nChoose option: ");
            System.out.println("1. Insert Record");
            System.out.println("2. Update Record");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            operationOption = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (operationOption) {
                case 1:
                    insertOperation();
                    break;
                case 2:
                    updateOperation();
                case 3:
                    System.out.println("GoodByee!!");
                    break;
                default:
                    System.out.println("Wrong option choosen");
            }
        } while (operationOption != 3);
    }

    public static void insertOperation() {
        Student student = new Student();
        System.out.print("Enter name: ");
        student.setName(sc.nextLine());
        System.out.print("Enter age: ");
        student.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter email: ");
        student.setEmail(sc.nextLine());
        System.out.print("Enter phone: ");
        student.setPhone(sc.nextLine());

        try {
            studentRepository.insertData(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateOperation() {
        HashMap<String, String> updatedictionary = new HashMap<String, String>();
        int updateFieldOption;
        boolean fieldToUpdateChoosen = false;
        do {
            System.out.println("\nChoose the fields to update: ");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Email");
            System.out.println("4. Phone");
            if (fieldToUpdateChoosen) {
                System.out.println("5. Move forward to choosing condition");
                System.out.println("6. Exit");
            } else {
                System.out.println("5. Exit");
            }
            System.out.print("Enter option number: ");
            updateFieldOption = sc.nextInt();
            System.out.println();
            sc.nextLine();

            if (updateFieldOption >= 1 && updateFieldOption <= 4)
                fieldToUpdateChoosen = true;

            switch (updateFieldOption) {
                case 1:
                    System.out.print("Enter new name: ");
                    updatedictionary.put("name", sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new age: ");
                    updatedictionary.put("age", Integer.toString(sc.nextInt()));
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new email: ");
                    updatedictionary.put("email", sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter new phone: ");
                    updatedictionary.put("phone", sc.nextLine());
                    break;
                case 5:
                    if (fieldToUpdateChoosen)
                        conditionForUpdate(updatedictionary);
                    else
                        System.out.println("Back to Main Menu");
                    break;
                case 6:
                    if (fieldToUpdateChoosen)
                        System.out.println("Back to Main Menu");
                    else
                        System.out.println("Invalid option. Try again.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (updateFieldOption != 5 && updateFieldOption != 6);
    }

    public static void conditionForUpdate(HashMap<String, String> updatedDictionary) {
        boolean iscondition = false;
        int choice;

        do {
            System.out.println("\nChoose option: ");
            System.out.println("1. With a condition");
            System.out.println("2. Without a condition");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            System.out.println();
            sc.nextLine();

            if (choice == 1)
                iscondition = true;
            else if (choice == 2)
                iscondition = false;
            else
                System.out.println("Invalid option. Try again.");
        } while (choice != 1 && choice != 2);

        if (iscondition) {
            String condition = "";
            boolean prevLogic = false;
            int logicChoice;
            int connectorChoice;
            do {
                System.out.println("\nChoose column to add logic");
                System.out.println("1. ID");
                System.out.println("2. Name");
                System.out.println("3. Age");
                System.out.println("4. Email");
                System.out.println("5. Phone");
                if (prevLogic) {
                    System.out.println("6. Exit");
                }
                System.out.print("Enter option: ");
                logicChoice = sc.nextInt();
                System.out.println();
                sc.nextLine();

                if (prevLogic && (logicChoice >= 1 && logicChoice <= 5)) {
                    do {
                        System.out.println("Choose connector: ");
                        System.out.println("1. AND");
                        System.out.println("2. OR");
                        System.out.print("Enter option: ");
                        connectorChoice = sc.nextInt();
                        sc.nextLine();

                        switch (connectorChoice) {
                            case 1:
                                condition += " AND ";
                                break;
                            case 2:
                                condition += " OR ";
                                break;
                            default:
                                System.out.println("Wrong option. Try again.");
                        }
                    } while (connectorChoice != 1 && connectorChoice != 2);
                } else {
                    prevLogic = true;
                }

                switch (logicChoice) {
                    case 1:
                        System.out.print("Enter the ID to match: ");
                        condition = condition + "ID = " + sc.nextLine();
                        break;
                    case 2:
                        System.out.print("Enter the name characteristics: ");
                        condition = condition + "name = '" + sc.nextLine() + "'";
                        break;
                    case 3:
                        System.out.print("Enter the age: ");
                        condition = condition + "age = " + Integer.toString(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 4:
                        System.out.print("Enter the email characteristics: ");
                        condition = condition + "email = '" + sc.nextLine() + "'";
                        break;
                    case 5:
                        System.out.print("Enter the phone characteristics: ");
                        condition = condition + "phone = '" + sc.nextLine() + "'";
                        break;
                    case 6:
                        if (!prevLogic)
                            System.out.println("Invalid option.Try again.");
                        else {
                            System.out.println("Back To Main Menu");
                        }
                        break;
                    default:
                        System.out.println("Invalid Option. Try again.");
                }
            } while (logicChoice != 6 || !prevLogic);
            // System.out.println(condition);
            updatedDictionary.put("condition", condition);
        }
        try {
            studentRepository.updateData(updatedDictionary);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
