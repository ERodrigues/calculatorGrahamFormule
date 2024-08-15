# Calculadora de preço de ações utilizando a fórmula de Graham

A Fórmula de Graham, também apelidada como “Modelo de Graham”, é uma fórmula desenvolvida por Benjamin Graham, considerado o “pai do investimento em valor” e mentor de Warren Buffett. Essa fórmula foi apresentada em seu livro clássico de investimentos, “Security Analysis,” coescrito com David Dodd, e posteriormente abordada em seu clássico livro “O investidor inteligente.”

## Parâmetros para o calculo
- LPA: Lucro por ação (lucro líquido dividido pelo número de ações).
- VPA: Valor patrimonial por ação  (patrimônio líquido dividido pelo total de ações).

Com base nesses parâmetros, o cálculo retorna aquilo que deve ser considerado um preço justo por ação.

## Projeto 

Esse projeto tem um único endpoint onde ao ser chamado deve ser informando no header os valores: 
- VPA 
- LPA
- 
O retorno do endpoint retornará o valor considerado justo por uma ação. 