//Напишите программу, которая использует Stream API
//для обработки списка чисел.
//Программа должна вывести на экран среднее значение всех четных чисел в списке.


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        int[] number = {-8,-3,-1,12,8,3,4,2,6,7,8,21,44,19,88,13,14,90};
//        int result = 0;
//
//        for (int l : number){
//            result += l;
//
//        }
//
//        System.out.println("Среде-арифметическое значение равно : " + result / number.length);
//

        List<Integer> number = Arrays.asList(8,3,-10,12,8,3,4,2,6,7,8,21,44,-19,88,13,14);

        double numbers = getNumber(number);
        System.out.println(numbers);



   }
   private static  double getNumber(List<Integer> number){
        return number.stream()
                .mapToInt(x -> x)
                .average().orElse(0);
   }

}