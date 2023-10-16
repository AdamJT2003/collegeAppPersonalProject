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

        startQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (quizComboBoxQuizzes.getSelectedItem() == "Internet of Things (IoT)"){
                    //Creates a new instance of the IoTQuiz class and assigns it to the variable prog
                    IoTQuiz prog = new IoTQuiz();

                    //Calls the method called IoTQuizQ1 within the IoTQuiz class
                    prog.IoTQuizQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Digital Skills: Software Development") {
                    //Creates a new instance of the DigSkillsSoftDevQuiz class and assigns it to the variable prog
                    DigSkillsSoftDevQuiz prog = new DigSkillsSoftDevQuiz();

                    //Calls the method called DigSkillsSoftDevQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.DigSkillsSoftDevQuizQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Digital Skills: Computer Science"){
                    //Creates a new instance of the DigSkillsCompSciQuiz class and assigns it to the variable prog
                    DigSkillsCompSciQuiz prog = new DigSkillsCompSciQuiz();

                    //Calls the method called DigSkillsCompSciQ1 within the DigSkillsCompSciQuiz class
                    prog.DigSkillsCompSciQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Digital Skills: Cybersecurity"){
                    //Creates a new instance of the DigSkillsCyberSecQuiz class and assigns it to the variable prog
                    DigSkillsCyberSecQuiz prog = new DigSkillsCyberSecQuiz();

                    //Calls the method called DigSkillsCyberSecQuizQ1 within the DigSkillsCyberSecQuiz class
                    prog.DigSkillsCyberSecQuizQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Digital Skills: Data Science"){
                    //Creates a new instance of the DigSkillsDataSciQuiz class and assigns it to the variable prog
                    DigSkillsDataSciQuiz prog = new DigSkillsDataSciQuiz();

                    //Calls the method called DigSkillsDataSciQ1 within the DigSkillsDataSciQuiz class
                    prog.DigSkillsDataSciQuizQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Network Infrastructure"){
                    //Creates a new instance of the NetworkInfraQuiz class and assigns it to the variable prog
                    NetworkInfraQuiz prog = new NetworkInfraQuiz();

                    //Calls the method called NetworkInfraQuizQ1 within the NetworkInfraQuiz class
                    prog.NetworkInfraQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Cloud Computing"){
                    //Creates a new instance of the CloudComputingQuiz class and assigns it to the variable prog
                    CloudComputingQuiz prog = new CloudComputingQuiz();

                    //Calls the method called CloudComputingQuizQ1 within the CloudComputingQuiz class
                    prog.CloudComputingQuizQ1();
                }else if (quizComboBoxQuizzes.getSelectedItem() == "Computer Science"){
                    //Creates a new instance of the ComputerScienceQuiz class and assigns it to the variable prog
                    ComputerScienceQuiz prog = new ComputerScienceQuiz();

                    //Calls the method called IoTQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.ComputerScienceQuizQ1();
                } else if (quizComboBoxQuizzes.getSelectedItem() == "Software Development") {
                    //Creates a new instance of the SoftwareDevelopmentQuiz class and assigns it to the variable prog
                    SoftwareDevelopmentQuiz prog = new SoftwareDevelopmentQuiz();

                    //Calls the method called IoTQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.SoftDevQuizQ1();
                }
            }
        });
    }
}
