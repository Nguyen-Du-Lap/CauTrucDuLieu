package conlection;

public class MyArrayStack implements IStackQueue{
    private int size;
    private int indexTop;
    private int[] a;
    public MyArrayStack(int size) {
        this.size = size;
        indexTop = -1;
        a = new int[size];
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = a[indexTop];
            indexTop--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()) {
            indexTop++;
            a[indexTop] = value;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(indexTop == -1) return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if(indexTop == size - 1) return true;
        return false;
    }

    @Override
    public void show() {
        if(indexTop == -1) System.out.println("Array is emty");
        else for(int i = 0; i < size; i++){
            System.out.print(a[i]+" ");
        }
    }
}
