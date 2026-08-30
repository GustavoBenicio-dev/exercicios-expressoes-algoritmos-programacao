#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double n1, p1, n2, p2, n3, p3;

    cout << "Nota 1: "; cin >> n1;
    cout << "Peso 1: "; cin >> p1;
    cout << "Nota 2: "; cin >> n2;
    cout << "Peso 2: "; cin >> p2;
    cout << "Nota 3: "; cin >> n3;
    cout << "Peso 3: "; cin >> p3;

    double media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);

    string situacao;
    if (media >= 7.0) {
        situacao = "Aprovado";
    } else if (media >= 5.0 && media < 7.0) { // && para AND
        situacao = "Recuperação";
    } else {
        situacao = "Reprovado";
    }

    cout << fixed << setprecision(2);
    cout << "Média ponderada: " << media << endl;
    cout << "Situação: " << situacao << endl;

    return 0;
}