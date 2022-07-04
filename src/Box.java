public class Box {
    private double weight;
    private double height;
    private TypeMaterial typeMaterial;

    public Box() {
    }

    public Box(double weight, double height, TypeMaterial typeMaterial) {
        this.weight = weight;
        this.height = height;
        this.typeMaterial = typeMaterial;
    }

    @Override
    public String toString() {
        return " Коробка " +
                " ширина: : " + weight +
                " высота: " + height +
                " материал: " + typeMaterial.getTypeName() +
                " объём: " + volume();
    }

    public double volume() {
        double volume;
        return volume = this.height * this.weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TypeMaterial getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(TypeMaterial typeMaterial) {
        this.typeMaterial = typeMaterial;
    }
}
