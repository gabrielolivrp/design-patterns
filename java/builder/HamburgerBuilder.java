package builder;

class HamburgerBuilder extends SandwichBuilder {
    private Sandwich sandwich = null;

    public HamburgerBuilder() {
        this.sandwich = new Hamburger();
    }

    @Override
    public void openBread() {
        System.out.println("Open hamburger bread");
    }

    @Override
    public void insertIngredients() {
        System.out.println("Insert meat and cheese");
    }
    
    @Override
    public void closeBread() {
        System.out.println("Close hamburger bread");
    }

    @Override
    public Sandwich getSandwich() {
        System.out.println("Burger is ready");
        return sandwich;
    }
}
