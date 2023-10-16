import javax.swing.*;

public class NetworkInfraQuiz {

        public int quizTotal;

        public static void main(String[] args) {
            //initialises prog
            NetworkInfraQuiz prog = new NetworkInfraQuiz();
            //calls DigSkillsSoftDevQ1 method
            prog.NetworkInfraQ1();
        }

        public void NetworkInfraQ1() {
            //initialising options array, creating JRadioButton as radios array and setting it as options array
            String[] options = {"a) Bus                                                                                                                                                                                                                                                    ",
                    "b) Star",
                    "c) Mesh",
                    "d) Route"};

            //Initialises JRadioButton array called radios and set it the length of options
            JRadioButton[] radios = new JRadioButton[options.length];

            //create button group so only one radio button can be selected at once
            ButtonGroup group = new ButtonGroup();

            //A loop to create a new radio button for each option
            for (int i = 0; i < options.length; i++) {
                radios[i] = new JRadioButton(options[i]);
                //Adding radio button to the group
                group.add(radios[i]);
            }
            //Initialising result as JOptionPane
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Which of the following is NOT a network topology? (Choose one)  ", JOptionPane.OK_CANCEL_OPTION);

            //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
            if (result == JOptionPane.OK_OPTION) {

                //If radios[3] is selected, it will prompt a correct answer message and add 1 to quizTotal.
                if (radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    NetworkInfraQ2();
                }
                //If radios[0], radios[1] or radios[2] is selected it will prompt an incorrect message and move onto the next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d.");
                    NetworkInfraQ2();
                }
                //If there is no input then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    NetworkInfraQ1();
                }
            }
        }

        public void NetworkInfraQ2() {
            //Options for the buttons
            String[] options = {"a) To prevent unauthorized access to a network                                                                                                                                                                                                                                                                   ",
                    "b) To manage hardware resources",
                    "c) To provide internet connectivity ",
                    "d) To provide a user interface for applications"};
            //creating JRadioButton array called radios and setting it to the length of options.
            JRadioButton[] radios = new JRadioButton[options.length];

            //Creates a button group called group.
            ButtonGroup group = new ButtonGroup();

            //A loop to create a new radio button for each option
            for (int i = 0; i < options.length; i++) {
                radios[i] = new JRadioButton(options[i]);

                //adds all radio buttons to the group so that only one can be selected at once.
                group.add(radios[i]);
            }
        /*Initialises results.
        Sets result as JOptionPane.showConfirmDialog.
         */
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - What is the purpose of a firewall? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

            //Checks the answer if result = JOptionPane.OK_OPTION
            if (result == JOptionPane.OK_OPTION) {
                //If radios[0] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[0].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    NetworkInfraQ3();
                }
                //If the radios[1], radios[2] or radios[3] is selected then it will prompt an incorrect message and move on to the next question.
                else if (radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a.");
                    NetworkInfraQ3();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    NetworkInfraQ2();
                }
            }
        }

        public void NetworkInfraQ3() {
            //Initialises options array
            String[] options = {"a) TCP/IP                                                                                                                                                                                                                                       ",
                    "b) HTTP",
                    "c) SMTP",
                    "d) HTML."};

            //Initialises JRadioButton array radios as the length of options
            JRadioButton[] radios = new JRadioButton[options.length];

            //Creates a button group called group.
            ButtonGroup group = new ButtonGroup();

            //Loops to create a new radio button for every option
            for (int i = 0; i < options.length; i++) {
                radios[i] = new JRadioButton(options[i]);

                //adds all radio buttons to the group so that only one can be selected at once.
                group.add(radios[i]);
            }

            //Initialises result as JOptionPane.showConfirmDialog
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 -Which of the following is NOT a type of network protocol? (Choose one)  ", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {
            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    NetworkInfraQ4();
                }
                //If radios[0] OR radios[1] OR radios[2] is selected, it will prompt an incorrect answer message and move onto next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected() ) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d");
                    NetworkInfraQ4();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    NetworkInfraQ3();
                }
            }
        }

        public void NetworkInfraQ4() {
            //Initialises options array
            String[] options = {"a) Router                                                                                                                                                                                                                                                                                                                                                                                                                       ",
                    "b) Switch",
                    "c) Artificial Intelligence",
                    "d) Hub"
            };
            //Initialises JRadioButton array radios as the length of options
            JRadioButton[] radios = new JRadioButton[options.length];

            //Creates a button group called group.
            ButtonGroup group = new ButtonGroup();

            //Loops to create a new radio button for every option
            for (int i = 0; i < options.length; i++) {
                radios[i] = new JRadioButton(options[i]);

                //adds all radio buttons to the group so that only one can be selected at once.
                group.add(radios[i]);
            }

            //Initialises result as JOptionPane.showConfirmDialog
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - Which of the following is NOT a type of network device? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {

                //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[2].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    NetworkInfraQ5();
                }
                //If radios[0] OR radios[1] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was C");
                    NetworkInfraQ5();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    NetworkInfraQ4();
                }
            }


        }

        public void NetworkInfraQ5() {
            //Initialises options array
            String[] options = {"a) FTP                                                                                                                                                                                                                                                                                                                                                                                                                               ",
                    "b) DNS ",
                    "c) DHCP  ",
                    "d) SMTP  "};
            //Initialises JRadioButton array radios as the length of options
            JRadioButton[] radios = new JRadioButton[options.length];

            //Creates a button group called group.
            ButtonGroup group = new ButtonGroup();

            //Loops to create a new radio button for every option
            for (int i = 0; i < options.length; i++) {
                radios[i] = new JRadioButton(options[i]);

                //Adds all radio buttons to the group so that only one can be selected at once.
                group.add(radios[i]);
            }

            //Initialises result as JOptionPane.showConfirmDialog
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - Which of the following protocols is used to transfer files over the internet? (Choose one)  ", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {

                //If radios[0] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[0].isSelected() ) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    NetworkInfraQ6();
                }
                //If radios[2] OR radios[1] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
                else if ( radios[2].isSelected()|| radios[3].isSelected() || radios[1].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a");
                    NetworkInfraQ6();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    NetworkInfraQ5();
                }
            }
        }

        public void NetworkInfraQ6() {
            //Initialises options array
            String[] options = {"a) 64                                                                                                                                                                                                                                                                                                                                                                                                                                     ",
                    "b) 126   ",
                    "c) 128     ",
                    "d) 254  ",
            };
            //Initialises JRadioButton array radios as the length of options
            JRadioButton[] radios = new JRadioButton[options.length];

            //Creates a button group called group.
            ButtonGroup group = new ButtonGroup();

            //Loops to create a new radio button for every option
            for (int i = 0; i < options.length; i++) {
                radios[i] = new JRadioButton(options[i]);

                //Adds all radio buttons to the group so that only one can be selected at once.
                group.add(radios[i]);
            }

            //Initialises result as JOptionPane.showConfirmDialog
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 -What is the maximum number of IP addresses that can be assigned to devices on a network with a subnet mask of 255.255.255.128?  (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {

                //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[1].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    results();
                }
                //If  radios[0] OR  radios[2] is selected then it will prompt an incorrect message and move on to the next question.
                else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b");
                    results();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    NetworkInfraQ6();
                }
            }
        }

        public void results() {
            //Initialises quiz percentage as double
            double quizPercentage;

            //Calculates quiz percentage
            quizPercentage = (quizTotal * 100) / 6;

            //Initialises roundOff as double and rounds the percentage
            double roundOff = Math.round(quizPercentage * 100.0) / 100.0;

            //Initialising roundQuizPercentage as an int, converting roundOff as an int and setting roundQuizPercentage as the int value of roundOff
            int roundQuizPercentage = (int) roundOff;

            //Using roundQuizPercentage to find out if the user passed
            String[] quizGrades = {"passed", "failed"};
            String quizGrade;
            if (roundQuizPercentage >= 50){
                quizGrade = quizGrades[0];
            }else {
                quizGrade = quizGrades[1];
            }

            //Prompts a JOptionPane to display the users score and percentage
            JOptionPane.showMessageDialog(null, "Results\nYour total is: " + quizTotal + " out of 6.\nYour quiz percentage is: " + roundQuizPercentage + "%.\nYou have " + quizGrade + " this quiz.");
        }

    }


