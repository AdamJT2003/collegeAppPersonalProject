import javax.swing.*;

public class DigSkillsCompSciQuiz {
    public int quizTotal;

    public static void main(String[] args) {
        //initialises prog
        DigSkillsCompSciQuiz prog = new DigSkillsCompSciQuiz();
        //calls DigSkillsSoftDevQ1 method
        prog.DigSkillsCompSciQ1();
    }

    public void DigSkillsCompSciQ1() {
        //initialising options array, creating JRadioButton as radios array and setting it as options array
        String[] options = {"a) C++                                                                                                                                                                                                          ",
                "b) Python",
                "c) Assembly Language",
                "d) Java"};

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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Out of these programming languages, which is NOT an example of a high-level programming language? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
        if (result == JOptionPane.OK_OPTION) {

            //If radios[2] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCompSciQ2();
            }
            //If radios[0], radios[1] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c.");
                DigSkillsCompSciQ2();
            }
            //If there is no input then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCompSciQ1();
            }
        }
    }

    public void DigSkillsCompSciQ2() {
        //Options for the buttons
        String[] options = {"a) True                                                                                                                                                                                                                                                                                                               ",
                "b) False",
                "c) None",
                "d) Error"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - Calculate the result of the following Boolean expression. (5 > 3) AND (4 < 7) (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //Checks the answer if result = JOptionPane.OK_OPTION
        if (result == JOptionPane.OK_OPTION) {
            //If radios[0] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[0].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCompSciQ3();
            }
            //If radios[1] radios[2] or radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a.");
                DigSkillsCompSciQ3();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCompSciQ2();
            }
        }
    }

    public void DigSkillsCompSciQ3() {
        //Initialises options array
        String[] options = {"a) While                                                                                                                                                                                                                                     ",
                "b) Do while",
                "c) For",
                "d) If ."};

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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 -Which is NOT a type of programming loop (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {
            //If radios[3] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCompSciQ4();
            }
            //If radios[0] OR radios[1] OR radios[2]  is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected() ) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d");
                DigSkillsCompSciQ4();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCompSciQ3();
            }
        }
    }

    public void DigSkillsCompSciQ4() {
        //Initialises options array
        String[] options = {"a) > More than                                                                                                                                                                                                                                                                                           ",
                "b) < less than ",
                "c) = equals",
                "d) != equal to "};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - Which of these is NOT a relational operator in programming? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[3] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCompSciQ5();
            }
            //If radios[0] OR radios[1] OR radios[2] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d");
                DigSkillsCompSciQ5();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCompSciQ4();
            }
        }


    }

    public void DigSkillsCompSciQ5() {
        //Initialises options array
        String[] options = {"a) 3D printer                                                                                                                                                                                                                                                                                                   ",
                "b) Amplifier",
                "c) Soundboard ",
                "d) All of the above "};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - IO devices are needed for computers to function. Which of these devices in an OUTPUT device? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[3].isSelected() ) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsCompSciQ6();
            }
            //If  radios[0] OR radios[1] OR radios[2] is selected then it will prompt an incorrect message and move on to the next question.
            else if ( radios[2].isSelected()|| radios[0].isSelected() || radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d");
                DigSkillsCompSciQ6();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCompSciQ5();
            }
        }
    }

    public void DigSkillsCompSciQ6() {
        //Initialises options array
        String[] options = {"a) Graphics card                                                                                                                                                                                                                                                                                                     ",
                "b) Operating system  ",
                "c) CPU   ",
                "d) All the above "};
        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];


        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);

        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 -Which of the following are ESSENTIAL hardware components for building a computer? (Select that all apply)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[2].isSelected() && !radios[0].isSelected() && !radios[1].isSelected() && !radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                results();
            }
            //If  radios[0] OR radios[1] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c");
                results();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsCompSciQ6();
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
