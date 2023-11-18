package conlection;

import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];
    public MyHashSet(){
        myBuckets = new ArrayList[SIZE];
        for(int i = 0; i < SIZE; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;
    }
    public void add(int key){
        int keyHash = hashFunction(key);
        if(!myBuckets[keyHash].contains(key)) {
            myBuckets[keyHash].add(key);
        }

    }
    public void remove(int key) {
        int keyHash = hashFunction(key);
        int index = myBuckets[keyHash].indexOf(key);
        if(index != -1) myBuckets[keyHash].remove(index);
    }
    public boolean contains(int key) {
        int keyHash = hashFunction(key);
        int index = myBuckets[keyHash].indexOf(key);
        if(index != -1) return true;
        return false;
    }

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1000);
        hashSet.add(1001);
        System.out.println(hashSet.contains(2));
        System.out.println(hashSet.contains(1000));
        hashSet.remove(2);
        System.out.println(hashSet.contains(2));
    }

}
