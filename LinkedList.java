public class LinkedList{
    Node head;

    private static class Node {
        int value; // value of node
        Node nextNode; // reference to the next node in the linked list

        public Node(int value) { // Constructor to create a node
            this.value = value;
        }
    }

    public void add(int toAdd){
        // Linked list is empty -> node to add becomes the head
        if (this.head == null) {
            this.head = new Node(toAdd);
        }
        // Linked list not empty -> node to add becomes head and points to the previous head
        // Add new node to start of linked list
        else {
            Node nodeToAdd = new Node(toAdd);
            nodeToAdd.nextNode = this.head;
            this.head = nodeToAdd;
        }
    }

    public void delete(int toDelete){
        Node currentNode = this.head;

        if (this.head == null){
            System.out.println("Linked list is empty.");
            return;
        }

        if (this.head.value == toDelete){
            this.head = this.head.nextNode;
            return;
        }
        while (currentNode.nextNode != null){
            // find the node to delete
            if (currentNode.nextNode.value == toDelete){ // node to delete is found
                currentNode.nextNode = currentNode.nextNode.nextNode;
                return;
            }
            else {
                currentNode = currentNode.nextNode;
            }
        }

        System.out.println("Node to delete does not exist.");

    }

    public int length(){
        int count = 0;
        Node currentNode = this.head;
        while (currentNode != null){
            count+=1;
            currentNode = currentNode.nextNode;
        }
        return count;
    }

    public int nthElement(int n){ // index of linked list starts at 0

        Node currentNode = this.head;

        if (n > this.length() - 1){
            System.out.println("Element does not exist");
        }

        for (int i = 0; i < n; i++){
            currentNode = currentNode.nextNode;
        }
        return currentNode.value;
    }


    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.add(10);
        myList.add(20);
        myList.delete(20);
        myList.add(30);
        System.out.println(myList.length());
        System.out.println(myList.head.value);
        System.out.println(myList.nthElement(0));
        System.out.println(myList.nthElement(1));
        //System.out.println(myList.nthElement(2));
    }

}
