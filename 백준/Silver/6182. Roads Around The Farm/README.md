# [Silver II] Roads Around The Farm - 6182

[문제 링크](https://www.acmicpc.net/problem/6182)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 198, 정답: 92, 맞힌 사람: 83, 정답 비율: 50.000%

### 분류

분할 정복, 수학, 재귀

### 문제 설명

<p>Farmer John&#39;s cows have taken an interest in exploring the territory around the farm. Initially, all N (1 &lt;= N &lt;= 1,000,000,000) cows commence traveling down a road in one big group. Upon encountering a fork in the road, the group sometimes chooses to break into two smaller (nonempty) groups with each group continuing down one of the roads. &nbsp;When one of those groups arrives at another fork, it might split again, and so on.</p>

<p>The cows have crafted a peculiar way of splitting: if they can split into two groups such that the sizes of the groups differ by exactly K (1 &lt;= K &lt;= 1000), then they will split in that way; otherwise, they stop exploring and just start grazing peacefully.</p>

<p>Assuming that there will always be new forks in the road, compute the final number of groups of peacefully grazing cows.</p>

### 입력

<p>Line 1: Two space-separated integers: N and K</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the number of groups of grazing cows</li>
</ul>

### 힌트

<p>There are 3 final groups (with 2, 1, and 3 cows in them).</p>

<pre>
   6
  / \
 2   4
    / \
   1   3</pre>