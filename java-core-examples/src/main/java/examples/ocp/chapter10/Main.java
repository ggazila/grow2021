package examples.ocp.chapter10;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        three();
    }

    private static void three() {
        try {
            new Main().findNewLego("one", "two");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private String findNewLego(String url, String type) throws SQLException {
        var query = "SELECT name FROM sets WHERE " + "type = " + type
                + " ORDER BY date DESC";
        var con = DriverManager.getConnection(url);
        try (con; var ps = con.createStatement(); var rs = ps
                .executeQuery(query)) {

            if (rs.next())
                return rs.getString(1);
        }
        throw new RuntimeException("None available, try  later");
    }
}
