package Java8.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
        System.out.println("The Structure before flattening is : " + listOfListofInts);



        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .map(e->e+1)
                .collect(Collectors.toList());
        System.out.println("The Structure after flattening is : " + listofInts);


        //use two map
        List<List<Integer>> listoflist=listOfListofInts.stream()
                .map(e->e.stream().map(i->i+1).collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println("The Structure after two mapping is : " + listoflist);

        List<List<Integer>> listoflist1=new ArrayList<>();
        listOfListofInts.stream()
                .forEach(e->{
                    listoflist1.add(e.stream().map(i->i+1).collect(Collectors.toList()));
                }
                );
        System.out.println("The Structure after foreach and map is : " + listoflist1);
    }
}

