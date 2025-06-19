package Hashing;

import java.util.LinkedList;

public class HashMapImpl {
    static class HashMap<K, V> {
        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }//...Node

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int bucketIndex(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int dataIndex(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        //put,remove, containsKey,size, rehashing
        public void put(K key, V value) {
            int bi = bucketIndex(key);
            int di = dataIndex(key, bi);
            LinkedList<Node> ll = buckets[bi];

            if (di == -1) {
                Node node = new Node(key, value);
                ll.add(node);
                n++;
                if ((n * 1.0) / N > 1) rehashing();
            } else {
                ll.get(di).value = value;
            }
        }

        //remove
        public V remove(K key) {
            int bi = bucketIndex(key);
            int di = dataIndex(key, bi);
            if (di == -1) {
                return null;
            } else {
                n--;
                return buckets[bi].remove(di).value;
            }
        }

        //containsKey
        public boolean containsKey(K key) {
            int bi = bucketIndex(key);
            int di = dataIndex(key, bi);
            return di != -1;
        }

        //rehashing
        @SuppressWarnings("unchecked")
        public void rehashing() {
            LinkedList<Node>[] oldBuckets = buckets;
            this.N = N * 2;
            this.n = 0;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> oldBucket : oldBuckets) {
                for (Node node : oldBucket) {
                    put(node.key, node.value);
                }
            }

        }
        public int numberOfBuckets(){
            return this.N;
        }

        public int numberOfPairs(){
            return this.n;
        }


    }//...HashMap


    public static void main(String[] args) {

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("India", 115);
        myMap.put("China", 110);
        myMap.put("USA", 50);
        myMap.put("UK", 40);
        myMap.put("Australia",20);
        myMap.put("Austria",5);
        myMap.put("Butan",2);
        myMap.put("Nepal",2);
        myMap.put("Thailand",3);

        System.out.println("Contains India");
        System.out.println( myMap.containsKey("India"));
        System.out.println("contains UK:" + myMap.containsKey("UK"));
        System.out.println("contains UN:" + myMap.containsKey("UN"));
//         int value=myMap.remove("UK");
//        System.out.println("Removed : "+ value);
//        System.out.println("contains UK:" + myMap.containsKey("UK"));
        System.out.println("Number of buckets : "+ myMap.numberOfBuckets());
        System.out.println("Number of pairs : "+ myMap.numberOfPairs());



    }//...mainMethod
}//...mainClass
