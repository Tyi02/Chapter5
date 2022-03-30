package com.CSCI185;

public class Rectangle {
    private int length;
    private int width;

    //Mutators
    public void setLength(int newLength) {

        length = newLength;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }
    //Accessor
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea()
    {
        return length*width;
    }

    public void writeOutput()
    {

        System.out.println("Length: "+ length );
        System.out.println("Width: "+ width );
        System.out.println("Area: "+ getArea() );
    }

    public boolean equals(Rectangle other)
    {
     //complicated one
       /* boolean result;
        result = this.length == other.length &&
                 this.width == other.width;
        return result;
    */
        return this.length == other.length && this.width == other.width;
    }

}
