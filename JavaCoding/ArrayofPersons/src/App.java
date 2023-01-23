import java.util.Scanner;

import datamodel.Person;

public class App {
    public static void main(String[] args) throws Exception {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of person:");
        int c = sc.nextInt();
        sc.nextLine();
        Person[] persons = new Person[c];
        for(int i = 0; i < c; i++){
            System.out.println("Enter name of person:");
            name = sc.nextLine();
            System.out.println("Enter age of person:");
            age = sc.nextInt();
            sc.nextLine();
            Person p = new Person(name,age);
            persons[i] = p;
        }

        for(Person p : persons){
            System.out.println(p);
            System.out.println();
        }
        sc.close();
    }
}
