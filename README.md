# project-anderson-georger-styka
project-anderson-georger-styka created by GitHub Classroom

Iteration 1:
In this iteration we completed the base of the project. The base classes were created and implemented. This includes the player class, game class, stopwatch class, and main function:
Player Class: Holds important attributes corresponding to a player such as their score and functions to set and get the score.
Game Class: Is the class that holds the elements of the game. This has 2 players of player class. It has functions to get and change the players and turns, as well as a a random generator and reset. 
Stopwatch class: Will handle the stopwatch, not implemented yet. Is planned for next iteration.
Main: runs the game for 5 turns and prints out results each turn.

In the next iteration we plan to implement the stopwatch and have a more interactive agme were the users are more involved.

The turns function still has some bugs, but works, and the stopwatch is still unusable.

We have made a bash script to run the game, so it should be intuitive.

Iteration 2:
In this iteration, we attempted to make-up the work we had previously failed to attend to (Kanban, Unit Testing) as well as create more complexity within our game.
To begin, we fixed the bash scripting file as before it did not include the --classpath flag, which originally caused many errors. After some research, we figured out how to ascertain the Main class's usage of the other classes in the directory they are all stored in.

Next, the unit testing needed to be fixed as they were not all connected to their classes appropriately. By reconfiguring the unit tests, we now see a handful of unit tests working properly when running our program as a JUnit.

Next, we needed to create more interactivity with the user. To do so, we created a start menu for the player to control whether or not he/she starts a game, retrieves help on the rules of the game, or quits. By creating switch statements for the Scanner, we retrieved the keyboard inputs of the user to then figure out which menu item was selected. When the game ends, the player then has a decision to either play another game or quit.

We then had to approach the Stopwatch situation as before we accidentally used an interface that was banned from this project. So, we found resources online explaining how to keep track of time in java, therefore we can use this in order to find the difference in time between keyboard clicks. Finding this difference in time will give the user more interactivity, creating the final output of the game we want including scoring based on the time elapsed.

