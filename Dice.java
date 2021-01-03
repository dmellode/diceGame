// The "Dice" class.
import java.awt.*;
import hsa.Console;

/*
Dice Game
Dean D'Mello
17/04/2018
This program recreates the dice game from price is right and asks the user to
roll a dice and guess if the digit above is higher or lower than what they
rolled. They could win A BRAND NEW CARRRRR!
*/

public class Dice
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Declaration

	//Dice and actual price variables
	int dice1, dice2, dice3, dice4, dig1, dig2, dig3, dig4, dig5;

	//User's higher or lower choice variables
	char choice1, choice2, choice3, choice4, end;

	//Name
	String name;


	//Assignment

	//Temporary Values
	choice1 = 'A';
	choice2 = 'A';
	choice3 = 'A';
	choice4 = 'A';
	end = 'l';

	//Calculation

	//Random Dice Roll Assignment
	dice1 = (int) (Math.random () * 6) + 1;
	dice2 = (int) (Math.random () * 6) + 1;
	dice3 = (int) (Math.random () * 6) + 1;
	dice4 = (int) (Math.random () * 6) + 1;

	//Random Actual Value of Car Assignment
	dig1 = (int) (Math.random () * 6) + 1;
	dig2 = (int) (Math.random () * 6) + 1;
	dig3 = (int) (Math.random () * 6) + 1;
	dig4 = (int) (Math.random () * 6) + 1;
	dig5 = (int) (Math.random () * 6) + 1;


	//Input

	//Intro
	//Dice With Title
	int[] x = {70, 70, 100, 130, 130, 100, 70, 100, 130, 100, 100, 70};
	int[] y = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x, y, 12);

	int[] x1 = {133, 133, 163, 193, 193, 163, 133, 163, 193, 163, 163, 133};
	int[] y1 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x1, y1, 12);

	int[] x2 = {196, 196, 226, 256, 256, 226, 196, 226, 256, 226, 226, 196};
	int[] y2 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x2, y2, 12);

	int[] x3 = {196 + 63, 196 + 63, 226 + 63, 256 + 63, 256 + 63, 226 + 63, 196 + 63, 226 + 63, 256 + 63, 226 + 63, 226 + 63, 196 + 63};
	int[] y3 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x3, y3, 12);

	int[] x4 = {196 + 126, 196 + 126, 226 + 126, 256 + 126, 256 + 126, 226 + 126, 196 + 126, 226 + 126, 256 + 126, 226 + 126, 226 + 126, 196 + 126};
	int[] y4 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x4, y4, 12);

	int[] x5 = {196 + 189, 196 + 189, 226 + 189, 256 + 189, 256 + 189, 226 + 189, 196 + 189, 226 + 189, 256 + 189, 226 + 189, 226 + 189, 196 + 189};
	int[] y5 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x5, y5, 12);

	int[] x6 = {196 + 252, 196 + 252, 226 + 252, 256 + 252, 256 + 252, 226 + 252, 196 + 252, 226 + 252, 256 + 252, 226 + 252, 226 + 252, 196 + 252};
	int[] y6 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x6, y6, 12);

	int[] x7 = {196 + 315, 196 + 315, 226 + 315, 256 + 315, 256 + 315, 226 + 315, 196 + 315, 226 + 315, 256 + 315, 226 + 315, 226 + 315, 196 + 315};
	int[] y7 = {20, 50, 70, 50, 20, 40, 20, 5, 20, 40, 70, 50};
	c.drawPolygon (x7, y7, 12);

	//Title
	c.setColour (Color.black);
	Font f = new Font ("TimesNewRoman", Font.ITALIC, 26);
	c.setFont (f);
	c.drawString ("D", 105, 55);
	c.drawString ("I", 168, 55);
	c.drawString ("C", 231, 55);
	c.drawString ("E", 294, 55);
	c.drawString ("G", 357, 55);
	c.drawString ("A", 420, 55);
	c.drawString ("M", 483, 55);
	c.drawString ("E", 546, 55);

	//Game Board
	c.setColor (Color.orange);
	c.fillRect (70, 70, 500, 250);

	//Number Display Boxes
	Color border = new Color (254, 105, 16);
	c.setColor (border);
	c.fillRect (90, 150, 65, 90);
	c.fillRect (180, 80, 65, 90);
	c.fillRect (180, 220, 65, 90);
	c.fillRect (270, 80, 65, 90);
	c.fillRect (270, 220, 65, 90);
	c.fillRect (360, 80, 65, 90);
	c.fillRect (360, 220, 65, 90);
	c.fillRect (450, 80, 65, 90);
	c.fillRect (450, 220, 65, 90);
	Color numback = new Color (80, 80, 80);
	c.setColor (numback);
	c.fillRect (100, 160, 45, 70);
	c.fillRect (190, 90, 45, 70);
	c.fillRect (190, 230, 45, 70);
	c.fillRect (280, 90, 45, 70);
	c.fillRect (280, 230, 45, 70);
	c.fillRect (370, 90, 45, 70);
	c.fillRect (370, 230, 45, 70);
	c.fillRect (460, 90, 45, 70);
	c.fillRect (460, 230, 45, 70);

	//Dice Boxes
	Color dicebox = new Color (255, 0, 0);
	c.setColor (dicebox);
	c.fillRect (192, 175, 40, 40);
	c.fillRect (282, 175, 40, 40);
	c.fillRect (372, 175, 40, 40);
	c.fillRect (462, 175, 40, 40);
	c.setCursor (19, 1);


	//Intro Text
	c.println ("Welcome to The Price Is Right!");
	c.println ();
	c.println ("What's your name contestant?");
	name = c.readString ();
	c.println (name + ", come on dowwwwwwwwnnnnn!");
	c.println ();


	//New Screen
	c.println ("Press any key to continue");
	c.getChar ();
	c.clear ();


	//Game Board
	c.setColor (Color.orange);
	c.fillRect (70, 70, 500, 250);

	//Number Display Boxes
	c.setColor (border);
	c.fillRect (90, 150, 65, 90);
	c.fillRect (180, 80, 65, 90);
	c.fillRect (180, 220, 65, 90);
	c.fillRect (270, 80, 65, 90);
	c.fillRect (270, 220, 65, 90);
	c.fillRect (360, 80, 65, 90);
	c.fillRect (360, 220, 65, 90);
	c.fillRect (450, 80, 65, 90);
	c.fillRect (450, 220, 65, 90);

	c.setColor (numback);
	c.fillRect (100, 160, 45, 70);
	c.fillRect (190, 90, 45, 70);
	c.fillRect (190, 230, 45, 70);
	c.fillRect (280, 90, 45, 70);
	c.fillRect (280, 230, 45, 70);
	c.fillRect (370, 90, 45, 70);
	c.fillRect (370, 230, 45, 70);
	c.fillRect (460, 90, 45, 70);
	c.fillRect (460, 230, 45, 70);

	//Dice Boxes
	c.setColor (dicebox);
	c.fillRect (192, 175, 40, 40);
	c.fillRect (282, 175, 40, 40);
	c.fillRect (372, 175, 40, 40);
	c.fillRect (462, 175, 40, 40);

	//First Digit
	c.setCursor (19, 1);
	c.println ("Here is the first digit of the car's price.");
	Font f1 = new Font ("TimesNewRoman", Font.ITALIC, 40);
	c.setFont (f1);
	c.setColor (Color.white);
	c.drawString (dig1 + "", 110, 210);



	//Rolls
	//Second Digit
	c.println ("Please press any key to roll the dice");
	c.getChar ();

	c.setColor (Color.white);
	c.drawString (dice1 + "", 200, 210);
	Color light = new Color (251, 245, 38);
	if (dice1 == dig2)
	{

	    c.setColor (light);
	    c.fillRect (180, 80, 65, 90);
	    c.fillRect (180, 220, 65, 90);
	    c.setColor (numback);
	    c.fillRect (190, 90, 45, 70);
	    c.fillRect (190, 230, 45, 70);

	    c.println ("Wow, you got the second digit!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else if (dice1 == 1)
	{
	    c.setColor (light);
	    c.fillRect (180, 80, 65, 90);
	    c.setColor (numback);
	    c.fillRect (190, 90, 45, 70);
	    c.println ("You already know  it is higher!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else if (dice1 == 6)
	{
	    c.setColor (light);
	    c.fillRect (180, 220, 65, 90);
	    c.setColor (numback);
	    c.fillRect (190, 230, 45, 70);
	    c.println ("You already know it is lower!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else
	{
	    //First Choice
	    c.println ("Sorry the second digit is not " + dice1 + ", do you think the digit is higher(H) or lower(L) than what you rolled?");
	    choice1 = c.getChar ();
	    if (choice1 == 'H')

		{
		    c.setColor (light);
		    c.fillRect (180, 80, 65, 90);
		    c.setColor (numback);
		    c.fillRect (190, 90, 45, 70);
		}
	    else if (choice1 == 'L')

		{
		    c.setColor (light);
		    c.fillRect (180, 220, 65, 90);
		    c.setColor (numback);
		    c.fillRect (190, 230, 45, 70);
		}
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	}
	//Clear Text
	c.setCursor (19, 1);
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();

	c.setCursor (19, 1);

	//Third Digit
	c.drawString (dice2 + "", 290, 210);

	if (dice2 == dig3)
	{
	    c.println ("Wow, you got the third digit!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else if (dice2 == 1 || dice2 == 6)
	{
	    c.println ("You already know if it is higher or lower!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else
	{
	    //Second Choice
	    c.println ("Sorry the third digit is not " + dice2 + ", do you think the digit is higher(H) or lower(L) than what you rolled?");
	    choice2 = c.getChar ();
	    c.println (choice2);
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	}

	//Clear Text
	c.setCursor (19, 1);
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();

	c.setCursor (19, 1);

	//Fourth Digit
	c.drawString (dice3 + "", 380, 210);

	if (dice3 == dig4)
	{
	    c.println ("Wow, you got the fourth digit!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else if (dice3 == 1 || dice3 == 6)
	{
	    c.println ("You already know if it is higher or lower!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else
	{
	    //Third Choice
	    c.println ("Sorry the fourth digit is not " + dice3 + ", do you think the digit is higher(H) or lower(L) than what you rolled?");
	    choice3 = c.getChar ();
	    c.println (choice3);
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	}

	//Clear Text
	c.setCursor (19, 1);
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();

	c.setCursor (19, 1);

	//Fifth Digit
	c.drawString (dice4 + "", 470, 210);

	if (dice4 == dig5)
	{
	    c.println ("Wow, you got the fifth digit!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';

	}
	else if (dice4 == 1 || dice4 == 6)
	{
	    c.println ("You already know if it is higher or lower!");
	    c.println ();
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	    end = 'w';
	}
	else
	{
	    //Fourth Choice
	    c.println ("Sorry the fifth digit is not " + dice4 + ", do you think the digit is higher(H) or lower(L) than what you rolled?");
	    choice4 = c.getChar ();
	    c.println (choice4);
	    c.println ("Please press any key to roll the dice");
	    c.getChar ();
	}

	//Real Value

	//Fifth Digit Reveal
	c.println ("The fifth digit was " + dig5);
	if (dig5 == dice4)
	{
	    c.println ("You already guessed this number with your roll.");
	}
	else if (dice4 == 1 || dice4 == 6)
	{
	    c.println ("You automatically got this digit with your roll!");
	}
	else if ((dig5 > dice4 && choice4 == 'H') || (dig5 < dice4 && choice4 == 'L'))
	{
	    c.println ("Your guess for the fifth digit was correct!");
	    end = 'w';
	}
	else
	{
	    c.println ("Your guess for the fifth digit was incorrect :(  Good Try!");
	    end = 'l';
	}
	c.println ();



	//Fourth Digit Reveal
	c.println ("The fourth digit was " + dig4);
	if (dig4 == dice3)
	{
	    c.println ("You already guessed this number with your roll.");
	}
	else if (dice3 == 1 || dice3 == 6)
	{
	    c.println ("You automatically got this digit with your roll!");
	}
	else if ((dig4 > dice3 && choice3 == 'H') || (dig4 < dice3 && choice3 == 'L'))
	{
	    c.println ("Your guess for the fourth digit was correct!");
	    end = 'w';
	}
	else
	{
	    c.println ("Your guess for the fourth digit was incorrect :(  Good Try!");
	    end = 'l';
	}
	c.println ();



	//Third Digit Reveal
	c.println ("The third digit was " + dig3);
	if (dig3 == dice2)
	{
	    c.println ("You already guessed this number with your roll.");
	}
	else if (dice2 == 1 || dice2 == 6)
	{
	    c.println ("You automatically got this digit with your roll!");
	}
	else if ((dig3 > dice2 && choice2 == 'H') || (dig3 < dice2 && choice2 == 'L'))
	{
	    c.println ("Your guess for the third digit was correct!");
	    end = 'w';
	}
	else
	{
	    c.println ("Your guess for the third digit was incorrect :(  Good Try!");
	    end = 'l';
	}
	c.println ();



	//Second Digit Reveal
	c.println ("The second digit was " + dig2);
	if (dig2 == dice1)
	{
	    c.println ("You already guessed this number with your roll.");
	}
	else if (dice1 == 1 || dice1 == 6)
	{
	    c.println ("You automatically got this digit with your roll!");
	}
	else if ((dig2 > dice1 && choice1 == 'H') || (dig2 < dice1 && choice1 == 'L'))
	{
	    c.println ("Your guess for the second digit was correct!");
	    end = 'w';
	}
	else
	{
	    c.println ("Your guess for the second digit was incorrect :(  Good Try!");
	    end = 'w';
	}
	c.println ();

	if (end == 'w')
	{
	    c.println ("Congratulations, you guessed the price! Enjoy your brand new 2 door buggy");
	}
	else
	{
	    c.println ("Sorry, you did not guess the price correctly. Better luck next time!");
	}







    } // main method
} // Dice class


