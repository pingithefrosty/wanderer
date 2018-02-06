package map;

import javax.swing.*;
import java.awt.*;

public class GameObject {
  protected int x;
  protected int y;
  private Image image;

  private void initObject() {
  }

  public GameObject() {
  }

  public void draw (Graphics graphics) {
    graphics.drawImage(image, x, y, null);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(String file){
    ImageIcon icon = new ImageIcon(file);
    this.image = icon.getImage();
  }
}
