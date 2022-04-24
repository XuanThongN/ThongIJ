package collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        ma.add(3);
        ma.add(1,4);
        System.out.println(ma.getSize());
        System.out.println(ma.toString());

    }
}
