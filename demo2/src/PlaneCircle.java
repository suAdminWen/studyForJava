interface Centered {
    double getCenterX();
    double getCenterY();
}

public class PlaneCircle extends Circle implements Centered{
    //  继承

    private double cx, cy;
    public PlaneCircle(double r, double x, double y) {
        super(r);
        this.setCenter(x, y);
    }

    private void setCenter(double x, double y) {
         this.cx = x;
         this.cy = y;
    }

    public double getCenterX(){
        return cx;
    }

    public double getCenterY(){
        return cy;
    }
    public boolean isInside(double x, double y){
        double dx = cx - x, dy = cy - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return (distance < r);
    }
}
