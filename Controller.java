import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Controller should listen to all of the views. It should ask the model for
 * data and update the views accordingly. Each View should be stored in an
 * instance of an Entity: Entity will be either a table, waiter, kitchen staff
 * or management. An Entity should store information about itself, for example:
 * A table will contain the accounts of each customer at the table and the order
 * that is currently being made.
 */
public class Controller {

  private static Controller instance = new Controller();

  private Model model;

  private JFrame[] frames = new JFrame[4];
  private JComponent[] views = new Fakeview[4];
  private Color[] colors = { Color.BLACK, Color.RED, Color.GREEN, Color.BLUE };

  private Controller() {
    model = new Model();
    for (int i = 0; i < frames.length; i++) {
      frames[i] = createDisplayFrame();
      views[i] = new Fakeview(colors[i]);
      displayView(frames[i], views[i]);
    }
  }

  private void displayView(JFrame frame, JComponent view) {
    // do some things with a list of views
    frame.getContentPane().add(view, 0);
  }

  /**
   * Create the JFrame.
   */
  private JFrame createDisplayFrame() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setPreferredSize(new Dimension(500, 500));
    frame.pack();
    frame.setVisible(true);
    return frame;
  }

  /*
   * Listeners to each view should be added here.
   */
  public static Controller getInstance() {
    return instance;
  }
}