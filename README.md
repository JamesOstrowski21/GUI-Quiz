# GUI-Quiz

## Problem Statement
Create a quiz using GUI for elementary school students. Make the quiz at least 5 questions and use 4 different GUI components throughout the questions. Each question should have 4 options for an answer. At the end of the quiz have a submit page with a checkbox for the student to acknowledge that it was their own work on the quiz. Have a results page with the quiz score.

## Developer Documentation
This Program Consists of 2 class files, QuizGui and QuizGui Driver. QuizGui contains 5 methods and a constructor the create the quiz. The constructor calls the methods frames() and nextquestion() to generate the quiz. The method frames() is used to initialize all the Jframes for the questions and create the content of the questions in each frame. Frames() calls the method buttons() to generate an "Enter" button for each question. Buttons() initializes an "Enter" button for each of the frames that contain a question and a "Submit Quiz" button for the submit page. The method nextquestion() is used to switch between questions of the quiz. Using an ActionListener, when the "Enter" button is pressed it makes the current question no longer visible and makes the next question visible to the user. When the "Submit Quiz" button is pressed it brings up the results page. The getScore() method just returns the current score of the quiz. The last method actionPerformer() allows for the use of ActionListener.
The QuizGuiDriver class contains the main method that calls the QuizGui constructor and generates the quiz for the user to take

## User Documentation
When the program is run a window will pop up with the title "Question 1", once you have selected an answer press the "Enter" button on the screen and the next question will appear. There will be a variety of multiple-choice questions, including check all that apply, select one, a dropdown box, and a list matching question. At the end of the quiz, there will be a window titled "Submit", check the box to acknowledge you are submitting your own work, and click the "Submit Quiz" button. After the quiz is submitted a results page will appear.
