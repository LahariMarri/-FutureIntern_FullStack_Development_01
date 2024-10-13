package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployeeDetailsDAO {

    public int delete(String empId) {
        int rowsDeleted = 0;

        try (Connection con = DBConnection.getCon();
             PreparedStatement ps = con.prepareStatement("DELETE FROM EmployeeDetails WHERE id = ?")) {

            ps.setString(1, empId);
            rowsDeleted = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Log the error
        }

        return rowsDeleted;
    }
}
