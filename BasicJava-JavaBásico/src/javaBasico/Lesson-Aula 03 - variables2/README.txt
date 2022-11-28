(EN) Notes:

* Good practice: Always indicate the type of number if the expression is floating-point (not integer).
* For a double use: .0
* For a float use: f

* If you defined the two initial variables as int (integer), the result will be 2.0, because the system understands that you want an integer result. To solve this and get a result of 2.5, we have to do casting, i.e., the explicit conversion of the values.
* Another very common example where it is necessary to use casting is when the compiler thinks that you are missing information. Example:

- double v;
- int z;
		
- v = 5.0;
- z = (int) v;
		
- System.out.println(z);

* You will notice that when you try to just assign the value of z to v, the compiler will give an error, to solve this you just need to do the casting with int, substituting above.

(PT-BR) Observações:

* Boas práticas: Indicar sempre o tipo de número se a expressão for ponto flutuante (não número inteiro).
* Para double use: .0
* Para float use: f

* Se você definiu as duas variáveis iniciais como do tipo int (inteiro), o resultado vai dar 2.0, porque o sistema entende que você quer um resultado inteiro. Para resolver isso e ter o resultado de 2.5, temos que fazer o casting, ou seja, a conversão explícita dos valores.
* Outro exemplo muito comum aonde é necessário estar utilizando o casting é quando o compilador achar que você vai estar perdendo informação. Ex.:

- double v;
- int z;
		
- v = 5.0;
- z = (int) v;
		
System.out.println(z);

* Percebe-se que quando se tenta somente atribuir o valor de z para o v, o compilador vai dar um erro, para resolver isso é necessário apenas fazer o casting com int, substituindo acima.