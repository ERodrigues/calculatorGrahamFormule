# Calculadora de preço de ações utilizando a fórmula de Graham

A Fórmula de Graham, também apelidada como “Modelo de Graham”, é uma fórmula desenvolvida por Benjamin Graham, considerado o “pai do investimento em valor” e mentor de Warren Buffett. Essa fórmula foi apresentada em seu livro clássico de investimentos, “Security Analysis,” coescrito com David Dodd, e posteriormente abordada em seu clássico livro “O investidor inteligente.”

# Objetivo da aplicação 
Essa aplicação tem um objetivo bem simples que é calcular qual o valor justo a se pagar por uma determinada ação considerando como referência a Formula de Graham.

### Observação 

- Esta aplicação não armazena nenhuma informação, todo o cálculo é feito apenas em tempo de execução 

## Parâmetros para o calculo
- LPA: Lucro por ação (lucro líquido dividido pelo número de ações).
- VPA: Valor patrimonial por ação  (patrimônio líquido dividido pelo total de ações).

Com base nesses parâmetros, o cálculo retorna aquilo que deve ser considerado um preço justo por ação.

## Projeto 

Esse projeto tem um único endpoint onde ao ser chamado deve ser informando no header os valores: 
- VPA 
- LPA

O retorno do endpoint retornará o valor considerado justo por uma ação.

## Executando a aplicação 
Faça o build da imagem docker disponível: 

```
docker image build -t grahamformulecalculator-api . 
```

Execute a imagem: 

```
docker run grahamformulecalculator-api -p 8080:8080
 ```

É possível acessar via curl passando os valores de VPA e LPA no header, como no exemplo abaixo: 
```
curl --header "vpa: 4.2" --header "lpa: 5.2" http://localhost:8080/v1/stocks/resultGrahamFormule
```
Ou acessando o swagger da aplicação através do link:
```
http://localhost:8080/swagger-ui/index.html#/graham-formule-controller/getResultGrahamFormule
```
E passar os valores no header da chamada. 