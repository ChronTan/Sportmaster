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


}
