# [Bronze I] Excellent Grades - 33552

[문제 링크](https://www.acmicpc.net/problem/33552)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 304, 정답: 59, 맞힌 사람: 40, 정답 비율: 17.699%

### 분류

수학

### 문제 설명

<p>In order to receive his propedeutic degree <em>cum laude</em>, the weighted average of all of Eddie's grades must be at least 8.0. Of course he must also have passed all of his courses, which requires a grade of at least 5.8. With only one exam to go, Eddie is wondering if he still has a shot at achieving <em>cum laude</em>.</p>

<p>Given all of the grades for Eddie's previous courses and their weights, and the weight of the final exam, check if Eddie can still obtain his degree <em>cum laude</em>. If he can, output the grade Eddie requires for his final exam to achieve this. Otherwise output IMPOSSIBLE.</p>

### 입력

<ul>
	<li>A line with 1 integer $w_u$ $(1 \leq w_u \leq 30)$, the weight of the final exam</li>
	<li>A line with 1 integer $n$ $(1 \leq n \leq 100)$, the number of other grades</li>
	<li>$n$ lines with 1 double (1 decimal) $g_i$ $(1 \leq g_i \leq 10)$ and 1 integer $w_i$ $(1\leq w_i \leq 30)$ where $g$ is the grade of exam $i$ and $w_i$ is the weight of exam $i$.</li>
</ul>

### 출력

<p>If Eddie can achieve <em>cum laude</em>, print the grade $g$ $(1 \leq g \leq 10)$ he has to achieve on his final exam, rounded to 1 decimal. Otherwise print IMPOSSIBLE.</p>