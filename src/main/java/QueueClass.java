public class QueueClass {

    private final NewLinkedList linkedList;

    public QueueClass() {
        this.linkedList = new NewLinkedList();
    }

    public void append(INode node) {
        linkedList.append(node);
    }

    public INode peak() {
        return linkedList.head;
    }

    public void printQueue() {
        linkedList.printNodes();
    }


    public INode deque() {
        return linkedList.popLast();
    }

}
