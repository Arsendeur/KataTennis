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
}
