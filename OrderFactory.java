/**
 * @author TaiAu
 */

public class OrderFactory {
  // private Database db;
  private static OrderFactory instance = new OrderFactory();

  public static OrderFactory getInstance() {
    return instance;
  }

  // DATABASE YET TO BE DONE
  /*
   * public void setDb(Database argDb) { this.db = argDb; }
   */

  public Item createOrder(String name, double price, String allergyInfo, Boolean availability, Item child) {
    return createOrder(name, price, allergyInfo, availability, child);
  }

  // DATABASE YET TO BE DONE
  /*
   * public Item createItem(String name, ItemType type, String desc, float
   * value, Item child, boolean save) throws NameClashException { Item
   * createdItem; switch (type) { case DEVELOPER: createdItem = new
   * AggregateItem(name, desc, value); break; case PROJECT: createdItem = new
   * AggregateItem(name, desc, value); break; case STORY: createdItem = new
   * AggregateItem(name, desc, value); break; case STORY_DEVELOPER: createdItem
   * = new SingleItem(name, Float.valueOf(value), child); break; default:
   * createdItem = null; } if ((save) && (this.db != null)) {
   * this.db.insertItem(type, createdItem); } return createdItem; }
   * 
   * public void setDatabase(Database argdb) { this.db = argdb; } }
   */
}