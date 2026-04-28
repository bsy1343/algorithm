# [Platinum IV] Flight Collision - 21342

[문제 링크](https://www.acmicpc.net/problem/21342)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 271, 정답: 82, 맞힌 사람: 74, 정답 비율: 30.328%

### 분류

자료 구조, 집합과 맵, 우선순위 큐, 트리를 사용한 집합과 맵, 연결 리스트

### 문제 설명

<p>The <em>Icelandic Corporation for Parcel Circulation</em> is the leading carrier for transporting goods between Iceland and the rest of the world. Their newest innovation is a drone link connecting to mainland Europe that has a number of drones travelling back and forth along a single route.</p>

<p>The drones are equipped with a sophisticated system that allows them to fly evasive manoeuvres whenever two drones come close to each other. Unfortunately, a software glitch has caused this system to break down and now all drones are flying along the route with no way of avoiding collisions between them.</p>

<p>For the purposes of this problem, the drones are considered as points moving along an infinite straight line with constant velocity. Whenever two drones are at the same location, they will collide, causing them to fall off their flight path and plummet into the Atlantic Ocean. The flight schedule of the drones is guaranteed to be such that at no point will there be three or more drones colliding at the same location.</p>

<p>You know the current position of each drone as well as their velocities. Your task is to assess the damage caused by the system failure by finding out which drones will continue flying indefinitely without crashing.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \leq n \leq 10^5$), the number of drones. The drones are numbered from $1$ to $n$.</li>
	<li>$n$ lines, the $i$th of which contains two integers $x_i$ and $v_i$ ($-10^9 \leq x_i,v_i \leq 10^9$), the current location and the velocity of the $i$th drone along the infinite straight line.</li>
</ul>

<p>The drones are given by increasing $x$ coordinate and no two drones are currently in the same position, i.e. $x_i &lt; x_{i+1}$ for each $i$. You may assume that there will never be a collision involving three or more drones.</p>

### 출력

<p>Output the number of drones that never crash, followed by the indices of these drones in numerically increasing order.</p>