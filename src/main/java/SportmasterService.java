public class SportmasterService {

    private float costOfAllPurchases;
    private float costPurchases;
    private String levelCard;

    public SportmasterService(float costOfAllPurchases, float costPurchases) {
        this.costOfAllPurchases = costOfAllPurchases;
        this.costPurchases = costPurchases;
    }

    public float getCostOfAllPurchases() {
        return costOfAllPurchases;
    }



    public String getLevelCard() {
        return levelCard;
    }



    public void levelCard(float cost){
        if(cost<=15000){
            levelCard="Standart";
        }else if(cost<=150000){
            levelCard="Silver";
        }else{
            levelCard="Gold";
        }
    }

    public float accounting(SportmasterService sms){
        float bonus=0;
        switch (sms.levelCard){
            case "Standart":
                bonus=(float)Math.floor(costPurchases/1000)*50;
                break;
            case "Silver":
                bonus=(float)Math.floor(costPurchases/1000)*70;
                break;
            case "Gold":
                bonus=(float)Math.floor(costPurchases/1000)*100;
                break;
                default:
                    System.out.println("Такой категории нет");
                    break;
        }

        return bonus;
    }
}
