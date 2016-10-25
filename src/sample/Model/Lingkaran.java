package sample.Model;

import static java.lang.Math.sqrt;

/**
 * Created by root on 19/10/16.
 */
public class Lingkaran {
    private double r;
    private Point p;

    public Lingkaran(double r, Point p) {
        this.r = r;
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public Point getP() {
        return p;
    }

    public void setR(float r) {
        this.r = r;
    }

    public void setP(Point p) {
        this.p = p;
    }
}
