import java.util.Objects;

public class Breakfast extends Menu{

    public Breakfast(){
        //System.out.println("A new breakfast order has started.");
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
            i++;
        }
        if (mainCount == 0 && sideCount == 0)
        {
            orderOut = "Unable to process: Eggs and Toast are missing";
        }
        else if(mainCount == 0){
            orderOut = "Unable to process: Eggs are missing";
        }
        else if(mainCount > 1){
            orderOut = "Unable to process: Eggs cannot be ordered more than once";
        }
        else if(sideCount == 0){
            orderOut = "Unable to process: Toast is missing";
        }
        else if(sideCount > 1){
            orderOut = "Unable to process: Toast cannot be ordered more than once";
        }
        else if(mainCount == 1 && sideCount == 1 && drinkCount == 1){
            orderOut = "Eggs, Toast, Coffee" ;
        }
        else if(mainCount == 1 && sideCount == 1 && drinkCount == 0){
            orderOut = "Eggs, Toast, Water";
        }
        else if(drinkCount > 1){
            orderOut = "Eggs, Toast, Coffee(" + drinkCount + ")";
        }
        mainCount = 0;
        sideCount = 0;
        drinkCount = 0;
        return orderOut;

    }

}
