import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

import javax.swing.SpringLayout;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomPanel extends JPanel
{
  private SpringLayout appLayout;
  private JButton sampleButton;

  private Popup view;
  private Words playerOneName;
  private Words defaultWords;
  private Words questions;
  private Scanner inputScanner;

  public CustomPanel()
  {
    super();

    view = new Popup();
    inputScanner = new Scanner(System.in);
    defaultWords = new Words();


    sampleButton = new JButton("Click H");
    setupPanel();
    setupListeners();
  }

  private void setupListeners()
  {
    sampleButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent click)
      {
        // setup();
        updateDisplay();
      }
    });
  }

  // private void startGame()
  // {
  //   this.setBackgroundColor(updateColor);

  // }
  private void setupPanel()
  {
    // this.setBackground(Color.GREEN);
    this.add(sampleButton);
    this.setLayout(appLayout);
  }
  
  private void updateDisplay()
  {
    this.setBackground(updateColor());
  }

  private Color updateColor()
	{
		Color randomColor = null;
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		randomColor = new Color(red, green, blue);
		
		return randomColor;
	}


  public void setup ()
  {
    view.displayMessage("Let's begin");

    Words custom = new Words();
    String response = "";
    String answer = "";
    String reply = "";
    int total = 1;


    //Player names

    response = view.askQuestion("What is player one's name?");
    response = view.askQuestion("Player one's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
      custom.setPlayerOneName(response);
      updateDisplay();
    }
    else
    {
      response = view.askQuestion("What is player one's new name?");
      view.displayMessage("Player one's new name is " + response);
      custom.setPlayerOneName(response);
      updateDisplay();
    }

    response = view.askQuestion("What is player two's name?");
    response = view.askQuestion("Player two's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
      custom.setPlayerTwoName(response);
      updateDisplay();
    }
    else
    {
      response = view.askQuestion("What is player two's new name?");
      view.displayMessage("Player two's new name is " + response);
      custom.setPlayerTwoName(response);
      updateDisplay();
    }

    view.displayMessage("Let's move on");
    updateDisplay();



    //Questions for the trivia section

    String [] questions = new String [4];
		
		for (int index = 0; index < questions.length; index ++)
		{
      response = view.askQuestion("Type a trivia question here");
      updateDisplay();
      answer = view.askQuestion("Type your answer here for question: " + response);
      updateDisplay();

      for (int index2 = 0; index2 < 1; index2 ++)
      {
        reply = view.askQuestion("Answer the following question (you have only two tries): " + response);

        if (reply.equalsIgnoreCase(answer))
        {
          view.displayMessage("Nice job! Now it's  your turn to ask the question.");
          total = total++;
          updateDisplay();
        }
        else
        {
          reply = view.askQuestion("Try again");
          if (reply.equalsIgnoreCase(answer))
          {
            view.displayMessage("Great! Now it's your turn to ask the question.");
            total = total++;
            updateDisplay();
          }
          else
          {
            view.displayMessage("The answer is: " + answer + ". Now it's your turn to ask the question.");
            updateDisplay();
          }
        }
      }
    }

            // creating a list of Integers 
        List<Integer> list = Arrays.asList(reply.length()); 
  
        // Using count() to count the number 
        // of elements in the stream and 
        // storing the result in a variable. 
        long total1 = list.stream().count(); 
  
        // Displaying the number of elements 
        view.displayMessage("The total is " + total1); 




      view.displayMessage("The total correct answers:" + total);


      ArrayList<String> userInput = new ArrayList<String>();
		  String input = view.askQuestion("Write the correct answers to all of the questions (one at a time)");
		
		  while(!input.equalsIgnoreCase("done") || userInput.size() > 10)
	  	{
			  userInput.add(input);
		  	input = view.askQuestion("Add the rest of the answers. Type done when finished");
		  }
		
		  view.displayMessage("Cool, you have: " + userInput.size() 
		  + " correct answers. They are: " + userInput);
  }
}

