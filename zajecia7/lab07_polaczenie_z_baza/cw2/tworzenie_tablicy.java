package cw2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tworzenie_tablicy {

    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "CREATE TABLE OBECNOSC " +"(ID INT PRIMARY KEY     NOT NULL," +
                    " PROWADZACY           TEXT    NOT NULL, " +
                    " NAZWA_PRZEDMIOTU          TEXT     NOT NULL, " +
                    " IMIE        CHAR(20), " +
                    " NAZWISKO    CHAR(25), " +
                    " NR INT    NOT NULL, " +
                    " DATA    DATE, " +
                    " CZAS_ZALOGOWANIA   TIME NOT NULL, " +
                    " CZAS_WYLOGOWANIA   TIME NOT NULL, " +
                    " DLUGOSC_SPEDZONEGO_CZASU  TIME NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
}

