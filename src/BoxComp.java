public class BoxComp extends Box implements Comparable<Box> {
    public BoxComp(double weight, double height, TypeMaterial typeMaterial) {
        super(weight, height, typeMaterial);
    }

    @Override
    public int compareTo(Box o) {
        return new Double(volume()).compareTo(o.volume());
    }
}
