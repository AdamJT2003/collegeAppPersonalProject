import javax.swing.*;

public class SoftwareDevelopmentQuiz {
    public int quizTotal;


    public static void main(String[] args) {
        //initialises prog
        SoftwareDevelopmentQuiz prog = new SoftwareDevelopmentQuiz();
        //calls SoftDevQuizQ1 method
        prog.SoftDevQuizQ1();
    }

    public void SoftDevQuizQ1() {
        //initialising options array, creating JRadioButton as radios array and setting it as options array
        String[] options = {"a) JDK                                                                                                                                                                                   ",
                "b) JIT",
                "c) JVM",
                "d) JRE"};

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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Java relies on which component to compile, debug and execute all Java programs? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
        if (result == JOptionPane.OK_OPTION) {

            //If radios[0] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[0].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                SoftDevQuizQ2();
            }
            //If radios[1], radios[2] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a.");
                SoftDevQuizQ2();
            }
            //If there is no input then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                SoftDevQuizQ1();
            }
        }
    }

    public void SoftDevQuizQ2() {
        //Options for the buttons
        String[] options = {"a) Package                                                                                                                                                                                   ",
                "b) Import",
                "c) Export",
                "d) Extend"};
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
        /*Initialise result.
        Sets result as JOptionPane.showConfirmDialog.
         */
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - In Java language what is the keyword used for accessing the features of a package? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //Checks the answer if result = JOptionPane.OK_OPTION
        if (result == JOptionPane.OK_OPTION) {
            //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                SoftDevQuizQ3();
            }
            //If the radios[0], radios[2] or radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b.");
                SoftDevQuizQ3();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                SoftDevQuizQ2();
            }
        }
    }

    public void SoftDevQuizQ3() {
        //Initialises options array
        String[] options = {"a) write.Main                                                                                                                                                                                   ",
                "b) class.create(Main)",
                "c) {class_name} == startup.main_void",
                "d) psvm"};

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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 - What is the written shortcut for adding a main method into any class within a Java program? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {
            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                SoftDevQuizQ4();
            }
            //If radios[0] OR radios[1] OR radios[2] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d.");
                SoftDevQuizQ4();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                SoftDevQuizQ3();
            }
        }
    }

    public void SoftDevQuizQ4() {
        //Initialise options array
        String[] options = {"a) Null                                                                                                                                                                                   ",
                "b) Float",
                "c) Object",
                "d) Complex"};
        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];


        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);

        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - In Java which of these data types are supported locally with no extensions? (Choose all that apply)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            /*If radios[0] AND radios[1] is selected
            it will prompt a correct message, add 1 to quizTotal and moves onto the next question.*/
            if (radios[0].isSelected() && radios[1].isSelected() && !radios[2].isSelected() && !radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                SoftDevQuizQ5();
            }
            //If radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a and b.");
                SoftDevQuizQ5();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                SoftDevQuizQ4();
            }
        }


    }

    public void SoftDevQuizQ5() {
        //Initialise options array
        String[] options = {"a) Throw                                                                                                                                                                                   ",
                "b) Final",
                "c) None ",
                "d) Catch"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - Exceptions created by a TRY block are caught in which block? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                SoftDevQuizQ6();
            }
            //If  radios[0] OR radios[1] OR radios[2] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was d.");
                SoftDevQuizQ6();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                SoftDevQuizQ5();
            }
        }
    }

    public void SoftDevQuizQ6() {
        //Initialises options array
        String[] options = {"a) Input                                                                                                                                                                                   ",
                "b) textBox  ",
                "c) Scanner ",
                "d) Applier"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 - In Java, which class is used to take an input from the user of your program. (Choose one)", JOptionPane.OK_CANCEL_OPTION);

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
                SoftDevQuizQ6();
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


