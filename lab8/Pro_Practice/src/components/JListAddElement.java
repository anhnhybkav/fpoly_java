/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListAddElement {

    private static DefaultListModel listmodel; // here's our DefaultListModel

    private static void createAndShowUI() {
        final JFrame frame = new JFrame("JList AddElement");
        final JPanel mainPane = new JPanel();

        String[] items = {"Fe", "Fi", "Fo", "Fum", "What?!?"};

        // create the list model and fill with Strings
        listmodel = new DefaultListModel();
        for (int i = 0; i < items.length; i++) {
            listmodel.addElement(items[i]);
        }
        // create JList and give it our defaultlistmodel
        JList myJList = new JList(listmodel);

        // button that allows  us to add an item to the list model
        JButton addItem = new JButton("Add Item");
        addItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // call a joptionpane to get a string
                String text = JOptionPane.showInputDialog(frame, "Add Item to be Entered into List");
                if (text != null && !text.isEmpty()) {
                    // then add the string to the list's model here
                    // note that nothing else needs to be done.  When the model changes
                    // the list automatically shows these changes
                    listmodel.addElement(text);
                }
            }
        });

        mainPane.setPreferredSize(new Dimension(400, 300));
        mainPane.add(new JScrollPane(myJList));
        mainPane.add(addItem);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                createAndShowUI();
            }
        });
    }
}
