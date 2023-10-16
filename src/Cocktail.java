import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cocktail {
    private final String name_of_cocktail;
    private  List<Ingredient> ingredients;
    private  List<Actions> actions;
    private static int count_of_cocktails;
    public Cocktail(String name_of_cocktail){
        this.name_of_cocktail = name_of_cocktail;
        this.ingredients = new ArrayList<>();
        this.actions = new ArrayList<Actions>();
    }
    public Cocktail(String name_of_cocktail,List<Ingredient> ingredients,List<Actions> actions){
        this.name_of_cocktail = name_of_cocktail;
        this.ingredients = ingredients;
        this.actions = actions;
    }
    public Cocktail(){
        this.name_of_cocktail = new  Random_string_generator().generate_random_string();
        this.ingredients = new ArrayList<>();
        this.actions = new ArrayList<Actions>();
        int bound = new Random().nextInt(3);
        for(int i=0;i<bound;i++){
            Actions actions1 = Actions.values()[new Random().nextInt(Actions.values().length)];
            this.actions.add(actions1);
        }
        bound = new Random().nextInt(3);
        for(int i=0;i<bound;i++){
            ingredients.add(new Ingredient(new Random_string_generator().generate_random_string()
                    ,new Random().nextDouble()));
        }

    }



    public List<Actions> getActions() {
        return actions;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getName_of_cocktail() {
        return name_of_cocktail;
    }

    public void setActions(Actions action) {
        this.actions.add(action);
    }

    public void setIngredients(Ingredient ingredients) {
        this.ingredients.add(ingredients);
    }



    public void get_info_about_cocktail(){
        System.out.printf("%n%n");
        System.out.printf("Название коктейля - %s%n", this.getName_of_cocktail());
        System.out.println("Ингредиенты:");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName_of_ingredient() + ": " + ingredient.getQuantity() + " л");
        }
        System.out.println("Последовательность действий:");
        for (Actions action : actions) {
            System.out.println(action);

        }
        System.out.printf("Крепость коктейля - %.2f%%",this.calculateStrength());

    }

    public double calculateStrength(){
        Random random = new Random();
        double minValue = 0.1;
        double maxValue = 0.42;
        return random.nextDouble() * (maxValue - minValue) + minValue;
    }
}
