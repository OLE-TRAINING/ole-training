# ole-training
Template project to resolve some exercises.

## Flow to implement
For each module, a branch must be created from its respective develop branch to solve it. <br>
After development is completed, a pull request by github should be opened for proper approval. <br>

## Common Exercises

</br>

**1** - Resolve exercises 5 - 7 - 9 - 10 - 11 - 17 - 19 - 20 from book "Modulo_02"<br>
**2** - Resolve exercises - from book "Modulo_03"<br>
**3** - Resolve exercises 12 - 14 - 16 from book "Modulo_03"<br>

## Backend Specific Exercices

<br>
All exercises below should be done using a maven project. <br>
The resolution of the exercises of each topic should be well organized. <br>

### API Java Time

</br>

**1** - Display the current date using the classes in this api. <br>
**2** - convert a string in the dd /MM/yyyy pattern to a date object. <br>
**3** - Do the reverse process of Exercise 2. <br>
**4** - Convert a string with a GMT-3 time zone date to a date object. <br>
**5** - Recover the next month from any date. <br>
**6** - Add 10 days on any date and print the difference. <br>

### BigDecimal

</br>

**1** - Declare a number and print. <br>
**2** - Reverse the sign of a number. <br>
**3** - Compare three numbers and print the largest and smallest. <br>
**4** - Create a calculator, add, subtract, divide and multiply. <br>

### API Gson

</br>

**1** - Create the Person object that will have the attributes, name (type character), id (type numerical), salary (type decimal), registrationDate (type date). <br>
**2** - Instantiate the Person object and convert it to a json and print the same. <br>
**3** - Do the reverse process of Exercise 2. <br>
**4** - Same process as Exercise 2, plus omit json id attribute. <br>
	

### Reflection

</br>

**1** - Study Java Reflection. <br>
**2** - List all attributes of the person object using reflection. <br>
**3** - Print if the name attribute of the Person object contains value. <br>
**4** - Create a class named ErrorResponse with the attributes, id (type character), message (type character). <br>
**5** - Create a structure to validate if the attributes of the person object are null. For each null attribute, create an ErrorResponse object and then throw a created exception to display the validation errors. <br>
**6** - Create a class called MethodReflection, and add several methods to it, each with a different signature and different parameters. Finally, execute and list all methods of the class using Reflection. <br>

### Client Http

</br>

**1** - Studying over HTTP protocol. <br>
**2** - Create a poc and use some api, library or framework that makes http requests. <br>
**3** - Use some http call generator (Mocky io, Mock Bin, MockAPI) to run the tests below. <br>
**4** - Call a service to return a Person list (object created in the previous theme), containing three items. <br>
**5** - Call a service that saves a Person and expects the http status that is generated when creating a resource (You will not need to persist anywhere, just represent a call that does this). <br>
**6** - Call a service that updates a Person (No need to persist anywhere, just represent a call that does this operation). <br>
**7** - Call a service that updates only some information from a Person (No need to persist anywhere, just represent a call that does this). <br>
**8** - Call a service that deletes a Person. <br>
**9** - Call a service to return an HTTP error and throw a new exception according to the name of the received code status. <br>

## Android Specific Exercices

<br>
//TODO
<br>

## iOS Specific Exercices

<br>
//TODO
<br>

### Final Common Test
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
