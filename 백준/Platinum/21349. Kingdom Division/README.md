# [Platinum V] Kingdom Division - 21349

[문제 링크](https://www.acmicpc.net/problem/21349)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>In a far away kingdom, there are $N$ cities numbered between $0$ and $N - 1$. The cities are connected by $N - 1$ two-way roads. Each road connects exactly two cities, such that there is a unique path between any pair of cities. Each city $i$ has some value $C[i]$ (possibly negative).</p>

<p>Unfortunately, the old king of the kingdom died, without appointing a successor. Thus a civil war broke out in the kingdom, between the $P$ lords (also numbered between $0$ and $P - 1$) who wish to gain control of the kongdom.</p>

<p>After a long and terrible war, the lords realized none of them could beat all the other lords in the war. They agreed to a truce, and decided to divide the kingdom into $P$ parts, one part per lord. The parts must be so that if two cities $a$ and $b$ lie in the same part, all cities in the unique path between them must also lie in that part. Since no lord wants to be left out, each one must be given at least one city.</p>

<p>Since no lord wants to get less than another, the value of each part must be the same. The value of a part is the sum of the values of all cities in that part.</p>

### 입력

<p>The sample judge reads input in the following format:</p>

<ul>
	<li>line $1$: <code>N P</code></li>
	<li>line $2$: <code>C[0] C[1] .. C[N - 1]</code></li>
	<li>line $3$: <code>F[0] F[1] .. F[N - 2]</code></li>
	<li>line $4$: <code>T[0] T[1] .. T[N - 2]</code></li>
</ul>

### 출력

<p>The sample judge will first write a single line with the return value of <code>division(N, P, C, F, T)</code>. The next line will contain $N$ integers containing the input to the <code>parts(R)</code> call.</p>

### 제한

<ul>
	<li>$1 \le P \le N \le 100\,000$</li>
</ul>