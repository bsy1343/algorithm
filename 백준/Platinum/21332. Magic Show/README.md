# [Platinum III] Magic Show - 21332

[문제 링크](https://www.acmicpc.net/problem/21332)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>M&aring;rten the Magician is currently performing in a magnificent magic competition. The show consists of $N$ rounds. In each round, M&aring;rten uses his magic to perform one of two tricks: either he makes some number $x$ rabbits appear, or he sabotages his opponents&#39; tricks by making some number $y$ of their rabbits disappear. He can also choose to do neither.</p>

<p>For each rabbit M&aring;rten makes appear or disappear, he must use 1 magick. In the beginning of the show, M&aring;rten has $K$ magicks. When he has run out of magicks, he can no longer perform a trick.</p>

<p>The scoring of the competition is easy. In the $i$:th round, let \[ S_i = \begin{cases} x &amp; \text{ if M&aring;rten made $x$ rabbits appear } \\ -y &amp; \text{ if M&aring;rten made $y$ rabbits disappear } \\ 0 &amp; \text{ if M&aring;rten didn&#39;t perform a trick} \end{cases} \]</p>

<p>In round $i$, if $S_i$ is in the interval $[L[i], R[i]]$ where $L[i]$ and $R[i]$ are integers specific to the round, he gets $|S_i - \frac{L[i] + R[i]}{2}|$ points. If $S_i$ is outside this interval, M&aring;rten gets $0$ points. Note that M&aring;rten cannot perform his magic on fractional rabbits, thus $S_i$ will always be an integer.</p>

<p>M&aring;rten&#39;s total score in the competition is the sum of scores among all the rounds. What is the maximum score M&aring;rten can get if he performs optimally?</p>

### 입력

<p>The sample judge reads input in the following format:</p>

<ul>
	<li>line $1$: <code>N K</code></li>
	<li>line $2$: <code>L[0] L[1] .. L[N - 1]</code></li>
	<li>line $3$: <code>R[0] R[1] .. R[N - 1]</code></li>
</ul>

### 출력

<p>The sample judge writes output in the following format:</p>

<ul>
	<li>line $1$: the return value of <code>magic_score(N, K, L, R)</code> on a line</li>
	<li>line $2$: $N$ integers, the values given from the calls to <code>trick(X)</code> in order.</li>
</ul>

### 제한

<ul>
	<li>$N \le 1\,000$</li>
	<li>$K \le 1,000$</li>
</ul>