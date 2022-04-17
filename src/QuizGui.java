import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates a elementary level swing GUI quiz.
 * This class contains 1 constructor and 5 methods.
 */

public class QuizGui extends JFrame implements ActionListener {
    /**
     * Stores the users Score on the quiz.
     */
    private int Score;
    /**
     * Stores string for results page.
     */
    private String Q1,Q2,Q3,Q4,Q5;
    /**
     * Holds each frame of the quiz
     */
    //Each frame declared
    private static JFrame frame1,frame2,frame3,frame4,frame5, frame6,frame7;
    /**
     * Declares each label for the quiz
     */
    //Each label declared
    private static JLabel label1, label2, label3,label4, label5, label7;
    /**
     * Each questions result on the results page.
     */
    private static JLabel Results1, Results2, Results3, Results4, Results5;
    /**
     * Declares each button for the quiz
     */
    //Each button declared
    private static JButton Btest, Enter1, Enter2, Enter3, Enter4, Enter5;
    /**
     * Declares each CheckBox for the quiz.
     */
    //Each CheckBox declared
    private static JCheckBox Box1, Box2, Box3,Box4, Boxtest;
    /**
     * Declares a Panel for each frame.
     */
    //Each Panel declared
    private static JPanel panel1, panel2, panel3, panel4, panel5,panel6, panel7;
    /**
     * Declares each radio button for the quiz.
     */
    //Each RadioButton declared
    private static JRadioButton B1, B2, B3, B4, B5,B6,B7,B8;
    /**
     * Declares each Button Group for the quiz.
     */
    //Each ButtonGroup declared
    private static ButtonGroup Question2, Question3;
    /**
     * Declares the comboBox used.
     */
    //ComboBox declared
    private static JComboBox Question4;
    /**
     * Declares each list for question 5
     */
    //Each List declared
    public static JList Question5_1, Question5_2;

    /**
     * Creates the quiz using the methods within the class.
     */
    public QuizGui(){
        frames();
        nextquestion();

    }

    /**
     * Creates the frames of the quiz and the contents of each question.
     * Uses the method buttons() to initialize and enter button for each question.
     */
    public void frames(){
        //Initializes frame1 and creates the contents of question 1.
        frame1 = new JFrame("Question1");
        frame1.setSize(500,500);
        label1 = new JLabel();
        panel1 = new JPanel();
        Box1 = new JCheckBox();
        Box2 = new JCheckBox();
        Box3 = new JCheckBox();
        Box4 = new JCheckBox();
        label1.setText("Which of the following are colors?");
        label1.setLocation(200,100);
        panel1.add(label1);
        Box1.setText("Blue");
        Box2.setText("Green");
        Box3.setText("Bike");
        Box4.setText("Couch");
        Box1.setFocusable(false);
        Box2.setFocusable(false);
        Box3.setFocusable(false);
        Box4.setFocusable(false);
        panel1.add(Box1);
        panel1.add(Box2);
        panel1.add(Box3);
        panel1.add(Box4);
        frame1.add(panel1);
        frame1.setVisible(true);
        frame1.setAlwaysOnTop(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);

        //Radio Buttons for frame2
        B1 = new JRadioButton("Purple");
        B2 = new JRadioButton("Green");
        B3 = new JRadioButton("Orange");
        B4 = new JRadioButton("Yellow");
        Question2 = new ButtonGroup();
        Question2.add(B1);
        Question2.add(B2);
        Question2.add(B3);
        Question2.add(B4);

        //Initializes frame2 and the contents of question 2.
        frame2 = new JFrame("Question 2");
        frame2.setSize(500,500);
        label2 = new JLabel();
        panel2 = new JPanel();
        label2.setText("What color is a Banana?");
        label2.setLocation(200,100);
        panel2.add(label2);
        panel2.add(B1);
        panel2.add(B2);
        panel2.add(B3);
        panel2.add(B4);
        frame2.add(panel2);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);

        //Radio Buttons for Question 3
        B5 = new JRadioButton("Towel");
        B6 = new JRadioButton("Car");
        B7 = new JRadioButton("TV");
        B8 = new JRadioButton("Desk");
        Question3 = new ButtonGroup();
        Question3.add(B5);
        Question3.add(B6);
        Question3.add(B7);
        Question3.add(B8);

        //Initializes frame3 and the contents of question 3.
        frame3 = new JFrame("Question 3");
        frame3.setSize(500,500);
        label3 = new JLabel();
        panel3 = new JPanel();
        label3.setText("Which of the following is a type of transportation?");
        label3.setLocation(200,100);
        panel3.add(label3);
        panel3.add(B5);
        panel3.add(B6);
        panel3.add(B7);
        panel3.add(B8);
        frame3.add(panel3);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setLayout(null);

        //Initializes frame4 and the contents of question 4.
        String [] answers = {"Bear", "Bird", "Snake", "Dog"};
        Question4 = new JComboBox(answers);
        frame4 = new JFrame("Question 4");
        frame4.setSize(500,500);
        label4 = new JLabel();
        panel4 = new JPanel();
        label4.setText("Select the animal that can fly");
        label4.setLocation(200,100);
        panel4.add(label4);
        panel4.add(Question4);
        frame4.add(panel4);
        frame4.setVisible(true);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setLayout(null);

        //Initializes frame5 and the contents of question 5.
        String[] objects = {"Plane", "Vacuum", "Toilet", "Table"};
        String[] actions = {"Crying", "Eating", "Sleeping","Flying"};
        Question5_1 = new JList(objects);
        Question5_2 = new JList(actions);
        frame5 = new JFrame("Question 5");
        frame5.setSize(500,500);
        label5 = new JLabel();
        panel5 = new JPanel();
        label5.setText("Select the matching action with the object.");
        label5.setLocation(200,100);
        panel5.add(label5);
        panel5.add(Question5_1);
        panel5.add(Question5_2);
        frame5.add(panel5);
        frame5.setVisible(true);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setLayout(null);

        //Initializes frame6 and the contents of the submit check page.
        frame6 = new JFrame("Submit");
        frame6.setSize(500,500);
        panel6 = new JPanel();
        Boxtest = new JCheckBox();
        Boxtest.setText("Acknowledgement this quiz is your own work");
        Boxtest.setFocusable(false);
        panel6.add(Boxtest);
        frame6.add(panel6);
        frame6.setVisible(true);
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setLayout(null);

        buttons();

    }

    /**
     * Creates and Enter button for each frame (each question of the quiz) and a submit button to view score.
     */
    public static void buttons() {
        //Button Question 1
        Enter1 = new JButton("Enter");
        Enter1.setSize(80, 40);
        panel1.add(Enter1);
        Enter1.setLocation(200, 400);

        //Button Question 2
        Enter2 = new JButton("Enter");
        Enter2.setSize(80, 40);
        panel2.add(Enter2);
        Enter2.setLocation(200, 400);

        //Button Question 3
        Enter3 = new JButton("Enter");
        Enter3.setSize(80, 40);
        panel3.add(Enter3);
        Enter3.setLocation(200, 400);

        //Button Question 4
        Enter4 = new JButton("Enter");
        Enter4.setSize(80, 40);
        panel4.add(Enter4);
        Enter4.setLocation(200, 400);

        //Button Question 5
        Enter5 = new JButton("Enter");
        Enter5.setSize(80, 40);
        panel5.add(Enter5);
        Enter5.setLocation(200, 400);

        //Submit Button
        Btest = new JButton("Submit Quiz");
        Btest.setSize(120, 40);
        frame6.add(Btest);
        Btest.setLocation(180, 400);

    }

    /**
     * Uses ActionListener to move to the next question when each enter button is clicked.
     */
    public void nextquestion(){
        //If enter is pressed on question 1
        Enter1.addActionListener((ActionEvent e) -> {
            //Adds 1 to score if right answer is selected.
            if(Box1.isSelected() && Box2.isSelected()){
                Score++;
                Q1 = "(Correct)";
            } else if(!Box1.isSelected() && !Box2.isSelected() && !Box3.isSelected() && !Box4.isSelected()){
                Q1 = "(Unanswered)";
            } else {
                Q1 = "(Incorrect)";
            }
            //Closes question 1 and makes question 2 visible.
            frame1.setVisible(false);
            frame2.setVisible(true);

        });
        //If enter is pressed on question 2
        Enter2.addActionListener((ActionEvent e) -> {
            //Adds 1 to score if right answer is selected.
            if(B4.isSelected()){
                Score++;
                Q2 = "(Correct)";
            }else if(B1.isSelected()){
                Q2 = "(Incorrect)";
            }else if(B2.isSelected()){
                Q2 = "(Incorrect)";
            }else if(B3.isSelected()){
                Q2 = "(Incorrect)";
            }else {
                Q2 = "(Unanswered)";
            }
            //Closes question 2 and makes question 3 visible.
            frame2.setVisible(false);
            frame3.setVisible(true);
        });
        //If enter is pressed on question 3
        Enter3.addActionListener((ActionEvent e) -> {
            //Adds 1 to score if right answer is selected.
            if(B6.isSelected()){
                Score++;
                Q3 = "(Correct)";
            }else if(B5.isSelected()){
                Q3 = "(Incorrect)";
            }else if(B7.isSelected()){
                Q3 = "(Incorrect)";
            }else if(B8.isSelected()){
                Q3 = "(Incorrect)";
            }else {
                Q3 = "(Unanswered)";
            }

            //Closes question 3 and makes question 4 visible.
            frame3.setVisible(false);
            frame4.setVisible(true);
        });
        //If enter is pressed on question 4
        Enter4.addActionListener((ActionEvent e) -> {
            //Adds 1 to score if right answer is selected.
            if(Question4.getSelectedItem() == "Bird"){
                Score++;
                Q4 = "(Correct)";
            } else{
                Q4 = "(Incorrect)";
            }
            //Closes question 4 and makes question 5 visible.
            frame4.setVisible(false);
            frame5.setVisible(true);
        });
        //If enter is pressed on question 5
        Enter5.addActionListener((ActionEvent e) -> {
            //Adds 1 to score if right answer is selected.
            if(Question5_1.getSelectedValue() == "Plane" && Question5_2.getSelectedValue() == "Flying"){
                Score++;
                Q5 = "(Correct)";
            } else if(Question5_1.getSelectedValue() != "Plane" && Question5_2.getSelectedValue() != "Flying"){
                Q5 = "(Incorrect)";
            }
            //Closes question 5 and makes submit page visible.
            frame5.setVisible(false);
            frame6.setVisible(true);
        });
        //If Submit button is pressed.
        Btest.addActionListener((ActionEvent e) -> {
            //Generates a results page if acknowledge box is selected.
            if(Boxtest.isSelected()) {
                frame6.setVisible(false);
                frame7 = new JFrame("Results");
                frame7.setSize(200,300);
                label7 = new JLabel();
                Results1 = new JLabel();
                Results2 = new JLabel();
                Results3 = new JLabel();
                Results4 = new JLabel();
                Results5 = new JLabel();
                panel7 = new JPanel();
                label7.setText("You got " + getScore() +"/5 on this Quiz");
                label7.setLocation(200,100);
                Results1.setText("Question 1: "+Q1);
                Results1.setLocation(200,150);
                Results2.setText("Question 2: "+Q2);
                Results2.setLocation(200,200);
                Results3.setText("Question 3: "+Q3);
                Results3.setLocation(200,250);
                Results4.setText("Question 4: "+Q4);
                Results4.setLocation(200,300);
                Results5.setText("Question 5: "+Q5);
                Results5.setLocation(200,350);
                panel7.add(label7);
                panel7.add(Results1);
                panel7.add(Results2);
                panel7.add(Results3);
                panel7.add(Results4);
                panel7.add(Results5);
                frame7.add(panel7);
                frame7.setVisible(true);
                frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame7.setLayout(null);
            }
        });

    }

    /**
     * Get method for Score
     * @return returns the current score on the quiz.
     */
    public int getScore(){
        return Score;
    }

    /**
     * Action performed method need for the ActionListener
     * @param e used as action listener parameter.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
