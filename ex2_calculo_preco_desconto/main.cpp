#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double preco, percentual;

    cout << "Preço do produto: ";
    cin >> preco;
    cout << "Percentual de desconto: ";
    cin >> percentual;

    double desconto = preco * percentual / 100.0;
    double precoFinal = preco - desconto;

    cout << fixed << setprecision(2);
    cout << "Desconto: R$ " << desconto << endl;
    cout << "Preço final: R$ " << precoFinal << endl;

    return 0;
}