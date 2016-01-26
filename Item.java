/**
 * @author TaiAu
 */

public interface Item {

  // REQUIREMENTS FOR ITEM

  /*
   * Allergies and Calories Change the Order Menu Filtering Menu Update Read
   * Only Menu Available Dishes
   * 
   * Cancel Order
   * 
   * 
   */

  /**
   * Returns the string representation of the Item. For debugging purposes.
   */
  String toString();

  /**
   * Returns the name of the Item.
   */
  String getName();

  /**
   * Sets the name of the Item.
   */
  void setName();

  /**
   * Returns the price of the Item.
   */
  double getPrice();

  /**
   * Sets the price of the Item.
   */
  void setPrice();

  /**
   * Returns the Item's stock quantity when called.
   */
  int getStockQuantity();

  /**
   * Returns the allergy information of the Item.
   */
  String getAllergyInfo();

  // setStock()? <- security risk?

  /**
   * Opens the Item to view its information e.g. allergies, nutrition and
   * calories when called.
   */
  void open();

  /**
   * Returns whether the Item is open or not.
   */
  void isOpen();

  /**
   * Returns the Item's availability depending on the Stock counter. When the
   * stock drops to 0, the Item becomes unavailable.
   * 
   * @return true or false
   */
  boolean isAvailabile();

}
