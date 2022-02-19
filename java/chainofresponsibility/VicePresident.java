package chainofresponsibility;

class VicePresident extends Handler {
    @Override
    public void approve(Purchase purchase) {
        if(purchase.getValue() < 50000F) {
            System.out.println("Purchase approved by vice president!");
        } else {
            this.next.approve(purchase);
        }
    }
}
