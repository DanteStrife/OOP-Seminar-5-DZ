import java.util.ArrayList;

public class HotDrinkAuto implements CoffeeAuto{
    ArrayList<HotDrink> array = new ArrayList<>();

    @Override
    public void initHotDrink(ArrayList arrayHotDrink) {
        array=arrayHotDrink;

    }

    @Override
    public HotDrink GetHotDrink(String name) {
        return null;
    }



    @Override
    public HotDrink GetHotDrink(String name, int volume, int temperature, Double Cost) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).name.equals(name) && array.get(i).volume == volume && array.get(i).temperature == temperature && array.get(i).temperature == temperature) {
                return array.get(i);
            }
        }
        return null;
    }
}
