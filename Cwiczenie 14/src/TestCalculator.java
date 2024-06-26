import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalculator {

    private JLabel screen;
    private boolean start;
    private double result;
    private String lastCommand;

    public TestCalculator() {
        start = true;
        lastCommand = "=";
        JFrame frame = new JFrame();

        screen = new JLabel("0", JLabel.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(screen, BorderLayout.NORTH);
        frame.add(makeButtonsPanel(), BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private JPanel makeButtonsPanel() {
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(4, 4));

        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            panel.add(addButton(buttons[i]));
        }

        return panel;
    }

    private JButton addButton(String name) {
        JButton button = new JButton(name);

        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.addActionListener(calcListener);

        return button;
    }

    private ActionListener calcListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String v = ((JButton) e.getSource()).getText();

            if ("/+-*=".indexOf(v) >= 0) {
                calculate(v);
            } else {
                insertNUmber(v);
            }

        }
    };

    public void calculate(String s) {

        double num = Double.parseDouble(screen.getText());

        if (lastCommand.equals("=")) result = num;
        if (lastCommand.equals("+")) result += num;
        if (lastCommand.equals("*")) result *= num;
        if (lastCommand.equals("-")) result -= num;
        if (lastCommand.equals("/")) result /= num;

        screen.setText("" + result);
        lastCommand = s;
        start = true;

    }

    public void insertNUmber(String s) {

        if (start) {
            screen.setText("");
            start = false;
        }

        screen.setText(screen.getText() + s);

    }

    public static void main(String[] args) {

        TestCalculator calculator = new TestCalculator();

    }
}
