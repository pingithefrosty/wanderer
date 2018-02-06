package map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Map extends GameObject {
  private Tile[][] map = new Tile[10][10];
  private List<String> layout;

  public Map() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (maze().get(j).charAt(i) == '0') {
          Tile floor = new Tile(i, j, true, null);
          map[i][j] = floor;
        } else if (maze().get(j).charAt(i) == '1') {
          Tile wall = new Tile(i, j, false, null);
          map[i][j] = wall;
        }
      }
    }
  }

  public List<String> maze() {
    Path path = Paths.get("resources/maze.txt");
    try {
      layout = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return layout;
  }


  public Tile[][] getMap() {
    return map;
  }

  public Tile getTile (int x, int y) {
    return map[x][y];
  }
}
