// My applet program must be a subclass of java.applet.Applet or javax.swing.JApplet(Preferred) class.
// Applet supports all GUI(AWT, Swing)
// JApplet is totally deprecated.

import java.applet.Applet;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class SimplestApplet extends JApplet {
    @Override
    public void init() {
// Create Swing components
        JLabel nameLabel = new JLabel("Your Name:");
        JTextField nameFld = new JTextField(15);
        JButton sayHelloBtn = new JButton("Say Hello");
// Add an action litener to the button to display the message
        sayHelloBtn.addActionListener(e -> sayHello(nameFld.getText()));
// Add Swing components to the content pane of the applet
        Container contentPane = this.getC();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(nameLabel);
        contentPane.add(nameFld);
        contentPane.add(sayHelloBtn);
    }

    private void sayHello(String name) {
        String msg = "Hello there";
        if (name.length() > 0) {
            msg = "Hello " + name;
        }
// Display the hello message
        JOptionPane.showMessageDialog(null, msg, "Hello", INFORMATION_MESSAGE);
    }
}