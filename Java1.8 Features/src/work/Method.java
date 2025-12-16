package work;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class Method {
    public static void main(String[] args) {
        //Filter Method
       /* List<String> names= List.of("Aniket","Aman","Abhinav","Hasan");
        List<String> newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);*/

        //Map Method
       /* List<Integer> numbers=List.of(23,4,2,5,7,3);
        List<Integer> square=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(square); OR numbers.stream().forEach(e->System.out.println(e*e));*/

        //SORT
       /* List<Integer> numbers1=List.of(23,4,2,5,7,3);
        numbers1.stream().sorted().forEach(System.out::println);
        Integer integer=numbers1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("MIX:"+integer);
        Integer i2=numbers1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("MAX:"+i2); */
    }
}

