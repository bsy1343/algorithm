# [Gold II] Artillery - 29914

[문제 링크](https://www.acmicpc.net/problem/29914)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

조합론, 수학

### 문제 설명

<p>The good soldier &Scaron;vejk, serving in the 14-th mounted artillery regiment, has reached Česk&eacute; Budějovice. Unexpectedly, general Finck von Finckenstein arrives to inspect the regiment. Lieutenant Luka&scaron; must line up $N$ cannons (all horse-drawn, of course) and fire each one exactly once.</p>

<p>Unfortunately, the shots scare the horses. The effect is worse when consecutive shots are fired from cannons close to each other. Therefore, Lieutenant Luka&scaron; asks &Scaron;vejk to devise a firing sequence where consecutive shots are fired from cannons that are as far from each other as possible. More precisely, the sum of the distances is to be maximized.</p>

<p>A firing sequence for $N$ cannons is a reordering $P$ of the numbers $1 \dots N$, where $P_1$ is the number of the cannon fired first, $P_i$ the number of the cannon fired $i$-th in the sequence, and $P_N$ the number of the cannon fired last. The sum of distances for such a sequence is $S = |P_1-P_2| + |P_2-P_3| + \dots + |P_{N-1}-P_N|$.</p>

<p>When listing sequences, they are orderd so that when the first $i-1$ elements of two sequences $P$ and $Q$ match, but the $i$-th elements differ, the sequence with the smaller $i$-th element comes earlier in the list.</p>

<p>Lieutenant Luka&scaron; knows that the favourite number of general Finck von Finckenstein is $M$, and suspects the general is likely to request the cannons to be fired in the order of the sequence on the $M$-th position in the list of possible sequences.</p>

<p>To help &Scaron;vejk, write a program that computes</p>

<ul>
	<li>$S$, the maximal possible sum of distances;</li>
	<li>$K$, the total number of firing sequences with the maximal sum;</li>
	<li>the first sequence in the list of all sequences with the maximal sum;</li>
	<li>the $M$-th sequence in the list of all sequences with the maximal sum.</li>
</ul>

### 입력

<p>\sis The only line of input contains two integers: $N$, the number of cannons ($2 \le N \le 10^5$), and $M$, the favourite number of general Finck von Finckenstein ($1 \le M \le \min(10^{18}, K)$), where $K$ is the total number of sequences with the maximal sum of distances.</p>

### 출력

<p>The first line of output should contain $S$, the maximal possible sum of distances when $N$ cannons are fired in some sequence, and $K \bmod 1\,000\,000\,007$, where $K$ is the total number of sequences with the sum $S$. The second line should contain $N$ integers: the first sequence in the list of all sequences with the maximal sum. The third line should also contain $N$ integers: the $M$-th sequence in the list of all sequences with the maximal sum.</p>