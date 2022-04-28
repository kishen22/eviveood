import java.util.Objects;

public class Dinner extends Menu{

    public Dinner(){
        //System.out.println("A new dinner order has started.");
    }
    //getOrder function that overrides default in Menu when breakfast order is placed
    @Override
    public String getOrder(String userOrder){
        orderOut = "";
        finalOrder = userOrder.split("[ ,]+");
        setMenu(finalOrder[0]);
        int i = 1;
        while (i < finalOrder.length) {
            if (Objects.equals(finalOrder[i], "1")) {
                mainCount++;
            }
            if (Objects.equals(finalOrder[i], "2")) {
                sideCount++;
            }
            if (Objects.equals(finalOrder[i], "3")) {
                drinkCount++;
            }
            if (Objects.equals(finalOrder[i], "4")) {
                dessertCount++;
            }
            i++;
        }
        if (mainCount == 0 && sideCount == 0 && dessertCount == 0)
        {
            orderOut = "Unable to process: Steak, Potatoes, and Cake are missing";
        }
        else if (mainCount == 0 && sideCount == 0)
        {
            orderOut = "Unable to process: Steak and Potatoes are missing";
        }
        else if (mainCount == 0)
        {
            orderOut = "Unable to process: Steak is missing";
        }
        else if(mainCount > 1){
            orderOut = "Unable to process: Steak cannot be ordered more than once";
        }
        else if(sideCount == 0){
            orderOut = "Unable to process: Potatoes are missing" ;
        }
        else if(drinkCount > 1){
            orderOut = "Unable to process: Wine cannot be ordered more than once" ;
        }
        else if(dessertCount == 0){
            orderOut = "Unable to process: Cake is missing" ;
        }
        else if(dessertCount > 1){
            orderOut = "Unable to process: Cake cannot be ordered more than once" ;
        }
        else if(mainCount == 1 && sideCount == 1 && drinkCount == 1 && dessertCount == 1){
            orderOut = "Steak, Potatoes, Wine, Water, Cake" ;
        }
        else if(mainCount == 1 && sideCount == 1 && drinkCount == 0 && dessertCount == 1) {
            orderOut ="Steak, Potatoes, Water, Cake";
        }
        mainCount = 0;
        sideCount = 0;
        drinkCount = 0;
        dessertCount = 0;
        return orderOut;
    }
}
