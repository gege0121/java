package Interview;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    //fizz----3
    //Buzz----5
    //fizzbuzz-----15

    public String fiz(Integer integer) {
        if (integer % 3 == 0) {
            if (integer % 5 == 0) return "FizzBuzz";
            else return "Fizz";
        } else if (integer % 5 == 0) return "Buzz";
        else return String.valueOf(integer);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fiz(44));

        Map<Integer, String> testCases = new HashMap<>();
        testCases.put(44, "44");
        testCases.put(15, "FizzBuzz");


        boolean pass = true;

        for (Integer input : testCases.keySet()) {
            pass = (fizzBuzz.fiz(input).equals(testCases.get(input)));
            if (pass == false) break;
        }

        System.out.println(pass);

    }


}
