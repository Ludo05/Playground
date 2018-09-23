package Generi;

public class Gen<T> {
private  T t;


    public void add (T t){
        this.t = t;
    }

    public T get(){
        return  t;
    }
}
