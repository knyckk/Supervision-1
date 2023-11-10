public class FunctionalArray {
    private BinaryTreeNode root;
    private int size;
    public FunctionalArray(int size) {
        this.size = size;
        this.root = length(size);
    }
    public BinaryTreeNode tcons(int v, BinaryTreeNode t) {
        if(t == null) {
            return new BinaryTreeNode(v);
        }
        BinaryTreeNode toReturn = new BinaryTreeNode(v);
        toReturn.setLeft(tcons(t.getValue(),t.getRight()));
        toReturn.setRight(t.getLeft());
        return toReturn;
    }
    public BinaryTreeNode length(int n) {
        if(n<=0) {
            return null;
        }
        else{
            return tcons(n,length(n-1));
        }
    }
    public int get(int i) {
        BinaryTreeNode node = root;
        i++;
        while(i != 1 && node != null) {
            if(i % 2 == 0) {
                node = node.getLeft();
                i = i / 2;
            }  else {
                node = node.getRight();
                i = i / 2;
            }
        }
        if(i == 1) {
            return node.getValue();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    public void set(int i, int v) {
        BinaryTreeNode node = root;
        i++;
        while(i != 1 && node != null) {
            if(i % 2 == 0) {
                node = node.getLeft();
                i = i / 2;
            }  else {
                node = node.getRight();
                i = i / 2;
            }
        }
        if(i == 1) {
            node.setValue(v);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
