import javax.swing.*;

public class IoTQuiz {
    public int quizTotal;

        public static void main(String[] args) {
            //initialises prog
            IoTQuiz prog = new IoTQuiz();
            //calls IoTQuizQ1 method
            prog.IoTQuizQ1();
        }

        public void IoTQuizQ1() {
            //initialising options array, creating JRadioButton as radios array and setting it as options array
            String[] options = {"a) Smartwatch                                                                                                                                                                                                                                                                                                                                                        ",
                    "b) Smart fridge",
                    "c) Thermostat",
                    "d) Smart vacuum"};

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
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Which of the following is NOT a type of IoT device? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

            //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
            if (result == JOptionPane.OK_OPTION) {

                //If radios[2] is selected, it will prompt a corrrect answer message and add 1 to quizTotal.
                if (radios[2].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    IoTQuizQ2();
                }
                //If radios[0], radios[1] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c.");
                    IoTQuizQ2();
                }
                //If there is no input then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    IoTQuizQ1();
                }
            }
        }

        public void IoTQuizQ2() {
            //Options for the buttons
            String[] options = {"a) Wi-Fi                                                                                                                                                                                                                                                                                                                                                       ",
                    "b) Bluetooth",
                    "c) RFID",
                    "d) RADIUS"};
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
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - Which of the following is NOT a communication protocol used in IoT devices (Choose one)", JOptionPane.OK_CANCEL_OPTION);

            //Checks the answer if result = JOptionPane.OK_OPTION
            if (result == JOptionPane.OK_OPTION) {
                //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    IoTQuizQ3();
                }
                //If the radios[0], radios[1] or radios[2] is selected then it will prompt an incorrect message and move on to the next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d.");
                    IoTQuizQ3();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    IoTQuizQ2();
                }
            }
        }

        public void IoTQuizQ3() {
            //Initialises options array
            String[] options = {"a) Cyber-physical systems                                                                                                                                                                                                                                                                                                                                                     ",
                    "b) Internet of things",
                    "c) Artificial intelligence",
                    "d) Augmented reality"};

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
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 - What is the umbrella term for the network of physical objects embedded with sensors, software and other technologies that connect and exchange data with other devices and systems over the internet? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {
                //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[1].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    IoTQuizQ4();
                }
                //If radios[0] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
                else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b.");
                    IoTQuizQ4();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    IoTQuizQ3();
                }
            }
        }

        public void IoTQuizQ4() {
            //Initialises options array
            String[] options = {"a)Layer 2 – data link                                                                                                                                                                                                                                                                                                                                         ",
                    "b) Layer 3 – network",
                    "c) Layer 1 – physical",
                    "d) Layer 4 – transport"};
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
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - Routers operate at layer _________ of OSI reference model? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {

                //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[1].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    IoTQuizQ5();
                }
                //If radios[0] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
                else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b.");
                    IoTQuizQ5();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    IoTQuizQ4();
                }
            }


        }

        public void IoTQuizQ5() {
            //Initialises options array
            String[] options = {"a) Configure an authentication                                                                                                                                                                                                                                                                                                                          ",
                    "b) Configure encryption",
                    "c) Physically secure a network",
                    "d) Configure an acl"};
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
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - What is the first line of defence when setting up a network? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {

                //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[2].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    IoTQuizQ6();
                }
                //If  radios[0] OR radios[1] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c.");
                IoTQuizQ6();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    IoTQuizQ5();
                }
            }
        }

        public void IoTQuizQ6() {
            //Initialises options array
            String[] options = {"a) Serial                                                                                                                                                                                                                                                                                                                                                      ",
                    "b) Parallel  ",
                    "c) Firewire ",
                    "d) USB"};
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
            int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 - Out of these options, which is the fastest port for data transfer (Choose one)", JOptionPane.OK_CANCEL_OPTION);

            //If result is = JOptionPane.OK_OPTION then it will check the answer selected
            if (result == JOptionPane.OK_OPTION) {

                //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
                if (radios[2].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer");
                    quizTotal++;
                    results();
                }
                //If  radios[0] OR radios[1] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
                else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                    JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c.");
                    results();
                }
                //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
                else {
                    JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                    IoTQuizQ6();
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
