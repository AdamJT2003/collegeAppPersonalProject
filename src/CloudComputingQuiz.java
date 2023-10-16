import javax.swing.*;

//
public class CloudComputingQuiz {


    public int quizTotal;
    public static void main(String[] args) {
        //initialises prog
        CloudComputingQuiz prog = new CloudComputingQuiz();
        //calls DigSkillsSoftDevQ1 method
        prog.CloudComputingQuizQ1();
    }

    public void CloudComputingQuizQ1() {
        //initialising options array, creating JRadioButton as radios array and setting it as options array
        String[] options = {"a) Software as a service                                                                                                                                                                                                                                                                     ",
                "b) Infrastructure as a service",
                "c) Payment as a service ",
                "d) Hardware as a service"};

        //Initialises JRadioButton array called radios and set it the length of options
        JRadioButton[] radios = new JRadioButton[options.length];



        //A loop to create a new radio button for each option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);


        }
        //Initialising result as JOptionPane
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 1 - Cloud computing offers many services, which of these is a cloud computing service that can be bought? (Choose all that apply) ", JOptionPane.OK_CANCEL_OPTION);

        //If result = JOptionPane.OK_OPTION then it will check if the answer is correct or incorrect.
        if (result == JOptionPane.OK_OPTION) {

            //If radios[0] AND radios[1] is selected, it will prompt a correct answer message and add 1 to quizTotal.
            if (radios[0].isSelected() && radios[1].isSelected() && !radios[2].isSelected() && !radios[3].isSelected())  {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                CloudComputingQuizQ2();
            }
            //If radios[2] OR radios[3] is selected it will prompt an incorrect message and move onto the next question.
            else if (radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a,b.");
                CloudComputingQuizQ2();
            }
            //If there is no input then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                CloudComputingQuizQ1();
            }
        }
    }

    public void CloudComputingQuizQ2() {
        //Options for the buttons
        String[] options = {"a) NAS (Network attached storage system)                                                                                                                                                                                     ",
                "b) Games console",
                "c) Hoover",
                "d) Analog alarm clock "};
        //creating JRadioButton array called radios and setting it to the length of options.
        JRadioButton[] radios = new JRadioButton[options.length];


        //A loop to create a new radio button for each option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);

        }
        /*Initialises results.
        Sets result as JOptionPane.showConfirmDialog.
         */
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 2 - Which of these devices can connect to a cloud service? (Choose all that apply) ", JOptionPane.OK_CANCEL_OPTION);

        //Checks the answer if result = JOptionPane.OK_OPTION
        if (result == JOptionPane.OK_OPTION) {
            //If radios[0], radios[1] and radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[0].isSelected()&& radios[1].isSelected() && radios[2].isSelected() && !radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                CloudComputingQuizQ3();
            }
            //If the radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a,b,c.");
                CloudComputingQuizQ3();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                CloudComputingQuizQ2();
            }
        }
    }

    public void CloudComputingQuizQ3() {
        //Initialises options array
        String[] options = {"a) PaaS                                                                                                                                                                                                                                                   ",
                "b) IaaS",
                "c) CaaS",
                "d) SaaS"};

        //Initialises JRadioButton array radios as the length of options
        JRadioButton[] radios = new JRadioButton[options.length];

        //Loops to create a new radio button for every option
        for (int i = 0; i < options.length; i++) {
            radios[i] = new JRadioButton(options[i]);
        }

        //Initialises result as JOptionPane.showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 3 - Choose the acronyms that match the answers you have chosen in question one. (Choose all that apply) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[0], radios[3] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the nex
            if (radios[0].isSelected() && radios[3].isSelected() && !radios[2].isSelected() && !radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                CloudComputingQuizQ4();
            }
            //If  radios[2] OR radios[1] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[1].isSelected() || radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was a,d");
                CloudComputingQuizQ4();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                CloudComputingQuizQ3();
            }
        }
    }

    public void CloudComputingQuizQ4() {
        //Initialises options array
        String[] options = {"a) EC1                                                                                                                                                                                                                                                                                                                       ",
                "b) EC10",
                "c) EC2",
                "d) Hybrid"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 4 - Amazon provides a cloud service for their customers. One of the services they provide is an IaaS (Infrastructure as a service) what is the name of this? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {


            //If radios[2] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the nex
            if (radios[2].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                CloudComputingQuizQ5();
            }
            //If radios[0] OR radios[1] OR radios[3] is selected, it will prompt an incorrect answer message and move onto next question.
            else if (radios[0].isSelected() || radios[1].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was c");
                CloudComputingQuizQ5();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                CloudComputingQuizQ4();
            }
        }


    }

    public void CloudComputingQuizQ5() {
        //Initialises options array
        String[] options = {"a) Cost                                                                                                                                                                                                                                                                              ",
                "b) Security",
                "c) Space",
                "d) Platform"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 5 - What is the most important area of concern to consider when creating a new cloud solution? (Choose one)  ", JOptionPane.OK_CANCEL_OPTION);

        //If result is = JOptionPane.OK_OPTION then it will check the answer selected
        if (result == JOptionPane.OK_OPTION) {

            //If radios[1] is selected, it will prompt a correct message, add 1 to quizTotal and moves onto the next question.
            if (radios[1].isSelected()) {
                JOptionPane.showMessageDialog(null, "Correct answer");
                quizTotal++;
                CloudComputingQuizQ6();
            }
            //If  radios[0] OR radios[2] OR radios[3] is selected then it will prompt an incorrect message and move on to the next question.
            else if (radios[0].isSelected() || radios[2].isSelected() || radios[3].isSelected()) {
                JOptionPane.showMessageDialog(null, "Incorrect answer. The correct answer was b");
                CloudComputingQuizQ6();
            }
            //If none of the buttons are selected then it will prompt an invalid answer message and repeat the question.
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer! One button must be selected before pressing 'ok'.");
                CloudComputingQuizQ5();
            }
        }
    }

    public void CloudComputingQuizQ6() {
        //Initialises options array
        String[] options = {"a) IaaS                                                                                                                                                                                                                                           ",
                "b) SaaS",
                "c) XaaS",
                "d) PaaS"};
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
        int result = JOptionPane.showConfirmDialog(null, radios, "Question 6 -Which of these cloud services provide a run time environment? (Choose one) ", JOptionPane.OK_CANCEL_OPTION);

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
                CloudComputingQuizQ5();
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


