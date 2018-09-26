# ole-training
Template project to resolve some exercises.

## Flow to implement
For each module, a branch must be created from its respective develop branch to solve it. <br>
After development is completed, a pull request by github should be opened for proper approval. <br>

## Common Exercises

</br>

**1** - Resolve exercises 5 - 7 - 9 - 10 - 11 - 17 - 19 - 20 from book "Modulo_02"<br>
**2** - Resolve exercises - from book "Modulo_03"<br>

## Backend Specific Exercices

<br>
//TODO
<br>

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

Um esquadr�o de tropa de robos desembarcaram na Nasa em uma plataforma de marte. Essa plataforma, que � curiosamente retangular, deve ser percorrida pelos rob�s de modo que suas cameras on-board posssam captar a vista completa ao redor do terreno para enviar de volta para a terra.

A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

Uma posi��o de rob� e a localiza��o � representada pela combina��o de coordenadas x e y, e uma letra representando um dos 4 pontos cardeais da b�ssula. A plataforma � dividiva dentro de uma grade para simplificar a navega��o. Um exemplo de posi��o pode ser 0, 0, N, o que significa que o rob� est� no canto inferior esquerdo e virado para o norte.

In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.

Em ordem para controlar um robo, a Nasa manda uma simples string de letras. As letras poss�veis s�o 'L', 'R' e 'M'. 'L' e 'R' faz o rob� girar 90 graus para a esquerda ou para a direita respectivamente. Sem sair de seu lugar. 'M' 
significa avan�ar um ponto de grade e manter a mesma posi��o.

Assume that the square directly North from (x, y) is (x, y+1).
Suponha que o quadrado diretamente ao norte (x,y) � (x, y+1).

#### INPUT:

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

A primeira linha de entrada � a coordenada superior direita da plataforma, o coordenada inferior esquerda suponha que seja 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

O restante das entradas � informa��o pertinente aos robos que tem sido implantadas. Cada rob� tem duas linhas de entrada. A primeira linha da a posicao do rob�, e a segunga linha � uma s�rie de instru��es contando ao rob� como explorar a plataforma.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.

A posi��o � feita de dois inteiros e uma letra separada por espa�os, correspondendo �s coordenadas X e Y  e a orienta��o do rob�.

Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.

Cada rob� ser� finalizado sequencialmente, o que significa que o segundo rob� n�o come�a o movimento at� o primeiro ter acabado seu movimento.

#### OUTPUT:

The output for each rover should be its final co-ordinates and heading.

A sa�da para cada robo deve est�r com a coordenada final e cabe�alho.

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