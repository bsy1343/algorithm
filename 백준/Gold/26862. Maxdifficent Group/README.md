# [Gold IV] Maxdifficent Group - 26862

[문제 링크](https://www.acmicpc.net/problem/26862)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 49, 맞힌 사람: 43, 정답 비율: 84.314%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Given an array of integers $A_{1..N}$ where $N &ge; 2$. Each element in A should be assigned into a group while satisfying the following rules.</p>

<ul>
	<li>Each element belongs to exactly one group.</li>
	<li>If $A_i$ and $A_j$ where $i &lt; j$ belongs to the same group, then $A_k$ where $i &le; k &le; j$ also belongs to the same group as $A_i$ and $A_j$.</li>
	<li>There is at least one pair of elements that belong to a different group.</li>
</ul>

<p>Let $G_i$ denotes the group ID of element $A_i$. The cost of a group is equal to the sum of all elements in $A$ that belong to that group.</p>

<p>$$\text{cost}(x) = \sum_{\text{i s.t. }G_i = x}{A_i}$$</p>

<p>Two different group IDs, $G_i$ and $G_j$ (where $G_i \ne G_j$), are adjacent if and only if $G_k$ is either $G_i$ or $G_j$ for every $i &le; k &le; j$. Finally, the $\text{diff}()$ value of two group IDs $x$ and $y$ is defined as the absolute difference between $\text{cost}(x)$ and $\text{cost}(y)$.</p>

<p>$$\text{diff}(x, y) = |\text{cost}(x) &minus; \text{cost}(y)|$$</p>

<p>Your task in this problem is to find a group assignment such that the largest $\text{diff}()$ value between any pair of adjacent group IDs is maximized; you only need to output the largest $\text{diff}()$ value.</p>

<p>For example, let $A_{1..4} = \{100, &minus;30, &minus;20, 70\}$. There are $8$ ways to assign each element in $A$ into a group in this example; some of them are shown as follows.</p>

<ul>
	<li>$G_{1..4} = \{1, 2, 3, 4\}$. There are $3$ pairs of group IDs that are adjacent and their $\text{diff}()$ values are:
	<ul>
		<li>$\text{diff}(1, 2) = |\text{cost}(1) &minus; \text{cost}(2)| = |(100) &minus; (&minus;30)| = 130$,</li>
		<li>$\text{diff}(2, 3) = |\text{cost}(2) &minus; \text{cost}(3)| = |(&minus;30) &minus; (&minus;20)| = 10$, and</li>
		<li>$\text{diff}(3, 4) = |\text{cost}(3) &minus; \text{cost}(4)| = |(&minus;20) &minus; (70)| = 90$.</li>
		<li>The largest $\text{diff}()$ value in this group assignment is $130$.</li>
	</ul>
	</li>
	<li>$G_{1..4} = \{1, 2, 2, 3\}$. There are $2$ pairs of group IDs that are adjacent and their $\text{diff}()$ values are:
	<ul>
		<li>$\text{diff}(1, 2) = |\text{cost}(1) &minus; \text{cost}(2)| = |(100) &minus; (&minus;30 + (&minus;20))| = 150$, and</li>
		<li>$\text{diff}(2, 3) = |\text{cost}(2) &minus; \text{cost}(3)| = |(&minus;30 + (&minus;20)) &minus; (&minus;20)| = 70$.</li>
		<li>The largest $\text{diff}()$ value in this group assignment is $150$.</li>
	</ul>
	</li>
</ul>

<p>The other $6$ group assignments are: $G_{1..4} = \{1, 1, 1, 2\}$, $G_{1..4} = \{1, 1, 2, 2\}$, $G_{1..4} = \{1, 2, 2, 2\}$, $G_{1..4} = \{1, 1, 2, 2\}$, $G_{1..4} = \{1, 1, 2, 3\}$, and $G_{1..4} = \{1, 2, 3, 3\}$. Among all possible group assignments in this example, the maximum largest $\text{diff}()$ that can be obtained is $150$ from the group assignment $G_{1..4} = \{1, 2, 2, 3\}$.</p>

### 입력

<p>Input begins with a line containing an integer $N$ ($2 &le; N &le; 100\,000$) representing the number of elements in array $A$. The next line contains $N$ integers $A_i$ ($-10^6 &le; A_i &le; 10^6$) representing the array $A$.</p>

### 출력

<p>Output contains an integer in a line representing the maximum possible largest $\text{diff}()$ that can be obtained from a group assignment.</p>