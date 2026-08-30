#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double nota1, nota2, nota3;

    cout << "Digite a primeira nota: ";
    cin >> nota1;
    cout << "Digite a segunda nota: ";
    cin >> nota2;
    cout << "Digite a terceira nota: ";
    cin >> nota3;

    // Parênteses garantem soma antes da divisão
    double media = (nota1 + nota2 + nota3) / 3.0;

    bool aprovado = media >= 7.0;

    cout << fixed << setprecision(2);
    cout << "Média: " << media << endl;
    if (aprovado) {
        cout << "Aprovado!" << endl;
    } else {
        cout << "Reprovado!" << endl;
    }

    return 0;
}