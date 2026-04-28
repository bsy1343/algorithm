# [Platinum III] Swimming - 31322

[문제 링크](https://www.acmicpc.net/problem/31322)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 11, 맞힌 사람: 10, 정답 비율: 33.333%

### 분류

수학, 기하학, 많은 조건 분기, 미적분학

### 문제 설명

<p>Trying to reach Skumbriewitz, who was floundering around the buoy, Ostap Bender swam on his side, keeping an eye on Berlaga, who was sitting on the shore. Ostap&#39;s head was turned by a constant angle for the whole time. For that reason he swam along a curve rather than along a straight line, so the angle between the direction of his swimming and the direction to Berlaga was constant.</p>

<p>Your task is to find the length of Ostap Bender&#39;s trajectory.</p>

### 입력

<p>The input file consists of three lines. Each of these lines contains two integers not exceeding $10^5$ by absolute value. The first line contains the initial coordinates of Ostap Bender, the second line contains the coordinates of his destination -- Skumbriewitz, and the third line -- the coordinates of Berlaga. All defined points are pairwise distinct. It is guaranteed that Berlaga and Skumbriewitz didn&#39;t move while Ostap was swimming.</p>

### 출력

<p>The input file must contain a single real number -- the length of the shortest trajectory from the initial position of Ostap to Skumbriewitz&#39;s buoy, given that the angle between the tangent to the trajectory and the direction to Berlaga was constant. Print the answer with a relative or absolute error not greater than $10^{-8}$.</p>