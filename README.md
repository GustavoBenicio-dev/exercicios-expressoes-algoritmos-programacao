# Exercícios de Expressões em Algoritmos e Programação

Este repositório contém a resolução de cinco exercícios práticos sobre expressões aritméticas, relacionais e lógicas, aplicando os conceitos de precedência, associatividade, conversão de tipos e entrada/saída de dados. Cada exercício foi implementado nas linguagens Python, Java e C++, conforme orientado no material didático.

## Estrutura do Repositório

Os códigos estão organizados em pastas individuais para cada exercício, contendo os três arquivos fonte

## Conceitos Aplicados

Todos os exercícios foram desenvolvidos com base nos seguintes tópicos:

- Expressões aritméticas (adição, subtração, multiplicação, divisão, resto e potenciação quando aplicável).
- Expressões relacionais (comparações: `==`, `!=`, `>`, `<`, `>=`, `<=`).
- Expressões lógicas (AND, OR, NOT) e suas respectivas sintaxes em cada linguagem.
- Precedência e associatividade de operadores, com uso explícito de parênteses para garantir a ordem correta e melhorar a legibilidade.
- Conversão de tipos (entrada como string convertida para número inteiro ou real).
- Entrada de dados via teclado e saída formatada.
- Estruturas condicionais para tomada de decisão baseada em expressões booleanas.

## Como Executar

### Python

Navegue até a pasta do exercício desejado e execute:

Python
```bash
python main.py

Java
Compile e execute o arquivo Main.java:
bash
javac Main.java
java Main

C++
Compile e execute o arquivo main.cpp:
bash
g++ main.cpp -o main
./main

Descrição dos Exercícios:

Exercício 1 – Cálculo de Média Aritmética

Enunciado:
Leia três notas de um estudante, calcule a média aritmética e informe se ele foi aprovado (média maior ou igual a 7,0).

Conceitos aplicados:

    Entrada de dados com conversão para double/float.

    Expressão aritmética com parênteses para garantir a soma antes da divisão.

    Operador relacional >= para determinar aprovação.

    Saída formatada com duas casas decimais.

Exercício 2 – Cálculo de Preço com Desconto

Enunciado:
Leia o preço de um produto e o percentual de desconto. Calcule o valor do desconto e o preço final após a aplicação.

Conceitos aplicados:

    Expressões aritméticas com multiplicação e divisão.

    Precedência natural (multiplicação e divisão antes da subtração).

    Uso de variáveis para armazenar resultados intermediários.

Exercício 3 – Conversão de Temperaturas

Enunciado:
Leia uma temperatura em graus Celsius e converta para Fahrenheit utilizando a fórmula:
F = C × 9/5 + 32.

Conceitos aplicados:

    Expressão aritmética com múltiplos operadores.

    Parênteses para tornar a intenção explícita ((celsius * 9 / 5) + 32).

    Associatividade da multiplicação e divisão (esquerda para direita).

Exercício 4 – Média Ponderada com Situação

Enunciado:
Leia três notas e seus respectivos pesos. Calcule a média ponderada conforme a fórmula:
(n1×p1 + n2×p2 + n3×p3) / (p1 + p2 + p3).
Após o cálculo, informe a situação do estudante:

    Aprovado se média ≥ 7,0.

    Recuperação se 5,0 ≤ média < 7,0.

    Reprovado se média < 5,0.

Conceitos aplicados:

    Expressão aritmética com parênteses para garantir a ordem correta.

    Operadores relacionais (>=, <) e lógicos (and/&&) para combinar condições.

    Estrutura condicional encadeada (if, elif/else if, else).

Exercício 5 – Consumo de Combustível com Validação

Enunciado:
Leia a distância percorrida (km), a quantidade de litros consumidos e o preço por litro. Calcule:

    Consumo médio = distância / litros.

    Custo total = litros × preço por litro.

    Custo por km = custo total / distância.

Antes de calcular, valide se todos os valores são positivos e se distância e litros são diferentes de zero. Utilize expressões relacionais e lógicas para a validação.

Conceitos aplicados:

    Entrada de dados numéricos.

    Expressões relacionais (>, !=) combinadas com operadores lógicos (&& ou and).

    Estrutura condicional para exibir mensagem de erro caso os dados sejam inválidos.

    Cálculo das três métricas com base em expressões aritméticas.