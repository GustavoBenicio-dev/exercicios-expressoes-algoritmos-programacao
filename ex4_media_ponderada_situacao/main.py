n1 = float(input("Nota 1: "))
p1 = float(input("Peso 1: "))
n2 = float(input("Nota 2: "))
p2 = float(input("Peso 2: "))
n3 = float(input("Nota 3: "))
p3 = float(input("Peso 3: "))

# Média ponderada com parênteses para garantir a ordem correta
media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3)

# Uso de operadores relacionais e lógicos (and)
if media >= 7:
    situacao = "Aprovado"
elif media >= 5 and media < 7:   # expressão lógica com 'and'
    situacao = "Recuperação"
else:
    situacao = "Reprovado"

print(f"Média ponderada: {media:.2f}")
print(f"Situação: {situacao}")