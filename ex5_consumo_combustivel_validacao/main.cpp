#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double distancia, litros, precoLitro;

    cout << "Distância percorrida (Km): ";
    cin >> distancia;
    cout << "Litros consumidos: ";
    cin >> litros;
    cout << "Preço por litro (R$): ";
    cin >> precoLitro;

    // Validação com relacionais e lógicos
    bool valido = (distancia > 0) && (litros > 0) && (precoLitro > 0) && (litros != 0) && (distancia != 0);

    if (valido) {
        double consumoMedio = distancia / litros;
        double custoTotal = litros * precoLitro;
        double custoKm = custoTotal / distancia;

        cout << fixed << setprecision(2);
        cout << "Consumo médio: " << consumoMedio << " Km/l" << endl;
        cout << "Custo total: R$ " << custoTotal << endl;
        cout << "Custo por Km: R$ " << custoKm << endl;
    } else {
        cout << "Dados inválidos! Certifique-se de que todos os valores são positivos e que distância e litros são diferentes de zero." << endl;
    }

    return 0;
}