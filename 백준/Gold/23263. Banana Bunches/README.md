# [Gold I] Banana Bunches - 23263

[문제 링크](https://www.acmicpc.net/problem/23263)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 13, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Barbara goes to Alan&#39;s banana farm, where the&nbsp;$N$&nbsp;banana trees are organized in one long line represented by an array&nbsp;$B$. The tree at position&nbsp;$i$&nbsp;has&nbsp;$B_i$&nbsp;banana bunches. Each tree has the same cost. Once Barbara buys a tree, she gets all the banana bunches on that tree. Alan has a special rule: because he does not want too many gaps in his line, he allows Barbara to buy at most&nbsp;$2$&nbsp;contiguous sections of his banana tree line.</p>

<p>Barbara wants to buy some number of trees such that the total number of banana bunches on these purchased trees equals the capacity&nbsp;$K$&nbsp;of her basket. She wants to do this while spending as little money as possible. How many trees should she buy?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$ test cases follow.</p>

<p>Each test case begins with a line containing two integers integer $N$, the number of trees on Alan&#39;s farm, and $K$, the capacity of Barbara&#39;s basket.</p>

<p>The next line contains $N$ non-negative integers $B_1,B_2,\cdots,B_N$ representing array $B$, where the $i$-th integer represents the number of banana bunches on the $i$-th tree on Alan&#39;s farm.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$ is the test case number (starting from $1$) and&nbsp;$y$ is the minimum number of trees Barbara must purchase to obtain $K$&nbsp;banana bunches using at most $2$ contiguous sections of the farm, or&nbsp;<code>-1</code>&nbsp;if it is impossible to do so.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$0 \le B_i \le K$, for each $i$&nbsp;from&nbsp;$1$ to $N$.</li>
</ul>