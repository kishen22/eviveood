import java.util.Objects;

public class Lunch extends Menu{

    public Lunch(){
        //System.out.println("A new lunch order has started.");
    }

    //getOrder function that overrides default in Menu when breakfast order is placed
    @Override
    public String getOrder(String userOrder) {
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
        if (mainCount == 0 && sideCount == 0) {
            orderOut = "Unable to process: Sandwich and Chips are missing";
        } else if (mainCount == 0) {
            orderOut = "Unable to process: Sandwich is missing";
        } else if (mainCount > 1) {
            orderOut = "Unable to process: Sandwich cannot be ordered more than once";
        } else if (sideCount == 0) {
            orderOut = "Unable to process: Chips are missing";
        } else if (drinkCount > 1) {
            orderOut = "Unable to process: Soda cannot be ordered more than once";
        } else if (mainCount == 1 && sideCount == 1 && drinkCount == 1) {
            orderOut = "Sandwich, Chips, Soda";
        } else if (mainCount == 1 && sideCount == 1 && drinkCount == 0) {
            orderOut = "Sandwich, Chips, Water";
        } else if (mainCount == 1 && sideCount > 1 && drinkCount == 0) {
            orderOut = "Sandwich, Chips(" + sideCount + "), Water";
        }else if (mainCount == 1 && sideCount > 1 && drinkCount == 1) {
            orderOut = "Sandwich, Chips(" + sideCount + "), Soda";
        }
        mainCount = 0;
        sideCount = 0;
        drinkCount = 0;
        return orderOut;
    }
}
