import java.util.Scanner;

//parent or abstract class
public class Menu {
    //initializing variables
    private String Water;
    String menu = "";
    int mainCount = 0;
    int sideCount = 0;
    int drinkCount = 0;
    int dessertCount = 0;
    String [] finalOrder;
    public String orderOut = "";

    public Menu(){};
    public Menu(String menu, int mainCount, int sideCount, int drinkCount, int dessertCount){
        setMenu("Breakfast");
        setMainCount(mainCount);
        setSideCount(sideCount);
        setDrinkCount(drinkCount);
        setDessertCount(dessertCount);
        setFinalOrder(finalOrder);
    }

    //functions
    public String getOrder (String userOrder){
        finalOrder = userOrder.split("[ ,]+");
        setMenu(finalOrder[0]);
        System.out.println("Entered " + finalOrder[0] + " menu.");
        return orderOut;
    }

    //creating getters and setters
    public String getMenu() {return menu;}

    public int getMainCount() {
        return mainCount;
    }

    public int getSideCount() {
        return sideCount;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public int getDessertCount() {
        return dessertCount;
    }

    public String[] getFinalOrder() {
        return finalOrder;
    }

    public void setMainCount(int mainCount) {
        this.mainCount = mainCount;
    }

    public void setSideCount(int sideCount) {
        this.sideCount = sideCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    public void setDessertCount(int dessertCount) {
        this.dessertCount = dessertCount;
    }

    public void setFinalOrder(String[] finalOrder) {
        this.finalOrder = finalOrder;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
