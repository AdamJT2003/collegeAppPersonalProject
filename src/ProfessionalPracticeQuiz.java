import javax.swing.*;

public class ProfessionalPracticeQuiz {

    public int quizTotal;
    public static void main(String[] args) {
        //initialises prog
        ProfessionalPracticeQuiz prog = new ProfessionalPracticeQuiz();
        //calls DigSkillsSoftDevQ1 method
        prog.ProfessionalPracticeQuizQ1();
    }

    public void ProfessionalPracticeQuizQ1() {
        //initialising options array, creating JRadioButton as radios array and setting it as options array
        String[] options = {"a) Focusing                                                                                                                                                                                                                                                ",
                "b) Adapting",
                "c) Sense making ",
                "d) Curiosity"};

        //Initialises JRadioButton array called radios and set it the length of options
        JRadioButton[] radios = new JRadioButton[options.length];



        //A loop to create a new radio button for each option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);

        }
        //Initialising result as JOptionPane
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Which of the following are self-management meta skills? (Choose all that apply)  ", JOptionPane.OK_CANCEL_OPTION);

        //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
        if (result == JOptionPane.OK_OPTION) {

            //If radios[0], AND radios [1] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[0].isSelected() && radios[1].isSelected() && !radios[2].isSelected() && !radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                ProfessionalPracticeQuizQ2();
            }
            //If radios[2] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a,b.");
                ProfessionalPracticeQuizQ2();
            }
            //If there is no input then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                ProfessionalPracticeQuizQ1();
            }
        }
    }

    public void ProfessionalPracticeQuizQ2() {
        //Options for the buttons
        String[] options = {"a) Collaborating                                                                                                                                                                                                                                                                                                     ",
                "b) Communicating",
                "c) Feeling",
                "d) Leading"};
        //creating JRadioButton array called radios and setting it to the length of options.
        JRadioButton[] radios = new JRadioButton[options.length];



        //A loop to create a new radio button for each option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);


        }
        /*Initialises results.
        Sets result as JOptionPane.showConfirmDialog.
         */
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - Which of the following are social intelligence meta skills? (Choose all that apply) ", JOptionPane.OK_CANCEL_OPTION);

        //Checks the answer if result = JOptionPane.OK_OPTION
        if (result == JOptionPane.OK_OPTION) {
            //If radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[0].isSelected() && radios[1].isSelected() && radios[2].isSelected() && radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                ProfessionalPracticeQuizQ3();
            }
            //If radios[2] or radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a,b,c and d.");
                ProfessionalPracticeQuizQ3();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                ProfessionalPracticeQuizQ2();
            }
        }
    }

    public void ProfessionalPracticeQuizQ3() {
        //Initialises options array
        String[] options = {"a) Initiative                                                                                                                                                                                                                                   ",
                "b) Critical thinking",
                "c) Integrity",
                "d) Creativity"};

        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];

        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);
        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 - Which of the following would be innovation meta skills? (Choose all that apply) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {
            /*If radios[1] AND radios[2] is selected AND radios[3] is not selected, it will prompt a correct answer message,
            add 1 to quizTotal and move onto the next question.
            */
            if (radios[1].isSelected() && radios[2].isSelected() && !radios[0].isSelected() && !radios[3].isSelected() ) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                ProfessionalPracticeQuizQ4();
            }
            //If radios[0] OR radios[3] it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b,c");
                ProfessionalPracticeQuizQ4();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                ProfessionalPracticeQuizQ3();
            }
        }
    }

    public void ProfessionalPracticeQuizQ4() {
        //Initialises options array
        String[] options = {"a) Coding                                                                                                                                                                                                                                             ",
                "b) Design",
                "c) Testing",
                "d) Maintenance"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - What would be the second to last stage in the waterfall software development model? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            /*If radios[2] is selected AND radios[0] AND radios[1] AND radios[3] is not selected, it will prompt a correct answer message,
            add 1 to quizTotal and move onto the next question.
            */
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                ProfessionalPracticeQuizQ5();
            }
            //If radios[0] OR radios[2] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c");
                ProfessionalPracticeQuizQ5();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                ProfessionalPracticeQuizQ4();
            }
        }


    }

    public void ProfessionalPracticeQuizQ5() {
        //Initialises options array
        String[] options = {"a) Product Owner                                                                                                                                                                                                                              ",
                "b) Scrum Master",
                "c) Developer",
                "d) Team Member"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - What would be the main role in an Agile SCRUM environment? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[0] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[0].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                ProfessionalPracticeQuizQ6();
            }
            //If  radios[1] OR radios[2] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[1].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a");
                ProfessionalPracticeQuizQ6();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                ProfessionalPracticeQuizQ5();
            }
        }
    }

    public void ProfessionalPracticeQuizQ6() {
        //Initialises options array
        String[] options = {"a) Sprint planning                                                                                                                                                                                                                           ",
                "b) Spring Closure",
                "c) Sprint Review",
                "d) Daily Standup"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 - Which of the following is NOT an event in Agile SCRUM? (Choose one)", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                results();
            }
            //If  radios[0] OR radios[2] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b");
                results();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                ProfessionalPracticeQuizQ5();
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


