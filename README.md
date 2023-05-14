Neste trabalho, cada grupo terá que desenvolver um jogo baseado em turnos, chamado ElementOOPs, utilizando conceitos de programação orientada a objetos com Java. No jogo, o jogador deverá escolher uma criatura mística, representando um dos quatro elementos (terra, água, fogo e ar), e batalhar contra outras criaturas para se tornar o campeão do torneio ElementOOPs.

Funcionamento do Jogo
O jogo inicia apresentando um menu para o jogador, oferecendo as opções de iniciar um novo jogo ou sair do programa. Ao iniciar um novo jogo, um menu deve ser apresentado para o jogador com as opções de criaturas disponíveis para seleção e a opção de sair do programa. O jogo deve possuir quatro tipos de criaturas: StoneDev (terra),  WaveNerd (água), BurnCoder (fogo) e BreezeHacker (ar). Uma criatura deve possuir as seguintes características, cujos valores devem ser escolhidos aleatoriamente, dentro de um intervalo de valores possíveis, conforme apresentado abaixo:

PODER (PDR): inteiro entre 10 e 30;
ATAQUE (ATQ): inteiro entre 5 e 15;
DEFESA (DEF): inteiro entre 5 e 15;
VELOCIDADE (VEL): inteiro entre 1 e 10;
PONTOS DE VIDA (PVD): inteiro entre 200 e 400.
Uma vez escolhida a criatura, um menu deve ser apresentado com as opções de iniciar o torneio ou sair do programa. O torneio consiste de três batalhas, uma contra cada uma das criaturas não selecionadas pelo jogador. Uma batalha acontece em turnos. Em cada turno, a criatura com maior VELOCIDADE realiza a primeira ação. No momento do jogador realizar sua ação, um menu deve ser apresentado com as opções de realizar um ataque físico, realizar um ataque elemental ou sair do programa. Um ataque físico consiste em exibir uma mensagem e causar um DANO à criatura oponente, isto é, reduzir seus PONTOS DE VIDA, conforme definido a seguir:

DANO = PDR x ATQ / DEF

Um ataque elemental consiste em exibir uma mensagem especial, vinculada ao elemento da criatura, e causar um DANO à criatura oponente, isto é, reduzir seus PONTOS DE VIDA, conforme definido a seguir:

DANO = PDF x ATQ / DEF x FATOR

onde o FATOR depende da matriz de cruzamento a seguir:



Ao escolher a ação, o efeito sobre o oponente deve ser imediato e o jogo deve sinalizar a ação por meio de uma mensagem na tela. A ação da criatura controlada pelo jogo deve ser escolhida de maneira aleatória entre realizar um ataque físico e realizar um ataque elemental. Ao final de cada ação, o jogo deve verificar se a criatura afetada foi derrotada, isto é, teve seus PONTOS DE VIDA reduzidos à menos que 01 (um). Caso uma das criaturas tenha sido derrotada após uma ação, a batalha deve ser encerrada com uma mensagem de sucesso, caso o jogador seja o vitorioso, ou de derrota, caso o jogador seja o derrotado. Se o jogador for derrotado numa batalha, o jogo encerra com uma mensagem. Se o jogador for vitorioso numa batalha, um menu deve ser apresentado com as opções de iniciar a próxima batalha ou sair do programa. Se o jogador vencer as três batalhas, o jogo encerra com uma mensagem de sucesso. A qualquer momento que o usuário selecionar uma opção para sair do programa, o programa deve exibir uma mensagem e solicitar a confirmação da ação. Caso o usuário confirme, o programa deve ser encerrado.

Requisitos Técnicos
O trabalho deve ser desenvolvido em grupos de 04 (quatro) integrantes;
O jogo deve ser desenvolvimento em Java;
O desenvolvimento deve seguir os princípios do paradigma de programação orientada a objetos;
Não é necessário que o jogo possua uma interface gráfica de usuário baseada em janelas; uma interface para o terminal de comandos é suficiente;
A implementação dos conceitos de herança e polimorfismo é obrigatória neste projeto.
