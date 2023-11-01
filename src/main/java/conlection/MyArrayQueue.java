package conlection;

public class MyArrayQueue implements  IStackQueue{
    private int size;
    private int[] array;
    private int indexHead;
    private int indexTail;
    public MyArrayQueue(int size){
        this.size = size;
        array = new int[size];
        indexHead = indexTail = -1;
    }
    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = array[indexHead];
            for (int i = 0; i< size-1; i++) {
                array[i] = array[i+1];
            }
            indexTail--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if(isEmpty()) {
                indexHead++;
            }
                indexTail++;
                array[indexTail] = value;
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return indexTail == -1 && indexTail == -1;
    }

    @Override
    public boolean isFull() {
        return indexTail == size - 1;
    }

    @Override
    public void show() {
        if(isEmpty()) System.out.println("Array is emty");
        else for(int i = 0; i <= indexTail; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
