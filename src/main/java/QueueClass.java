public class QueueClass {

    private final NewLinkedList linkedList;

    public QueueClass() {
        this.linkedList = new NewLinkedList();
    }

    public void append(INode node) {
        linkedList.append(node);
    }

    public void printQueue() {
        linkedList.printNodes();
    }

    public INode peak() {
        return linkedList.head;
    }

    public INode deque() {
        return linkedList.popLast();
    }
}
