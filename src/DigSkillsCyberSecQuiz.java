import javax.swing.*;

public class DigSkillsCyberSecQuiz {

    public int quizTotal;
    public static void main(String[] args) {
        //initialises prog
        DigSkillsCyberSecQuiz prog = new DigSkillsCyberSecQuiz();
        //calls DigSkillsSoftDevQ1 method
        prog.DigSkillsCyberSecQuizQ1();
    }

    public void DigSkillsCyberSecQuizQ1() {
        //initialising options array, creating JRadioButton as radios array and setting it as options array
        String[] options = {"a) Malware                                                                                                                                                                                                                                                        ",
                "b) Phishing",
                "c) Data backup ",
                "d) Denial of Service "};

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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Which of the following is NOT an example of a cyber-attack? (Choose one)  ", JOptionPane.OK_CANCEL_OPTION);

        //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
        if (result == JOptionPane.OK_OPTION) {

            //If radios[2] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCyberSecQuizQ2();
            }
            //If radios[0], radios[1] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c.");
                DigSkillsCyberSecQuizQ2();
            }
            //If there is no input then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCyberSecQuizQ1();
            }
        }
    }

    public void DigSkillsCyberSecQuizQ2() {
        //Options for the buttons
        String[] options = {"a) Encryption                                                                                                                                                                                                                                                                                                     ",
                "b) Decryption",
                "c) Hashing",
                "d) Steganography"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - Name of the process used to disguise a message or piece of data to make it appear as something else? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //Checks the answer if result = JOptionPane.OK_OPTION
        if (result == JOptionPane.OK_OPTION) {
            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsSoftDevQuizQ3();
            }
            //If the radios[0], radios[1] or radios[2] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d.");
                DigSkillsSoftDevQuizQ3();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCyberSecQuizQ2();
            }
        }
    }

    public void DigSkillsSoftDevQuizQ3() {
        //Initialises options array
        String[] options = {"a) Firewall                                                                                                                                                                                                                                  ",
                "b) Locked server room",
                "c) Password policy",
                "d) Intrusion detection system "};

        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];

        //create button group so only one radio button can be selected at once
        ButtonGroup group = new ButtonGroup();

        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);

            //adds all radio buttons to the group so that only one can be selected at once.
            group.add(radios[i]);
        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 - Which of the following is NOT an example of a network security measure? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {
            /*If radios[1] is selected, it will prompt a correct answer message,
            add 1 to quizTotal and move onto the next question.
            */
            if (radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCyberSecQuizQ4();
            }
            //If radios[0] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b");
                DigSkillsCyberSecQuizQ4();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsSoftDevQuizQ3();
            }
        }
    }

    public void DigSkillsCyberSecQuizQ4() {
        //Initialises options array
        String[] options = {"a) Image rendering                                                                                                                                                                                                                      ",
                "b) Steganography",
                "c) Rootkits",
                "d) Bitmapping"};
        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];

        //create button group so only one radio button can be selected at once
        ButtonGroup group = new ButtonGroup();

        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);

            //adds all radio buttons to the group so that only one can be selected at once.
            group.add(radios[i]);
        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - The act of hiding media or other information within a file is called what? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            /*If radios[1] is selected, it will prompt a correct answer message,
            add 1 to quizTotal and move onto the next question.
            */
            if (radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCyberSecQuizQ5();
            }
            //If radios[0] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b");
                DigSkillsCyberSecQuizQ5();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCyberSecQuizQ4();
            }
        }


    }

    public void DigSkillsCyberSecQuizQ5() {
        //Initialises options array
        String[] options = {"a) WPA                                                                                                                                                                                                                                                  ",
                "b) WPA3",
                "c) WEP",
                "d) WPA2"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - Which of the following is the LEAST secure out of these security methods? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCyberSecQuizQ6();
            }
            //If  radios[0] OR radios[1] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c");
                DigSkillsCyberSecQuizQ6();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCyberSecQuizQ5();
            }
        }
    }

    public void DigSkillsCyberSecQuizQ6() {
        //Initialises options array
        String[] options = {"a) Trap door                                                                                                                                                                                                                                   ",
                "b) Trojan Horse",
                "c) Virus",
                "d) Worm"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 - Choose which of the following is a principle of object-oriented programming? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                results();
            }
            //If  radios[0] OR radios[1] OR radios[2] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d");
                results();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCyberSecQuizQ5();
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
    }}

