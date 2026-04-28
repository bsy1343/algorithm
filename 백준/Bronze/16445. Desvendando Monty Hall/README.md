# [Bronze III] Desvendando Monty Hall - 16445

[문제 링크](https://www.acmicpc.net/problem/16445)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 407, 정답: 368, 맞힌 사람: 334, 정답 비율: 90.515%

### 분류

구현

### 문제 설명

<p>No palco de um programa de audit&oacute;rio h&aacute; tr&ecirc;s portas fechadas: porta 1, porta 2 e porta 3. Atr&aacute;s de uma dessas portas h&aacute; um carro, atr&aacute;s de cada uma das outras duas portas h&aacute; um bode. A produ&ccedil;&atilde;o do programa sorteia aleatoriamente a porta onde vai estar o carro, sem trapa&ccedil;a. Somente o apresentador do programa sabe onde est&aacute; o carro. Ele pede para o jogador escolher uma das portas. Veja que agora, como s&oacute; h&aacute; um carro, atr&aacute;s de pelo menos uma entre as duas portas que o jogador n&atilde;o escolheu, tem que haver um bode!</p>

<p>Portanto, o apresentador sempre pode fazer o seguinte: entre as duas portas que o jogador n&atilde;o escolheu, ele abre uma que tenha um bode, de modo que o jogador e os espectadores possam ver o bode. O apresentador, agora, pergunta ao jogador: &ldquo;voc&ecirc; quer trocar sua porta pela outra porta que ainda est&aacute; fechada?&rdquo;. E vantajoso trocar ou n&atilde;o? O jogador quer ficar com a porta que tem o carro, &acute; claro!</p>

<p>Paulinho viu uma demonstra&ccedil;&atilde;o rigorosa de que a probabilidade de o carro estar atr&aacute;s da porta que o jogador escolheu inicialmente &eacute; 1/3 e a probabilidade de o carro estar atr&aacute;s da outra porta, que ainda est&aacute; fechada e que o jogador n&atilde;o escolheu inicialmente, &eacute; 2/3 e, portanto, a troca &eacute; vantajosa. Paulinho n&atilde;o se conforma, sua intui&ccedil;&atilde;o lhe diz que tanto faz, que a probabilidade &eacute; 1/2 para ambas as portas ainda fechadas...</p>

<p>Neste problema, para acabar com a d&uacute;vida do Paulinho, vamos simular esse jogo milhares de vezes e contar quantas vezes o jogador ganhou o carro. Vamos supor que:</p>

<ul>
	<li>O jogador sempre escolhe inicialmente a porta 1;</li>
	<li>O jogador sempre troca de porta, depois que o apresentador revela um bode abrindo uma das duas portas que n&atilde;o foram escolhidas inicialmente.</li>
</ul>

<p>Nessas condi&ccedil;&otilde;es, em um jogo, dado o n&uacute;mero da porta que cont&eacute;m o carro, veja que podemos saber exatamente se o jogador vai ganhar ou n&atilde;o o carro.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m um inteiro N (1 &le; N &le; 10<sup>4</sup>), indicando o n&uacute;mero de jogos na simula&ccedil;&atilde;o. Cada uma das N linhas seguintes cont&eacute;m um inteiro: 1, 2 ou 3; representando o n&uacute;mero da porta que cont&eacute;m o carro naquele jogo.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha, contendo um inteiro representando o n&uacute;mero de vezes que o jogador ganhou o carro nessa simula&ccedil;&atilde;o, supondo que ele sempre escolhe inicialmente a porta 1 e sempre troca de porta depois que o apresentador revela um bode abrindo uma das duas portas que n&atilde;o foram escolhidas inicialmente.</p>