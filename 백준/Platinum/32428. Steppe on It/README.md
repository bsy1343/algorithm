# [Platinum II] Steppe on It - 32428

[문제 링크](https://www.acmicpc.net/problem/32428)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 이분 탐색, 트리

### 문제 설명

<p>The gas pedal on the floor. Squealing tires. Wailing sirens. Emergency vehicles do whatever is necessary to reach their target locations as quickly as possible. Time is critical because lives often depend on it.</p>

<p>Providing emergency services is always challenging, especially for sparsely populated areas such as the Kazakh Steppe. The cost of building infrastructure is high compared to the number of people served. It is therefore important to minimize both the number of roads and the number of vehicles. On the other hand, it is also vital to minimize the response time of emergency services.</p>

<p>This problem considers a road network that already minimizes the number of roads, which means that any two villages are connected by exactly one path. Thanks to a government grant, the Kazakh Steppe Fire Department recently acquired some shiny new fire engines. The department wants to establish fire stations in some of the villages and allocate the fire engines to them in a way that optimizes the guaranteed response time.</p>

<p>Your task is to find an optimal placement of fire engines that minimizes the time needed for any village to be reached by a fire engine. You can neglect the time needed to assemble the fire crew and start the engine as well as the time to travel across any villages. The response time is determined solely by traveling along the roads.</p>

### 입력

<p>The first line contains two integers: the number of villages $n$ ($1 ≤ n ≤ 100\, 000$) and the number of fire engines $f$ ($1 ≤ f ≤ n$).</p>

<p>This is followed by $n-1$ lines numbered from $2$ to $n$. Line number $i$ contains two integers $v_i$ ($1 ≤ v_i &lt; i$) and $t_i$ ($1 ≤ t_i ≤ 10\, 000$) meaning that there is a two-way road between villages $i$ and $v_i$ that can be traveled in time $t_i$.</p>

### 출력

<p>Output the minimum response time that can be guaranteed by placing fire engines into $f$ villages.</p>