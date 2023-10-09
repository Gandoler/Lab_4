import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Cocktail mojito = new Cocktail("Мохито");
        mojito.setActions(Actions.POUR);
        mojito.setActions(Actions.STIR);
        mojito.setActions(Actions.SHAKE);
        mojito.setIngredients(new Ingredient("Tequila", 0.05));
        mojito.setIngredients(new Ingredient("Triple Sec", 0.02));
        mojito.setIngredients(new Ingredient("Lime Juice", 0.02));
        mojito.get_info_about_cocktail();



        Cocktail_with_unique_items pina_colada = new Cocktail_with_unique_items("Пина Колада");
        pina_colada.setIngredients(new Ingredient("White Rum", 0.06));
        pina_colada.setIngredients(new Ingredient("Pineapple Juice", 0.09));
        pina_colada.setIngredients(new Ingredient("Coconut Cream", 0.03));
        pina_colada.setIngredients(new Ingredient("Simple Syrup", 0.015));
        pina_colada.setActions(Actions.POUR);
        pina_colada.setActions(Actions.STIR);
        pina_colada.setActions(Actions.SHAKE);
        pina_colada.setUnigueIngridients(Unigue_ingridients.Ice);
        pina_colada.get_info_about_cocktail();

    }
}