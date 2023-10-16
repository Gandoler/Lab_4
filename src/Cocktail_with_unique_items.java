import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cocktail_with_unique_items extends Cocktail{
    private List<Unigue_ingridients> unigueIngridients;
    public Cocktail_with_unique_items(String name_of_cocktail, List<Unigue_ingridients> unigueIngridients) {
        super(name_of_cocktail);
        this.unigueIngridients = unigueIngridients;
    }


    public Cocktail_with_unique_items() {
        super();

        this.unigueIngridients = new ArrayList<>();
        int bound = new Random().nextInt(3);


        for(int i=0;i< bound;i++){
            Unigue_ingridients unigueIngridients1 = Unigue_ingridients.values()
                    [new Random().nextInt(Unigue_ingridients.values().length)];
            this.unigueIngridients.add(unigueIngridients1);
        }
    }

    public void setUnigueIngridients(Unigue_ingridients unigueIngridients) {
        this.unigueIngridients.add(unigueIngridients);
    }

    @Override
    public void get_info_about_cocktail() {
        super.get_info_about_cocktail();
        System.out.println("\nУникальные ингредиенты:");
        for (Unigue_ingridients unique : unigueIngridients) {
            System.out.println(unique);

        }

    }
}
