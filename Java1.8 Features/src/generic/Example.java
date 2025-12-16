package generic;

public class Example {
    public static void main(String[] args) {

        //It takes input only in String
        Box<String> box1=new Box<String>("Hasan");
        System.out.println(box1.getValue());
        System.out.println(box1.contain.getClass().getName());

        //It takes input only in Integer
        Box<Integer> box2=new Box<Integer>(121);
        System.out.println(box2.getValue());
        System.out.println(box2.contain.getClass().getName());

        //It takes input only in Boolean
        Box<Boolean> booleanBox=new Box<>(true);
        System.out.println(booleanBox.getValue());

    }
}
