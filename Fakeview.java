import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A view only used for testing purposes.
 * 
 * @author Ben
 */

public class Fakeview extends JPanel {

  private Color color;

  public Fakeview(Color c) {
    this.color = c;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(color);
    g.fillRect(10, 10, getWidth() - 20, getHeight() - 20);

  }
}