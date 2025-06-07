# Repositório de Projetos Java

Este repositório contém 4 projetos Java independentes, cada um com sua própria classe `Main`. Todos devem ser executados separadamente.

## Estrutura do Projeto

      /Calculadora
      Main.java
      /CPFCalculator
      Main.java
      /DescobridorDeRaizes
         Main.java
      /ConversorDeUnidades
      Main.java


## Como Executar Cada Projeto

### Via Terminal/CMD:

1. Navegue até a pasta do projeto desejado:
   ```bash
   cd Calculadora

    Compile o arquivo Java:

      javac Main.java

      Execute o programa:
   
    java Main

Repita esses passos para cada projeto, entrando na pasta correspondente:

    cd CPFCalculator

    cd DescobridorDeRaizes

    cd ConversorDeUnidades

Via IDE (Eclipse, IntelliJ, VSCode):

    Importe a pasta do projeto que deseja executar

    Localize o arquivo Main.java correspondente

    Execute usando as opções da IDE:

        Botão direito → "Run"

        Ou use o atalho de execução (🔴 ou Ctrl+F11)

Descrição dos Projetos

    Calculadora
    Programa que realiza operações matemáticas básicas

    CPFCalculator
    Validador e/ou gerador de CPF

    DescobridorDeRaizes
    Calcula raízes de equações matemáticas

    ConversorDeUnidades
    Converte entre diferentes unidades de medida

Requisitos

    Java JDK 8 ou superior instalado(Java 21 Recomendado)

    Variáveis de ambiente configuradas corretamente

Dicas

🔹 Cada projeto é totalmente independente
🔹 Verifique o nome exato da classe principal (deve ser igual ao nome do arquivo)
🔹 Se ocorrer erro "classe principal não encontrada", confira se está na pasta certa
Solução de Problemas

❌ Erro ao compilar?

    Verifique se o Java está instalado (java -version)

    Confira se está no diretório correto

❌ Arquivo não encontrado?

    Liste os arquivos com dir (Windows) ou ls (Linux/Mac)

    Confira a capitalização (letras maiúsculas/minúsculas) do nome do arquivo
