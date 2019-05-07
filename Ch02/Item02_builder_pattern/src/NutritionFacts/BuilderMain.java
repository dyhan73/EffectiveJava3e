package NutritionFacts;

public class BuilderMain {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .setCalories(100).setSodium(35).setCarbonhydrate(27).build();
        System.out.println(cocaCola);
    }
}
