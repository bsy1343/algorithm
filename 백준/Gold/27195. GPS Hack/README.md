# [Gold I] GPS Hack - 27195

[문제 링크](https://www.acmicpc.net/problem/27195)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Denis is a student and he&#39;s failed his data security exam, so today he&#39;s having a retake. He woke up late and decided to take a taxi.</p>

<p>Denis lives in a city, which can be represented as $n$ crossroads connected by $m$ bidirectional roads. For every road it is known, how much it takes to drive along it. Denis lives near a crossroad with number $s$ and the university is near crossroad $t$. As soon as the taxi is near the university, Denis immediately leaves it and rushes for his exam.</p>

<p>Unfortunately, everything is a bit more complicated --- hackers had hacked a GPS in Denis&#39;s taxi. When the GPS works properly, it helps you to reach your destination as fast, as it&#39;s possible. On every crossroad it shows, which road should be taken in order to finish your journey in the fastest way. If there are more than one possible road, GPS can show you any. Hackers can make GPS show you any road they want, but no more than once. </p>

<p>Denis doesn&#39;t remember exactly, how did he get to the university, but he remembers the time $L$ the road took. It turned out that his teacher had already known about the attack on GPS, so he asked Denis to calculate the number of different possible routes from his place to the university as a part of his retake.</p>

<p>Help Denis calculate the number of routes from crossroad $s$ to crossroad $t$, that took $L$ time and were possible considering the GPS hack. As this number might be very large, find it modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- number of crossroads and roads between them in the city, where Denis lives ($2 \leq n \leq 2 \cdot 10^5$, $1 \leq m \leq \min{(2 \cdot 10^5, \frac{n(n - 1)}{2})}$).</p>

<p>The second line contains three integers $s$, $t$ and $L$ --- crossroad number, where Denis lives, number of the crossroad near the university and the ride time ($1 \leq s, t \leq n$, $s \neq t$, $1 \leq L \leq 2 \cdot 10^{14}$).</p>

<p>The next $m$ lines contain descriptions of roads between crossroads. The description contains three integers $v$, $u$, $w$ ($1 \leq v, u \leq n$, $v \neq u$, $1 \leq w \leq 10^9$) --- numbers of the two crossroads connected by this road and the time, needed to drive along it. </p>

<p>All the roads are bidirectional, any pair of crossroads is connected with no more than one road. No roads connect a crossroad with itself. It is guaranteed that it is possible to get from crossroad $s$ to the crossroad $t$.</p>

### 출력

<p>Print the only integer --- number of routes Denis could have modulo $10^9 + 7$.</p>