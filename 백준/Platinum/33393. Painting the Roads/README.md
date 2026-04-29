# [Platinum II] Painting the Roads - 33393

[문제 링크](https://www.acmicpc.net/problem/33393)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You are the king of the Pigeon Kingdom. The Pigeon Kingdom consists of $n$ cities and $n-1$ two-way roads, each connecting a pair of cities. It is guaranteed that it is possible to traverse between any two cities through the roads.</p>

<p>Each road has a color, black or white, and a length $\ell_i$. Initially, each road is white. However, you think that it is too boring this way. So you have decided to assign $m$ robots to $m$ cities to paint the roads to your favorite color pattern. Different robots <strong>can</strong> be assigned to the same city. Robot $i$ starts at city $p_i$, travels through some roads (possibly none), and then stops. A robot <strong>cannot</strong> travel through one road multiple times. When a robot travels through a road, it flips the color of the road (if it was white, it turns black, and vice versa). The robots are independent, which means that they will not interfere with each other in the travel. We assume that different robots don't paint any road simultaneously. Also, different robots <strong>can</strong> stop in the same city. The cost of a robot's travel is defined as the sum of lengths of all the roads on its path.</p>

<p>As the king of the Pigeon Kingdom, you want to minimize the total cost of all the travels. If it is impossible to paint the roads to the desired pattern with the $m$ robots, print $-1$ instead.</p>

### 입력

<p>The first line contains an integer $t$, the number of test cases ($1 \le t \le 5000$). The test cases follow.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($2 \le n \le 5000$ and $1 \le m \le 5000$), denoting the number of cities and the number of robots, respectively.</p>

<p>Each of the next $n-1$ lines contains four integers $u_i$, $v_i$, $\ell_i$, $c_i$ ($1 \le u_i &lt; v_i \le n$; $1\le \ell_i \le 10$; $c_i=0$ or $c_i=1$), denoting a road of length $\ell_i$ connecting cities $u_i$ and $v_i$. If $c_i=0$, you should paint it white in the desired pattern; otherwise, you should paint it black. It is guaranteed that it is possible to traverse between any pair of cities through the given roads.</p>

<p>Then a single line contains $m$ integers $p_j$ ($1 \le p_j \le n$), denoting the starting city for each robot.</p>

<p>It is guaranteed that the of sum of $n$ over all test cases will not exceed $5000$, and the sum of $m$ over all test cases will not exceed $5000$.</p>

### 출력

<p>For each test case, print one line containing a single integer: the minimal total cost to paint all the roads to the desired pattern. If it is impossible to do so, print $-1$ instead.</p>