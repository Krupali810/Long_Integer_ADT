
public class SLLNode extends Position {

    private SLLNode next;

    public SLLNode(int value) {
        super(value);

        this.next = null;
    }

    public SLLNode getNext() {
        return this.next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

}
