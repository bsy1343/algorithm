# [Platinum IV] Drone With a Camera - 23602

[문제 링크](https://www.acmicpc.net/problem/23602)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 151, 정답: 18, 맞힌 사람: 14, 정답 비율: 20.588%

### 분류

수학, 기하학

### 문제 설명

<p>Maggy got a camera-equipped drone as a present. She wants to take photos of two nearby straight infinite roads using a drone and best road photos are taken directly above the road. She would like to make drone&#39;s route as short as possible, as she is afraid that the batteries might not last long enough. Of course, the drone must start and finish at Maggy&#39;s house! Help her to plan the shortest possible route.</p>

### 입력

<p>The first line of the input contains three integers $a, b, c$ ($-10^6 \leq a,b,c \leq 10^6$, $a \neq 0$ or $b \neq 0$), each separated by a single space They describe the first road, which satisfies the equation $a x + b y = c$. The second and last line of the input contains a similar description of the second road.</p>

<p>The two roads are different, i.e. they do not coincide. Furthermore, they do not pass through Maggys&#39; house, whose coordinates are $(0,0)$.</p>

### 출력

<p>You should write a single real number in the first and only line of the output -- the smallest possible length of drone&#39;s route. The answer is accepted, if its relative or absolute error is at most $10^{-6}$.</p>