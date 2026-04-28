# [Gold II] Hamilton - 19174

[문제 링크](https://www.acmicpc.net/problem/19174)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 11, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Tracker Smurf is planning his trip for next holidays. &nbsp;He wants to spend <strong>exactly</strong>&nbsp;one night in each of the villages in SmurfLand. His trip can start and end in any village. &nbsp;Villages in SmurfLand are connected by roads in such a way that there&#39;s exactly one path between any two villages. &nbsp;The distance between any two directly connected villages is exactly one kilometer. &nbsp;Tracker is so fast that he can travel up to three kilometers each day, but he is still not sure if that&#39;s enough to be able to spend a night in each village exactly once. &nbsp;Help him find the answer.</p>

### 입력

<p>First line of input contains an integer $n$ ($1 \leq n \leq 10^5$) -- the number of villages in SmurfLand. The next $n-1$ lines describe the roads. &nbsp;$i$th input line ($i \in \{ 2, \ldots, n \}$) contains an integer $p_i$ ($1 \leq p_i &lt; i$) which means that there is a road connecting villages $i$ and $p_i$.</p>

### 출력

<p>On a single line output $n$ integers $q_1, q_2, \ldots, q_n$ ($1 \leq q_i \leq n$) specifying the sequence of villages for Tracker to spend the nights in (Tracker starts in village $q_1$ then goes to village $q_2$ and so on, finishing in village $q_n$). If it is not possible to plan Tracker&#39;s trip then on a single line output the word &quot;NO&quot; (without quotes).</p>