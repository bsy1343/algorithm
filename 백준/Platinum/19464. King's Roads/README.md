# [Platinum II] King's Roads - 19464

[문제 링크](https://www.acmicpc.net/problem/19464)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 78, 정답: 27, 맞힌 사람: 24, 정답 비율: 36.923%

### 분류

그래프 이론, 최소 스패닝 트리, 두 포인터

### 문제 설명

<p>King Byteasar wants to introduce an innovative road network in Byteland. There are $n$ cities in Byteland. There are $a_i$ citizens living in $i$-th city.</p>

<p>Initially, there are no roads in Byteland. The king wants to build several roads in such a way that all cities are connected (directly or indirectly). He also wants to minimize expenses on maintaining the roads.</p>

<p>Naturally, if a road connects populous cities, it is used more heavily and thus is more expensive to maintain. Formally, maintaining a road between cities $i$ and $j$ costs $a_i + a_j$ bytalers per year. However, if $a_i + a_j$ is at least $M$, the road is considered <em>a national highway</em>, and it brings revenue of $M$ bytalers per year from taxation (thus, the effective cost for this road is $a_i + a_j - M$ per year). Note that all $a_i$ are less than $M$.</p>

<p>Help King Byteasar find the minimum annual cost for maintaining a set of roads so that all cities become connected.</p>

### 입력

<p>The first line of input contains two space-separated integers $n$ and $M$ ($1 \leq n \leq 200\,000$, $1 \leq M \leq 10^9$).</p>

<p>The second line contains $n$ space-separated integers $a_1$, $\ldots$, $a_n$ ($0 \leq a_i &lt; M$).</p>

### 출력

<p>Print one integer --- the minimum annual cost for maintaining a spanning set of roads in bytalers.</p>