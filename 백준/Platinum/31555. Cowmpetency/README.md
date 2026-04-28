# [Platinum II] Cowmpetency - 31555

[문제 링크](https://www.acmicpc.net/problem/31555)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 31, 맞힌 사람: 30, 정답 비율: 41.096%

### 분류

구현, 그리디 알고리즘, 애드 혹, 많은 조건 분기

### 문제 설명

<p>Farmer John is hiring a new herd leader for his cows. To that end, he has interviewed $N$ ($2 \leq N \leq 10^5$) cows for the position. After interviewing the $i$th candidate, he assigned the candidate an integer &quot;cowmpetency&quot; score $c_i$ ranging from $1$ to $C$ inclusive ($1 \leq C \leq 10^9$) that is correlated with their leadership abilities.</p>

<p>Because he has interviewed so many cows, Farmer John does not remember all of their cowmpetency scores. However, he does remembers $Q$ ($1 \leq Q &lt; N$) pairs of numbers $(a_j, h_j)$ where cow $h_j$ was the first cow with a <strong>strictly greater</strong> cowmpetency score than cows $1$ through $a_j$ (so $1 \leq a_j &lt; h_j \leq N$).</p>

<p>Farmer John now tells you the sequence $c_1, \dots, c_N$ (where $c_i = 0$ means that he has forgotten cow $i$&#39;s cowmpetency score) and the $Q$ pairs of $(a_j, h_j)$. Help him determine the <strong>lexicographically smallest</strong> sequence of cowmpetency scores consistent with this information, or that no such sequence exists! A sequence of scores is lexicographically smaller than another sequence of scores if it assigns a smaller score to the first cow at which the two sequences differ.</p>

<p>Each input contains $T$ $(1 \leq T \leq 20)$ independent test cases. The sum of $N$ across all test cases is guaranteed to not exceed $3 \cdot 10^5$.</p>

### 입력

<p>The first line contains $T$, the number of independent test cases. Each test case is described as follows:</p>

<ol>
	<li>First, a line containing $N$, $Q$, and $C$.</li>
	<li>Next, a line containing the sequence $c_1, \dots, c_N$ $(0 \leq c_i \leq C)$.</li>
	<li>Finally, $Q$ lines each containing a pair $(a_j, h_j)$. It is guaranteed that all $a_j$ within a test case are distinct.</li>
</ol>

### 출력

<p>For each test case, output a single line containing the lexicographically smallest sequence of cowmpetency scores consistent with what Farmer John remembers, or $-1$ if such a sequence does not exist.</p>