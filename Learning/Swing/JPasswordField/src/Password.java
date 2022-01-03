// A very simple LogIn form.
// Method by method tasking.

import javax.swing.*;
import java.awt.*;

public class Password {
    public static JFrame frame = new JFrame("Password Demo");
    private static Container contentPane = frame.getContentPane();

    //    Layout.
    private static LayoutManager layout = new FlowLayout();

    //    Components for LogIn form.
    private static JLabel userLabel = new JLabel("Username: ");
    private static JTextField userName = new JTextField(10);

    private static JLabel passwordLabel = new JLabel("Password: ");
    private static JPasswordField password = new JPasswordField(8);

    private static JCheckBox showPassword = new JCheckBox("Show Password", false);

    private static Box userComponentsContainer = Box.createHorizontalBox();
    private static Box passwordComponentsContainer = Box.createHorizontalBox();
    private static Box logInFormContainer = Box.createVerticalBox();

    //    Methods.
    public static void main(String[] args) {
        constructLogInForm();

        frameSet();
    }

    private static void constructLogInForm() {
        userLabel.setLabelFor(userName);
        passwordLabel.setLabelFor(password);

        userComponentsContainer.add(userLabel);
        userComponentsContainer.add(userName);

        passwordComponentsContainer.add(passwordLabel);
        passwordComponentsContainer.add(password);

        logInFormContainer.add(userComponentsContainer);
        logInFormContainer.add(new JPanel());
        logInFormContainer.add(passwordComponentsContainer);
        logInFormContainer.add(new JPanel());
        logInFormContainer.add(showPassword);

        contentPane.add(logInFormContainer);
    }

    private static void frameSet() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }

    private static Dimension giveFrameDimension() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        return new Dimension(screenSize.width / 2, (int) screenSize.height / 2);
    }
}
