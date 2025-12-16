package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system Start");
        // USING ANONYMOUS CLASS
       /* MyInter myinter = new MyInter() {
            @Override
            public void sayhello() {
                System.out.println("INTERFACE");
            }
        };
        myinter.sayhello(); */

        //USING LAMBDA EXPRESSION
        /*MyInter myInter=()-> System.out.println("This is Lambda interface");
        myInter .sayhello();

        sumInter sumInter=(a,b)->a+b;
        System.out.println(sumInter.sum(5,7)); */


    }
}
