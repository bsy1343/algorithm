# [Platinum V] Driving the Gnu - 23616

[문제 링크](https://www.acmicpc.net/problem/23616)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 54, 정답: 8, 맞힌 사람: 7, 정답 비율: 17.500%

### 분류

미적분학, 기하학, 수학, 물리학, 삼분 탐색

### 문제 설명

<p>Adam Kazimirovicz is racing his car, the Gnu, at the speed of $v$, across the vast cathedral square. Suddenly, a priest appears in his way, trying to fool Adam. The priest is a segment of the length $w$, perpendicular to Adam&#39;s trajectory, with its center on the trajectory. The initial distance between the car and the priest is $d$.</p>

<p>Enter Ostap --- he overrides Adam&#39;s panicked driving in an attempt to avoid the collision with the priest. For this purpose, he can accelerate the car at every moment in any direction. Note that at different moments in time, both the module and the direction of the acceleration can be changed. However, Ostap is not omnipotent; hence, the acceleration magnitude at each moment in time cannot be greater than $a$.</p>

<p>Find the minimal possible value of $a$ sufficient to avoid the collision.</p>

### 입력

<p>The first line of the input file contains an integer $T$ --- the number of test cases ($1 \le T \le 5 \cdot 10^4$).</p>

<p>The following $T$ lines each contain three integers $v$, $d$ and $w$ --- the initial velocity of the car, the initial distance from the Gnu to the priest, and the length of the segment ($1 \le v, d, w \le 1000$).</p>

### 출력

<p>The output file must contain $T$ lines, the $i$th line must contain the answer to the $i$th test case. The answer is the minimal possible value of $a$ sufficient to avoid a collision.</p>

<p>The absolute or relative error of each answer must not be greater than $10^{-10}$.</p>