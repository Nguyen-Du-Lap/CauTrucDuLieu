package conlection;

import java.util.ArrayList;

public class MyHashMap {
    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];
    private class Data{
        int key;
        int value;
        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public MyHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }
    public int hashFunction(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int keyHash = hashFunction(key);
        var bucket = myBuckets[keyHash];
        for (int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i).key == key) {
                bucket.get(i).value = bucket.get(i).value+1;
            }
        }
    }

    public void remove(int key) {
        int keyHash = hashFunction(key);
        var bucket = myBuckets[keyHash];
        int index = -1;
        for (int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i).key == key) {
                index = i;
            }
        }
        if(index != -1) bucket.remove(index);
    }
    public int get(int key) {
        int keyHash = hashFunction(key);
        var bucket = myBuckets[keyHash];
        int index = -1;
        for (int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i).key == key) {
                index = i;
            }
        }
        if(index != -1) return bucket.get(index).value;
        return index;
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 2);
    }
}
