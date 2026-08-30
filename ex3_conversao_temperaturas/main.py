celsius = float(input("Temperatura em °C: "))

# Fórmula: multiplicação e divisão têm mesma precedência, avaliadas da esquerda para direita
# Colocamos parênteses para deixar explícito que (celsisus * 9 / 5) é feito antes de somar 32
fahrenheit = (celsius * 9 / 5) + 32

print(f"{celsius}°C equivale a {fahrenheit:.2f}°F")