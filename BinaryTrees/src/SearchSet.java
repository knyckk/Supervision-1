public class SearchSet {
    private BinaryTreeNode head;
    public SearchSet() {
        head = null;
    }
    public SearchSet(BinaryTreeNode set) {
        head = set;
    }
    public void insert(int insert) {
        if(!this.contains(insert)) {
            BinaryTreeNode newHead = new BinaryTreeNode(insert);
            newHead.setRight(head.getRight());
            head.setRight(null);
            newHead.setLeft(head);
            this.head = newHead;
        }
    }
    public int getNumberElements() {
        int toReturn = 0;
        if(head != null) {
            toReturn = 1 + new SearchSet(head.getLeft()).getNumberElements() + new SearchSet(head.getRight()).getNumberElements();
        }
        return toReturn;
    }
    public boolean contains(int search) {
        boolean toReturn = false;
        if(head != null) {
            toReturn = head.getValue() == search || new SearchSet(head.getLeft()).contains(search) || new SearchSet(head.getRight()).contains(search);
        }
        return toReturn;
    }

    @Override
    public String toString() {
        return "SearchSet{" +
                "head=" + head +
                '}';
    }
}
