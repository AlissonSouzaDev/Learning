(EN - US) Question Statement:

* Make a program to read a positive integer N. The program should then display on the screen N lines starting from 1 to N. For each line, display the line number, then the square and cube of the value, as in the example.

Input:           / Output:
5                / 1 1 1
                 / 2 4 8
                 / 3 9 27
                 / 4 16 64
                 / 5 25 125

* Exercise correction / Other solution method:

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for (int i=1; i<=n; i++) {

	int first = i;
	int second = i * i;
	int third = i * i * i;
	
	System.out.printf("%d %d %d%n", first, second, third);

}

sc.close();

}

(PT - BR) Enunciado da Questão:

*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.

Entrada:         / Saída:
5                / 1 1 1
                 / 2 4 8
                 / 3 9 27
                 / 4 16 64
                 / 5 25 125

* Correção do exercício / Outro método de solução:

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for (int i=1; i<=n; i++) {

	int first = i;
	int second = i * i;
	int third = i * i * i;
	
	System.out.printf("%d %d %d%n", first, second, third);

}

sc.close();

}