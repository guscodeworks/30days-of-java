# Exercício — Cadastro de Produto com Scanner

## Objetivo

Criar um programa em Java que receba dados de um produto usando `Scanner` e calcule o valor total com desconto.

## O programa deve pedir
```
- Nome do produto
- Preço do produto
- Quantidade em estoque
- Porcentagem de desconto
```
## O programa deve calcular
```
- Total sem desconto
- Valor do desconto
- Total com desconto
```
## Fórmulas

```
totalSemDesconto = preco * quantidade;
valorDesconto = totalSemDesconto * desconto / 100;
totalComDesconto = totalSemDesconto - valorDesconto;
```

## Regra

Se o total com desconto for maior ou igual a `500`, mostre:

```
Compra grande
```

Caso contrário, mostre:

```
Compra comum
```

## Exemplo de entrada

```
Nome do produto: Teclado
Preço do produto: 120.00
Quantidade em estoque: 3
Porcentagem de desconto: 10
```

## Exemplo de saída

```
--- Produto Cadastrado ---
Produto: Teclado
Preço unitário: R$ 120.00
Quantidade: 3
Total sem desconto: R$ 360.00
Desconto: R$ 36.00
Total com desconto: R$ 324.00
Compra comum
```

# Resultado: `ExercicioED.java`