# [Bronze II] Jogo de Estratégia - 13604

[문제 링크](https://www.acmicpc.net/problem/13604)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 426, 정답: 291, 맞힌 사람: 235, 정답 비율: 66.952%

### 분류

구현

### 문제 설명

<p>Um jogo de estrat&eacute;gia, com J jogadores, &eacute; jogado em volta de uma mesa. O primeiro a jogar &eacute; o jogador 1, o segundo a jogar &eacute; o jogador 2 e assim por diante. Uma vez completada uma rodada, novamente o jogador 1 faz sua jogada e a ordem dos jogadores se repete novamente. A cada jogada, um jogador garante uma certa quantidade de Pontos de Vit&oacute;ria. A pontua&ccedil;&atilde;o de cada jogador consiste na soma dos Pontos de Vit&oacute;ria de cada uma das suas jogadas.</p>

<p>Dado o n&uacute;mero de jogadores, o n&uacute;mero de rodadas e uma lista representando os Pontos de Vit&oacute;ria na ordem em que foram obtidos, voc&ecirc; deve determinar qual &eacute; o jogador vencedor. Caso mais de um jogador obtenha a pontua&ccedil;&atilde;o m&aacute;xima, o jogador com pontua&ccedil;&atilde;o m&aacute;xima que tiver jogado por &uacute;ltimo &eacute; o vencedor.</p>

### 입력

<p>A entrada consiste de duas linhas. A primeira linha cont&eacute;m dois inteiros J e R, o n&uacute;mero de jogadores e de rodadas respectivamente (1 &le; J, R &le; 500). A segunda linha cont&eacute;m J &times; R inteiros, correspondentes aos Pontos de Vit&oacute;ria em cada uma das jogadas feitas, na ordem em que aconteceram. Os Pontos de Vit&oacute;ria obtidos em cada jogada ser&atilde;o sempre inteiros entre 0 e 100, inclusive.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha, contendo o inteiro correspondente ao jogador vencedor.</p>