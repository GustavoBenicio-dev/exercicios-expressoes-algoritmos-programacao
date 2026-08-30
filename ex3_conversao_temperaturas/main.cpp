#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double celsius;

    cout << "Temperatura em °C: ";
    cin >> celsius;

    double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

    cout << fixed << setprecision(2);
    cout << celsius << "°C equivale a " << fahrenheit << "°F" << endl;

    return 0;
}