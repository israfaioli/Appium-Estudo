## Projeto automação Mobile Appium ##
Olá Analistas e recrutadores,

Espero que vocês consigam navegar com tranquilidade por esse projeto. Estou seguindo o padrão POM para estruturação do projeto.

Espero que gostem, qualquer dúvida fiquem a vontade para entrar em contato - israfaioli@gmail.com

Este projeto foi desenvolvido durante meu curso Appium pela Udemy através da URL: https://www.udemy.com/course/testes-appium/

## pré requisitos ##
Java 8

Eclipse ou framework de seu gosto

Android Studio

Emulador

Appium

Maven


## Tecnologias Utilizadas ##
Selenium WebDriver
AndroidStudio
Appium
Java

## Estrutura do projeto ##
Core - Pacote que conterá a estrutura principal do projeto.

     - BasePage - Classe que conterão os métodos essencias que utilizaremos nas pages filhas

     - BaseTest - Métodos que irão acontecer antes e após a execução dos testes como exemplo "encerrar o Drive do Android", "gerar screenshot após cada teste", "e espera global"

     - Driver factory - Classe onde é feita a criação do AndroidDriver 

Page - Onde será mapeado os elementos e funções de cada página. No exemplo do curso fizemos cada página uma função de interação com diverson tipos de cenários que iremos encontrar no dispositivo como:
     - Mudar de aba

     - Clicar em accordeon

     - Interagir com Alerts

     - Ações de clique

     - Ação de Drag and Drop

     - Preenchimento de um formulário

     - Interação com menus

     - Interação com componente splash

     - Integerar com componentes do tipo SwipeList

     - Interagir com WebView

     - SeuBarriga - Paginas onde iremos trabalhar com os elementos de página web real e seus métodos de interação

models - Onde são criados os objetos que podem ser usados na automação.
runners - Suite principal para execução dos testes funcionais.
test - onde ficarão nossas classes de teste.

Acessa a pasta do projeto
Rode o seguinte comando do maven:

## Execução dos Testes Funcionais ##

- Executar suite de testes:

mvn clean test -Dtest=AppiumRunners

