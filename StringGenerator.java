import java.util.ArrayList;

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
        s = "";
        for(int i = 0; i < Math.pow(10, n); i++){
            s += alphabet.charAt((int)(Math.random() * 4));
        }

        return s;


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
