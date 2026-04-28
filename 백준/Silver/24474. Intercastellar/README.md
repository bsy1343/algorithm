# [Silver I] Intercastellar - 24474

[문제 링크](https://www.acmicpc.net/problem/24474)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 237, 정답: 149, 맞힌 사람: 124, 정답 비율: 67.027%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>In 30XX, due to the constant efforts of scientists and engineers, interaction among different planets becomes very active. Bitaro is a beaver who is working as an ambassador of an exchange program. His task is to introduce foods from the Earth to the habitants in different planets. He will leave for the JOI Planet at 1:00 in the afternoon.</p>

<p>Now, Bitaro is planning to introduce castella to the habitants in the JOI Planet. The castella was already cut into several pieces. Castella is a baked sponge cake made of flour, egg, sugar, and starch syrup.</p>

<p>The shape of the castella is a horizontally long rectangular box. It was cut into $N$ pieces. The length of the $i$-th piece ($1 &le; i &le; N$) from the left is an integer $A_i$.</p>

<p>A couple of minutes ago, it turned out that the habitants in the JOI Planet do not like even integers. To cope with this problem, you will perform the following sequential operations until pieces of even length disappear.</p>

<ol>
	<li>Among the pieces of even length, you choose the rightmost one.</li>
	<li>You cut the chosen piece into two pieces of equal length. Namely, if the length of the chosen piece is $k$, you cut it into two pieces of length $\frac{k}{2}$. You do not move the position of the pieces.</li>
</ol>

<p>To confirm whether the operations are performed correctly, Bitaro will ask you $Q$ questions. The $j$-th question ($1 &le; j &le; Q$) is as follows.</p>

<ul>
	<li>After all the operations are performed, what is the length of the $X_j$-th piece from the left?</li>
</ul>

<p>Given information of the castella and the questions, write a program which answer the questions.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/269e41f1-dc7d-4235-8a90-cc10a9a29903/-/preview/" style="width: 264px; height: 198px;" /></p>

### 입력

<p>Read the following data from the standard input. Given values are all integers.</p>

<p>$\begin{align*} &amp; N \\ &amp; A_1 \\ &amp; A_2 \\ &amp; \vdots \\ &amp; A_N \\ &amp; Q \\ &amp; X_1 \\ &amp; X_2 \\ &amp; \vdots \\ &amp; X_Q\end{align*}$</p>

### 출력

<p>Write&nbsp;$Q$ lines to the standard output. The $j$-th line ($1 &le; j &le; Q$) should contain the answer to the $j$-th question.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 200\,000$.</li>
	<li>$1 &le; A_i &le; 1\,000\,000\,000$ ($1 &le; i &le; N$).</li>
	<li>$1 &le; Q &le; 200\,000$.</li>
	<li>$1 &le; X_j &le; 1\,000\,000\,000\,000\,000$ ($= 10^{15}$) ($1 &le; j &le; Q$).</li>
	<li>$X_j &le; X_{j+1}$ ($1 &le; j &le; Q - 1$).</li>
	<li>After all the operations are performed, the castella is cut into at least $X_Q$ pieces.</li>
</ul>