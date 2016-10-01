
public class SLLSimpleList implements SimpleList<SLLNode> {

    private SLLNode head;
    private SLLNode tail;

    public SLLSimpleList() {

    }

    public void insertFirst(int value) {

        SLLNode node = new SLLNode(value);
        if (head != null) {

            node.setNext(head);
            head = node;

        } else {
            head = node;
            tail = head;
            //only one node condition
        }

    }

    public void insertLast(int value) {
        SLLNode node = new SLLNode(value);
        if (head != null) {

            tail.setNext(node);
            tail = node;

        } else {
            head = node;
            tail = head;
            //only one node condition
        }
        //

    }

    public SLLNode first() {
        return head;

    }

    public SLLNode last() {
        return tail;
    }

    public boolean isFirst(SLLNode p) {
        if (p == head) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isLast(SLLNode p) {
        if (p == tail) {
            return true;
        } else {
            return false;
        }
    }

    public SLLNode before(SLLNode p) {
        //
        SLLNode node = head;
        //
        while (node.getNext() != null) {
            if (node.getNext() == p) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public SLLNode after(SLLNode p) {
        return p.getNext();
    }

    public boolean isEmpty() {
        if (head.getNext() == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        int size = 1;
        while (head != tail) {
            head = head.getNext();
            size++;
        }
        return size;
    }

    public boolean isSLL() {
        return true;
    }
}
