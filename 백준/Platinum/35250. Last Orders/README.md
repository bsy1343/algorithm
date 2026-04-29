# [Platinum V] Last Orders - 35250

[문제 링크](https://www.acmicpc.net/problem/35250)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>You are attempting a legendary pub crawl across town.</p>

<p>The town has $k$ junctions which are connected by $m$ roads. There is a pub at each junction. Each road could be traveled in both directions and has a non-negative travel time. There could be multiple roads between the same pair of junctions. You start the pub crawl at time $0$ in pub $1$.</p>

<p>Pub $i$ is located at junction $i$ and will close at absolute time $c_i$. A pint must be finished at or before closing time in order to count.</p>

<p>Your drinking ability changes as the night goes on: The 1st pint takes $t_1$ time units, The 2nd takes $t_2$, and so on, with the $r$-th pint taking $t_r$. Please note that $t_i$ are not necessarily increasing.</p>

<p>You may visit pubs in any order (not necessarily starting by <em>drinking</em> at pub $1$) and may return to the same pub multiple times, but you cannot drink two consecutive pints in the same pub.</p>

<p>Your task is to maximize the number of pints consumed before closing times run out.</p>

### 입력

<ul>
<li>One line containing the number of pints you are capable of drinking, $r$ ($1 \leq r \leq 100$).</li>
<li>One line containing $r$ integers: the number of seconds taken to drink the pints, $t_1 \ldots t_r$ ($1 \le t_i \le 3600$).</li>
<li>One line containing the number of pubs, $k$ ($1 \le k \le 300$).</li>
<li>One line containing $k$ integers, the integer closing times $c_1 \ldots c_k$ of the pubs in seconds ($1 \le c \le 86400$).</li>
<li>One line containing the number of roads, $m$ ($1 \le m \le 90000$).</li>
<li>$m$ further lines, each containing three integers: $a$, $b$, and $d$, indicating that there is a connection between pubs $a$ and $b$ taking $d$ seconds to travel ($1 \le (a \ne b) \le k$; $1 \le d \le 86400$). Please note that there could be more than one road between same pair of pubs.</li>
</ul>

### 출력

<p>Output an integer --- the maximum number of pints you can drink before all of the pubs are closed.</p>