# [Platinum I] Nomad Camp - 33406

[문제 링크](https://www.acmicpc.net/problem/33406)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 3, 맞힌 사람: 3, 정답 비율: 23.077%

### 분류

그래프 이론, 그래프 탐색, 데이크스트라, 최단 경로

### 문제 설명

<p>On summer vacation, Amir stayed at his grandmother's house, where she told him stories about how nomadic people in ancient times chose pastures for themselves:</p>

<p>There are only $n$ pastures, numbered from $1$ to $n$, and $m$ roads available. Each pasture belongs to one of the four types: қыстау (winter), көктеу (spring), жайлау (summer), and күзеу (autumn).</p>

<p>Each pasture is initially inhabited by people, regardless of the season. When the season changes, from each pasture, people move to the nearest pasture corresponding to the new season. If there are multiple nearest pastures, they choose the pasture with the smallest number. If there is no pasture for the new season, people become sad and stop moving at all.</p>

<p>Now Amir wonders if it would be possible to gather all the people in one place if people could change the season of the year to any other season, as many times as they like.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \le T \le 10^4$): the number of test cases. For each test case:</p>

<p>The first line contains two integers $n$ and $m$ ($1 \le n \le 200$, $1 \le m \le \frac{n \cdot (n - 1)}{2}$): the number of pastures and the number of roads between them.</p>

<p>The second line contains $n$ integers $c_1, c_2, \ldots, c_n$ ($1 \le c_i \le 4$): the types of pastures.</p>

<p>Each of the next $m$ lines contains three integers, $u_i$, $v_i$, and $w_i$ ($1 \le u_i, v_i \le n$, $1 \le w_i \le 10^5$), which mean there is a bidirectional road between pastures $u_i$ and $v_i$ that has length $w_i$.</p>

<p>It is guaranteed that the sum of $n$ for all test cases does not exceed $10^5$.</p>

<p>It is guaranteed that the sum of $m$ for all test cases does not exceed $10^6$.</p>

### 출력

<p>Output $T$ lines, each of which is the answer to the corresponding test case. As the answer, output "<code>YES</code>" if it is possible to gather everyone in one place, and "<code>NO</code>" otherwise.</p>