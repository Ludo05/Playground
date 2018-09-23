package BR;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.Stream;

public class BR {

    public static void main(String[] args) throws Exception {
       /* String str;
        BufferedReader br = new BufferedReader(new FileReader(new File("/Users/LewisWilliams/IdeaProjects/Playground/NewFile.txt")));

        while (br.readLine() != null){
            str = br.readLine();
            System.out.println(str);

        }*/
//      newFile("NewFile.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File("/Users/LewisWilliams/IdeaProjects/Playground/NewFile.txt")));
        Stream<String> breader = br.lines();
        breader.forEach(System.out::print);


    }

    public static void newFile(String fileName)throws Exception{
        File file = new File(fileName);
        if(file.exists()) {
            System.out.println("Already created");
        }else{
        }
        System.out.println(file.createNewFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getPath());
    }
}
