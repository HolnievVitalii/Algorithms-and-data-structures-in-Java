package lessonEight;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author holnievvitalii@outlook.com
 * @version dated 30.10.2019
 */
public class ChainedMethod {
    interface HashTable1 {
        boolean push(int x, int y);

        boolean delete(int x);

        int get(int x);
    }

    public class Pair {
        private final int key;
        private final int value;
        private boolean deleted;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public boolean isDeleted() {
            return deleted;
        }

        public boolean deletePair() {
            if (!this.deleted) {
                this.deleted = true;
                return true;
            } else {
                return false;
            }
        }
    }

    public class ChainHashTable extends HashMaker implements HashTable1 {
        private ArrayList[] table;

        public ChainHashTable() {
            table = new ArrayList[100000];
        }

        public boolean push(int x, int y) {
            int h = returnHash(x);
            int n;
            try {
                n = table[h].size();
            } catch (NullPointerException e) {
                table[h] = new ArrayList();
                n = 0;
            }
            for (int i = 0; i < n; i++) {
                if (table[h].get(i).getKey() == x) {
                    table[h].set(i, new Pair(x, y));
                    return false;
                }
            }
            table[h].add(new Pair(x, y));
            return true;
        }

        public boolean delete(int x) {
            int h = returnHash(x);
            int n;
            try {
                n = table[h].size();
            } catch (NullPointerException e) {
                return false;
            }
            for (int i = 0; i < n; i++) {
                if (table[h].get(i).getKey().equals(x)) {
                    table[h].remove(i);
                    return true;
                }
            }
            return false;
        }

        public int get(int x) {
            int h = returnHash(x);
            int n;
            try {
                n = table[h].size();
            } catch (NullPointerException e) {
                return Integer.parseInt(null);
            }
            for (int i = 0; i < n; i++) {
                if (table[h].get(i).getKey().equals(x)) {
                    return table[h].get(i).getValue();
                }
            }
            return Integer.parseInt(null);
        }
    }


    public abstract class HashMaker {
        public int returnHash(int x) {
            return hashCode();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ChainHashTable table = new ChainHashTable();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            if (s.equals("push")) {
                int temp = in.nextInt();
                table.push(temp, temp);
            }
            if (s.equals("delete")) {
                int temp = in.nextInt();
                table.delete(temp);
            }
            if (s.equals("get")) {
                int temp = in.nextInt();
                System.out.println(table.get(temp));
            }
        }
    }
}

