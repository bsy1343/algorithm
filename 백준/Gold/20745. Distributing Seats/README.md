# [Gold IV] Distributing Seats - 20745

[문제 링크](https://www.acmicpc.net/problem/20745)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 문제 설명

<p>An airline called <em>Divided Airlines</em> has recently made the news due to their tendency to overbook their flights rather aggressively. For some flights, they even resorted to dragging passengers out from the plane! This was of course not very popular, so they decided to &quot;resolve&quot; the issue by making the seating assignments very chaotic (airlines do like unnecessary complexity).</p>

<p>A particular flights has $n$ passengers. The seats are divided into $r$ rows each containing $c$ seats. Every passenger $i$ is assigned to some particular seat located at row $a_i$ and column $b_i$. However, some passengers may be assigned to the same seat.</p>

<p>Of course, passengers are usually okay with sitting somewhere else than their assigned seat, but they may still want to be somewhat close to their original seat. Perhaps they want to be able to speak to their friends, or sit close to their overhead luggage. More specifically, passenger $i$ accepts sitting at most $s_i$ rows away from the row on their ticket.</p>

<p>Due to budget reasons, you decided to travel on a Divided flight. As expected, all the passengers assigned to an overbooked seat started to fight with each other, moving around in complex ways and causing a long delay. You proposed a fair resolution: you will construct a seat assignment which takes into account how far the passengers accepts to sit from their assigned seats so that as many passengers as possible get a seat. Now, all that remains is to actually find this assignment.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with the integers $n$, $r$ and $c$ ($1 \le n, r, c \le 10^5$), the number of passengers, rows and columns in the flight.</li>
	<li>$n$ lines with the integers $a_i, b_i$ and $s_i$ ($1 \le a_i \le r$, $1 \le b_i \le c$, $0 \le s_i \le r$). The $i$&#39;th line has the assigned row $a_i$ and column $b_i$, and maximum distance $s_i$ of the $i$&#39;th passenger. The maximum distance is given in rows.</li>
</ul>

### 출력

<p>Output the maximum number of passengers that can be assigned a seat in an optimal assignment.</p>