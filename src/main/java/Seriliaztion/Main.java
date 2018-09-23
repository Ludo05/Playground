package Seriliaztion;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main  {

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        person.setAge(25);
        person.setDOB(150193);
        person.setFirstName("Lewis");

        saveAccount(person,"Peersonclass");
        reafAccount("Peersonclass");

    }

    public static void saveAccount(Person person, String fileName) throws IOException {
           ObjectOutputStream objectOutputStream =
                   new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
            objectOutputStream.writeObject(person);
    }

    public static void reafAccount(String fileName) throws IOException , ClassNotFoundException{
        Person person = null;
        ObjectInputStream objectInputStream =
                new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
         person = (Person)   objectInputStream.readObject();

        System.out.println(person.getAge());
        System.out.println(person.getDOB());
        System.out.println(person.getFirstName());
    }
}
