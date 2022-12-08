public class BinarySearchTree {
    public TreeNode root;

    public BinarySearchTree(){


    }

    public void create(){
        root = null;
    }

    public boolean search(String key){
        TreeNode current = root;
        while(current != null){
            if(current.kmer.equals(key)){
                return true;
            }else if(key.compareTo(current.kmer) < 0){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }

    public void insert(String key){
        if(root == null){
            root = new TreeNode(key);
        }else{
            TreeNode current = root;

            while(true){
                if (key.compareTo(current.kmer) < 0) {
                    if (current.left == null) {
                        current.left = new TreeNode(key);
                        break;
                    } else {
                        current = current.left;
                    }
                }else if(key.compareTo(current.kmer) > 0) {
                    if (current.right == null) {
                        current.right = new TreeNode(key);
                        break;
                    } else {
                        current = current.right;
                    }
                }else{
                    current.frequencyOfKmer++;
                    break;
                }

            }
        }
    }
    public void destroy(){
        root = null;
    }

    public int getFrequency(String key){
        TreeNode current = root;
        while(current != null){
            if(current.kmer.equals(key)){
                return current.frequencyOfKmer;
            }else if(key.compareTo(current.kmer) < 0){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return 0;
    }

    //traverse tree in order
    public void inOrder(TreeNode localRoot){
        if(localRoot != null){
            inOrder(localRoot.left);
            System.out.println(localRoot.kmer + " " + localRoot.frequencyOfKmer);
            inOrder(localRoot.right);
        }
    }


}
