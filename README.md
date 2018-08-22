# initial-project
Template java project to resolve some exercises.

## Flow to implement
For each exercise, there should be a class in the main package to perform the proposed exercise. <br>
The main class, it will only have the responsibility to call the method responsible for the rule. <br>
The classes responsible for the rules should be created in the business package. <br>
And if it is necessary to create some POJO, it should be created in the package model. <br>

## Exercises

**Before any exercise, a dependency on log4 must be added to print the results of some exercises. Sysout will not be used.**<br>

</br>

**1** - Write a Java program to print the result of the following operations. <br>
Test Data: <br>
a. -5 + 8 * 6 <br>
b. (55+9) % 9 <br>
c. 20 + -3*5 / 8 <br> 
d. 5 + 15 / 3 * 2 - 8 % 3 <br> 
Expected Output : <br>
43 <br>
1 <br>
19 <br>
13 <br>

### Final Test
--------------------

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

#### INPUT:

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.

Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.

#### OUTPUT:

The output for each rover should be its final co-ordinates and heading.

#### INPUT AND OUTPUT:

##### Test Input:
5 5

1 2 N

LMLMLMLMM

3 3 E

MMRMMRMRRM

##### Expected Output:

1 3 N

5 1 E
