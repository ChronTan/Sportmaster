import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SportmasterService {

    private final Sportmaster sportmaster;



    public void levelCard(int cost){
        if(cost<=15000){
            sportmaster.setLevelCard("Standart");
        }else if(cost<=150000){
            sportmaster.setLevelCard("Silver");
        }else{
            sportmaster.setLevelCard("Gold");
        }
    }

    public int accounting(Sportmaster sportmaster){
        int bonus=0;
        switch (sportmaster.getLevelCard()){
            case "Standart":
                bonus=sportmaster.getCostPurchases()/1000*50;
                break;
            case "Silver":
                bonus=sportmaster.getCostPurchases()/1000*70;
                break;
            case "Gold":
                bonus=sportmaster.getCostPurchases()/1000*100;
                break;
            default:
                System.out.println("Такой категории нет");
                break;
        }

        return bonus;
    }
}
