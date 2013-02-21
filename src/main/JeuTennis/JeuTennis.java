package main.JeuTennis;




public class JeuTennis {
    int nombreDePointDuJoueur1 = 0;
    int nomBreDePointDuJoueur2 = 0;

    public String Score() {

        return(ConvertirPointEnScore(nombreDePointDuJoueur1) + "-" + ConvertirPointEnScore(nomBreDePointDuJoueur2));
    }

    public void Joueur1Marque() {
        nombreDePointDuJoueur1++;
    }

    public void Joueur2Marque()
    {
        nomBreDePointDuJoueur2++;
    }

    private String ConvertirPointEnScore(int nombreDePointEnScore)
    {
        switch (nombreDePointEnScore)
        {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "Score inconnu";
        }

    }
}
