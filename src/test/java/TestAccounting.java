import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAccounting {

    @Test
    void accounting() {
        SportmasterService smService = new SportmasterService(10_000,1_500);
        smService.levelCard(smService.getCostOfAllPurchases());
        float result=smService.accounting(smService);
        assertEquals(50,result);
    }

}