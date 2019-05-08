public class UiPixelAttrib {
    public double Size = 3;
    public double Green = 0, Red = 0, Blue = 0;
    public UiPixelAttrib(){}
    public UiPixelAttrib(double red, double green, double blue) {
        Green = green;
        Red = red;
        Blue = blue;
    }
    public void setSize(double size) {
        Size = size;
    }
    
    public double green() {return Green;}
    public double red() {return Red;}
    public double blue() {return Blue;}
    public double size() {return Size;}

}