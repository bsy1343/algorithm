# [Platinum II] Even Separation - 19212

[문제 링크](https://www.acmicpc.net/problem/19212)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 49, 정답: 30, 맞힌 사람: 24, 정답 비율: 57.143%

### 분류

수학, 선형대수학, 가우스 소거법, 배타적 논리합 기저 (gf(2))

### 문제 설명

<p>The good king of the Even Kingdom is dying, and two (surely, an even number) of his sons, Alfred and Brian, are in equal right of ruling the kingdom. The king has decided to separate the kingdom into two parts, so that each son can rule his part single-handedly. Of course, the separation must be <em>even</em>.</p>

<p>The kingdom consists of $n$ cities, some of which are connected by bidirectional roads; no road connects a city with itself, and no two cities are connected by two or more roads. After separation, each city will belong either to Alfred or to Brian. Moreover, every road which connects cities that belong to different brothers will be destroyed. The separation will be <em>even</em>&nbsp;if, after those roads are destroyed, each of the cities will be <strong>directly</strong>&nbsp;connected to an even number of other cities (that is, the degree of each vertex of the graph representing the road network will be even).</p>

<p>Time is running short; help the good king to find the even separation of his kingdom!</p>

<p>Note that initially some pairs of cities may be unreachable from each other via roads, and in an even separation it may be possible that some cities in some part are unreachable from each other via remaining roads.</p>

### 입력

<p>The first line of input contains two space-separated integers $n$ and $m$ --- the number of cities and roads in the Even Kingdom ($1 \leq n \leq 500$, $0 \leq m \leq \frac{n (n - 1)}{2}$).</p>

<p>The next $m$ lines describe the roads in the kingdom; $i$-th of these lines contain two space-separated integers --- numbers of the cities connected by $i$-th road. Cities are numbered starting from $1$. There is no more than one road connecting the every pair of cities, and no road connecting a city to itself.</p>

### 출력

<p>If the separation is possible, print one line containing $n$ characters; the $i$-th character should be &quot;<code>A</code>&quot; or &quot;<code>B</code>&quot; if the $i$-th city should belong to Alfred or Brian, respectively. If there are several possible answers, output any of them.</p>

<p>If the separation is impossible, print one line &quot;<code>IMPOSSIBLE</code>&quot;.</p>

### 힌트

<p>Note that it is possible that some of the brothers will not get any cities at all. Oh well, no one said it should be fair.</p>