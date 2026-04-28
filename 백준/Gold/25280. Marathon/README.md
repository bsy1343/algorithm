# [Gold IV] Marathon - 25280

[문제 링크](https://www.acmicpc.net/problem/25280)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 54, 맞힌 사람: 45, 정답 비율: 71.429%

### 분류

수학, 이분 탐색, 매개 변수 탐색, 확률론

### 문제 설명

<p>Erik wants to run a marathon. Most of all, he wants to <em>win</em> the race. To plan his training, he has looked up how the other contestants performed in previous races and made a model to predict his chances of winning. The finishing time for each contestant is distributed uniformly at random in an interval $[a_i, b_i]$. What is the largest finishing time Erik can have while still having a $50\%$ change of winning?</p>

### 입력

<p>The first line contains an integer $1 \leq N \leq 10^5$, the number of other contestants. Then follows $N$ lines, each with two floating point values $0 \leq a_i \leq 10^5$ and $a_i \le b_i \leq 10^5$ with at exactly one decimal place, the start and end time in seconds for their finishing time.</p>

### 출력

<p>A single floating point number, the largest finishing time in seconds that Erik needs to have a $50\%$ chance of winning. The answer must be with a relative or absolute error of at most $10^{-6}$.</p>