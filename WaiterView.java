import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

/**
 * @author Sabina Sandia
 *
 */
public class WaiterView extends JFrame {

  private JPanel contentPane;
  private JTable table;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          WaiterView frame = new WaiterView();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public WaiterView() {
    setBounds(new Rectangle(0, 0, 1920, 1080));
    setName("frmWaiterInterface");
    setResizable(false);
    setMinimumSize(new Dimension(1920, 1080));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JPanel pnlLogo = new JPanel();
    pnlLogo.setFont(new Font("Arial", Font.PLAIN, 16));
    pnlLogo.setBorder(new LineBorder(new Color(0, 0, 0)));
    pnlLogo.setBounds(41, 32, 311, 74);
    pnlLogo.setMinimumSize(new Dimension(400, 20));
    contentPane.add(pnlLogo);
    pnlLogo.setLayout(null);

    JTextArea txtrRestaurantNameAnd = new JTextArea();
    txtrRestaurantNameAnd.setBounds(57, 25, 196, 22);
    txtrRestaurantNameAnd.setText("Restaurant Name and Logo");
    pnlLogo.add(txtrRestaurantNameAnd);

    // table = new JTable();
    TableColumn column = null;
    TableRow row = null;

    JTable table = new JTable(10, 5);
    table.setFont(new Font("Arial", Font.PLAIN, 16));
    table.setBorder(new LineBorder(new Color(0, 0, 0)));

    table.setRowHeight(32);

    // configure column 0
    table.setValueAt("Menu Item", 0, 0);
    column = table.getColumnModel().getColumn(0);
    column.setMinWidth(10);
    column.setMaxWidth(1000);
    column.setPreferredWidth(1000);

    // configure column 1
    table.setValueAt("Quantity", 0, 1);
    column = table.getColumnModel().getColumn(1);
    column.setMinWidth(10);
    column.setMaxWidth(1000);
    column.setPreferredWidth(60);

    // configure column 2
    table.setValueAt("Status", 0, 2);
    column = table.getColumnModel().getColumn(2);
    column.setMinWidth(10);
    column.setMaxWidth(1000);
    column.setPreferredWidth(100);

    // configure column 3
    table.setValueAt("Time Placed", 0, 3);
    column = table.getColumnModel().getColumn(3);
    column.setMinWidth(10);
    column.setMaxWidth(1000);
    column.setPreferredWidth(100);

    // configure column 4
    table.setValueAt("Paid", 0, 4);
    column = table.getColumnModel().getColumn(4);
    column.setMinWidth(10);
    column.setMaxWidth(1000);
    column.setPreferredWidth(50);

    table.setBackground(Color.LIGHT_GRAY);
    table.setBounds(41, 675, 1341, 320);
    contentPane.add(table);

    JPanel pnlClientCalls = new JPanel();
    pnlClientCalls.setFont(new Font("Arial", Font.PLAIN, 16));
    pnlClientCalls.setBounds(41, 154, 311, 440);
    contentPane.add(pnlClientCalls);

    // Client Calls List
    DefaultListModel model;
    model = new DefaultListModel();
    JList listClientCalls = new JList(model);
    listClientCalls.setBorder(new LineBorder(UIManager.getColor("Button.shadow")));
    listClientCalls.setBounds(1, 1, 307, 444);
    pnlClientCalls.add(listClientCalls);

    model.addElement("Element1");
    pnlClientCalls.setLayout(null);

    JScrollPane pane = new JScrollPane(listClientCalls);
    pane.setBounds(1, 1, 307, 389);
    JButton addButton = new JButton("Assign Table");
    addButton.setBounds(1, 392, 154, 46);
    JButton removeButton = new JButton("Remove Table");
    removeButton.setBounds(155, 392, 154, 46);

    pnlClientCalls.add(pane);
    pnlClientCalls.add(addButton);
    pnlClientCalls.add(removeButton);

    JTextArea txtrClientCalls = new JTextArea();
    txtrClientCalls.setBounds(41, 117, 124, 26);
    contentPane.add(txtrClientCalls);
    txtrClientCalls.setBackground(UIManager.getColor("CheckBox.background"));
    txtrClientCalls.setFont(new Font("Arial", Font.PLAIN, 16));
    txtrClientCalls.setText("Client Calls");

    JTextArea txtrTable = new JTextArea();
    txtrTable.setFont(new Font("Arial", Font.PLAIN, 16));
    txtrTable.setBackground(UIManager.getColor("CheckBox.background"));
    txtrTable.setText("Table: ");
    txtrTable.setBounds(41, 638, 66, 26);
    contentPane.add(txtrTable);

    JLabel lblTable = new JLabel("____");
    lblTable.setFont(new Font("Arial", Font.PLAIN, 16));
    lblTable.setBounds(133, 635, 42, 28);
    contentPane.add(lblTable);

    // Pending Calls List
    JTextArea txtrPendingCallsTo = new JTextArea();
    txtrPendingCallsTo.setBackground(UIManager.getColor("CheckBox.background"));
    txtrPendingCallsTo.setFont(new Font("Arial", Font.PLAIN, 16));
    txtrPendingCallsTo.setText("Pending Calls to other Waiters");
    txtrPendingCallsTo.setBounds(456, 120, 220, 23);
    contentPane.add(txtrPendingCallsTo);

    JPanel pnlPendingCalls = new JPanel();
    pnlPendingCalls.setBorder(new LineBorder(new Color(0, 0, 0)));
    pnlPendingCalls.setBounds(454, 154, 311, 440);
    contentPane.add(pnlPendingCalls);
    pnlPendingCalls.setLayout(null);

    DefaultListModel model1;
    model1 = new DefaultListModel();
    JList listPendingCalls = new JList(model1);
    listPendingCalls.setBorder(new LineBorder(UIManager.getColor("Button.shadow")));
    listPendingCalls.setBounds(0, 0, 311, 440);
    pnlPendingCalls.add(listPendingCalls);
    model1.addElement("Element2");

    // Ready for Collection List
    JPanel pnlReadyCollection = new JPanel();
    pnlReadyCollection.setBounds(882, 154, 212, 440);
    contentPane.add(pnlReadyCollection);
    pnlReadyCollection.setLayout(null);

    DefaultListModel model2;
    model2 = new DefaultListModel();
    JList listReadyCollection = new JList(model2);
    listReadyCollection.setBorder(new LineBorder(UIManager.getColor("Button.shadow")));
    listReadyCollection.setBounds(0, 0, 212, 440);
    pnlReadyCollection.add(listReadyCollection);
    model2.addElement("Element3");

    JTextArea txtrReadyForCollection = new JTextArea();
    txtrReadyForCollection.setBackground(UIManager.getColor("CheckBox.background"));
    txtrReadyForCollection.setFont(new Font("Arial", Font.PLAIN, 16));
    txtrReadyForCollection.setText("Ready for Collection");
    txtrReadyForCollection.setBounds(882, 118, 151, 25);
    contentPane.add(txtrReadyForCollection);

  }
}