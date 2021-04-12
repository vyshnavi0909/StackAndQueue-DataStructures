import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    public void given3Nums_WhenEnqueue_FirstAdded_ShouldBeAtFirst(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        QueueClass queue = new QueueClass();
        queue.append(firstNode);
        queue.append(secondNode);
        queue.append(thirdNode);
        queue.printQueue();
        INode peak = queue.peak();
        Assertions.assertEquals(firstNode, peak);
    }

    @Test
    public void given3Nums_WhenDeque_ShouldDeleteEndElement(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        QueueClass queue = new QueueClass();
        queue.append(firstNode);
        queue.append(secondNode);
        queue.append(thirdNode);
        INode deque = queue.deque();
        queue.printQueue();
        Assertions.assertEquals(thirdNode, deque);
    }

}
