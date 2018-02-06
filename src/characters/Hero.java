package characters;

import map.GameObject;
import map.Map;

import javax.swing.*;
import java.awt.*;

public class Hero extends GameObject{
  protected int x;
  protected int y;
  private Image image;
  private static final String heroD = "resources/heroD.png";
  private static final String heroR = "resources/heroR.png";
  private static final String heroL = "resources/heroL.png";
  private static final String heroU = "resources/heroU.png";

  public enum Directions {
    UP, DOWN, LEFT, RIGHT
  }

  public Hero() {
    super();
    setImage(heroD);
    x = 0;
    y = 0;
  }

  public void setImage(String file){
    ImageIcon icon = new ImageIcon(file);
    this.image = icon.getImage();
  }

  public void move(Map map, Hero.Directions dir) {
    int newX = x / 72;
    int newY = y / 72;

    switch (dir) {
      case UP:
        newY = y - 1;
        setImage(heroU);
        break;
      case DOWN:
        newY = y + 1;
        setImage(heroD);
        break;
      case LEFT:
        newX = x - 1;
        setImage(heroL);
        break;
      case RIGHT:
        newX = x + 1;
        setImage(heroR);
        break;
    }

    if ((newX < 10) && (newY < 10) && (newX > -1) && (newY > -1)
        && map.getTile(newX, newY).getFloor()) {
      x = newX * 72;
      y = newY * 72;
    }
  }
}
