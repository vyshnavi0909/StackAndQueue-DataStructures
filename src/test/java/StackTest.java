import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class StackTest {
    @Test
    public void given3Nums_WhenAdded_ShouldHaveLastAdded(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        StackClass stack = new StackClass();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        INode peak = stack.peak();
        Assertions.assertEquals(thirdNode, peak);
    }

    @Test
    public void given3Nums_PopUntillStackIsEmpty(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        StackClass stack = new StackClass();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.pop();
        stack.printStack();
        INode peak = stack.peak();
        Assertions.assertEquals(secondNode, peak);
    }

    @Test
    public void given3Nums_WhenEnqueue_FirstAdded_ShouldBeAtTop(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        QueueClass queue = new QueueClass();
        queue.append(firstNode);
        queue.append(secondNode);
        queue.append(thirdNode);
        queue.printQueue();
        INode peak = queue.peak();
        Assertions.assertEquals(firstNode, peak);
    }


}
