import java.util.*;

public class Gibson_Dunkan_Discussion5 {

    public static void main(String[] args) {

        ArrayList<Dessert> list = new ArrayList<Dessert>();

        IceCream iceCream = new IceCream();

        Cake cake = new Cake();


        // Step 1: populate list with a total of 10 IceCream and Cake objects at random indexes

        for (int i = 0; i < 10; i++) {

             double random = Math.random() * 100;

            if (random > 50) {
                list.add(cake);
            } else {
                list.add(iceCream);
            }
        }

        System.out.println("The items in the list after step 1 are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Step 2: If the first and last desserts are different, make the last dessert the same as the first dessert
        if (list.get(0) != list.get(list.size() - 1)) {

            list.remove(list.size() - 1);

            list.add(list.size(), list.get(0));

        }

        System.out.println("The items in the list after step 2 are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Step 3: At every other index, if the dessert is not cake, make it cake

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != cake && i % 2 == 0) {

                list.remove(i);

                list.add(i, cake);
            }
        }

        System.out.println("The items in the list after step 3 are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Step 4: Remove all cakes
        list.clear();

        System.out.println("The items in the list after step 4 are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }
}
