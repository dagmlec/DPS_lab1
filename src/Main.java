import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Pensjonariusz.readFileAsString("dane.txt");
        //Pensjonariusz p = new Pensjonariusz("imie", "CW", 28);
        String fileName = "dane.txt";
        Pensjonariusz p = new Pensjonariusz("imie", "CW", 28);
        Wyswietl(p.readFileAsString(fileName));

    }
    static void Wyswietl(Pensjonariusz[] pensjonariusze){
        for(int i = 0; i<pensjonariusze.length; i++){
            System.out.println(pensjonariusze[i].toString());
        }
    }
}
