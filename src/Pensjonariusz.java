import java.io.*;

public class Pensjonariusz {
    /*String imie;
    String typTerapii;
    int wiek;

    public Pensjonariusz(String imie, String typTerapii, int wiek){
        this.imie = imie;
        this.typTerapii = typTerapii;
        this.wiek = wiek;
    }*/

    public static void readFileAsString(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("dane.txt"));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        while (line != null) {
            sb.append(line).append("\n");
            line = br.readLine();
        }

        String fileAsString = sb.toString();
        System.out.println(fileAsString);
        return;
    }

}
