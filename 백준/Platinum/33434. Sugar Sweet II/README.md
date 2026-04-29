# [Platinum V] Sugar Sweet II - 33434

[문제 링크](https://www.acmicpc.net/problem/33434)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그래프 이론, 방향 비순환 그래프, 수학, 조합론, 확률론

### 문제 설명

<p>Sugar is sweet.</p>

<p>There are $n$ children asking for sugar. Prof. Chen gives out sugar to the children. The $i$-th child initially has $a_{i}$ bags of sugar. There are $n$ events happening in <strong>uniformly randomized order</strong>. The $i$-th event is:</p>

<ul>
	<li>If the $i$-th child has <strong>strictly less</strong> bags of sugar than the $b_{i}$-th child, then the $i$-th child will get extra $w_{i}$ bags of sugar. Otherwise, nothing happens.</li>
</ul>

<p>Now, since the events happen in random order, Randias, which is the assistant of Prof. Chen, wants to know the expected number of bags of sugar each child will have after all the events happen.</p>

<p>It can be shown that the answer can be expressed as an irreducible fraction $\frac{x}{y}$ where $x$ and $y$ are integers and $y \not \equiv 0 \pmod {10^9 + 7}$. Output the integer equal to $x \cdot y^{-1} \pmod {10^9 + 7}$. In other words, output such an integer $a$ that $0\leq a &lt; 10^9 + 7$ and $a \cdot y \equiv x \pmod {10^9 + 7}$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains a single interger $t$ ($1 \leq t \leq 5 \cdot 10^5$) denoting the number of test cases. For each test case:</p>

<p>The first line contains a single integer $n$ ($1 \le n \le 5 \cdot 10^5$) denoting the number of children.</p>

<p>The second line contains $n$ integers $a_{i}$ ($1 \le a_{i} \le 10^9$): the initial number of bags of sugar each child has.</p>

<p>The third line contains $n$ integers $b_{i}$ ($1 \le b_{i} \le n$).</p>

<p>The fourth line contains $n$ integers $w_{i}$ ($1 \le w_{i} \le 10^9$).</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $5 \cdot 10^5$.</p>

### 출력

<p>For each test case, output $n$ integers in a line: the expected number of bags of sugar each child will get. Output the answers as integers modulo $10^9 + 7$, as described above.</p>