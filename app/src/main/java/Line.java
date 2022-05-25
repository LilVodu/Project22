public class Line {
    Point a, b;
    double length;
    public Line(Point a, Point b){
        this.a = a;
        this.b = b;
        length = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public boolean onLine(Point c){
        return (c.y - a.y)/(b.y - a.y) == (c.x - a.x)/(b.x - a.x);
    }

    public double angleBetween(Line line){
        Vector a = new Vector(this.a.x - this.b.x, this.a.y - this.b.y);
        Vector b = new Vector(line.a.x - line.b.x, line.a.y - line.b.y);
        return Math.toDegrees(Math.acos(Math.abs(a.scalarProduct(b)) / (a.module * b.module)));
    }
}