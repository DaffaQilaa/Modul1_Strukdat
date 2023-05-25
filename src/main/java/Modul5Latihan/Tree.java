package Modul5Latihan;

public class Tree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static class BinaryTree{
        public Node root;
        public void NewNode(int data){
            root = NewNode(root, new Node(data));
        }
        private Node NewNode(Node root, Node newData){
            if (root == null) {
                root = newData;
                return root;
            }
            if (newData.data < root.data) {
                root.left = NewNode(root.left, newData);
            }else{
                root.right = NewNode(root.right, newData);
            }
            return root;
        }
        public void inOrder(Node node){
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.data+" ");
                inOrder(node.right);
            }
        }
        public void preOrder(Node node){
            if (node != null) {
                System.out.print(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }
        public void postOrder(Node node){
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data + " ");
            }
        }
    }
        public static void main(String[] args) {
            BinaryTree pohon = new BinaryTree();

            pohon.NewNode(20);
            pohon.NewNode(2);
            pohon.NewNode(25);
            pohon.NewNode(37);
            pohon.NewNode(16);

            System.out.print("\n Pre Order : ");
            pohon.preOrder(pohon.root);
            System.out.print("\n In Order : ");
            pohon.inOrder(pohon.root);
            System.out.print("\n Post Order : ");
            pohon.postOrder(pohon.root);
        }

}
