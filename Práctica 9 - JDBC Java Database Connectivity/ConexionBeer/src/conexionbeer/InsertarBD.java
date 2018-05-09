package conexionbeer;

import java.sql.*;

public class InsertarBD {

    public void InsertarBD() throws SQLException {
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer", "root", "admingenius09");
        miConexion.setAutoCommit(false);
        String insertar1 = "INSERT INTO bar (name, address) VALUES (?, ?)";
        String insertar2 = "INSERT INTO drinker (name, address) VALUES (?, ?)";
        PreparedStatement bar1 = miConexion.prepareStatement(insertar1);
        PreparedStatement bar2 = miConexion.prepareStatement(insertar2);
        bar1.setString(1, "Nombre1");
        bar1.setString(2, "Direccion1");
        bar2.setString(1, "Nombre2");
        bar2.setString(2, "Direccion2");
        int num1 = bar1.executeUpdate();
        int num2 = bar2.executeUpdate();
        miConexion.commit();
        miConexion.rollback();
        miConexion.close();
        System.out.println("ACTUALIZADA CON ÉXITO");
    }
}
