package chainofresponsibility;

abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void approve(Purchase purchase);
}
