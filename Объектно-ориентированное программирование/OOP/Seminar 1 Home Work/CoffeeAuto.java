import java.util.ArrayList;

public interface CoffeeAuto {
    public void initHotDrink(ArrayList arrayHotDrink);
    public HotDrink GetHotDrink(String name);

    HotDrink GetHotDrink(String name, int volume, int temperature, Double Cost);
}
