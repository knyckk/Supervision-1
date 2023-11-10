public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int root) {
        this.value = root;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode() {

    }

    public int getValue() {
        return this.value;
    }
    public void setValue(int newVal) {
        this.value = newVal;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    @Override
    public String toString() {
        return "              " + getValue() + "\n     " + getLeft() + "          " + getRight();
    }
}
