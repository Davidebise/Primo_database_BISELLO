import org.example.Database;

import javax.xml.crypto.Data;
import java.sql.SQLException;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main(){
    Database database=null;
    try {
        database = Database.getInstance();

    } catch (SQLException e) {
        println("Impossbile connettersi al database");
        System.exit(-1);
    }
    println("Connesso al database");

    database.insertPiatto(readln("Inserisci nome piatto:"),Double.parseDouble(readln("Inserisci prezzo:")),Integer.parseInt(readln("Inserisci quantità:")));
}