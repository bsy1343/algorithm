# [Platinum V] JOIG Tour - 27207

[문제 링크](https://www.acmicpc.net/problem/27207)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 29, 맞힌 사람: 28, 정답 비율: 75.676%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 이분 탐색

### 문제 설명

<p>Do you know Just Odd Ink Way? It is a national road of length $10^{100}$ in Republic of EGOI from the east end to the west end. It is famous because there are several painting on the road painted by &ldquo;Just Odd Ink.&rdquo; In the following, we abbreviate it, and call it JOI Way.</p>

<p>There are several painting of various sizes on JOI Way. Characters are written on some of them.</p>

<p>Rie is a tour guide working on JOI Way. She plans to guide the participants of JOIG Spring Training Camp. In order to cheer the participants, she plans to choose the paintings on which &lsquo;<code>J</code>&rsquo;, &lsquo;<code>O</code>&rsquo;, &lsquo;<code>I</code>&rsquo;, &lsquo;<code>G</code>&rsquo; are written, and visit them in this order. There are $N$ candidates of paintings. The $i$-th painting ($1 &le; i &le; N$) is located at the place on JOI Way at a distance of $A_i$ from the west end. In this painting, the character $C_i$ is written.</p>

<p>Rie has $Q$ plans. In the $j$-th plan ($1 &le; j &le; Q$), she will travel as follows.</p>

<ol>
	<li>Rie starts a tour from the place on JOI Way at a distance of $S_j$ from the west end.</li>
	<li>She chooses a painting on which &lsquo;<code>J</code>&rsquo; is written, and moves to its location.</li>
	<li>She chooses a painting on which &lsquo;<code>O</code>&rsquo; is written, and moves to its location.</li>
	<li>She chooses a painting on which &lsquo;<code>I</code>&rsquo; is written, and moves to its location.</li>
	<li>She chooses a painting on which &lsquo;<code>G</code>&rsquo; is written, and moves to its location.</li>
	<li>She moves to the place on JOI Way at a distance of $T_j$ from the west end, and finishes the tour.</li>
</ol>

<p>During the tour, it is not allowed to go outside JOI Way.</p>

<p>Under the above conditions, Rie wants to minimize the total travel distance for each plan.</p>

<p>Write a program which, given information on the paintings on JOI Way and Rie&rsquo;s plans, calculates the minimum possible value of the total travel distance for each plan.</p>

### 입력

<p>Read the following data from the standard input.</p>

<blockquote>
<p>$N$</p>

<p>$A_1$ $C_1$</p>

<p>$A_2$ $C_2$</p>

<p>$\vdots$</p>

<p>$A_N$ $C_N$</p>

<p>$Q$</p>

<p>$S_1$ $T_1$</p>

<p>$S_2$ $T_2$</p>

<p>$\vdots$</p>

<p>$S_Q$ $T_Q$</p>
</blockquote>

### 출력

<p>Write $Q$ lines to the standard output. The $j$-th line ($1 &le; j &le; Q$) of the output should contain the minimum possible value of the total travel distance for the $j$-th plan.</p>

### 제한

<ul>
	<li>$4 &le; N &le; 100\,000$.</li>
	<li>$1 &le; A_i &le; 1\,000\,000\,000\,000\,000 (= 10^{15})$ ($1 &le; i &le; N$).</li>
	<li>$A_i &lt; A_{i+1}$ ($1 &le; i &le; N - 1$).</li>
	<li>$C_i$ ($1 &le; i &le; N$) is either &lsquo;<code>J</code>&rsquo;，&lsquo;<code>O</code>&rsquo;，&lsquo;<code>I</code>&rsquo;，or &lsquo;<code>G</code>&rsquo;.</li>
	<li>$C_i$ is equal to &lsquo;<code>J</code>&rsquo; for at least one $i$ ($1 &le; i &le; N$).</li>
	<li>$C_i$ is equal to &lsquo;<code>O</code>&rsquo; for at least one $i$ ($1 &le; i &le; N$).</li>
	<li>$C_i$ is equal to &lsquo;<code>I</code>&rsquo; for at least one $i$ ($1 &le; i &le; N$).</li>
	<li>$C_i$ is equal to &lsquo;<code>G</code>&rsquo; for at least one $i$ ($1 &le; i &le; N$).</li>
	<li>$1 &le; Q &le; 100\,000$.</li>
	<li>$1 &le; S_j &le; 1\,000\,000\,000\,000\,000 (= 10^{15})$ ($1 &le; j &le; Q$).</li>
	<li>$1 &le; T_j &le; 1\,000\,000\,000\,000\,000 (= 10^{15})$ ($1 &le; j &le; Q$).</li>
	<li>$(S_j , T_j) \ne (S_k, T_k)$ ($1 &le; j &lt; k &le; Q$).</li>
	<li>$N$, $Q$ are integers.</li>
	<li>$A_i$ is an integer ($1 &le; i &le; N$).</li>
	<li>$S_j$, $T_j$ are integers ($1 &le; j &le; Q$).</li>
</ul>