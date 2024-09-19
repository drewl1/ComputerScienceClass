import javax.swing.*;
import java.awt.*;

public class HiLoGUI extends JFrame {
    private int secret;
    private final JTextField guessBox;
    private final JLabel resultLbl;
    private final JLabel attmptLbl;
    int attempts = 0;

    public HiLoGUI() {
        setTitle("HiLo");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTitle = new JLabel("guess a number between 1 and 100:");
        lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTitle.setBounds(80, 20, 300, 30);
        add(lblTitle);

        attmptLbl = new JLabel("attempts: "+attempts);
        attmptLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
        attmptLbl.setBounds(155, 40, 100, 30);
        add(attmptLbl);

        guessBox = new JTextField();
        guessBox.setBounds(150, 70, 100, 30);
        add(guessBox);

        resultLbl = new JLabel("enter your guess");
        resultLbl.setHorizontalAlignment(SwingConstants.CENTER);
        resultLbl.setBounds(50, 160, 300, 30);
        add(resultLbl);

        JButton guessBtn = new JButton("guess");
        guessBtn.setBounds(150, 110, 100, 30);
        add(guessBtn);

        newGame();

        guessBtn.addActionListener(e -> checkGuess());
        setSize(new Dimension(400, 250));
        setVisible(true);
    }
    public void newGame() {
        secret = (int) (Math.random() * 100 + 1);
        resultLbl.setText("enter your guess");

    }
    public void checkGuess() {
        String guessText = guessBox.getText();
        String text;
        attempts++;
        try {
            int guess = Integer.parseInt(guessText);

            if (guess < secret) {
                text = guess + "? TOO LOW LOSER";
            } else if (guess > secret) {
                text = guess + "? TOO HIGH LOSER";
            } else {
                text = guess + " is correct.";
                newGame();
            }
        } catch (NumberFormatException e) {
            text = "enter a proper value";
        }
        resultLbl.setText(text);
        attmptLbl.setText("attempts: "+attempts);
        guessBox.requestFocus();
        guessBox.selectAll();
    }
    public static void main(String[] args) {
        new HiLoGUI();
    }
}
