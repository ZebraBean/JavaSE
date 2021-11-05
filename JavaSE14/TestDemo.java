package Tests.JavaSE14;

public class TestDemo {
    public static void main(String[] args) {
        RealLinkedList realLinkedList = new RealLinkedList();
        realLinkedList.addFirst(5);
        realLinkedList.addFirst(2);
        realLinkedList.addFirst(3);
        realLinkedList.addLast(4);
        realLinkedList.addLast(5);
        realLinkedList.addLast(5);
        realLinkedList.addIndex(0,5);
        realLinkedList.removeAllKey(5);
        realLinkedList.clear();
        realLinkedList.display();
    }
}
