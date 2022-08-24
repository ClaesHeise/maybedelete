import java.sql.Array;
import java.util.ArrayList;
import java.util.Locale;

public class MyNonExistingClass {

    public String gretting(){
        return "hello";
    }

    public String greet(Object name){
//        String result = ((result = name) != null) ? result : "my friend";
//        return "Hello, " + result;
        String output = "";
        ArrayList<String> names = new ArrayList<>();
        if(name instanceof String){
            names.add((String) name);
        } else if (name instanceof ArrayList<?>) {
            names = (ArrayList<String>) name;
        }
        else{
            output = "Hello, my friend";
        }
        for (String s : names) {
            if (s.equals(s.toUpperCase())) {
                output = "HELLO, "+s+"!";
            } else {
                output = "Hello, " + s;
            }
        }
        return output;
    }
}
