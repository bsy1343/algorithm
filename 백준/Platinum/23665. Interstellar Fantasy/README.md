# [Platinum V] Interstellar Fantasy - 23665

[문제 링크](https://www.acmicpc.net/problem/23665)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

기하학, 3차원 기하학, 수학

### 문제 설명

<p>Unfortunately, the boy finally got bankrupt. Looking at his receding figure, Rikka understood more about the world --- but she is still herself. Though, she still sat on the tower and spent time with the low gravity, feeling lost.</p>

<p>She looked at the deep dark sky, where the blue round Earth is shining overhead. Rikka thought about her families, her friends, and her homeland. Is she in her dream or a &quot;real&quot; world? The girl of <em>chunibyo</em> felt afraid for the first time since the journey began.</p>

<p>She saw a bright star traveling fast around the earth --- maybe a geostationary space station. How could she get there? Daydream started again.</p>

<p>In other words, Rikka wonders the minimum distance she needs to travel from her position $s$ to the position of the star $t$, while a sphere --- the earth staying there as an obstacle. They are in a 3-dimensional Euclidean space. $s$ and $t$ may be at the same position.</p>

### 입력

<p>The first line contains an integer $T (1 \leq T \leq 1000)$, the number of test cases. Then $T$ test cases follow.</p>

<p>Each test case contains two lines.</p>

<p>The first line contains four integers $o_x, o_y, o_z, r$, the positions in each dimension of the center of the sphere $o$ and its radius.</p>

<p>The second line contains six integers $s_x, s_y, s_z, t_x, t_y, t_z$, the positions in each dimension of the starting point $s$ and the terminal point $t$, respectively. Notice that $s$ and $t$ may be at the same position.</p>

<p>It is guaranteed that neither $s$ nor $t$ is strictly inside the obstacle, and each value of a position or a radius in the input belongs to $[1, 1000]$.</p>

### 출력

<p>Output one number, the minimum distance from $s$ to $t$ without entering the sphere obstacle. Your answer is considered correct if the absolute or relative error doesn&#39;t exceed $10^{-6}$.</p>