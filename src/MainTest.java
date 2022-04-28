import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("All the different test cases for Breakfast, Lunch, and Dinner based on the rules given")
    void main() {
        Breakfast breakfastRule1 = new Breakfast();
        Breakfast breakfastRule2 = new Breakfast();
        Breakfast breakfastRule3 = new Breakfast();
        Breakfast breakfastRule4 = new Breakfast();
        Lunch lunchRule1 = new Lunch();
        Lunch lunchRule2 = new Lunch();
        Lunch lunchRule3 = new Lunch();
        Lunch lunchRule4 = new Lunch();
        Lunch lunchRule5 = new Lunch();
        Dinner dinnerRule1 = new Dinner();
        Dinner dinnerRule2 = new Dinner();

        String b1 = "Breakfast 1,2,3";
        assertEquals("Eggs, Toast, Coffee",breakfastRule1.getOrder(b1));
        String b2 = "Breakfast 2,3,1";
        assertEquals("Eggs, Toast, Coffee",breakfastRule2.getOrder(b2));
        String b3 = "Breakfast 1,2,3,3,3";
        assertEquals("Eggs, Toast, Coffee(3)",breakfastRule3.getOrder(b3));
        String b4 = "Breakfast 1";
        assertEquals("Unable to process: Toast is missing",breakfastRule4.getOrder(b4));
        String l1 = "Lunch 1,2,3";
        assertEquals("Sandwich, Chips, Soda",lunchRule1.getOrder(l1));
        String l2 = "Lunch 1,2";
        assertEquals("Sandwich, Chips, Water",lunchRule2.getOrder(l2));
        String l3 = "Lunch 1,1,2,3";
        assertEquals("Unable to process: Sandwich cannot be ordered more than once",lunchRule3.getOrder(l3));
        String l4 = "Lunch 1,2,2";
        assertEquals("Sandwich, Chips(2), Water", lunchRule4.getOrder(l4));
        String l5 = "Lunch";
        assertEquals("Unable to process: Sandwich and Chips are missing" ,lunchRule5.getOrder(l5));
        String d1 ="Dinner 1,2,3,4";
        assertEquals("Steak, Potatoes, Wine, Water, Cake", dinnerRule1.getOrder(d1));
        String d2 = "Dinner 1,2,3";
        assertEquals("Unable to process: Cake is missing", dinnerRule2.getOrder(d2));


    }
}