package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ViewAllEmployeeDetailsDAO {
    
    public List<EmpBean> getAllEmployees() {
        List<EmpBean> employees = new ArrayList<>();
        String query = "SELECT * FROM EmployeeDetails"; // Change to your actual table name

        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","marri");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                EmpBean eb = new EmpBean();
                eb.setId(rs.getString("id"));
                eb.setName(rs.getString("name"));
                eb.setSal(rs.getFloat("salary"));
                eb.setAddress(rs.getString("address"));
                employees.add(eb);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }

        return employees;
    }
}


