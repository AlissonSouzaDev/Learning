(EN - US) Question Statement:

* Read an integer N and calculate all its divisors.

Input:           / Output:
6                / 1
                 / 2
                 / 3
                 / 6

* Exercise correction / Other solution method:

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for (int i=1; i<=n; i++) {

	if (n % i == 0) {
	
	System.out.println(i);
	
	}

}

sc.close();

}

(PT - BR) Enunciado da Questão:

* Ler um número inteiro N e calcular todos os seus divisores.

Entrada:         / Saída:
6                / 1
                 / 2
                 / 3
                 / 6

* Correção do exercício / Outro método de solução:

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for (int i=1; i<=n; i++) {

	if (n % i == 0) {
	
	System.out.println(i);
	
	}

}

sc.close();

}