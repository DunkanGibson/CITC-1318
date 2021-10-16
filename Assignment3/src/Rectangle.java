public class Rectangle implements FigureGeometry{
    private Point point;

    public Rectangle(Point p){
        point = p;
    }

    public int getWidth() {
        return point.getWidth();
    }

    public int getHeight(){//returns the height of a Rectangle object as follows:
        return point.getHeight();
    }

    public float getArea(){//returns the area of a Rectangle object as follows:
        return getWidth() * getHeight ();
    }

    public float getPerimeter(){//returns the perimeter of a Rectangle object as follows:
        return (getWidth() + getHeight()) * 2;
    }

    public void setPoint(Point p){//assigns the point of a Rectangle object as follows:
        point = p;
    }
}
