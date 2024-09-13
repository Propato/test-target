# Teste Técnico

As soluções foram desenvolvidas nas linguagens C++ e Java e dentro de cada pasta, além das soluções, há um README explicando como executar.

## 1 

Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 

> IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

Solução:
    
<a href='./c++/fibonacci.cpp'> Fibonacci em C++ </a>

<a href='./java/Fibonacci.java'> Fibonacci em Java </a>

## 2 

Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 

> IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 

Solução:
    
<a href='./c++/stringA.cpp'> Verifica String em C++ </a>

<a href='./java/StringA.java'> Verifica String em Java </a>

## 3 

Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); 

Ao final do processamento, qual será o valor da variável SOMA? 

```
Resposta:  
    A variável terá valor de 77.
```

## 4 

Descubra a lógica e complete o próximo elemento: 

 - a) 1, 3, 5, 7, __9__ 
 - b) 2, 4, 8, 16, 32, 64, __128__ 
 - c) 0, 1, 4, 9, 16, 25, 36, __49__ 
 - d) 4, 16, 36, 64, __100__ 
 - e) 1, 1, 2, 3, 5, 8, __13__ 
 - f) 2,10, 12, 16, 17, 18, 19, __200__

Resposta: 

 - 9
 - 128
 - 49
 - 100
 - 13
 - 200

## 5 

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?   

Resposta: 

Entendo que há três salas com uma lâmpada cada e uma sala de interruptores, onde começamos.
 
Assim, inicialmente, ligo o primeiro interruptor e espero alguns minutos. Em seguida, desligo o primeiro e ligo o segundo. Após, vou na sala 1 e vejo:

 - Se a lâmpada estiver acessa: O interruptor 2 controla a sala 1.
 - Se a lâmpada estiver apagada e quente: O interruptor 1 controla a sala 1.
 - Caso contrário, lâmpada fria e apagada: O interruptor 3 controla a sala 1.

Assim, voltaria para a sala de controle e acionaria um dos dois interruptores que ainda não sei qual lâmpada controlam e iria para a sala 2.

 - Se a lâmpada estiver acessa: O interruptor acionado controla a sala 2 e o outro, a sala 3.
 - Se a lâmpada estiver apagada: O interruptor acionado controla a sala 3 e o outro, a sala 2.
