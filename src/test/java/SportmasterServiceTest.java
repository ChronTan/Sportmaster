import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterServiceTest {

    @Test
    void testingNameLevel() {
        Sportmaster sportmaster = new Sportmaster(10_000_000, 1_999);
        SportmasterService sportmasterService = new SportmasterService(sportmaster);
        sportmasterService.levelCard(sportmaster.getCostOfAllPurchases());
        assertEquals("Gold", sportmaster.getLevelCard());

    }

    @Test
    void accounting() {
        Sportmaster sportmaster = new Sportmaster(10_000,1_999);
        SportmasterService sportmasterService = new SportmasterService(sportmaster);
        sportmasterService.levelCard(sportmaster.getCostOfAllPurchases());
        int bonus=sportmasterService.accounting(sportmaster);
        assertEquals(50,bonus);
    }
}