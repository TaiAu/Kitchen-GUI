import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class CustomerView extends JPanel {

  private static CustomerView instance = new CustomerView();

  /**
   * Gets the single instance of the View.
   */
  public static CustomerView getInstance() {
    return instance;
  }

  /**
   * Create the panel.
   */
  private CustomerView() {
    this.build();
  }

  public void build() {

    setLayout(null);

    JList list = new JList();
    list.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    list.setBounds(29, 50, 467, 410);
    add(list);

    JButton btnCallWaitor = new JButton("Call Waitor");
    btnCallWaitor.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    btnCallWaitor.setBounds(633, 359, 140, 29);
    add(btnCallWaitor);

    JButton btnPlaceOrder = new JButton("Place Order");
    btnPlaceOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    btnPlaceOrder.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnPlaceOrder.setBounds(633, 400, 140, 60);
    add(btnPlaceOrder);

    JList list_1 = new JList();
    list_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    list_1.setBounds(633, 50, 140, 297);
    add(list_1);

    JLabel lblMenu = new JLabel("Menu");
    lblMenu.setFont(new Font("Lucida Grande", Font.BOLD, 20));
    lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
    lblMenu.setBounds(108, 6, 294, 34);
    add(lblMenu);

    JLabel lblYourOrder = new JLabel("Your Order");
    lblYourOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
    lblYourOrder.setHorizontalAlignment(SwingConstants.CENTER);
    lblYourOrder.setBounds(633, 9, 140, 32);
    add(lblYourOrder);

    JButton btnRemoveItem = new JButton("Remove Item");
    btnRemoveItem.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    btnRemoveItem.setBounds(508, 301, 113, 29);
    add(btnRemoveItem);

    JButton btnAddItem = new JButton("Add Item");
    btnAddItem.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    btnAddItem.setBounds(508, 188, 113, 29);
    add(btnAddItem);

    JTextArea txtrAddAnItem = new JTextArea();
    txtrAddAnItem.setWrapStyleWord(true);
    txtrAddAnItem.setEditable(false);
    txtrAddAnItem.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    txtrAddAnItem.setBackground(SystemColor.window);
    txtrAddAnItem.setLineWrap(true);
    txtrAddAnItem.setText("Add an item from the menu to your order.");
    txtrAddAnItem.setBounds(508, 140, 113, 60);
    add(txtrAddAnItem);

    JTextArea txtrRemoveAnItem = new JTextArea();
    txtrRemoveAnItem.setWrapStyleWord(true);
    txtrRemoveAnItem.setText("Remove an item from your order.");
    txtrRemoveAnItem.setLineWrap(true);
    txtrRemoveAnItem.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    txtrRemoveAnItem.setEditable(false);
    txtrRemoveAnItem.setBackground(SystemColor.window);
    txtrRemoveAnItem.setBounds(508, 267, 113, 60);
    add(txtrRemoveAnItem);

    JButton btnTrackOrder = new JButton("Track Order");
    btnTrackOrder.setEnabled(false);
    btnTrackOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    btnTrackOrder.setBounds(508, 359, 113, 29);
    add(btnTrackOrder);

    JComboBox comboBox = new JComboBox();
    comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    comboBox.setModel(new DefaultComboBoxModel(new String[] { "All", "Offers", "Vegan", "Vegetarian" }));
    comboBox.setBounds(508, 66, 113, 41);
    add(comboBox);

    JLabel lblSortMenuBy = new JLabel("Sort menu by:");
    lblSortMenuBy.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
    lblSortMenuBy.setBounds(508, 38, 113, 41);
    add(lblSortMenuBy);
  }
}