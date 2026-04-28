# [Platinum IV] Single-track railway - 25112

[문제 링크](https://www.acmicpc.net/problem/25112)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 142, 정답: 66, 맞힌 사람: 55, 정답 비율: 50.926%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>Trains running on a single-track railway can only meet at the stations. Suppose that a pair of trains simultaneously leave in the opposite directions, one from the initial and the other from the final station, i.e. the initial station in the opposite direction. It is likely that one of the trains will have to wait for the other one at one of the stations along the railway. To minimize the delays, the trains meet at the station such that the waiting time is minimized.</p>

<p>We know the travel time between each two adjacent stations, equal in both directions. Unfortunately, the travel times constantly change because of the works along the railway. You are given the initial travel times and an updated travel time for the affected section after each change. Write a program that computes the shortest possible waiting time for a pair of trains leaving from the opposite ends of the railway after each of the changes.</p>

### 입력

<p>The first line specifies the number of stations, $n$. In the second line, $n - 1$ numbers are given, corresponding to the initial travel times between the adjacent stations (the $i$-th number is the travel time between stations $i$ and $i + 1$). The third line specifies the number of changes, $k$. This is followed by $k$ lines, each containing two numbers: the first one, $j &isin; [1, n - 1]$, specifies the station, and the second gives the updated travel time between stations $j$ and $j + 1$. Keep in mind that the first station is numbered $1$ rather than $0$.</p>

### 출력

<p>Output $n+1$ lines, where the $i$-th line will contain the shortest possible waiting time after $ i - 1$ changes (the first one should correspond to the situation before any changes).</p>

### 제한

<ul>
	<li>$2 &le; n &le; 200\,000$</li>
	<li>$0 &le; k &le; 200\,000$</li>
	<li>All travel times (both the initial and the updated ones) are integers from the interval $[1, 10^6]$.</li>
</ul>

### 힌트

<p>At the beginning, the trains leaving in the opposite directions should meet at station $3$. The first train will reach that station in $90$ minutes, and the second will arrive there in $100$ minutes; the waiting time will thus be $10$ minutes. Following the first change, the optimal meeting point becomes station $4$. Both trains will take $130$ minutes to get there, so neither will have to wait. After the second change, they will also meet at station $4$. This time, however, the train that arrives first will have to wait for $40$ minutes.</p>