package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployeeDetailsDAO {

    public int update(EmpBean eb) {
        String query = "UPDATE EmployeeDetails SET name = ?, salary = ?, address = ? WHERE id = ?"; // Change to your actual table name
        int rowsUpdated = 0;

        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","marri");
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, eb.getName());
            ps.setFloat(2, eb.getSalary());
            ps.setString(3, eb.getAddress());
            ps.setString(4, eb.getId());

            rowsUpdated= ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }

        return rowsUpdated;
    }
}
