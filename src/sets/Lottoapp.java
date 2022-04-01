package sets;

import java.util.*;

public class Lottoapp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbersYouChose = new HashSet<>();

        while (numbersYouChose.size()<6){
            String numberInString = scanner.next();
     try{
        int number = Integer.parseInt(numberInString);
         System.out.println("You want to add: "+number);

         if(number>0&& number<=45){
             numbersYouChose.add(number);
         } else {
             System.out.println("Please enter a number between 1-45!!!!");
         }
     }catch (NumberFormatException e){
            System.out.println("Please enter a valid number");
        }
        }


        numbersYouChose.forEach(System.out::println);


        Random random = new Random();
        Set<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size()<6){

            int randomNumber = random.nextInt(6)+1;
            System.out.println("the number is: "+randomNumber);
            randomNumbers.add(randomNumber);

        }

        randomNumbers.forEach(System.out::println);

        System.out.println(randomNumbers.containsAll(numbersYouChose));

        System.out.println("-----");

        randomNumbers.forEach(System.out::println);


    }
}
