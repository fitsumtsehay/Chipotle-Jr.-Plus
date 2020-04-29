//* initialize Random class declare ArrayList
//* Do for loop
//* Initiate an Array for each ingredient and add
//* Generate ingredients randomly
//* Set burrito price

import java.util.Random;

import java.util.ArrayList;

public class Burito {
    public static void main(String[] args) {

        for(int i = 0; i < 25; i++){

            System.out.print("\n\nBurrito " + (i+1) + ": ");

            burrito();
        }

    }
    public static void burrito(){

        ArrayList<String> firstFive = new ArrayList<>();

        ArrayList<String>burrito = new ArrayList<>();

        ArrayList<String> extraIng = new ArrayList<>();

        String [] rice = {"white rice", "brown rice", "no rice", "all rice"};

        String [] meat = {"chicken meat","steak meat","carnidas meat","chorizo meat","sofritas meat"," veggie meat", "no meat", "all meat"};

        String [] beans = {"pinto beans", "black beans", "no beans", "all beans"};

        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa", "all salsa"};

        String[] veggies = {"lettuce", "fajita",  "no veggies", "all veggies"};

        String[] cheese = {"cheese", "no cheese"};

        String[] guac = {"guac", "no guac"};

        String[] queso = {"queso", "no queso"};

        String[] sour = {"sour cream", "no sour cream"};

        //All ingredients

        burrito.add(ingOption(rice));

        burrito.add(ingOption(meat));

        burrito.add(ingOption(beans));

        burrito.add(ingOption(salsa));

        burrito.add(ingOption(veggies));

        burrito.add(ingOption(cheese));

        burrito.add(ingOption(guac));

        burrito.add(ingOption(queso));

        burrito.add(ingOption(sour));

        // The first five Burrito options

        for(int i = 0; i < 5 ; i++){
            firstFive.add(burrito.get(i));
        }

        System.out.print(firstFive.get(0)+", " + firstFive.get(1) + ", " + firstFive.get(2) +

                ", " + firstFive.get(3) + ", " + firstFive.get(4));

        int randNumber = randomNumber(burrito.size());  // choose randomly how many more ingredients

        // Extra ingredients

        for (int i = 0; i <randNumber ; i++ ){

            extraIng.add(burrito.get(i));

        }

        //Adding the extra ingredients

        for(String s: extraIng){

            System.out.print(", " + s);

        }

        // the price

        System.out.print("\nPrice of Burrito in $: " + (burritoPrice(firstFive) + (burritoPrice(extraIng)-3.00)));

    }

    public static String ingOption(String [] m){

        return m[randomNumber(m.length)];

    }

    public static int randomNumber(int bnd){

        Random rnd = new Random();

        return (rnd.nextInt(bnd));

    }
    public static ArrayList cleanup(ArrayList<String>m){

        m.remove("no rice");
        m.remove("no salsa");
        m.remove("no beans");
        m.remove("no queso");
        m.remove("no sour cream");
        m.remove("no cheese");
        m.remove("no guac");
        m.remove("no veggies");

        return m;

    }

    public static double burritoPrice(ArrayList<String>m){

        double price = (3.00 + (m.size() * 0.50));

        if (m.equals("no rice"))

            price-= 0.50;

        if(m.equals("no salsa"))

            price-= 0.50;

        if(m.equals("no beans"))

            price-= 0.50;

        if(m.equals("no queso"))

            price-= 0.50;

        if(m.equals("no sour cream"))

            price-= 0.50;

        if(m.equals("no cheese"))

            price-= 0.50;

        if(m.equals("no guac"))

            price-= 0.50;

        if(m.equals("no veggies"))

            price-= 0.50;

        return price;

    }

}
