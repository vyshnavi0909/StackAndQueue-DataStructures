public class StackClass {
    private final NewLinkedList linkedList;

    public StackClass() {
        this.linkedList = new NewLinkedList();
    }

    public void push(INode node) {
        linkedList.add(node);
    }

    public void printStack() {
        linkedList.printNodes();
    }

    public INode peak() {
        return linkedList.head;
    }

    public INode pop() {
        return linkedList.pop();
    }

}
