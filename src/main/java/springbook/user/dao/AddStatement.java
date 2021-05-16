package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddStatement implements StatementStrategy {
    User user;

    public AddStatement(User user) {
        this.user = user;
    }
    @Override
    public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
        PreparedStatement ps =
                c.prepareStatement("insert into users(id, name, password)" +
                                        "values (?,?,?)");
        ps.setString(1, user.getId());
        ps.setString(3, user.getName());
        ps.setString(2, user.getPassword());

        return ps;
    }
}
