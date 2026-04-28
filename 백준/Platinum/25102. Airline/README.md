# [Platinum IV] Airline - 25102

[문제 링크](https://www.acmicpc.net/problem/25102)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 28, 맞힌 사람: 26, 정답 비율: 65.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 트리, 누적 합, 트리에서의 다이나믹 프로그래밍, 최소 공통 조상

### 문제 설명

<p>An airline company offers regular flights involving $n$ different airports. Each flight links two airports directly (i.e. without stopping at any other airport) and allows travel in both directions. The flights are arranged such that for any choice of starting airport $s$ and destination airport $t$, there exists exactly one sequence of flights between the two airports without visiting any airport more than once. The number of flights in this sequence is called the <em>distance</em> between $s$ and $t$.</p>

<p>Were the airline to add another flight, say between airports $x$ and $y$, it is possible that for some pairs $(s, t)$, another, shorter sequence of flights from $s$ to $t$ would form. The more pairs affected, the more promising the new connection between $x$ and $y$ is considered to be. The airline is asking you to help them evaluate several possible additions $(x, y)$ with respect to this criterion.</p>

### 입력

<p>The first line contains two integers, $n$, the number of airports, and $q$, the number of possible additions $(x, y)$ that are to be evaluated.</p>

<p>The next $n-1$ lines describe the original flights before any additions. The $i$-th of these lines contains two integers $u_i$ and $v_i$, indicating that there is a direct flight connection between airports $u_i$ and $v_i$.</p>

<p>The remaining $q$ lines describe the possible additional flights that are being considered. The $i$-th of these lines contains two integers $x_i$ and $y_i$, indicating that in the $i$-th scenario the original $n-1$ flights would be supplemented by a new direct flight connection between airports $x_i$ and $y_i$ .</p>

### 출력

<p>Output $q$ lines; in the $i$-th line, output the number of pairs $(s, t)$ such that $1 &le; s &lt; t &le; n$ and the distance between airports $s$ and $t$ would decrease if the original network of $n - 1$ flights were supplemented by a direct flight connection between the airports $x_i$ and $y_i$ .</p>

### 제한

<ul>
	<li>$2 &le; n &le; 10^6$</li>
	<li>$1 &le; q &le; 10^5$</li>
	<li>$1 &le; u_i &le; n$; $1 &le; v_i &le; n$; $u_i \ne v_i$</li>
	<li>$1 &le; x_i &le; n$; $1 &le; y_i &le; n$; $x_i \ne y_i$</li>
	<li>$\sum_{i=1}^{q}{d_i} &le; 10^7$, where $d_i$ is the distance between $x_i$ and $y_i$ in the original flight network.</li>
</ul>