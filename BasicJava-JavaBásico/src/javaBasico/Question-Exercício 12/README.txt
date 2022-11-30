(EN - US) Question Statement:

* Based on the chart below, write a program that reads the code of an item and the quantity of this item. Then calculate and display the amount of the bill payable.

CODE           / SPECIFICATION          / PRICE
1              / Hot-dog                / $ 4.00
2              / X-Salad                / $ 4.50
3              / X-Bacon                / $ 5.00
4              / Toast                  / $ 2.00
5              / Soda                   / $ 1.50

Input:          / Input:
3 2             / 2 3
                /
Output:         / Output:
Total: $ 10.00  / Total: $ 13.50

* Exercise correction / Other solution method:

Scanner sc = new Scanner(System.in);

int code = sc.nextInt();
int quantity = sc.nextInt();

double total;

if (code == 1) {

	total = quantity * 4.0;

} else if (code == 2) {

 	total = quantity * 4.5;

} else if (code == 3) {

 	total = quantity * 5.0;

} else if (code == 4) {

	total = quantity * 2.0;

} else {

	total = quantity * 1.5;

}

System.out.printf("Total: $ %.2f%n", total);

sc.close();

(PT - BR) Enunciado da Questão:

* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

CODE           / SPECIFICATION          / PRICE
1              / Hot-dog                / $ 4.00
2              / X-Salad                / $ 4.50
3              / X-Bacon                / $ 5.00
4              / Toast                  / $ 2.00
5              / Soda                   / $ 1.50

Entrada:        / Entrada:
3 2             / 2 3
                /
Saída:          / Saída:
Total: $ 10.00  / Total: 13.50

* Correção do exercício/Outro método de solução:

Scanner sc = new Scanner(System.in);

int code = sc.nextInt();
int quantity = sc.nextInt();

double total;

if (code == 1) {

	total = quantity * 4.0;

} else if (code == 2) {

 	total = quantity * 4.5;

} else if (code == 3) {

 	total = quantity * 5.0;

} else if (code == 4) {

	total = quantity * 2.0;

} else {

	total = quantity * 1.5;

}

System.out.printf("Total: R$ %.2f%n", total);

sc.close();