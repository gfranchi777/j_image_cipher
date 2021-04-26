package ciphertools.imagecipher.imagedata;

public class PixelRGBData {
  private int red,green,blue;
  private int[] rgb = new int[3];
  
  public PixelRGBData() {
    
  }//End Method
  
  public PixelRGBData(int red, int green, int blue) {
    setRed(red);
    setGreen(green);
    setBlue(blue);
  }//End Method
  
  public void setRed(int red) {
    this.red = red;
    this.rgb[0] = red;
  }//End Method
  
  public void setGreen(int green) {
    this.green = green;
    this.rgb[1] = green;
  }//End Method
  
  public void setBlue(int blue) {
    this.blue = blue;
    this.rgb[2] = blue;
  }//End Method
  
  public int getRed() {
    return red;
  }//End Method
  
  public int getGreen() {
    return green;
  }//End Method
  
  public int getBlue() {
    return blue;
  }//End Method
  
  public int[] getRGB() {
    return rgb;
  }//End Method
  
  public void printPixelRGB() {
    System.out.println("Red  : " + getRed());
    System.out.println("Green: " + getGreen());
    System.out.println("Blue : " + getBlue());
  }//End Method
}//End Class