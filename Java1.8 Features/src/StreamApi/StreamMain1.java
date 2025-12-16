package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        // Creating a list and filtering all even number
        List<Integer> l1= List.of(2,4,50,21,22,67);
        List<Integer> l2=new ArrayList<>();
        l2.add(12);
        l2.add(34);
        l2.add(23);
        l2.add(78);
        l2.add(72);
        List<Integer> l3 = Arrays.asList(23, 567, 12, 677, 24);
        //WITHOUT STREAM seperating the even values from l1
        /*List<Integer> even = new ArrayList<>();
         for(Integer i:l1){
             if(i%2==0) even.add(i);
         }
        System.out.println(l1);
        System.out.println(even); */

        // USING STREAM seperating the even values from l1
        Stream<Integer> stream=l1.stream();
        List<Integer> newlist=stream.filter(i->i%2==0).toList();
        System.out.println(newlist);
        //ALL IN ONE LINE
        List<Integer> newlist2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist2);
        //Print number Greater than 10
        List<Integer> newlist1=l1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newlist1);


    }
}

