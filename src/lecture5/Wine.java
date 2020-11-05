package lecture5;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class Wine {

    String color;
    String region;
    double strength;

    public Wine(String color, String region, double strength) {
        this.color = color;
        this.region = region;
        this.strength = strength;
    }

    @Override
    public boolean equals(Object glass) {
        if (this == glass) {
            System.out.println("Это похоже на искомый бокал...");
            return true;
            }
        if (!(glass instanceof Wine)) {
            System.out.println("Второй бокал вообще не с вином!");
            return false;
            }
        Wine wine = (Wine) glass;
        System.out.println("может быть этот...");
        return Double.compare(wine.strength, strength) == 0 &&
                color.equals(wine.color) &&
                region.equals(wine.region);

    }

    @Override
    public int hashCode() {
        return Objects.hash(color, region, strength);
    }

    public boolean findTheGlassOfWine(Object[] glassesOfWine, Object strangeGlass){
        for (int i = 0; i < glassesOfWine.length; i++) {
            if (glassesOfWine[i].equals(strangeGlass)) {
                System.out.println("Здесь есть твой бокал!");
                return true;
                }
            }
        System.out.println("сорри, здесь нет твоего бокала( ");
        return false;
        }

    public void findAndDrink(Object[] glassesOfWine, Object strangeGlass){
        for (int i = 0; i < glassesOfWine.length; i++) {
            if (glassesOfWine[i].equals(strangeGlass)) {
                Object X = glassesOfWine[i];

                for (int j = i + 1; j < glassesOfWine.length; j++, i++){
                    glassesOfWine[i] = glassesOfWine[j];
                }
                glassesOfWine[glassesOfWine.length-1] = null;
                System.out.println("Бокал найден и выпит. Остались " + Arrays.toString(glassesOfWine));
                break;

            } else {
                System.out.println("сорри, здесь нет твоего бокала( ");
            }

        }
    }
}
