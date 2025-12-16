package generic;

public class Box<T> {
    //Object class is top most parent class of all java classes
   // It stores any type of data which is not mandatory for a good coder
    // that's why we are using Generic method here by using <T>
    Object container;

    T contain;
    public Box(T contain){
        this.contain=contain;
    }
    public T getValue(){
        return this.contain;
    }
}
