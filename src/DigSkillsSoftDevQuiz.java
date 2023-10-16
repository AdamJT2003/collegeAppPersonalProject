import javax.swing.*;

public class DigSkillsSoftDevQuiz {

    public int quizTotal;

    public static void main(String[] args) {
        //initialises prog
        DigSkillsSoftDevQuiz prog = new DigSkillsSoftDevQuiz();
        //calls DigSkillsSoftDevQ1 method
        prog.DigSkillsSoftDevQuizQ1();
    }

    public void DigSkillsSoftDevQuizQ1() {
        //initialising options array, creating JRadioButton as radios array and setting it as options array
        String[] options = {"a) Software                                                                                                                                                                                                                                                         ",
                "b) Malware",
                "c) Firmware",
                "d) Adware"};

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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - BIOS is a type of ______ware? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
        if (result == JOptionPane.OK_OPTION) {

            //If radios[2] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsSoftDevQuizQ2();
            }
            //If radios[0], radios[1] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c.");
                DigSkillsSoftDevQuizQ2();
            }
            //If there is no input then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsSoftDevQuizQ1();
            }
        }
    }

    public void DigSkillsSoftDevQuizQ2() {
        //Options for the buttons
        String[] options = {"a) Testing                                                                                                                                                                                                                                                                                                            ",
                "b) Development",
                "c) Planning",
                "d) Maintenance"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - At which stage of the Software Development Life Cycle (SDLC) would Software be a deliverable? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //Checks the answer if result = JOptionPane.OK_OPTION
        if (result == JOptionPane.OK_OPTION) {
            //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsSoftDevQuizQ3();
            }
            //If the radios[0], radios[2] or radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b.");
                DigSkillsSoftDevQuizQ3();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsSoftDevQuizQ2();
            }
        }
    }

    public void DigSkillsSoftDevQuizQ3() {
        //Initialises options array
        String[] options = {"a) Algorithms are a set of instructions for achieving goals                                                                                                                                                                                                                              ",
                "b) Algorithms may be decomposed into component parts (procedures),\n each of which itself contains an algorithm.",
                "c) A single problem may be solved by several different algorithms.",
                "d) Different algorithms for the same task will have the same performance characteristics."};

        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];

        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);
        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 - Which of these statements CORRECTLY describes algorithms?\n (Choose all that apply)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[0] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[0].isSelected() && radios[1].isSelected() && radios[2].isSelected() && !radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsSoftDevQuizQ4();
            }
            //If  radios[1] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a, b and c");
                DigSkillsSoftDevQuizQ4();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsSoftDevQuizQ3();
            }
        }
    }

    public void DigSkillsSoftDevQuizQ4() {
        //Initialises options array
        String[] options = {"a) GANTT chart                                                                                                                                                                                                                                                                                                      ",
                "b) Software validation plans and scripts",
                "c) Use case diagrams",
                "d) Change management plan"};
        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];

        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);
        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - What document TYPICALLY would a software tester create? (Choose all that apply)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            /*If radios[1] AND radios[2] are selected AND radios[0] AND radios[3] is not selected, it will prompt a correct answer message,
            add 1 to quizTotal and move onto the next question.
            */
            if (radios[1].isSelected() && radios[2].isSelected() && !radios[0].isSelected() && !radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsSoftDevQuizQ5();
            }
            //If radios[0] OR radios[1] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b and c");
                DigSkillsSoftDevQuizQ5();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsSoftDevQuizQ4();
            }
        }


    }

    public void DigSkillsSoftDevQuizQ5() {
        //Initialises options array
        String[] options = {"a) Scrum                                                                                                                                                                                                                                                                                                            ",
                "b) Extreme Programming",
                "c) Waterfall",
                "d) Kanban"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - Which of the following is NOT an agile software development methodology? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                DigSkillsSoftDevQuizQ6();
            }
            //If  radios[0] OR radios[1] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c");
                DigSkillsSoftDevQuizQ6();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                DigSkillsSoftDevQuizQ5();
            }
        }
    }

    public void DigSkillsSoftDevQuizQ6() {
        //Initialises options array
        String[] options = {"a) Abstraction                                                                                                                                                                                                                                                                                                        ",
                "b) Encapsulation ",
                "c) Inheritance ",
                "d) All the above "};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 -Choose which of the following is a principle of object-oriented programming? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

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
                DigSkillsSoftDevQuizQ5();
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
