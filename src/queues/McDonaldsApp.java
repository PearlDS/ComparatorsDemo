package queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class McDonaldsApp {

    public static void main(String[] args) {


        Queue <Burgerorder> burgerOrders = new PriorityQueue<>();
        burgerOrders.add(new Burgerorder("Vegan Chicken Nuggets", 15));
        burgerOrders.add(new Burgerorder("Chicken Nuggets", 13));
        burgerOrders.add(new Burgerorder("Big Bacon", 1));
        burgerOrders.add(new Burgerorder("Mc Flurry", 12));
        burgerOrders.add(new Burgerorder("Belgian Fries", 15));


        while (burgerOrders.size()>0){
            System.out.println(burgerOrders.poll());

        }



    }



}
