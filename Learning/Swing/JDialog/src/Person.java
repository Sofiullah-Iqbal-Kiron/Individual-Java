// Take information from a person and then show those on a Dialog.

import javax.swing.*;
import java.awt.*;

public class Person {
    //    Top-level frame.
    static final JFrame frame = new JFrame("Person Info");
    Container contentPane = frame.getContentPane();

    //    Layout.
    LayoutManager layout = new BorderLayout();

    public static void main(String[] args) {
//        "frame" settings.
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}
