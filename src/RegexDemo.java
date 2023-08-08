import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher m = p.matcher("arpit.sahu@bridgelabz.com");
        System.out.println(m.matches());

//        System.out.println(Pattern.matches("[6-9]{1}\\d{9}","7978214560"));


    }
}
