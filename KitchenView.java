
/**
 * @author TaiAu
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class KitchenView extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          KitchenView frame = new KitchenView();
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
  public KitchenView() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 500, 750);
    setResizable(false);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(245, 245, 245));
    contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblRestaurantname = new JLabel("The GitHub");
    lblRestaurantname.setHorizontalAlignment(SwingConstants.CENTER);
    lblRestaurantname.setBounds(210, 6, 80, 30);
    contentPane.add(lblRestaurantname);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(5, 70, 155, 372);
    contentPane.add(scrollPane);

    JList list = new JList();
    list.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
      }
    });
    scrollPane.setViewportView(list);

    JScrollPane scrollPane_1 = new JScrollPane();
    scrollPane_1.setBounds(340, 70, 154, 372);
    contentPane.add(scrollPane_1);

    JList list_2 = new JList();
    list_2.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
      }
    });
    scrollPane_1.setViewportView(list_2);

    JScrollPane scrollPane_2 = new JScrollPane();
    scrollPane_2.setBounds(172, 70, 155, 372);
    contentPane.add(scrollPane_2);

    JList list_1 = new JList();
    list_1.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
      }
    });
    scrollPane_2.setViewportView(list_1);

    JLabel lblNew = new JLabel("NEW");
    lblNew.setHorizontalAlignment(SwingConstants.CENTER);
    lblNew.setBounds(60, 45, 30, 20);
    contentPane.add(lblNew);

    JLabel lblCooking = new JLabel("COOKING");
    lblCooking.setHorizontalAlignment(SwingConstants.CENTER);
    lblCooking.setBounds(210, 45, 80, 20);
    contentPane.add(lblCooking);

    JLabel lblDone = new JLabel("DONE");
    lblDone.setHorizontalAlignment(SwingConstants.CENTER);
    lblDone.setBounds(395, 45, 50, 20);
    contentPane.add(lblDone);

    JButton btnNewButton = new JButton("START");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnNewButton.setBounds(5, 445, 155, 29);
    contentPane.add(btnNewButton);

    JButton btnFinish = new JButton("FINISH");
    btnFinish.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnFinish.setBounds(173, 445, 155, 29);
    contentPane.add(btnFinish);

    JScrollPane scrollPane_3 = new JScrollPane();
    scrollPane_3.setBounds(95, 500, 155, 210);
    contentPane.add(scrollPane_3);

    JList list_3 = new JList();
    scrollPane_3.setViewportView(list_3);

    JScrollPane scrollPane_4 = new JScrollPane();
    scrollPane_4.setBounds(255, 500, 155, 210);
    contentPane.add(scrollPane_4);

    JList list_4 = new JList();
    scrollPane_4.setViewportView(list_4);

    JButton btnNotify = new JButton("NOTIFY");
    btnNotify.setBounds(342, 445, 155, 29);
    contentPane.add(btnNotify);

    JLabel lblTableId = new JLabel("TABLE ID");
    lblTableId.setHorizontalAlignment(SwingConstants.CENTER);
    lblTableId.setBounds(135, 475, 68, 20);
    contentPane.add(lblTableId);

    JLabel lblStatus = new JLabel("STATUS");
    lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
    lblStatus.setBounds(300, 475, 68, 20);
    contentPane.add(lblStatus);
  }
}
