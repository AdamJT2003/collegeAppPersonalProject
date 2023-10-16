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
    private JPanel navBarStudents;
    private JPanel textBackgroundStudents;
    private JButton homeBtnStudents;
    private JButton quizzesBtnStudents;
    private JButton studentsBtnStudents;
    private JButton lecturersBtnStudents;
    private JButton coursesBtnStudents;
    private JButton aboutBtnStudents;
    private JButton accountSignInBtnStudents;
    private JButton gradesBtnStudents;
    private JComboBox courseComboBoxQuizzes;
    private JButton startQuizButton;
    private JComboBox quizComboBoxQuizzes;
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

        //Students Page styling
        //Sets border for the main text background
        textBackgroundStudents.setBorder(roundedBorder);

        //Sets border for navigation bar buttons
        homeBtnStudents.setBorder(buttonBorder);
        quizzesBtnStudents.setBorder(buttonBorder);
        studentsBtnStudents.setBorder(buttonBorder);
        lecturersBtnStudents.setBorder(buttonBorder);
        coursesBtnStudents.setBorder(buttonBorder);
        aboutBtnStudents.setBorder(buttonBorder);
        accountSignInBtnStudents.setBorder(buttonBorder);
        gradesBtnStudents.setBorder(buttonBorder);

        //Adds a blank space to the quiz combo box for empty selection
        quizComboBoxQuizzes.addItem("");


        //Home Page
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
        lecturersBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        coursesBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        aboutBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        accountSignInBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gradesBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        //Quizzes Page
        homeBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(HomeScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        quizzesBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(QuizzesScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        studentsBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(StudentScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        lecturersBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        coursesBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        aboutBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        accountSignInBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gradesBtnQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        courseComboBoxQuizzes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //Provides the option of quizzes available dependent on the course
                if (courseComboBoxQuizzes.getSelectedItem() == "HNC NextGen Computing"){
                    quizComboBoxQuizzes.addItem("Digital Skills: Software Development");
                    quizComboBoxQuizzes.addItem("Digital Skills: Computer Science");
                    quizComboBoxQuizzes.addItem("Digital Skills: Data Science");
                    quizComboBoxQuizzes.addItem("Digital Skills: Cybersecurity");
                    quizComboBoxQuizzes.addItem("Internet of Things (IoT)");
                    quizComboBoxQuizzes.addItem("Computer Science");
                    quizComboBoxQuizzes.addItem("Network Infrastructure");
                    quizComboBoxQuizzes.addItem("Software Development");
                    quizComboBoxQuizzes.addItem("Cloud Computing");
                    quizComboBoxQuizzes.addItem("Cybersecurity");
                    quizComboBoxQuizzes.addItem("Web Development");
                }
                if (courseComboBoxQuizzes.getSelectedItem() != "HNC NextGen Computing"){
                    quizComboBoxQuizzes.removeItem("Digital Skills: Software Development");
                    quizComboBoxQuizzes.removeItem("Digital Skills: Computer Science");
                    quizComboBoxQuizzes.removeItem("Digital Skills: Data Science");
                    quizComboBoxQuizzes.removeItem("Digital Skills: Cybersecurity");
                    quizComboBoxQuizzes.removeItem("Internet of Things (IoT)");
                    quizComboBoxQuizzes.removeItem("Computer Science");
                    quizComboBoxQuizzes.removeItem("Network Infrastructure");
                    quizComboBoxQuizzes.removeItem("Software Development");
                    quizComboBoxQuizzes.removeItem("Cloud Computing");
                    quizComboBoxQuizzes.removeItem("Cybersecurity");
                    quizComboBoxQuizzes.removeItem("Web Development");
                }
            }
        });



        //Students Page
        homeBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(HomeScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        quizzesBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(QuizzesScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        studentsBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(StudentScrollPane);
                Background.repaint();
                Background.revalidate();
            }
        });
        lecturersBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        coursesBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        aboutBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        accountSignInBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gradesBtnStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
