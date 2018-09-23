package Reflection;

public class Hello {

    Hello(){}


    public  void sayHello(String name){
       String m = String.format("Hello %s Reflection is working!",name);
        System.out.println(m);
    }

    public  int returnOne(){

        return  1;
    }
}
