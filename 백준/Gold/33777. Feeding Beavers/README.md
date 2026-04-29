# [Gold III] Feeding Beavers - 33777

[문제 링크](https://www.acmicpc.net/problem/33777)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 256 MB

### 통계

제출: 51, 정답: 34, 맞힌 사람: 30, 정답 비율: 63.830%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>It’s dinner time, and Busy Beaver has to feed his baby beavers.</p>

<p>Busy Beaver has $N$ baby beavers, numbered from $1$ to $N$. The older baby beavers have bigger indices than the younger ones; for example, beaver $1$ is the youngest while beaver $N$ is the oldest.</p>

<p>Busy Beaver also has $2N$ dishes, which are numbered from $1$ to $2N$. If a beaver eats dish $i$, its <em>satisfaction</em> will increase by $i$. Each beaver starts with $0$ satisfaction.</p>

<p>Now, Busy Beaver wants to distribute the dishes amongst his baby beavers subject to the following constraints:</p>

<ul>
	<li>Each beaver should get exactly two dishes.</li>
	<li>After all dishes are consumed, older beavers should have at least as much satisfaction as younger beavers. Formally, for any $i,j$ with $1\leq i&lt;j\leq N$, beaver $i$’s satisfaction should not exceed beaver $j$’s satisfaction.</li>
	<li>The parity of beaver $i$’s satisfaction should be $c_i$ (odd or even).</li>
</ul>

<p>Determine if there exists a way to feed all $N$ beavers that respects these constraints. Additionally, if the task is possible, print any valid assignment of dishes to beavers.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains a single integer $T$ ($1\leq T\leq 10^4$) --- the number of test cases. The description of each test case follows.</p>

<p>The first line of each test case contains an integer $N$ ($1\le N\le 10^5$) --- the number of baby beavers.</p>

<p>The second line of each test case contains a string $c$ of length $N$, where each of the characters $c_i$ is either <code>‘O’</code> or <code>‘E’</code>. If $c_i$ is <code>‘O’</code>, the beaver $i$ wants its satisfaction to be an odd number. If $c_i$ is <code>‘E’</code>, the beaver $i$ wants its satisfaction to be an even number.</p>

<p>It is guaranteed that the sum of $N$ across all test cases is no more than $10^5$.</p>

### 출력

<p>For each test case, if it is possible to feed the beavers, output “<code>YES</code>” (without quotes) on the first line. Next, print $N$ lines describing how to feed each beaver. The $i$-th of these lines should contain two integers, which denote the indices of the two dishes that will be given to beaver $i$.</p>

<p>If it is impossible to feed the beavers, output “<code>NO</code>” (without quotes).</p>

<p>You can output “<code>YES</code>” and “<code>NO</code>” in any case. (For example, strings “<code>yES</code>”, “<code>yes</code>” and “<code>Yes</code>” will be recognized as a positive response.)</p>