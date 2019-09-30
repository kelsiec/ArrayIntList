import java.util.Arrays;

public class ArrayIntList {
    private int size = 0;
    private int[] elements = new int[10];

    public void add(int value) {
        if (size >= elements.length) {
            expandSize();
        }

        elements[size] = value;
        size++;
    }

    public int get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        return elements[index];
    }

    public String toString() {
        return Arrays.toString(elements);
    }

    private void expandSize() {
        int increasedSize = elements.length * 2;
//        int[] newElements = new int[increasedSize];
//        for (int i = 0; i < size; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
        elements = Arrays.copyOf(elements, increasedSize);
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size ==  0;
    }

    public static void main(String[] args) {
        ArrayIntList foo = new ArrayIntList();
        System.out.println(foo);
        System.out.println(foo.isEmpty());

        foo.add(1);
        foo.add(2);
        foo.add(3);
        foo.add(4);
        foo.add(5);
        foo.add(6);
        foo.add(7);
        foo.add(8);
        foo.add(9);
        foo.add(10);
        foo.add(11);
        System.out.println(foo.isEmpty());
        System.out.println(foo);
        System.out.println(foo.size);

        System.out.println(foo.get(4));
        System.out.println(foo.get(15));
        System.out.println(foo.get(20));
    }
}
