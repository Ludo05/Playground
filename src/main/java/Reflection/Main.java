package Reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Hello obj = new Hello();
        Method method = obj.getClass().getMethod("sayHello", String.class);
        method.invoke(obj, "Lewis");
    }
}
