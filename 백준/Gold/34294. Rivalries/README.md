# [Gold I] Rivalries - 34294

[문제 링크](https://www.acmicpc.net/problem/34294)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘, 다이나믹 프로그래밍, 방향 비순환 그래프, 위상 정렬, 트리, 트리에서의 다이나믹 프로그래밍, 함수형 그래프

### 문제 설명

<p>At the prestigious Colorado School of Mines, interdepartmental rivalries are both intense and theatrical. Each department considers exactly one other department as their rival. However, rivalries are not always reciprocated—a department may view another as their rival without that feeling being mutual.</p>

<p>The administration, seeking to foster cooperation despite these rivalries, has decided to form rivalry pairs for an upcoming school-wide fundraising event. Each rivalry pair consists of two departments where either:</p>

<ul>
	<li>One department considers the other as a rival, or</li>
	<li>They consider each other as rivals.</li>
</ul>

<p>The administration wants to maximize the number of rivalry pairs to have as many departments as they can at the fundraising event, but due to the asymmetric nature of rivalries, it may not be possible to pair up every department. Some departments will be left without a pair.</p>

<p>Given the rivalry preferences of all departments, and that the administration will maximize the number of departments at the event, determine the minimum number of departments that cannot be paired.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \leq n \leq 10^5$) — the number of departments.</p>

<p>The second line contains $n$ space-separated integers $r_1, r_2, \dots, r_n$ ($1 \leq r_i \leq n$), where $r_i$ represents the department that department $i$ considers as its rival. A department may consider itself a rival, i.e., $r_i = i$.</p>

### 출력

<p>Print a single integer---the minimum number of departments that cannot be paired.</p>