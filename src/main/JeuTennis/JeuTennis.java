package main.JeuTennis;




public class JeuTennis {
    private int nombreDePointDuJoueur1 = 0;
    private int nomBreDePointDuJoueur2 = 0;
    private String nomDuJoueur1;
    private String nomDuJoueur2;

    public JeuTennis(String nomDuJoueur1, String nomDuJoueur2)
    {
        this.nomDuJoueur1 = nomDuJoueur1;
        this.nomDuJoueur2 = nomDuJoueur2;
    }

    public String Score() {
        if (LeJoueur1AGagneLaPartie()) return (nomDuJoueur1 + " a gagne la partie");
        if (LeJoueur2AGagneLaPartie()) return (nomDuJoueur2 + " a gagne la partie");
        if (LesJoueurSontAEqualite()) return "Equalite";


        return(ConvertirPointEnScore(nombreDePointDuJoueur1) + "-" + ConvertirPointEnScore(nomBreDePointDuJoueur2));
    }

    private boolean LeJoueur2AGagneLaPartie() {
        return nomBreDePointDuJoueur2 >= 4;
    }

    private boolean LeJoueur1AGagneLaPartie() {
        return nombreDePointDuJoueur1 >= 4;
    }


    private boolean LesJoueurSontAEqualite() {
        return (nombreDePointDuJoueur1 == nomBreDePointDuJoueur2) && (nombreDePointDuJoueur1 >= 3);
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
