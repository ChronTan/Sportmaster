import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterServiceTest {

    @Test
    void testingNameLevel() {
        SportmasterService smService = new SportmasterService(10_000_000,1_000);
        float cost=smService.getCostOfAllPurchases();
        smService.levelCard(cost);
        assertEquals("Gold",smService.getLevelCard());
        smService.levelCard(10_000);
        assertEquals("Standart",smService.getLevelCard());
        smService.levelCard(100_000);
        assertEquals("Silver",smService.getLevelCard());

    }

    @Test
    void accounting() {
        SportmasterService smService = new SportmasterService(10_000,1_500);
        smService.levelCard(smService.getCostOfAllPurchases());
        float result=smService.accounting(smService);
        assertEquals(50,result);
        smService.levelCard(10_000_000);
        result=smService.accounting(smService);
        assertEquals(100,result);
        smService.levelCard(100_000);
        result=smService.accounting(smService);
        assertEquals(70,result);
    }



}