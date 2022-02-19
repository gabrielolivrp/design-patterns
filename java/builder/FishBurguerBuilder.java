package builder;

class FishBurguerBuilder extends SandwichBuilder {
    private Sandwich sandwich = null;

    public FishBurguerBuilder() {
        this.sandwich = new FishBurguer();
    }

    @Override
    public void openBread() {
        System.out.println("Open fishburger bread");
    }

    @Override
    public void insertIngredients() {
        System.out.println("Insert fish fillet");
    }
    
    @Override
    public void closeBread() {
        System.out.println("Close fishburger bread");
    }

    @Override
    public Sandwich getSandwich() {
        System.out.println("Burger is ready");
        return sandwich;
    }
}
