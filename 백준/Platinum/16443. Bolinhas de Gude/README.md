# [Platinum I] Bolinhas de Gude - 16443

[문제 링크](https://www.acmicpc.net/problem/16443)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 193, 정답: 64, 맞힌 사람: 56, 정답 비율: 36.364%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Usar bolinhas de gude como moeda n&atilde;o deu muito certo em Cubic&ocirc;nia. Na tentativa de se redimir com seus amigos, depois de roubar suas bolinhas de gude, o imperador decidiu convidar todos para uma noite de jogos em seu pal&aacute;cio.</p>

<p>Naturalmente, os jogos utilizam bolinhas de gude, afinal agora o imperador precisa encontrar alguma utilidade para tantas bolinhas. N bolinhas de gude s&atilde;o espalhadas em um grande tabuleiro cujas linhas s&atilde;o numeradas de 0 a L e as colunas numeradas de 0 a C. Os jogadores alternam turnos e em cada turno o jogador da vez deve escolher uma das bolinhas de gude e mov&circ;e-la. O primeiro jogador que mover uma bolinha para a posi&ccedil;&atilde;o (0, 0) &eacute; o vencedor. Para que o jogo seja interessante, os movimentos s&atilde;o limitados; do contr&aacute;rio, o primeiro jogador sempre moveria a bolinha para a posi&ccedil;&atilde;o (0, 0) e venceria. Um movimento consiste em escolher um inteiro u maior que 0 e uma bolinha, cuja localiza&ccedil;&atilde;o denotaremos por (l, c), e mov&circ;e-la para uma das seguintes posi&ccedil;&tilde;oes, desde que a mesma n&atilde;o saia do tabuleiro:</p>

<ul>
	<li>(l &minus; u, c);</li>
	<li>(l, c &minus; u); ou</li>
	<li>(l &minus; u, c &minus; u).</li>
</ul>

<p>Note que mais de uma bolinha de gude pode ocupar a mesma posi&ccedil;&atilde;o no tabuleiro.</p>

<p>Como o imperador n&atilde;o gosta de perder voc&circ;e deve ajud&aacute;-lo a determinar em quais partidas ele deve participar. Como &eacute; de se esperar, sempre que joga o imperador fica com o primeiro turno. Assumindo que todos jogam de forma &oacute;tima, seu programa deve analisar a distribui&ccedil;&atilde;o inicial das bolinhas de gude no tabuleiro e informar se &eacute; poss&iacute;vel ou n&atilde;o que o imperador ven&ccedil;a caso ele jogue.</p>

### 입력

<p>A primeira linha cont&eacute;m um inteiro N (1 &le; N &le; 1000). Cada uma das N linhas seguintes cont&eacute;m dois inteiros l<sub>i</sub> e c<sub>i</sub> indicando em qual linha e coluna a i-&eacute;sima bolinha de gude se encontra no tabuleiro (1 &le; l<sub>i</sub>, ci &le; 100).</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha contendo o caractere Y caso seja poss&iacute;vel para o imperador ganhar o jogo ou N caso contr&aacute;rio.</p>