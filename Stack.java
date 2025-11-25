public class Stack{
    Node topOfStack;

    //Implement using linked list

    private static class Node{
        int value;
        Node nextNode;

        public Node(int value){
            this.value = value;
        }
    }

    public void push(int value){
        if (this.topOfStack == null){
            this.topOfStack = new Node(value);
        }else{
            Node newNode = new Node(value);
            newNode.nextNode = this.topOfStack;
            this.topOfStack = newNode;
        }
    }

    public int pop(){
        if (this.topOfStack == null){
            System.out.println("Stack is empty");
        }else{
            int returnVal = this.topOfStack.value;
            this.topOfStack = this.topOfStack.nextNode;
            return returnVal;
        }
        return -1;
    }

    public int peek(){ // returns top of stack without removing it
        return this.topOfStack.value;
    }

    public int size(){
        int count = 0;
        Node currentNode = this.topOfStack;
        while (currentNode != null){
            count+=1;
            currentNode = currentNode.nextNode;
        }
        return count;
    }

    public static void main(String[] args){
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        myStack.push(8);
        System.out.println(myStack.size());
    }
}