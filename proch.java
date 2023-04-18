import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.*;

public class proch {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for (int i = 0; i < 20; i++) {
            int n = (int) (Math.random() * 10 + 1);
            l1.add(n);
        }
        JFrame f1 = new JFrame();
        f1.setTitle(" Project Assignment");
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextField fl1 = new JTextField();
        fl1.setPreferredSize(new Dimension(550, 100));
        fl1.setHorizontalAlignment(JTextField.CENTER);
        StringBuffer str = new StringBuffer();
        str.append("{ ");
        for (int i = 0; i < l1.size(); i++) {
            str.append(l1.get(i) + ", ");
        }
        str.append("}");
        fl1.setText("List: " + str.toString());
        JRadioButton st = new JRadioButton("Stack");
        st.setPreferredSize(new Dimension(100, 100));
        JRadioButton q = new JRadioButton("Queue");
        q.setPreferredSize(new Dimension(100, 100));
        ButtonGroup gr = new ButtonGroup();
        gr.add(st);
        gr.add(q);
        JButton ps = new JButton("push");
        JButton p2 = new JButton("pop");
        JButton p3 = new JButton("Add");
        JButton p4 = new JButton("Delete");
        ps.setPreferredSize(new Dimension(100, 50));
        p2.setPreferredSize(new Dimension(100, 50));
        p3.setPreferredSize(new Dimension(100, 50));
        p4.setPreferredSize(new Dimension(100, 50));
        JTextField tf1 = new JTextField();
        tf1.setPreferredSize(new Dimension(400, 50));
        tf1.setHorizontalAlignment(JTextField.CENTER);
        ps.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (st.isSelected()) {
                    try {
                        int v = Integer.parseInt(JOptionPane.showInputDialog("Enter number to push:"));
                        l1.add(v);
                        StringBuffer str1 = new StringBuffer();
                        str1.append("{ ");
                        for (int i = 0; i < l1.size(); i++) {
                            str1.append(l1.get(i) + ", ");
                        }
                        str1.append("}");
                        fl1.setText("List: " + str1.toString());
                        tf1.setText("Successfully pushed " + v + " to List");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "only integer acceptable", "Error",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Operation selection",
                            " Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        p2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (st.isSelected()) {
                    int v = l1.removeLast();
                    StringBuffer str1 = new StringBuffer();
                    str1.append("{ ");
                    for (int i = 0; i < l1.size(); i++) {
                        str1.append(l1.get(i) + ", ");
                    }
                    str1.append("}");
                    fl1.setText("List: " + str1.toString());
                    tf1.setText("Successfully poped " + v + " from List");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Operation selection",
                            " Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (q.isSelected()) {
                    try {
                        int v = Integer.parseInt(JOptionPane.showInputDialog(" Number to add: "));
                        l1.add(v);
                        StringBuffer str1 = new StringBuffer();
                        str1.append("{ ");
                        for (int i = 0; i < l1.size(); i++) {
                            str1.append(l1.get(i) + ", ");
                        }
                        str1.append("}");
                        fl1.setText("List: " + str1.toString());
                        tf1.setText("Successfully Added " + v + " to List");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Integer accepted", "Message",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Operation selection",
                            " Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        p4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (q.isSelected()) {
                    int v = l1.removeFirst();
                    StringBuffer str1 = new StringBuffer();
                    str1.append("{ ");
                    for (int i = 0; i < l1.size(); i++) {
                        str1.append(l1.get(i) + ", ");
                    }
                    str1.append("}");
                    fl1.setText("List: " + str1.toString());

                    tf1.setText("Successfully deleted " + v + " from List");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Operation selection",
                            " Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        f1.add(fl1);
        f1.add(st);
        f1.add(q);
        f1.add(ps);
        f1.add(p3);
        f1.add(p2);
        f1.add(p4);
        f1.add(tf1);
        f1.setSize(600, 600);
        f1.setResizable(true);
        f1.setVisible(true);
    }
}
