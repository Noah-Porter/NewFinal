import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

import Popup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomPanel extends JPanel
{
  private JButton sampleButton;
  private Popup view;

  public controller()
  {
    view = new Popup();
    inputScanner = new Scanner(System.in);
    defaultWords = new Words();
  }

  public CustomPanel()
  {
    super();

    sampleButton = new JButton("Click Now");
    setupPanel();
    setupListeners();
  }

  private void setupListeners()
  {
    sampleButton.addActionListeners(new ActionListener()
    {
      public void actionPerformed(ActionEvent click)
      {
        setup();
      }
    });
  }

  private void startGame()
  {
    this.setBackgroundColor(updateColor);

  }
  private void setupPanel()
  {
    this.setBackground(Color.GREEN);
    this.add(sampleButton);
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
    }
    else
    {
      response = view.askQuestion("What is player one's new name?");
      view.displayMessage("Player one's new name is " + response);
      custom.setPlayerOneName(response);
    }

    response = view.askQuestion("What is player two's name?");
    response = view.askQuestion("Player two's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
      custom.setPlayerTwoName(response);
    }
    else
    {
      response = view.askQuestion("What is player two's new name?");
      view.displayMessage("Player two's new name is " + response);
      custom.setPlayerTwoName(response);
    }

    view.displayMessage("Let's move on");



    //Questions for the trivia section

    String [] questions = new String [4];
		
		for (int index = 0; index < questions.length; index ++)
		{
      response = view.askQuestion("Type a trivia question here");
      answer = view.askQuestion("Type your answer here for question: " + response);

      for (int index2 = 0; index2 < 1; index2 ++)
      {
        reply = view.askQuestion("Answer the following question (you have only two tries): " + response);

        if (reply.equalsIgnoreCase(answer))
        {
          view.displayMessage("Nice job! Now it's  your turn to ask the question.");
          total = total++;
        }
        else
        {
          reply = view.askQuestion("Try again");
          if (reply.equalsIgnoreCase(answer))
          {
            view.displayMessage("Great! Now it's your turn to ask the question.");
            total = total++;
          }
          else
          {
            view.displayMessage("The answer is: " + answer + ". Now it's your turn to ask the question.");
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

