public class Circle implements FigureGeometry{

    private float radius;

    public Circle(float theRadius){
        radius = theRadius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float theRadius) {
        this.radius = theRadius;
    }

    public float getArea(){
        return getRadius() * getRadius() * PI;
    }

    public float getPerimeter(){
        return getRadius() * 2 * PI;
    }
}
