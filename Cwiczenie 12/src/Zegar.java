import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zegar extends JFrame implements Runnable {

    private Thread thread;
    String hour, minute, second;
    JLabel label;

    public Zegar() {
        label = new JLabel("", JLabel.CENTER);
        label.setBounds(5, 5, 100, 40);
        add(label);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        try {

            while (true) {
                LocalDateTime today = LocalDateTime.now();
                hour = "" + today.getHour();
                minute = String.format("%02d", today.getMinute());
                second = String.format("%02d", today.getSecond());

                label.setText(hour + ":" + minute + ":" + second);
                thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Zegar clock = new Zegar();


    }


}
