# [Silver III] Troca de Cartas - 13671

[문제 링크](https://www.acmicpc.net/problem/13671)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 41, 맞힌 사람: 37, 정답 비율: 82.222%

### 분류

그리디 알고리즘

### 문제 설명

<p>Alice e Beatriz colecionam cartas de Pok&eacute;mon. As cartas s&atilde;o produzidas para um jogo que reproduz a batalha introduzida em um dos mais bem sucedidos jogos de videogame da hist&oacute;ria, mas Alice e Beatriz s&atilde;o muito pequenas para jogar, e est&atilde;o interessadas apenas nas cartas propriamente ditas. Para facilitar, vamos considerar que cada carta possui um identificador &uacute;nico, que &eacute; um n&uacute;mero inteiro.</p>

<p>Cada uma das duas meninas possui um conjunto de cartas e, como a maioria das garotas de sua idade, gostam de trocar entre si as cartas que t&ecirc;m. Elas obviamente n&atilde;o t&ecirc;m interesse emtrocar cartas id&ecirc;nticas, que ambas possuem, e n&atilde;o querem receber cartas repetidas na troca.Al&eacute;m disso, as cartas ser&atilde;o trocadas em uma &uacute;nica opera&ccedil;&atilde;o de troca: Alice d&aacute; para Beatriz um sub-conjunto com N cartas distintas e recebe de volta um outro sub-conjunto com N cartas distintas.</p>

<p>As meninas querem saber qual &eacute; o n&uacute;mero m&aacute;ximo de cartas que podem ser trocadas. Por exemplo, se Alice tem o conjunto de cartas {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} e Beatriz o conjunto {2, 2, 2, 3, 4, 6, 10, 11, 11}, elas podem trocar entre si no m&aacute;ximo quatro cartas. Escreva um programa que, dados os conjuntos de cartas que Alice e Beatriz possuem, determine o n&uacute;mero m&aacute;ximo de cartas que podem ser trocadas.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m dois n&uacute;meros inteiros A e B, separados por um espa&ccedil;o em branco, indicando respectivamente o n&uacute;mero de cartas que Alice e Beatriz possuem (1 &le; A &le; 10<sup>4</sup>&nbsp;e 1 &le; B &le; 10<sup>4</sup>). A segunda linha cont&eacute;m A n&uacute;meros inteiros X<sub>i</sub>, separados entre si por um espa&ccedil;o em branco, cada n&uacute;mero indicando uma carta do conjunto de Alice (1 &le; X<sub>i</sub>&nbsp;&le; 10<sup>5</sup>). A terceira linha cont&eacute;m B n&uacute;meros inteiros Y<sub>i</sub>, separados entre si por um espa&ccedil;o em branco, cada n&uacute;mero indicando uma carta do conjunto de Beatriz (1 &le; Y<sub>i&nbsp;</sub>&le; 10<sup>5</sup>). As cartas de Alice e Beatriz s&atilde;o apresentadas em ordem n&atilde;o decrescente.</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas dois zeros, separados por um espa&ccedil;o em branco.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha, contendo um numero inteiro, indicando o n&uacute;mero m&aacute;ximo de cartas que Alice e Beatriz podem trocar entre si.</p>