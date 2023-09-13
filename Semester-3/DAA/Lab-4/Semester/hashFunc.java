import java.util.Arrays;
import java.util.Scanner;

class HashTable {
    private int tableSize;
    private int[] table;
    private boolean[] isOccupied; // To check if a bucket is occupied or not

    public HashTable(int size) {
        tableSize = size;
        table = new int[size];
        isOccupied = new boolean[size];
        Arrays.fill(isOccupied, false);
    }

    private int hashFunction(int key) {
        return key % tableSize;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        while (isOccupied[index]) {
            index = (index + 1) % tableSize;
        }
        table[index] = key;
        isOccupied[index] = true;
    }

    public void delete(int key) {
        int index = hashFunction(key);
        while (isOccupied[index] && table[index] != key) {
            index = (index + 1) % tableSize;
        }
        if (isOccupied[index] && table[index] == key) {
            isOccupied[index] = false;
        }
    }

    public int search(int key) {
        int index = hashFunction(key);
        while (isOccupied[index]) {
            if (table[index] == key) {
                return index;
            }
            index = (index + 1) % tableSize;
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < tableSize; i++) {
            if (isOccupied[i]) {
                System.out.println("Bucket " + i + ": " + table[i]);
            } else {
                System.out.println("Bucket " + i + ": Empty");
            }
        }
    }

    public void printProbeNumbers(int key) {
        int index = hashFunction(key);
        int probes = 0;
        while (isOccupied[index] && table[index] != key) {
            index = (index + 1) % tableSize;
            probes++;
        }
        System.out.println("Probe numbers for key " + key + ": " + probes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tableSize = 10;
        HashTable hashTable = new HashTable(tableSize);

        System.out.println("Enter keys to insert: ");
        String[] inputKeys = scanner.nextLine().split(" ");
        for (String keyStr : inputKeys) {
            int key = Integer.parseInt(keyStr);
            hashTable.insert(key);
        }

        System.out.println("Enter a key to search: ");
        int keyToSearch = scanner.nextInt();
        System.out.println("Searching for key " + keyToSearch + ": " + hashTable.search(keyToSearch));

        System.out.println("Enter a key to delete: ");
        int keyToDelete = scanner.nextInt();
        hashTable.delete(keyToDelete);
        System.out.println("Hash Table after deleting key " + keyToDelete + ":");
        hashTable.display();

        System.out.println("Enter a key to print probe numbers: ");
        int keyToProbe = scanner.nextInt();
        hashTable.printProbeNumbers(keyToProbe);

        scanner.close();
    }
}
