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

    }
}