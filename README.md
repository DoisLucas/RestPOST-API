# RestPOST-API

**API:** O acrônimo API que provém do inglês Application Programming Interface (Em português, significa Interface de Programação de Aplicações), trata-se de um conjunto de rotinas e padrões estabelecidos e documentados por uma aplicação A, para que outras aplicações consigam utilizar as funcionalidades desta aplicação A, sem precisar conhecer detalhes da implementação do software.

**REST:** O modelo REST (**RE**presentational **S**tate **T**ransfer) representa nada mais que uma “nova” possibilidade para a criação de api's/web services, cujas principais diferenças em relação ao modelo tradicional (SOAP) estão na utilização semântica dos métodos HTTP (GET, POST, PUT e DELETE), na leveza dos pacotes de dados transmitidos na rede e na simplicidade, fazendo desnecessária a criação de camadas intermediárias

<p align="center">
<img src="https://becode.com.br/wp-content/uploads/2017/02/API-768x520.png" width="50%" height="50%" align="center"/>
</p>

A API criada disponibiliza todos os continentes e paises existentes, retornando os dados de busca no formato **JSON**. Confira abaixo as URLs de acesso a API:

## \continentes
Lista todos os continentes existentes.

## \continentes\\[id]
Lista um continente em especifico, de acordo com o parâmetro ID passado no corpo da URL.

## \continentes\\[id]\paises
Lista todos os paises de um continente especifico.

## \continentes\\[id]\paises\\[id]
Lista um pais especifico de um continente, de acordo com os parâmetros passados no corpo da URL.
