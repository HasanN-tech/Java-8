package Ref;
import java.util.Optional;
public class OptionalExample {

    public static Optional<String> getName(){
        String name="hasan";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
        String str=null;
        //It Gives NullPointerException
       // System.out.println(str.length());

        //Retrun true if value exist else false
        Optional<String> optional=Optional.ofNullable(str);
        System.out.println(optional.isPresent());

        // Return value if exist else given message
        System.out.println(optional.orElse("No value exist"));

        Optional<String> nameOptional=getName();
        System.out.println(nameOptional.orElse("Null return"));
    }
}
