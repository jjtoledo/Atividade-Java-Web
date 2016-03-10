package br.edu.ufop.web.persistence;

/**
 *
 * @author Fernando Bernardes de Oliveira - fernando@decea.ufop.br
 * 
 * 
 */


// Conexao MySQL
import com.mysql.jdbc.Driver;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnectionProcess {

    static MySQLConnectionProcess instance;
    // Objeto de conexao
    private Connection connection;
    // Parametros de conexao
    private String host = "";
    private String database = "";
    private String dbUsername = "";
    private String dbPassword = "";

    // Utilizando padrão Singleton
    private MySQLConnectionProcess() {
    }

    public static MySQLConnectionProcess getInstance() {
        if (instance == null) {
            instance = new MySQLConnectionProcess();
        }

        return instance;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * @return the dbUsername
     */
    public String getDbUsername() {
        return dbUsername;
    }

    /**
     * @param dbUsername the dbUsername to set
     */
    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    /**
     * @return the dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * @param dbPassword the dbPassword to set
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public boolean isParameterSet() throws Exception {
        if (this.getHost().length() == 0
                || this.getDatabase().length() == 0
                || this.getDbUsername().length() == 0
                || this.getDbPassword().length() == 0) {
            throw new Exception(MySQLConnectionProcess.class.getName()
                    + ": Set parameters to Open Database Connection !");
        }

        return true;
    }

    // Recupera conexao com o banco de dados
    public Connection getConnection() {
        if (connection == null) {
            try {
                new Driver();
                String url = "jdbc:mysql://" + getHost() + "/" + getDatabase();
                connection = DriverManager.getConnection(url,
                        this.getDbUsername(), this.getDbPassword());
            } catch (SQLException ex) {
                Logger.getLogger(MySQLConnectionProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return connection;
    }

    public Statement getStatement() {
        try {
            return this.getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnectionProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
