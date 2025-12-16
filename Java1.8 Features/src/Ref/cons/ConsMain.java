package Ref.cons;

public class ConsMain {
    public static void main(String[] args) {

        // Constructor Reference
        System.out.println("Constructor Reference");
        Providor providor=Student::new;
        Student student = providor.getStudent();
        student.display();

        //Lambda value references
        Providor providor1=()-> {
            return new Student();
        };
        Student student1= providor.getStudent();
        student.display();
    }
}
