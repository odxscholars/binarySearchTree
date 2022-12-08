import java.util.ArrayList;
import java.util.Random;

public class StringGenerator {
    public ArrayList<String> strings = new ArrayList<String>();
    public String s;
    public int k;
    private String alphabet = "ACGT";
    int n;
    public StringGenerator(int n, int k){
        this.n = n;
        this.k = k;
    }

    public String randomizeString(){
        //generate a random string of length 10 raised to n
        Random rand = new Random();
//        s = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.pow(10, n); i++){
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
//            s += alphabet.charAt((int)(Math.random() * 4));
        }
        s = sb.toString();
        return sb.toString();


    }
    public void generateStrings(){
        for(int i = 0; i < s.length() - k + 1; i++){
            strings.add(s.substring(i, i + k));
        }

    }
    public ArrayList<String> getStrings(){
        return strings;
    }
}
