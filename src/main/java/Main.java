public class Main {
    public static void main(String[] args) {
        Sportmaster sportmaster = new Sportmaster(10000_000,1_500);
        SportmasterService sportmasterService = new SportmasterService(sportmaster);
        sportmasterService.levelCard(sportmaster.getCostOfAllPurchases());
        int b=sportmasterService.accounting(sportmaster);
        System.out.println(b);

    }
}
