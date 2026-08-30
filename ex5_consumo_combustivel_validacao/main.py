distancia = float(input("Distâmcia percorrida (km): "))
litros = float(input("Litros consumidos: "))
preco_litro = float(input("Preço por litro (R$): "))

# Validação com expressões lógicas
valido = (distancia > 0) and (litros > 0) and (preco_litro > 0) and (litros != 0) and (distancia != 0)
# Nota: litros > o já garante != 0, mas deixamos explícito por didática.

if valido:
    consumo_medio = distancia / litros
    custo_total = litros * preco_litro
    custo_km = custo_total / distancia

    print(f"Consumo médio: {consumo_medio: .2f} km/l")
    print(f"Custo total: R$ {custo_total: .2f}")
    print(f"Custo por km: R$ {custo_km: .2f}")
else:
    print("Dados inválidos! Certifique-se de que todos os valores são positivose que distancia e litros são diferentes de zero.")