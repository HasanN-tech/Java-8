package Ref;

public class RefDemo {
    public static void main(String[] args) {
        //provide the implementation of WorkInter
        WorkInter workInter=()-> System.out.println("This is work Inter from main");

        //Referring the Static method
        //Syntax=ClassName::methodName
        WorkInter workInter1=Stuff::doSTuff;
        workInter1.doTask();

        Runnable runnable=Stuff::threadTask;
        Thread d=new Thread(runnable);
        d.start();

        //Referring non-static method
        //Object::Method
        Stuff ob=new Stuff();
        Runnable runnable1=ob::printNumber;
        Thread thread=new Thread(runnable1);
        thread.start();;
    }
}
