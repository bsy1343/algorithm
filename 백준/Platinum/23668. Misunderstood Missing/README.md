# [Platinum I] Misunderstood Missing - 23668

[문제 링크](https://www.acmicpc.net/problem/23668)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 44, 정답: 18, 맞힌 사람: 16, 정답 비율: 48.485%

### 분류

다이나믹 프로그래밍, 애드 혹

### 문제 설명

<p>Warm sunshine, cool wind and a fine day, while the girl watching is pursuing in chaos. Rikka reached out her hand and got the garland on her head, finding LCR with the immortal smile. The dream ended up waking, but the doubts will never disappear. In the end, without knowing about LCR, Rikka was invited to Shuyuan Men, a street of Chinese traditional arts in Xi&#39;an.</p>

<p>&quot;Is it enough to use the stored wires?&quot;</p>

<p>&quot;No problem... Those leaders are only concerned about expanding EC Final for the school&#39;s and their &#39;achievements&#39;. All chores are ours. It is fine to simply connect those wiring boards in the series for each row.&quot;</p>

<p>Their conversation engaged Rikka. Feeling strange, she decided to follow them. But before all, she needs to beat the devil in her heart.</p>

<p>Rikka has an aggressivity $A$ and an increment $D$ of it, which are both $0$ initially. There are $n$ rounds in total. For $i = 1, 2, \dots, n$, at the beginning of $i$-th round Rikka&#39;s aggressivity $A$ increases by the increment $D$, and then she can do one of the following:</p>

<ol>
	<li>Attack and cause a damage of $(A + a_i)$.</li>
	<li>Use the <em>Omnipotent Garland</em> from LCR to increase the increment $D$ by $b_i$.</li>
	<li>Use her <em>Schwarz Sechs Prototype Mark II</em> to increase the aggressivity $A$ by $c_i$.</li>
</ol>

<p>Rikka wonders the maximal possible damage she could cause in total. Could you help her?</p>

### 입력

<p>The first line contains a single integer $T (1 \le T \le 10)$, the number of test cases. Then $T$ test cases follow.</p>

<p>The input format of each test case is as follows:</p>

<p>The first line contains a single integer $n (1 \le n \le 100)$, the number of rounds.</p>

<p>The following $n$ lines contain $\{a_i\}, \{b_i\}, \{c_i\}$ for $i = 1, 2, \dots , n$. The $i$-th line among them contains three integers $a_i, b_i, c_i (1\le a_i, b_i, c_i \le 10^9)$ separated by spaces in order.</p>

<p>It is guaranteed that the sum of $n$ in all test cases is at most $100$.</p>

### 출력

<p>Output $T$ lines; each line contains one integer, the answer to that test case.</p>