package map;

import java.util.List;

public class Tile extends GameObject{
  private Boolean isFloor;
  private List charsOnTile;
  private static final String wall = "resources/wall.png";
  private static final String floor = "resources/floor.png";

  public Tile(int x, int y, Boolean isFloor, List charsOnTile) {
    this.x = x;
    this.y = y;
    this.isFloor = isFloor;
    if (isFloor) {
      setImage(floor);
    } else {
      setImage(wall);
    }
    this.charsOnTile = charsOnTile;
  }

  public Boolean getFloor() {
    return isFloor;
  }

  public List getCharsOnTile() {
    return charsOnTile;
  }

  public void setCharsOnTile(List charsOnTile) {
    this.charsOnTile = charsOnTile;
  }

  public void enter(Character character) {

  }

  public void leave(Character character) {
  }
}