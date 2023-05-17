package cw2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class talica_select {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM OBECNOSC;" );
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  prowadzacy = rs.getString("prowadzacy");
                String  nazwa_przedmiotu = rs.getString("nazwa_przedmiotu");
                String  imie = rs.getString("imie");;
                String  nazwisko = rs.getString("nazwisko");
                int  nr = rs.getInt("nr");
                String data = rs.getString("data");
                String  czas_zalogowania = rs.getString("czas_zalogowania");
                String  czas_wylogowania = rs.getString("czas_wylogowania");
                String  dlugosc_spedzonego_czasu = rs.getString("dlugosc_spedzonego_czasu");
                System.out.println( "ID = " + id );
                System.out.println( "PROWADZACY = " + prowadzacy );
                System.out.println( "NAZWA_PRZEDMIOTU = " + nazwa_przedmiotu );
                System.out.println( "IMIE = " + imie );
                System.out.println( "NAZWISKO = " + nazwisko );
                System.out.println( "NR = " + nr );
                System.out.println( "DATA = " + data );
                System.out.println( "CZAS_ZALOGOWANIA = " + czas_zalogowania );
                System.out.println( "CZAS_WYLOGOWANIA = " + czas_wylogowania );
                System.out.println( "DLUGOSC_SPEDZONEGO_CZASU = " + dlugosc_spedzonego_czasu );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }System.out.println("Operation done successfully");
    }
}
