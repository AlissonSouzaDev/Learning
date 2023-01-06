(EN - US) Question Statement:

* Write a program to read the coordinates (X,Y) of an indeterminate number of points in the Cartesian system. For each point write the quadrant to which it belongs. The algorithm will terminate when at least one of two coordinates is NULL (in this situation without writing any message).

Input:           
2 2             
3 -2
-8 -1
-7 1
0 2

Output:          
first 
fourth
third
second
           
* Exercise correction / Other solution method:

Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
int y = sc.nextInt();

while (x != 0 && y != 0) {

 	if (x > 0 && y > 0) {

		System.out.println("first");

	}

	else if (x < 0 && y > 0) {

		System.out.println("second");

	}

	else if (x < 0 && y < 0) {

		System.out.println("third");

	}

	else {

		System.out.println("fourth");

	}

	x = sc.nextInt();
	y = sc.nextInt();

}

sc.close();

(PT - BR) Enunciado da Questão:

* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada:           
2 2             
3 -2
-8 -1
-7 1
0 2

Saída:          
first 
fourth
third
second

* Correção do exercício / Outro método de solução:

Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
int y = sc.nextInt();

while (x != 0 && y != 0) {

 	if (x > 0 && y > 0) {

		System.out.println("first");

	}

	else if (x < 0 && y > 0) {

		System.out.println("second");

	}

	else if (x < 0 && y < 0) {

		System.out.println("third");

	}

	else {

		System.out.println("fourth");

	}

	x = sc.nextInt();
	y = sc.nextInt();

}

sc.close();

