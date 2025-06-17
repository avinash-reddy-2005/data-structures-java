class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        this.root = null;
    }

    void insert(int n) {
        Node newNode = new Node(n);

        if (root == null) {
            root = newNode;
            return;
        }

        Node cur = root;

        while (true) {
            if (n > cur.data) {
                if (cur.right == null) {
                    cur.right = newNode;
                    break;
                } else {
                    cur = cur.right;
                }
            } else {
                if (cur.left == null) {
                    cur.left = newNode;
                    break;
                } else {
                    cur = cur.left;
                }
            }
        }
    }

    void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(3);
        t.insert(5);
        t.insert(1);
        t.display(t.root); // Output should be: 1 3 5
    }
}
