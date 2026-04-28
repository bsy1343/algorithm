# [Bronze II] Dama - 13680

[문제 링크](https://www.acmicpc.net/problem/13680)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 145, 정답: 110, 맞힌 사람: 86, 정답 비율: 74.138%

### 분류

구현, 애드 혹

### 문제 설명

<p>O jogo de xadrez possui v&aacute;rias pe&ccedil;as com movimentos curiosos: uma delas &eacute; a&nbsp;<em>dama</em>, que pode se mover qualquer quantidade de casas na mesma linha, na mesma coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13680.%E2%80%85Dama/932fa22f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13680/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%207.49.08.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:175px; width:176px" /></p>

<p>O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posi&ccedil;&atilde;o de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 &times; 8, com 64 casas), de quantos movimentos, no m&iacute;nimo, ela precisa para chegar em outra casa do tabuleiro?</p>

<p>Kary achou a solu&ccedil;&atilde;o para alguns desses problemas, mas teve dificuldade com outros, e por isso pediu que voc&ecirc; escrevesse um programa que resolve esse tipo de problema. &nbsp;</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira e &uacute;nica linha de cada caso de teste cont&eacute;m quatro inteiros&nbsp;X<sub>1</sub>,&nbsp;Y<sub>1</sub>,&nbsp;X<sub>2</sub>&nbsp;eY<sub>2</sub>&nbsp;(1 &le; X<sub>1</sub>, Y<sub>1</sub>, X<sub>2</sub>, Y<sub>2</sub>&nbsp;&le; 8). A dama come&ccedil;a na casa de coordenadas&nbsp;(X<sub>1</sub>, Y<sub>1</sub>), e a casa de destino &eacute; a casa de coordenadas(X<sub>2</sub>, Y<sub>2</sub>). No tabuleiro, as colunas s&atilde;o numeradas da esquerda para a direita de 1 a 8 e as linhas de cima para baixo tamb&eacute;m de 1 a 8. As coordenadas de uma casa na linha X e coluna Y s&atilde;o (X, Y&nbsp;).</p>

<p>O final da entrada &eacute; indicado por uma linha contendo quatro zeros.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha na sa&iacute;da, contendo um n&uacute;mero inteiro, indicando o menor n&uacute;mero de movimentos necess&aacute;rios para a dama chegar em sua casa de destino.</p>