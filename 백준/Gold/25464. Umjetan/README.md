# [Gold III] Umjetan - 25464

[문제 링크](https://www.acmicpc.net/problem/25464)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 24, 맞힌 사람: 19, 정답 비율: 61.290%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p><em>(tu nedostaje neki tekst, zadatak će inače biti preumjetan, a postoji jedna jako lijepa, prikladna priča&hellip;)</em></p>

<p>Zadana je tablica prirodnih brojeva $P$ veličine $NxN$. Dobije se $M$ upita i na svaki upit za zadane $L$ i $R$ treba odgovoriti koliko iznosi $\max{(P[i][j])}$ gdje je $L &le; i, j &le; R$.</p>

### 입력

<p>U prvom su retku prirodni brojevi $N$ ($1 &le; N &le; 2\,000$) i $M$ ($1 &le; M &le; \min{(500\,000, N \times N)}$).</p>

<p>U sljedećih $N$ redaka nalazi se po $N$ prirodnih brojeva manjih od $1\,000\,000\,000$.</p>

<p>U zadnjih $M$ redaka nalaze se prirodni brojevi $L$ i $R$ ($1 &le; L &le; R &le; N$).</p>

### 출력

<p>U $M$ redaka ispi&scaron;i odgovore na tražene upite.</p>

### 힌트

<p>Opis prvog probnog primjera:</p>

<ol>
	<li>upit: $\max{(P[1][1])}=1$</li>
	<li>upit: $\max{(P[1][1], P[1][2], P[1][3], P[2][1], P[2][2], P[2][3], P[3][1], P[3][2], P[3][3])}=4$</li>
	<li>upit: $\max{(P[2][2], P[2][3], P[3][2], P[3][3])}=2$</li>
	<li>upit: $\max{(P[1][1], P[1][2], P[2][1], P[2][2])}=4$</li>
</ol>