public class Square implements FigureGeometry{
    private Point point;

    public Square(Point p){
        point = p;
    }

    public float getSideLength(){
        return point.getWidth();
    }

    public float getArea(){
        return getSideLength() *getSideLength();
    }

    public float getPerimeter(){
        return getSideLength() * 4;
    }

    public void setPoint(Point p){
        point= p;
    }
}
