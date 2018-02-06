package controls;

import characters.Hero;
import map.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  private static int testBoxX;
  private static int testBoxY;
  static Hero hero;
  static Map map;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    setPreferredSize(new Dimension(720, 800));
    setVisible(true);
    map = new Map();
    hero = new Hero();
  }


  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.fillRect(0, 0, 720, 720);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawImage(map.getTile(i, j).getImage(), i * 72, j * 72, null);
      }
    }
    hero.draw(g);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.move(map,Hero.Directions.UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.move(map,Hero.Directions.DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.move(map,Hero.Directions.LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.move(map,Hero.Directions.RIGHT);
    }
    repaint();
  }
}