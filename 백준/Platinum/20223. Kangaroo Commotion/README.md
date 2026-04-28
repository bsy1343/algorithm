# [Platinum V] Kangaroo Commotion - 20223

[문제 링크](https://www.acmicpc.net/problem/20223)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 512 MB

### 통계

제출: 188, 정답: 60, 맞힌 사람: 38, 정답 비율: 26.950%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Bushfires are threatening your habitat! Being a kangaroo, you must inform the other kangaroos in your troop as fast as possible and flee to a safe area.</p>

<p>You are currently standing still, and you will jump to the other kangaroos&#39; locations. You will visit the other kangaroos in a specific order so that all of them have sufficient time to escape. After visiting all other kangaroos you must continue jumping to the safe area, where you should come to a stop.</p>

<p>With each jump you move a (possibly negative) integer distance north and/or east. Because of your limited muscle power, you are only able to accelerate or decelerate at most $1$ in each direction each jump. Formally, if jump $i$ moves you $v_{x,i}$ to the north and $v_{y, i}$ to the east, the next jump $i+1$ must satisfy $|v_{x, i+1} - v_{x, i}| \leq 1$ and $|v_{y, i+1} - v_{y, i}| \leq 1$.</p>

<p>Find the minimal number of jumps needed to go from your current position to the safe area via all other kangaroos, without leaving the grid. It is very important to come to a full stop at the end, so the last jump must both start and end at the safe area.</p>

<p>The first sample is shown in figure K.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20223.%E2%80%85Kangaroo%E2%80%85Commotion/c31df3e4.png" data-original-src="https://upload.acmicpc.net/25a66a91-ee18-4891-ae14-a0d2887a1888/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 256px; height: 249px;" /></p>

<p style="text-align: center;">Figure K.1: Visualisation of Sample 1 showing one possible way to get to the safe area using $9$ jumps.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line containing three integers $r$, $c$ ($1\leq r, c \leq 50$), the number of rows and columns of the grid, and $k$ ($1\leq k\leq 5$), the number of other kangaroos you need to warn.</li>
	<li>$r$ lines each consisting of $c$ characters. A &quot;<code>.</code>&quot; indicates an open space and a &quot;<code>#</code>&quot; indicates a bush where you can&#39;t jump. Your start position is indicated by a &quot;<code>0</code>&quot; and the characters &quot;$1$&quot; to $k$ indicate the positions of the other kangaroos you need to warn <em>in this order</em>. The position indicated by $k+1$ indicates the safe area where you should come to a stop.</li>
</ul>

### 출력

<p>If it is possible to reach the safe area, then output the minimal number of steps needed to reach the safe area. Otherwise, output &quot;<code>impossible</code>&quot;.</p>