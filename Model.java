/**
 * The model class should communicate the with database via factories, it should
 * use factory classes to create menus and have a list of all entities in the
 * system so that they may be updated when required.
 *
 */

public class Model {

  private static Model instance = new Model();

  public static Model getInstance() {
    return instance;
  }
}