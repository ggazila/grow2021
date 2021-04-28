package examples.ocp.chapter10.chapter11;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
        six();
        eight();
        twenty();
        twentyTwo();
    }

    private static void twentyTwo() throws SQLException {
        var url = "jdbc:derby:pandas";
        var sql = "SELECT name FROM pandas WHERE location = ?";
        try (var conn = DriverManager.getConnection(url);  // s1
             var stmt = conn.prepareStatement(sql)) {        // s2

            stmt.setString(1, "DC");
            try (var rs = stmt.executeQuery()) {
                if (rs.next())
                    System.out.println(rs.getString("name"));
                else
                    System.out.println("No match");
            }
        }
    }

    private static void twenty() throws SQLException {
        var url = "jdbc:derby:clowns";
        var sql = "SELECT * FROM clowns";
        try (var conn = DriverManager.getConnection(url);   // s1
             var stmt = conn.prepareStatement(sql);           // s2
             var rs = stmt.executeQuery()) {                    // s3

            if (rs.next())
                System.out.println(rs.getString(1));
        }
    }

    private static void eight() throws SQLException {
        //        var url = "jdbc:derby:clowns";
        //        var sql = "SELECT * FROM clowns";
        //        try (var conn = new Connection(url);      // s1
        //             var stmt = conn.prepareStatement(sql); // s2
        //             var rs = stmt.executeQuery()) {        // s3
        //            if (rs.next())
        //                System.out.println(rs.getString(1));
        //        }
    }

    private static void six() throws SQLException {
        var url = "jdbc:derby:bunnies";
        var sql = "INSERT INTO bunny(name, color) VALUES (?, ?)";
        try (var conn = DriverManager.getConnection(url); var stmt = conn
                .prepareStatement(sql)) {  // s1

            stmt.setString(1, "Daisy");
            stmt.setString(2, "Brown");

            stmt.executeUpdate();

            stmt.setString(1, "Cinna");
            stmt.setString(2, "Brown");

            stmt.executeUpdate();
        }
    }
}
