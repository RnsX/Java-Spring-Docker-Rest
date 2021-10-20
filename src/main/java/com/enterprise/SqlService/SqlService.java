package com.enterprise.SqlService;
import java.sql.*;

public class SqlService {
    private String connectionUrl = "";

    public SqlService(String connUrl) {
        connectionUrl = connUrl;
    }

    public void RunScenario(int ScenarioId) {

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            String selectSql = "Exec RunScenarios @ScenarioId = " + ScenarioId;
            statement.execute(selectSql);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
