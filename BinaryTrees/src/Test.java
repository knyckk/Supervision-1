
public class Test {
    public static void main(String[] args) {
        FunctionalArray test = new FunctionalArray(10);
        for(int i = 0;i<10;i++) {
            //System.out.println(test.get(i));
            test.set(i,i);
            System.out.println(test.get(i));
        }
    }
}
