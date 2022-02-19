package chainofresponsibility;

class Director extends Handler {
    @Override
    public void approve(Purchase purchase) {
        if(purchase.getValue() < 10000F) {
            System.out.println("Purchase approved by director!");
        } else {
            this.next.approve(purchase);
        }
    }
}
