import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       int k = Integer.parseInt(args[1]);
       BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Generating random string of length 10^" + n + "with k size of "+ k);
       StringGenerator sg = new StringGenerator(n, k);
       sg.randomizeString();

       sg.generateStrings();
       ArrayList<String> strings = sg.getStrings();

       tree.create();
       for(String a: strings){
           tree.insert(a);
       }
    //    tree.inOrder(tree.root);




    }






}