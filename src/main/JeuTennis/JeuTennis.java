package main.JeuTennis;


public class JeuTennis {
    int nombreDePointDuJoueur1;

    public void JeuTennis()
    {
        nombreDePointDuJoueur1 = 0;
    }
    public String Score() {
        return(nombreDePointDuJoueur1*15 + "-0");
    }

    public void Joueur1Marque() {
        nombreDePointDuJoueur1++;
    }
}
