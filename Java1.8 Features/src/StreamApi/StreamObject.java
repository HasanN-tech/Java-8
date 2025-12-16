package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //1=Blank
        Stream<Object> empty = Stream.empty();

        //2= Array,Object,Collection
        /*String names[]={"Mohd","Hasan","Nawab","James","Bond"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e-> System.out.println(e)); */

        //3
        Stream<Object> streamBuilder= Stream.builder().build();

        //4
        /* IntStream stream= Arrays.stream(new int[]{2,4,65,3,546});
        stream.forEach(e-> System.out.println(e)); */

        //5= List,set
        /* List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);
        Stream<Integer> stream2=list.stream();
        stream2.forEach(z-> System.out.println(z)); */

    }
}
