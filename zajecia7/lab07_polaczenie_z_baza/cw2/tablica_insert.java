package cw2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tablica_insert {

    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        try {Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "INSERT INTO OBECNOSC (ID,PROWADZACY,NAZWA_PRZEDMIOTU,IMIE,NAZWISKO,NR,DATA,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA,DLUGOSC_SPEDZONEGO_CZASU) " +"VALUES (1, 'KOWALSKI', 'FIZYKA', 'kamil', 'nowak', 123456, '2023-05-17', '15:00:00', '16:30:00', '01:30:00' );";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OBECNOSC (ID,PROWADZACY,NAZWA_PRZEDMIOTU,IMIE,NAZWISKO,NR,DATA,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA,DLUGOSC_SPEDZONEGO_CZASU) " +"VALUES (2, 'HAJTO', 'MATEMATYKA', 'adrain', 'ferrari', 999999, '2023-05-18', '14:00:00', '16:30:00', '02:30:00' );";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OBECNOSC (ID,PROWADZACY,NAZWA_PRZEDMIOTU,IMIE,NAZWISKO,NR,DATA,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA,DLUGOSC_SPEDZONEGO_CZASU) " +"VALUES (3, 'KOKOS', 'POLSKI', 'krzys', 'zonda', 333333, '2023-05-19', '11:00:00', '16:30:00', '05:30:00' );";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OBECNOSC (ID,PROWADZACY,NAZWA_PRZEDMIOTU,IMIE,NAZWISKO,NR,DATA,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA,DLUGOSC_SPEDZONEGO_CZASU) " +"VALUES (4, 'TORRES', 'ANGIELSKI', 'karol', 'fran', 555555, '2023-05-19', '05:00:00', '12:30:00', '07:30:00' );";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
}
