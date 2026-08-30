# Entrada de dados e conversão explicita para float
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))

# Cálculo da média com parênteses para garantir a ordem correta
# (soma primeiro, depois divisão)
media = (nota1 + nota2 + nota3) / 3

# Expressão relacional que gera um valor booleano
aprovado = media >= 7

# Saída
print(f"Média: {media:.2f}")
if aprovado:
    print("Aprovado!")
else:
    print("Reprovado!")