import java.util.ArrayList;
import java.util.List;

public class HotDrink {
    public static void main(String[] args) {
        HotDrink hotDrink1 = new HotDrink();
        hotDrink1.name = "Ristretto";
        hotDrink1.volume = 15;
        hotDrink1.temperature = 92-96;
        hotDrink1.Cost = 60.0;
        HotDrink hotDrink2 = new HotDrink();
        hotDrink2.name = "Espresso";
        hotDrink2.volume = 30;
        hotDrink2.temperature = 90-96;
        hotDrink2.Cost = 90.0;
        HotDrink hotDrink3 = new HotDrink();
        hotDrink3.name = "Lungo";
        hotDrink3.volume = 45;
        hotDrink3.temperature = 90-94;
        hotDrink3.Cost = 100.0;
        HotDrinkAuto hotDrinkAuto = new HotDrinkAuto();
        ArrayList<HotDrink> arrayList = new ArrayList<HotDrink>(List.of(hotDrink1, hotDrink2, hotDrink3));
        hotDrinkAuto.initHotDrink(arrayList);
        System.out.println(hotDrinkAuto.GetHotDrink("Espresso", 30,90-96,90.0));
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temperature=" + temperature +
                ", Cost=" + Cost +
                '}';
    }


    String name;
    int volume;
    int temperature;
    Double Cost;
}
