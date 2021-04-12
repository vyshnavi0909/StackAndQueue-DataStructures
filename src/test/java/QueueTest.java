import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    @Test
    public void given3Nums_WhenEnqueue_FirstAdded_ShouldBeAtTop(){
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

}
