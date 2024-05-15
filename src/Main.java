public class Main {
    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree();

        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(2);
        binaryTree.insert(6);
        binaryTree.insert(7);

        binaryTree.inOrder();
        System.out.println();
        binaryTree.remove(5);
        System.out.println();
        binaryTree.inOrder();
        System.out.println();

        MyHashTable<test, Student> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            String key = "key" + i;
            test testingClass = new test(key);
            Student student = new Student("Student " + i, rand.nextInt(30));
            table.put(testingClass, student);
        }

        int[] bucketSizes = new int[table.buckets.getSize()];
        for (ArrayList<Entry<test, Student>> bucket : table.buckets) {
            bucketSizes[bucket.getSize()]++;
        }

        System.out.println("bucket: ");
        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("bucket " + i + ": " + bucketSizes[i] + " elements");
        }

    }
}
