(EN - US) Question Statement:

* Read the start time and end time of a game. Then calculate the duration of the game, knowing that the game can start on one day and end on another, having a minimum duration of 1 hour and a maximum of 24 hours.

Input:                      / Input:                      / Input:
16 2                        / 0 0                         / 2 16
                            /                             /
Output:                     / Output:                     / Output:
THE MATCH LASTED 10 HOURS   / THE MATCH LASTED 24 HOURS   / THE MATCH LASTED 14 HOURS

* Exercise correction / Other solution method:

Scanner sc = new Scanner(System.in);

int A, B, duration;

A = sc.nextInt();
B = sc.nextInt();

if (A < B) {

 		duration = B - A;

} else {

 		duration = 24 - A - B;

}

System.out.println("THE MATCH LASTED " + duration + "HOURS");

(PT - BR) Enunciado da Questão:

*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


Entrada:                    / Entrada:                    / Entrada:
16 2                        / 0 0                         / 2 16
                            /                             /
Saída:                      / Saída:                      / Saída:
THE MATCH LASTED 10 HOURS   / THE MATCH LASTED 24 HOURS   / THE MATCH LASTED 14 HOURS

* Correção do exercício/Outro método de solução:

Scanner sc = new Scanner(System.in);

int A, B, duration;
A = sc.nextInt();
B = sc.nextInt();

if (A < B) {

 		duration = B - A;

} else {

 		duration = 24 - A - B;

}

System.out.println("THE MATCH LASTED " + duration + "HOURS");
