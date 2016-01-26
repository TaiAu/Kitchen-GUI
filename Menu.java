import java.util.ArrayList;

/**
 * A menu is a list of items. The items can be of any type (drink, food, etc).
 * Typically the menu will be a list of sorted items e.g. a list containing only
 * a type of item or a list with some allergy requirement. The list should be
 * created using the menufactory which will create lists based on some sorting
 * value. The each menu should be associated with a table.
 */
public class Menu {
  // list that contains the items.
  private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

  public Menu() {

  }
}