# [Platinum V] Meticulous smoothing - 24249

[문제 링크](https://www.acmicpc.net/problem/24249)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 33, 맞힌 사람: 32, 정답 비율: 62.745%

### 분류

그리디 알고리즘

### 문제 설명

<p>The arts and crafts teacher is looking at the beautiful plank you crafted in the woodshop, and gaze at you with a stern look. &quot;This is not smooth enough! Use more sandpaper!&quot;</p>

<p>Your plank is $n$ cm long, and the arts and crafts teacher has measured the width of your plank on $k$ different locations to prove his point. He demands that the thickness should differ by no more than $1$ micrometer between any two consecutive measured location. If the sandpaper will shave off $1$ micrometer of wood each time you use it at a particular location, how many times do you need to use the sandpaper?</p>

### 입력

<p>The first line of input contains a single integer $1 \leq n \leq 10^6$, the length of your plank. On the second line of input follows $n$ space-separated integers $k_1, k_2, \ldots, k_n$, the thickness of your plank ($1 \leq k_i \leq 10^6$ for every $i$).</p>

### 출력

<p>Output a single integer, the minimum number of times you need to use the sandpaper (assuming that the sandpaper only touch one location at the same time).</p>