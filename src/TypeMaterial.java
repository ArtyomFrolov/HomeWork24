public enum TypeMaterial {
    PAPER("Бумага"),
    PLASTIC("Пластик"),
    WOOD("Древесина");

    private final String typeName;

    TypeMaterial(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
