/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListAddElement2 {

    static JList myJList1;
    static JList myJList2;
    private static DefaultListModel listmodel1; // here's our DefaultListModel
    private static DefaultListModel listmodel2;

    private static void createAndShowUI() {
        final JFrame frame = new JFrame("JList AddElement");
        final JPanel mainPane = new JPanel();
        mainPane.setSize(50, 100);

        frame.setLayout(new BorderLayout());

        String[] items1 = {"Thu hai", "Thu Ba", "Thu Tu", "Thu Nam"};
        String[] items2 = {"Tuesday", "Friday", "Sartusday", "Monday"};

        // create the list model and fill with Strings
        listmodel1 = new DefaultListModel();
        for (int i = 0; i < items1.length; i++) {
            listmodel1.addElement(items1[i]);
        }
        listmodel2 = new DefaultListModel();
        for (int i = 0; i < items1.length; i++) {
            listmodel2.addElement(items2[i]);
        }
        // create JList and give it our defaultlistmodel
        myJList1 = new JList(listmodel1);
        myJList2 = new JList(listmodel2);

        // button that allows  us to add an item to the list model
        JButton addItem1 = new JButton(" < ");
        JButton addItem2 = new JButton(" > ");

        addItem1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    listmodel1.addElement(myJList2.getSelectedValue());
                    listmodel2.remove(myJList2.getSelectedIndex());
                } catch (Exception ex) {
                    System.out.println("Ban chua chon hoac da het item");
                }

            }
        });

        addItem2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    listmodel2.addElement(myJList1.getSelectedValue());
                    listmodel1.remove(myJList1.getSelectedIndex());
                } catch (Exception ex) {
                    System.out.println("Ban chua chon hoac da het item");
                }

            }
        });


        //mainPane.setPreferredSize(new Dimension(400, 300));
        frame.add(new JScrollPane(myJList1), BorderLayout.WEST);

        mainPane.add(addItem1);
        mainPane.add(addItem2);
        frame.add(mainPane, BorderLayout.CENTER);

        frame.add(new JScrollPane(myJList2), BorderLayout.EAST);

//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add(mainPane);
        //  frame.pack();
        frame.add(myJList2, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        JListAddElement2.createAndShowUI();

    }
}
