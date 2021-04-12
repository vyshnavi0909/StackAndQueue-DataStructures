import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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
        StackClass stack = new StackClass();
        stack.append(firstNode);
        stack.append(secondNode);
        stack.append(thirdNode);
        stack.printStack();
        INode peak = stack.peak();
        Assertions.assertEquals(firstNode, peak);
    }


}
