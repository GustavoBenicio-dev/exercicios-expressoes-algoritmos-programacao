preco = float(input("Preço do produto: "))
percentual = float(input("Percentual de desconto (ex: 10 para 10%): "))

# Cálculo do desconto: preco * percentual / 100
desconto = preco * percentual / 100    # / e * mesma precedência, avaliado da esquerda para direita
preco_final = preco - desconto

print(f"Desconto: R$ {desconto:.2f}")
print(f"Preço final: R$ {preco_final:.2f}")