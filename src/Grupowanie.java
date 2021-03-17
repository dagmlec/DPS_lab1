public class Grupowanie {
    public int SprawdzLiczebnoscGrupy(String typyTerapii, Pensjonariusz[] pensjonariusze){
        int a = 0;
        for (int i = 0; i < pensjonariusze.length; i++)
        {
            /*if (pensjonariusze[i].toString().contains(typTerapii))
            {
                a++;
            }*/
        }
        return a;
    }

    public Pensjonariusz [] PobierzOsobyZDanejTerapii(String typTerapii, Pensjonariusz [] pensjonariusze){

        int a = 0;
        for (int i = 0; i < pensjonariusze.length; i++)
        {
            if (pensjonariusze[i].toString().contains(typTerapii))
            {
                a++;
            }
        }

        Pensjonariusz[] zDanejTerapii = new Pensjonariusz[a];
        for (int i = 0; i < zDanejTerapii.length; i++)
        {
            if (pensjonariusze[i].toString().contains(typTerapii))
            {
                zDanejTerapii[i] = pensjonariusze[i];
            }
        }
        return zDanejTerapii;
    }
}
