import java.io.*;

public class Pensjonariusz {
   private String imie;
   private String typTerapii;
   private int wiek;

    public final String getImie()
    {
        return imie;
    }

    public final String getTypTerapii()
    {
        return typTerapii;
    }

    public final int getWiek()
    {
        return wiek;
    }


    public Pensjonariusz(String imie, String typTerapii, int wiek){
        this.imie = imie;
        this.typTerapii = typTerapii;
        this.wiek = wiek;
    }


    public static Pensjonariusz[] readFileAsString(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();

//        String line = br.readLine();
//        while (line != null) {
//            sb.append(line).append("\n");
//            line = br.readLine();
//        }
//
//        String fileAsString = sb.toString();
//        System.out.println(fileAsString);
//        return Pensjonariusz[];

        String[] txt = br.readLine().split("|");
        Pensjonariusz[] lista = new Pensjonariusz[txt.length];
        for(int i=0; i<txt.length;i++)
        {
            Pensjonariusz p = new Pensjonariusz("imie", "NWM", 2);
            p.imie = txt[i].split(";")[0];
            p.typTerapii = txt[i].split(";")[4];
            p.wiek = Integer.parseInt(txt[i].split(";")[6]);
        }
        return lista;
    }

    public  String toString(){
        return imie + ", "+ typTerapii + ", "+ wiek + " " + "lat";
    }

}
