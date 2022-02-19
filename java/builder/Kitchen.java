package builder;

class Kitchen {
    public void makeSandwich(SandwichBuilder builder) {
        builder.openBread();
        builder.insertIngredients();
        builder.closeBread();
    }
}
