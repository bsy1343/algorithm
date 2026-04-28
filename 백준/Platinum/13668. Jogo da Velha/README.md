# [Platinum II] Jogo da Velha - 13668

[문제 링크](https://www.acmicpc.net/problem/13668)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 7, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>O jogo da velha &eacute; um dos jogos mais antigos da humanidade; os primeiros registros dele s&atilde;o do s&eacute;culo I antes de Cristo, no Imp&eacute;rio Romano. Jo&atilde;o e Maria jogam bastante jogo da velha, mas depois de algum tempo eles decidiram jogar uma variante do jogo da velha tradicional, o jogo da velha 1-D.<br />
<br />
O jogo da velha 1-D &eacute; um jogo disputado por dois jogadores em um tabuleiro 1 &times;&nbsp;N; inicialmente, todas as casas do tabuleiro est&atilde;o vazias. Os jogadores alternam-se desenhando uma cruz sobre uma casa vazia. O primeiro jogador a completar uma sequ&ecirc;ncia de tr&ecirc;s ou mais cruzes em casas consecutivas ganha o jogo.<br />
<br />
Maria logo percebeu que, dependendo da situa&ccedil;&atilde;o do jogo, sendo sua vez de jogar, ela pode sempre garantir a vit&oacute;ria, independente das jogadas de Jo&atilde;o. Isto &eacute; relativamente f&aacute;cil para tabuleiros menores, mas para tabuleiros maiores, mesmo ap&oacute;s v&aacute;rias jogadas, esta tarefa &eacute; mais dif&iacute;cil; por isso, ela pediu que voc&ecirc; escrevesse um programa que, dada a situa&ccedil;&atilde;o do tabuleiro, decide se ela tem uma estrat&eacute;gia vencedora.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de caso de teste cont&eacute;m um inteiro N, indicando o tamanho do tabuleiro (3 &le; N &le; 10<sup>4</sup>). A linha seguinte cont&eacute;m uma sequ&ecirc;ncia de N caracteres indicando quais casas do tabuleiro j&aacute; foram ocupadas: um &lsquo;.&rsquo; indica que a casa correspondente est&aacute; vazia, enquanto um &lsquo;X&rsquo; indica que a casa j&aacute; teve uma cruz desenhada sobre ela. A entrada nunca cont&eacute;m tr&ecirc;s &lsquo;X&rsquo; consecutivos.</p>

<p>O ultimo caso de teste &eacute; seguido por uma linha que cont&eacute;m um &uacute;nico n&uacute;mero zero.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha contendo um &uacute;nico caractere: &lsquo;S&rsquo; caso Maria possua uma estrat&eacute;gia vencedora e &lsquo;N&rsquo; caso contr&aacute;rio.</p>