Pedido Namoro ❤️

Um aplicativo divertido feito com Kotlin Compose Desktop que faz um pedido especial de namoro. Quando o usuário tenta clicar em "Não", o botão foge da tela, tornando impossível recusar.

Funcionalidades:

Tela principal com a pergunta: "Quer namorar comigo?" Botão Sim: confirma o pedido e mostra uma mensagem de confirmação. Botão Não: "foge" aleatoriamente da tela quando o mouse se aproxima. Interface simples e colorida, usando Material Design.

Tecnologias usadas:

Kotlin Jetpack Compose Desktop Material Design para Compose

![Preview da aplicação](https://i.imgur.com/3ryUKEF.png)

Como rodar;

Clone o repositório:

git clone https://github.com/seu-usuario/pedido-namoro.git cd pedido-namoro

Compile e rode o projeto:

./gradlew.bat run # Windows

ou
./gradlew run # Linux / Mac

Isso irá abrir a janela do app com a pergunta e os botões interativos.

Gerar executável

O projeto suporta geração de instaladores nativos:

No Windows, será gerado um .exe ou .msi na pasta:

build/compose/binaries/main/win32/

Para gerar, rode:

./gradlew.bat clean package

O executável inclui todas as dependências, então não é necessário ter Java instalado na máquina.

Personalização

Ícone do aplicativo: src/main/resources/ic.png

Tamanho da janela: 1280x720

Mensagens e cores podem ser alteradas no arquivo Main.kt.

Licença

Este projeto é open-source. Pode ser usado e modificado livremente.
