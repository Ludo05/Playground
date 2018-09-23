import java.util.StringJoiner;

public class Test {

    public static void main(String[] args) {

        System.out.println(notString("string"));

    }


    public static StringBuffer notString(String str){

        String m = str;
        String not = "not ";

        StringBuffer stringBuffer = new StringBuffer();
        if(!str.contains(not))
            stringBuffer.append(not).append(m);


        return stringBuffer;
    }
}
