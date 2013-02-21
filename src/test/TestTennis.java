import main.JeuTennis.JeuTennis;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTennis {
    private JeuTennis unJeuDeTennis;

    @Before
    public void initialiser()
    {
        unJeuDeTennis = new JeuTennis();
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
}
