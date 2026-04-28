# [Bronze I] Jogo de Boca - 15048

[문제 링크](https://www.acmicpc.net/problem/15048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 443, 정답: 345, 맞힌 사람: 311, 정답 비율: 81.201%

### 분류

수학, 게임 이론, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Um jogo infantil, muito popular, &eacute; o 21 de boca. O jogo &eacute; jogado da seguinte forma: o primeiro jogador diz um n&uacute;mero, n<sub>0</sub>, que pode ser 1 ou 2. O segundo jogador pode ent&atilde;o dizer um n&uacute;mero n<sub>1</sub> tal que n<sub>1</sub> &isin; {n<sub>0</sub> + 1, n<sub>0</sub> + 2}. E assim por diante, os jogadores se alternam, dizendo sempre um n&uacute;mero que &eacute; um ou dois maior do que o anterior. O jogador que disser 21 ganha o jogo. Por exemplo, a sequ&ecirc;ncia de n&uacute;meros poderia ser: 1, 3, 5, 6, 7, 9, 11, 12, 14, 15, 16, 18, 19, 21. Neste jogo, o primeiro jogador sempre perde, se o segundo souber jogar bem.</p>

<p>A cada nova gera&ccedil;&atilde;o as crian&ccedil;as ficam mais espertas. Atualmente, apesar de acharem o 21 de boca um jogo interessante, muitas crian&ccedil;as n&atilde;o se sentem desafiadas o bastante e por isso resolveram generalizar o jogo, criando assim o N de boca. Dado um inteiro N, no lugar do 21, o primeiro jogador pode escolher 1 ou 2. A partir da&iacute; os jogadores se alternam, adicionando 1 ou 2 ao n&uacute;mero anterior, at&eacute; que um deles diga o n&uacute;mero N e ganhe o jogo. Sabendo que ambos os jogadores s&atilde;o excelentes e sabem jogar muito bem, seu problema &eacute; determinar qual o inteiro inicial que o primeiro jogador deve escolher para ganhar o jogo.</p>

### 입력

<p>A entrada consiste de uma &uacute;nica linha que cont&eacute;m o inteiro N (3 &le; N &le; 10<sup>100</sup>) escolhido para a partida atual do N de boca.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando o n&uacute;mero, em {1, 2}, que o primeiro jogador deve escolher, para ganhar o jogo. Se n&atilde;o for poss&iacute;vel, ent&atilde;o o inteiro deve ser zero.</p>