(EN - US) Notes:

* To print a nextInt and a subsequent nextLine together without giving an error in line spacing, you must do as follows:

- int x;
- String g1, g2, g3;

- x = sc.nextInt();
- sc.nextLine();
- g1 = sc.nextLine();
- g2 = sc.nextLine();
- g3 = sc.nextLine();

* The addition of the nextLine between them prevents the IDE from absorbing a line since pressing 'Enter' on the variable data 'x', without that nextLine, would consider the 'g1' as a space and that would be the String value. So, it is necessary to have this loose nextLine in the middle to prevent this problem from happening.

(PT - BR) Observações:

* Para imprimir conjuntamente um nextInt e um nextLine subsequentes sem dar erro no espaçamento entre linhas, deve-se fazer da seguinte forma:

- int x;
- String g1, g2, g3;

- x = sc.nextInt();
- sc.nextLine();
- g1 = sc.nextLine();
- g2 = sc.nextLine();
- g3 = sc.nextLine();

* A adição do nextLine entre eles impede que a IDE absorva uma linha visto que ao apertar 'Enter' nos dados da variável 'x', sem aquele nextLine, iria considerar o 'g1' como um espaço e esse seria o valor da String. Por isso, se faz necessário esse nextLine solto ali no meio para impedir que aconteça esse problema.