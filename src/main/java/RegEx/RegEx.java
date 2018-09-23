package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        String reg = "4343";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher(reg);
        if (m.matches()) {
            System.out.println("it matches!!");
        } else {
            System.out.println("not found");
        }
    }
}
