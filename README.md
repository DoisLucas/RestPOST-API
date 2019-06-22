
# RestPOST-API
https://api-postful.herokuapp.com/

🔥 **Nova atualização: Agora é retornado a bandeira dos países.**

**API:** O acrônimo API que provém do inglês Application Programming Interface (Em português, significa Interface de Programação de Aplicações), trata-se de um conjunto de rotinas e padrões estabelecidos e documentados por uma aplicação A, para que outras aplicações consigam utilizar as funcionalidades desta aplicação A, sem precisar conhecer detalhes da implementação do software.

**REST:** O modelo REST (**RE**presentational **S**tate **T**ransfer) representa nada mais que uma “nova” possibilidade para a criação de web services, cujas principais diferenças em relação ao modelo tradicional (SOAP) estão na utilização semântica dos métodos HTTP (GET, POST, PUT e DELETE), na leveza dos pacotes de dados transmitidos na rede e na simplicidade, fazendo desnecessária a criação de camadas intermediárias.

<p align="center">
<img src="https://becode.com.br/wp-content/uploads/2017/02/API-768x520.png" width="50%" height="50%" align="center"/>
</p>

A API criada disponibiliza todos os continentes e países existentes, retornando os dados de busca no formato **JSON**. Confira abaixo as URLs de acesso a API:

**/paises?nome={param}**
*Lista um país especifico pelo nome, ignorando caixa alta/baixa e acentuações.*

**/continentes**
*Lista todos os continentes existentes.*

**/continentes/{id}**
*Lista um continente em especifico, de acordo com o parâmetro ID passado no corpo da URL.*

**/continentes/{id}/paises**
*Lista todos os países de um continente especifico.*

**/continentes/{id}/paises/{id}**
*Lista um país especifico de um continente de acordo com os parâmetros passados no corpo da URL.*

## Exemplo:

**/continentes/1/paises/1**

```
{
  "id": 1,
  "nome": "África do Sul",
  "capital": "Pretória",
  "area": 1221040,
  "populacao": 54956920,
  "governo": "República presidencialista",
  "lema": "Diversos povos se unem",
  "hino": "National anthem of South Africa",
  "linguas": "Africâner, Inglês, Ndebele, SeSotho do norte, SeSotho do sul, Suázi, Venda, Xhosa, XiTsonga, Zulu, seTswana",
  "moeda": "Rand sul-africano (ZAR), desde 1961",
  "vizinhos": "Botsuana, Lesoto, Moçambique, Namíbia, Suazilândia, Zimbábue",
  "f_maritimas": "Oceano Atlântico, Oceano Índico",
  "bandeira_url": "https://aimore.net/band/Africa_do_Sul.jpg"
}

```
