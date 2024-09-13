/*
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 

> IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
*/

#include <iostream>
#include <string>

using namespace std;

int main() {
    int quant=0;
    
    /*
        É possível comentar as linhas 19, 22 e 23 e descomentar a 20 para inserir o texto direto no código.
    */

    string text;
    // string text = "Texto A teste a ";
    
    cout << "Insira um texto: ";
    getline(cin, text);

    for(char c : text)
        if(c == 'a' || c == 'A')
            quant++;

    cout << "A letra 'a' aparece " << quant << " vezes no texto." << endl;
    return 0;
}
