public class Sportmaster {

    private int costOfAllPurchases;
    private int costPurchases;
    private String levelCard;

    public Sportmaster(int costOfAllPurchases, int costPurchases) {
        this.costOfAllPurchases = costOfAllPurchases;
        this.costPurchases = costPurchases;
    }

    public int getCostOfAllPurchases() {
        return costOfAllPurchases;
    }



    public String getLevelCard() {
        return levelCard;
    }

    public void setLevelCard(String levelCard) {
        this.levelCard = levelCard;
    }

    public int getCostPurchases() {
        return costPurchases;
    }

    public void setCostPurchases(int costPurchases) {
        this.costPurchases = costPurchases;
    }

    //    public void levelCard(int cost){
//        if(cost<=15000){
//            levelCard="Standart";
//        }else if(cost<=150000){
//            levelCard="Silver";
//        }else{
//            levelCard="Gold";
//        }
//    }
//
//    public int accounting(Sportmaster sms){
//        int bonus=0;
//        switch (sms.levelCard){
//            case "Standart":
//                bonus=(int)Math.floor(costPurchases/1000)*50;
//                break;
//            case "Silver":
//                bonus=(int)Math.floor(costPurchases/1000)*70;
//                break;
//            case "Gold":
//                bonus=(int)Math.floor(costPurchases/1000)*100;
//                break;
//                default:
//                    System.out.println("Такой категории нет");
//                    break;
//        }
//
//        return bonus;
//    }
}
