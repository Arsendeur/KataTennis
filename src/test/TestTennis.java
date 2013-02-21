import main.JeuTennis.JeuTennis;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTennis {

    @Test
    public void PeutRetournerLeScoreDUnMatchNull()
    {
        JeuTennis unJeuDeTennis = new JeuTennis();

        assertEquals("0-0", unJeuDeTennis.Score());

    }

    @Test
    public void LeJoueur1MarqueUnPoint()
    {
        JeuTennis unJeuDeTennis = new JeuTennis();
        unJeuDeTennis.Joueur1Marque();
        assertEquals("15-0", unJeuDeTennis.Score());
    }

    @Test
    public void LeJoueur2MarqueUnPoint()
    {
        JeuTennis unJeuDeTennis = new JeuTennis();
        unJeuDeTennis.Joueur2Marque();
        assertEquals("0-15", unJeuDeTennis.Score());
    }
}
