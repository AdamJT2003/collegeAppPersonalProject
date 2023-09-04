import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GradeApp {
    private JPanel Background;
    private JPanel Home;
    private JPanel navBarHome;
    private JButton homeBtnHome;
    private JButton quizzesBtnHome;
    private JButton studentsBtnHome;
    private JButton lecturersBtnHome;
    private JButton coursesBtnHome;
    private JButton aboutBtnHome;
    private JButton accountSignInBtnHome;
    private JButton gradesBtnHome;
    private JTextPane welcomeTextPane;
    private JPanel textBackground;
    private JPanel Quizzes;
    private JPanel navBarQuizzes;
    private JPanel textBackgroundQuizzes;
    private JScrollPane StudentsScrollPane;
    private JScrollPane QuizzesScrollPane;
    private JScrollPane HomeScrollPane;
    private JTextPane HomeHeading;
    private JButton homeBtnQuiz;
    private JButton quizzesBtnQuiz;
    private JButton studentsBtnQuiz;
    private JButton lecturersBtnQuiz;
    private JButton coursesBtnQuiz;
    private JButton aboutBtnQuiz;
    private JButton accountSignInBtnQuiz;
    private JButton gradesBtnQuiz;
    private JScrollPane StudentScrollPane;
    private JPanel Students;
    private JPanel nav;
    private JButton HomeBtn;


    public static void main(String[] args) {
        // create new jFrame
        JFrame frame = new JFrame("College Help");
        // set the jFrame to contain the GUI
        frame.setContentPane(new GradeApp().Background);
        // set exit on close, pack components and make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public GradeApp() {

        boolean signIn = false;

        if (signIn == true) {
            accountSignInBtnHome.setText("Account");
            accountSignInBtnQuiz.setText("Account");
        } else if (signIn == false) {
            accountSignInBtnHome.setText("Sign-in");
            accountSignInBtnQuiz.setText("Sign-in");
        }

        //Home Page styling
        //Sets Border for the main text background
        Border roundedBorder = new LineBorder(Color.gray, 10, true); // the third parameter - true, says it's round
        textBackground.setBorder(roundedBorder);

        //Sets border for navigation bar buttons
        Border buttonBorder = new LineBorder(Color.decode("#771919"), 2, true);
        homeBtnHome.setBorder(buttonBorder);
        quizzesBtnHome.setBorder(buttonBorder);
        studentsBtnHome.setBorder(buttonBorder);
        lecturersBtnHome.setBorder(buttonBorder);
        coursesBtnHome.setBorder(buttonBorder);
        aboutBtnHome.setBorder(buttonBorder);
        accountSignInBtnHome.setBorder(buttonBorder);
        gradesBtnHome.setBorder(buttonBorder);

        //Quizzes Page styling
        //Sets border for the main text background
        textBackgroundQuizzes.setBorder(roundedBorder);

        //Sets border for navigation bar buttons
        homeBtnQuiz.setBorder(buttonBorder);
        quizzesBtnQuiz.setBorder(buttonBorder);
        studentsBtnQuiz.setBorder(buttonBorder);
        lecturersBtnQuiz.setBorder(buttonBorder);
        coursesBtnQuiz.setBorder(buttonBorder);
        aboutBtnQuiz.setBorder(buttonBorder);
        accountSignInBtnQuiz.setBorder(buttonBorder);
        gradesBtnQuiz.setBorder(buttonBorder);



        homeBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(HomeScrollPane);
                Background.repaint();
                Background.revalidate();

            }
        });
        quizzesBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(QuizzesScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        studentsBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(StudentScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        homeBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(HomeScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
    }
}
