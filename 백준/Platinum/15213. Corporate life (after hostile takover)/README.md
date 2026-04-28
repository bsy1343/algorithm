# [Platinum II] Corporate life (after hostile takover) - 15213

[문제 링크](https://www.acmicpc.net/problem/15213)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 149, 정답: 57, 맞힌 사람: 47, 정답 비율: 60.256%

### 분류

자료 구조, 트리, 세그먼트 트리, 스위핑, 오일러 경로 테크닉

### 문제 설명

<p><em>JanuszPol</em> is a Polish company which has a long tradition to its name. Recently, though, it fell into dire financial situation, and was eventually taken over by a foreign competitor. The new board decided to completely rebuild the company organization. Until now, it was a typical tree structure:</p>

<ul>
	<li>There was exactly one executive director, who had no superiors,</li>
	<li>Every other employee had exactly one superior, and there were no cyclic relations.</li>
</ul>

<p>For every employee $x$, their <em>subordinate</em>&nbsp;is every employee $y$, who is under $x$ in the tree (there is a sequence of direct superiors from $y$ to $x$).</p>

<p>After the takeover, the company will employ the same people, and it will also be organized as a tree, but every employee will receive a diffrent position, so the shape of the tree may change completely. The executive director is, however, guaranteed to keep the position. Now everyone is afraid to give orders to anyone else -- any moment now, a subordinate may become the superior...</p>

<p>Given the description of the tree before and after the takover, for every employee $x$ determine the number of the people who were subordinates of $x$ and will remain the subordinates after the takeover.</p>

### 입력

<p>The first line of the input contains an integer $n$ ($2 \leq n \leq 200\,000$): the number of employees. The employees are numbered from $1$ to $n$, with the person number $1$ being the executive director. The second line contains the company structure before the takeover: there are $n-1$ numbers $a_2, a_3, \ldots, a_n$ with $a_i$ being the number of $i$&#39;s superior. The third line also contains $n-1$ numbers $b_2, b_3, \ldots, b_n$, where $b_i$ is the superior of $i$ after the takeover. You may assume that both descriptions define a proper tree rooted at $1$.</p>

### 출력

<p>Output a single line containing $n$ numbers -- $i$-th of them should be the number of people who are $i$&#39;s subordinates in both trees at once.</p>