import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSize() {

        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        BinaryTree.add(56);
        BinaryTree.add(30);
        BinaryTree.add(70);
        int size = BinaryTree.getSize();
        Assert.assertEquals(3, size);
    }
}