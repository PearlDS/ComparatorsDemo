import java.util.*;

public class TestApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        int sum = 0;
        while (numbers.size()<3){
            int number = scanner.nextInt();
            sum+=number;
            numbers.add(number);
        }
        numbers.forEach(System.out::println);
        System.out.println(sum/numbers.size());

        List<String> words = new ArrayList<>();
        while (true){
            String word = scanner.next();
            words.add(word+" ");
            if(word.endsWith(".")){
                break;
            }
        }
        words.forEach(System.out::print);

        System.out.println(words.get(words.size()-1));


    }
}
