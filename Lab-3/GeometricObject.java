public class GeometricObject {
    private String color;
    private  boolean isFilled = false;

    public GeometricObject(){
        this.color = "red";
        this.isFilled = false;
    }

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
