import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs", "password", "password");
            System.out.println("everything went just fine! :-)");

            letsUseTheConnection(connection);
        } catch (SQLException e) {
            System.out.println("there was a big problem");
        }
        System.out.println("let's go");
    }

    private static void letsUseTheConnection(Connection connection) {
        System.out.println("Something with " + connection);
    }
}
