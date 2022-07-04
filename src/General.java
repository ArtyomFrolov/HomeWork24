import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class General {
    public static void main(String[] args) {

        // Решение задач 2, 3

        Box box1 = new Box(0.52, 0.44, TypeMaterial.PAPER);
        Box box2 = new Box(0.63, 0.81, TypeMaterial.PLASTIC);
        Box box3 = new Box(0.44, 0.32, TypeMaterial.WOOD);

        Box[] boxes = new Box[]{box1, box2, box3};
        System.out.println(Arrays.toString(boxes));

        Comparator<Box> boxComparator = (((o1, o2) -> new Double(o1.volume()).compareTo(o2.volume())));
        Comparator<Box> boxComparator1 = Comparator.comparing(box -> box.volume());

        Arrays.sort(boxes, boxComparator1);
        System.out.println(Arrays.toString(boxes));

        Arrays.sort(boxes, boxComparator);
        System.out.println(Arrays.toString(boxes));

        BoxComp boxComp1 = new BoxComp(0.52, 0.44, TypeMaterial.PAPER);
        BoxComp boxComp2 = new BoxComp(0.63, 0.81, TypeMaterial.PLASTIC);
        BoxComp boxComp3 = new BoxComp(0.44, 0.32, TypeMaterial.WOOD);

        BoxComp[] boxComps = new BoxComp[]{boxComp1, boxComp2, boxComp3};
        Arrays.sort(boxComps);
        System.out.println(Arrays.toString(boxComps));

        // Решение задачи 4

        Function<Box, String> boxStringFunction = box -> {
            String result = "";
            switch (box.getTypeMaterial().getTypeName()) {
                case "Пластик":
                    result = "Коробка из пластика";
                    break;
                case "Бумага":
                    result = "Коробка из бумаги";
                    break;
                case "Древесина":
                    result = "Коробка из древесины";
                    break;
            }
            return result;
        };

        System.out.println(boxStringFunction.apply(box1));
        System.out.println(boxStringFunction.apply(box2));
        System.out.println(boxStringFunction.apply(box3));

        // Решение задачи 5

        Supplier<String> stringSupplier = () -> {
            int rand = (int) (Math.random() * (2 + 1) + 0);
            String material = "";
            int ordPaper = TypeMaterial.PAPER.ordinal();
            int ordWood = TypeMaterial.WOOD.ordinal();
            int ordPlastic = TypeMaterial.PLASTIC.ordinal();
            if (rand == ordPaper) {
                material = TypeMaterial.PAPER.getTypeName();
            } else if (rand == ordWood) {
                material = TypeMaterial.WOOD.getTypeName();
            } else if (rand == ordPlastic) {
                material = TypeMaterial.PLASTIC.getTypeName();
            }
            return material;
        };

        System.out.println(stringSupplier.get());
    }
}
