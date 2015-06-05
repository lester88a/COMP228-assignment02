package com.li.xu;

/**
 * Created by Thinkpad on 6/4/2015.
 */
public class Point {
    //declare X and Y instance variables
    private double _x, _y;

    //getter and setter
    public double get_x() {
        return _x;
    }

    public void set_x(double _x) {
        this._x = _x;
    }

    public double get_y() {
        return _y;
    }

    public void set_y(double _y) {
        this._y = _y;
    }

    //Constructor
    public Point (double x, double y)
    {
        this._x = x;
        this._y = y;
    }



}
