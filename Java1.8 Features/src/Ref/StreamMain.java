package Ref;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list= List.of(12,12352,5625,367356,475);
        System.out.println(list);
        //LAMBDA FOR PRINTING
        //list.stream().forEach(e-> System.out.println(e));

        //Stream
        list.stream().forEach(System.out::println);
    }
}
