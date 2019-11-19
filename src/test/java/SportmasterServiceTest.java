import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterServiceTest {

    @Test
    void testingNameLevel() {
        Sportmaster sportmaster = new Sportmaster(10_000_000, 1_999);
        SportmasterService sportmasterService = new SportmasterService(sportmaster);
        sportmasterService.levelCard(sportmaster.getCostOfAllPurchases());
        assertEquals("Gold", sportmaster.getLevelCard());

        Sportmaster sportmaster1 = new Sportmaster(10_000, 1_999);
        SportmasterService sportmasterService1 = new SportmasterService(sportmaster1);
        sportmasterService1.levelCard(sportmaster1.getCostOfAllPurchases());
        assertEquals("Standart", sportmaster1.getLevelCard());

        Sportmaster sportmaster2 = new Sportmaster(140_000, 1_999);
        SportmasterService sportmasterService2 = new SportmasterService(sportmaster2);
        sportmasterService2.levelCard(sportmaster2.getCostOfAllPurchases());
        assertEquals("Silver", sportmaster2.getLevelCard());

    }

    @Test
    void accounting() {
        Sportmaster sportmaster = new Sportmaster(10_000,1_999);
        SportmasterService sportmasterService = new SportmasterService(sportmaster);
        sportmasterService.levelCard(sportmaster.getCostOfAllPurchases());
        int bonus=sportmasterService.accounting(sportmaster);
        assertEquals(50,bonus);

        Sportmaster sportmaster1 = new Sportmaster(140_000, 1_999);
        SportmasterService sportmasterService1 = new SportmasterService(sportmaster1);
        sportmasterService1.levelCard(sportmaster1.getCostOfAllPurchases());
        int bonus1=sportmasterService1.accounting(sportmaster1);
        assertEquals(70,bonus1);

        Sportmaster sportmaster2 = new Sportmaster(140_000_000, 1_999);
        SportmasterService sportmasterService2 = new SportmasterService(sportmaster2);
        sportmasterService2.levelCard(sportmaster2.getCostOfAllPurchases());
        int bonus2=sportmasterService2.accounting(sportmaster2);
        assertEquals(100,bonus2);

        Sportmaster sportmaster3 = new Sportmaster(140_000_000, 1_999);
        SportmasterService sportmasterService3 = new SportmasterService(sportmaster3);
        sportmaster3.setLevelCard("No");
        assertEquals(-1,sportmasterService3.accounting(sportmaster3));
    }
}