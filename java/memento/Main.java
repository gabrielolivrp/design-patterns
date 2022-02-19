package memento;

class Main {
    public static void main(String args[]) {
        Seller seller = new Seller("Gabriel", 5000);
        System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());

        SellState state = new SellState();
        state.setMemento(seller.saveState());
        System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());

       seller.setName("Marcos");
       seller.setSalesAmount(1500);
       System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());

       seller.restoreState(state.getMemento());
       System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());
    }
}
