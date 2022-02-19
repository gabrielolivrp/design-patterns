package builder;

class Main {
    public static void main(String args[]) {
        Kitchen kitchen = new Kitchen();

        SandwichBuilder builder1 = new HamburgerBuilder();
        SandwichBuilder builder2 = new FishBurguerBuilder();
        
        System.out.println("Hamburger");
        kitchen.makeSandwich(builder1);
        builder1.getSandwich();
        
        System.out.println("\nFishBurger");
        kitchen.makeSandwich(builder2);
        builder2.getSandwich();
    }
}
