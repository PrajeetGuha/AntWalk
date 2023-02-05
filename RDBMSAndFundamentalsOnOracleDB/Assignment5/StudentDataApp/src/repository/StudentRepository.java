package repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import model.Student;

public class StudentRepository {

    private Connection connection;

    public StudentRepository(Connection connection) throws SQLException {
        this.connection = connection;
        String createTable = "CREATE TABLE IF NOT EXISTS Student( ID INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT, email VARCHAR(50), phone VARCHAR(10)); ";
        connection.createStatement().executeUpdate(createTable);
        System.out.println("Executed : " + createTable);
    }

    public void insertData(Student student) throws SQLException {
        String addRecord = "INSERT INTO Student(name, age, email, phone) VALUES('" + student.getName() + "', "
                + student.getAge() + ", '" + student.getEmail() + "', '" + student.getPhone() + "');";
        connection.createStatement().executeUpdate(addRecord);
        System.out.println("Record is added: "+addRecord);
        // System.out.println(addRecord);
    }

    public void updateData(HashMap<String, String> updateDictionary) throws SQLException {
        String updateRecord = "UPDATE Student SET";
        String[] fieldnames = { "name", "age", "email", "phone" };
        boolean fieldUpdatePresent = false;

        for (String s : fieldnames) {
            if (updateDictionary.containsKey(s)) {
                if (fieldUpdatePresent)
                    updateRecord += ",";
                updateRecord = updateRecord + " " + s + " = ";
                if (s.equals("age"))
                    updateRecord += updateDictionary.get(s);
                else
                    updateRecord = updateRecord + "'" + updateDictionary.get(s) + "'";
                fieldUpdatePresent = true;
            }
        }
        if (updateDictionary.containsKey("condition")) {
            updateRecord = updateRecord + " WHERE " + updateDictionary.get("condition");
        }
        updateRecord += ";";
        int res = connection.createStatement().executeUpdate(updateRecord);
        System.out.println("The number of records updated are : " + res);
        System.out.println("The query is: "+updateRecord);
        // System.out.println(updateRecord);

    }

}
