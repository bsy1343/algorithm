# [Platinum II] Apple Catching - 24974

[문제 링크](https://www.acmicpc.net/problem/24974)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 143, 정답: 74, 맞힌 사람: 70, 정답 비율: 51.471%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵

### 문제 설명

<p>It&#39;s raining apples! At certain points in time, some number of apples will hit the number line. At certain points in time, some of Farmer John&#39;s cows will arrive on the number line and start catching apples.</p>

<p>If an apple hits the number line without a cow to catch it, it is lost forever. If a cow and an apple arrive at the same time, the cow catches it. Each cow can travel one unit per second. Once a cow catches a single apple, she exits the number line.</p>

<p>If FJ&#39;s cows collaborate optimally, how many apples can they catch in total?</p>

### 입력

<p>The first line contains $N$ ($1\le N\le 2\cdot 10^5$), the number of times apples hit the number line or FJ&#39;s cows appear.</p>

<p>The next $N$ lines each contain four integers $q_i$, $t_i$, $x_i$, and $n_i$ ($q_i\in \{1,2\}, 0\le t_i\le 10^9, 0\le x_i\le 10^9, 1\le n_i\le 10^3$).</p>

<p>&nbsp;</p>

<ul>
	<li>If $q_i=1$, this means that $n_i$ of FJ&#39;s cows arrive on the number line at time $t_i$ at location $x_i$.</li>
	<li>If $q_i=2$, this means that $n_i$ apples will hit the number line at time $t_i$ at location $x_i$.</li>
</ul>

<p>It is guaranteed that all of the ordered pairs $(t_i,x_i)$ are distinct.</p>

### 출력

<p>The maximum number of apples FJ&#39;s cows may collectively catch.</p>