# [Gold I] Doomsday - 24240

[문제 링크](https://www.acmicpc.net/problem/24240)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 23, 맞힌 사람: 22, 정답 비율: 44.898%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Doomsday is near! Or at least that&rsquo;s what your brother is telling you. In his preparations he has constructed a clever network of well concealed food depots and water depots far out in a mountainous region. You are in your base, and the alarm goes off: how quickly can you fetch both food and water supplies?</p>

### 입력

<p>The first line contains four integers $n$, $m$, $w$, $f$, where $1 \leq n \leq 50\,000$ is the number of hidden locations, $0 \leq m \leq 150\,000$ is the number of trails in the network, $1 \leq w \leq n$ is the number of water depots in total, and $1 \leq f \leq n$ is the number of food depots in total. Your base is at location $0$. The second line contains $w$ space-separated integers $u_1, u_2, \ldots, u_w$, which represents the (distinct) locations of the water depots ($0 \leq u_i &lt; n$ for each $i$). The third line contains $f$ space-separated integers $v_1, v_2, \ldots, v_f$, which represents the (distinct) locations of the food depots ($0 \leq v_i &lt; n$ for each $i$).</p>

<p>The next $m$ lines each describe a (bidirectional) trail in the network. The $i^{\text{th}}$ such line contains three space-separated integers $a_i$, $b_i$ and $t_i$ indicating that there is a trail between location $a_i$ and $b_i$ which takes $t_i$ hours to traverse ($0 \leq a_i, b_i &lt; n$ and $0 \leq t_i &lt; 100$ for each $i$).</p>

### 출력

<p>Output a single integer, the minimum number of hours required to fetch both food and water and bring it back to base.</p>