package ciphertools.imagecipher.imagedata;

import java.awt.image.*;

import ciphertools.imagecipher.utils.*;

public class ImageData {
  private int imageHeight, imageWidth;
  private PixelRGBData[][] pixelRGBData;
  private PixelBinaryData[][] pixelBinaryData;
  
  public ImageData(BufferedImage image) {
    setImageHeight(image.getHeight());
    setImageWidth(image.getWidth());
    pixelRGBData = new PixelRGBData[imageHeight][imageWidth];
    pixelBinaryData = new PixelBinaryData[imageHeight][imageWidth];
    new ParseImage(image,this);
  }//End Method
  
  /**
   * 
   * @return
   */
  public int getImageHeight() {
    return imageHeight;
  }//End Method
  
  public int getImageWidth() {
    return imageWidth;
  }//End Method
  
  public PixelRGBData[][] getPixelRGBData() {
    return pixelRGBData;
  }//End Method
  
  public PixelBinaryData[][] getPixelBinaryData() {
    return pixelBinaryData;
  }//End Method
  
  public PixelRGBData getRGBColorDataAt(int row, int col) {
    return pixelRGBData[row][col];
  }//End Method
  
  public PixelBinaryData getBinaryColorDatasAt(int row, int col) {
    return pixelBinaryData[row][col];
  }//End Method
  
  public void setImageHeight(int imageHeight) {
    this.imageHeight = imageHeight;
  }//End Method
  
  public void setImageWidth(int imageWidth) {
    this.imageWidth = imageWidth;
  }//End Method
  
  public void setRGBColorDataAt(int row, int col, 
                                int red, int green, int blue) {
    pixelRGBData[row][col] = new PixelRGBData(red,green,blue);
  }//End Method
  
  public void setBinaryColorDataAt(int row, int col, int[] binarySequence) {
    pixelBinaryData[row][col] = new PixelBinaryData(binarySequence);
  }//End Method
  
  public void printAllImagePixelsRGBData() {
    System.out.println("Image Pixel Color RGB Data: ");
    System.out.println();
    
    for(int i = 0; i < pixelRGBData.length; i++) {
      for(int j = 0; j < pixelRGBData[i].length; j++) {
          System.out.print("Image RGB Color Data [" + i + "," + j + "]: ");
          pixelRGBData[i][j].printPixelRGB();
      }//End For
    }//End For
    System.out.println();
  }// End Method
  
  public void printAllImagePixelsBinaryData() {
    System.out.println("Image Pixel Color Binary Data: ");
    System.out.println();
    
    for(int i = 0; i < pixelBinaryData.length; i++) {
      for(int j = 0; j < pixelBinaryData[i].length; j++) {
        System.out.print("Image Binary Color Data [" + i + "," + j + "]: ");
        for(int k = 0; 
            k < pixelBinaryData[i][j].length(); k++) {
          System.out.print("" + pixelBinaryData[i][j].getBitAt(k)); 
        }//End For
        System.out.println();
      }//End For
    }//End For
    System.out.println();
  }// End Method
}//End Class