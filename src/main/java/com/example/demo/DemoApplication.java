package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONObject;

@SpringBootApplication
@RestController
public class DemoApplication {
//    //JDBC driver name and database URL
//    static final String JDBC_DRIVER = "org.h2.Driver";
//    static final String DB_URL = "jdbc:h2:~/test";
//
//    //Database credetials
//    static final String USER = "user";
//    static final String PASS = "12345";
//    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//    }
//    @GetMapping("user-api/v1/users")
//    public String getListOfUsers() {
//        Connection conn = null;
//        Statement stmt = null;
//        try {
//            Class.forName(JDBC_DRIVER);
//            System.out.println("Connecting to database...");
//            conn = DriverManager.getConnection(DB_URL,USER,PASS);
//            System.out.println("Connected successfully!");
//            stmt = conn.createStatement();
//            String sql = "SELECT * FROM users";
//            ResultSet rs = stmt.executeQuery(sql);
//            JSONArray json = new JSONArray();
//            ResultSetMetaData rsmd = rs.getMetaData();
//            while(rs.next()) {
//                int numColumns = rsmd.getColumnCount();
//                JSONObject obj = new JSONObject();
//                for (int i = 1; i <= numColumns; i++) {
//                    String column_name = rsmd.getColumnName(i);
//                    obj.put(column_name, rs.getObject(column_name));
//                }
//                json.put(obj);
//            }
//            conn.close();
//            return json.toString();
//        } catch(SQLException se) {
//            //Handle errors for JDBC
//            se.printStackTrace();
//        } catch(Exception e) {
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        } finally {
//            //finally block used to close resources
//            try{
//                if(stmt!=null) stmt.close();
//            } catch(SQLException se2) {
//            } // nothing we can do
//            try {
//                if(conn!=null) conn.close();
//            } catch(SQLException se){
//                se.printStackTrace();
//            } //end finally try
//        } //end try
//        return null;
//    }
//    @PostMapping("user-api/v1/users")
//     newEmployee(@RequestBody Employee newEmployee) {
//        return repository.save(newEmployee);
//    }
    @GetMapping("/api")
    public String getApiRequest() {
        return "API route";
    }
}
