// Java8 docs: https://docs.oracle.com/javase/8/docs/api/javax/swing/JDialog.html

/* LocalDateTime:
-> Java16 docs: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/time/LocalDateTime.html
-> A datetime without a timezone in year-month-day-hour-minute-second format.
 */

/*
-> Place the JDialog in the center of top-level container JFrame: JDialog.setLocationRelativeTo(JFrame);
-> Place any component in the center of screen: Component.setLocationRelativeTo(null);
-> When the owner\parent of a child container\JDialog is closed, the child is also closed.
-> When the owner is maximized or minimized, the child also maximized or minimized.
-> Child is always displayed upon its owner.
 */

import javax.swing.*;

import java.awt.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDialog {
    //    Top-level window frame.
    final static JFrame frame = new JFrame("Current Date Time");
    final static Container contentPane = frame.getContentPane();

    //    Layout.
    final static LayoutManager layout = new BorderLayout();

    public static void main(String[] args) {
        contentPane.setLayout(layout);

        JButton okButton = new JButton("Ok");

//        JDialog
        JDialog dateTimeDialog = new JDialog(frame, "DateTime");
        dateTimeDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JButton bringPopup = new JButton("Show date-time");
        bringPopup.addActionListener(e -> {
            dateTimeDialog.add(new JLabel(getCurrentDateTime()), BorderLayout.NORTH);
            dateTimeDialog.add(okButton, BorderLayout.CENTER);
            dateTimeDialog.setVisible(true);
            dateTimeDialog.setLocationRelativeTo(frame);
            dateTimeDialog.pack();
        });

        okButton.addActionListener(e -> {
            dateTimeDialog.dispose();
        });


//        Frame settings.
        frame.add(bringPopup);
        frame.setAlwaysOnTop(true); // Always on top of other opened window.
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }

    private static String getCurrentDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMMM, yyyy.\nhh:mm:ss a B");

        return ldt.format(formatter);
    }
}
