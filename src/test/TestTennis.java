import main.JeuTennis.JeuTennis;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTennis {
    private JeuTennis unJeuDeTennis;

    @Before
    public void initialiser()
    {
        unJeuDeTennis = new JeuTennis("Mengsk", "Kerrigan");
    }

    private void MettreLesDeuxAEqualite()
    {
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
    }

    @Test
    public void PeutRetournerLeScoreDUnMatchNull()
    {
        assertEquals("0-0", unJeuDeTennis.Score());

    }

    @Test
    public void LeJoueur1MarqueUnPoint()
    {
        unJeuDeTennis.Joueur1Marque();
        assertEquals("15-0", unJeuDeTennis.Score());
    }

    @Test
    public void LeJoueur2MarqueUnPoint()
    {
        unJeuDeTennis.Joueur2Marque();
        assertEquals("0-15", unJeuDeTennis.Score());
    }

    @Test
    public void LesDeuxJoueurMarqueChacun2Points()
    {
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
        assertEquals("30-30", unJeuDeTennis.Score());
    }

    @Test
    public void UnJoueurPeurMarquer3Points()
    {
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        assertEquals("40-0", unJeuDeTennis.Score());
    }

    @Test
    public void LeJoueur1PeutGagnerLaPartie()
    {
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        assertEquals("Mengsk a gagne la partie", unJeuDeTennis.Score());
    }

    @Test
    public void LeJoueur2PeutGagnerLaPartie()
    {
        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
        assertEquals("Kerrigan a gagne la partie", unJeuDeTennis.Score());
    }

    @Test
    public void LesJoueurSontAEqualite()
    {
        MettreLesDeuxAEqualite();
        assertEquals("Equalite", unJeuDeTennis.Score());
    }

    @Test
    public void LeJoueur1ALAvantage()
    {
        MettreLesDeuxAEqualite();

        unJeuDeTennis.Joueur1Marque();
        assertEquals("Avantage Mengsk", unJeuDeTennis.Score());
    }

    @Test
    public void LeJoueur2ALAvantage()
    {
        MettreLesDeuxAEqualite();

        unJeuDeTennis.Joueur2Marque();
        assertEquals("Avantage Kerrigan", unJeuDeTennis.Score());
    }

    @Test
    public void JeuInterminable()
    {
        MettreLesDeuxAEqualite();

        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur1Marque();
        unJeuDeTennis.Joueur2Marque();

        unJeuDeTennis.Joueur2Marque();
        unJeuDeTennis.Joueur2Marque();
        assertEquals("Kerrigan a gagne la partie", unJeuDeTennis.Score());
    }
}
