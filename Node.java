public class Node {
    int id;
    int path = Integer.MAX_VALUE;
    Node previous;

    public Node(int id){
        this.id = id;
    }
}
