package lesson7;

public enum Size {
    SMALL("smole"),
    MEDIUM("medium"),
    BIG("big"),
    ;

    public String size;

    Size(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Size{" +
                "size='" + size + '\'' +
                '}';
    }
}

