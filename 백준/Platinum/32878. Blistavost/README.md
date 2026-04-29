# [Platinum III] Blistavost - 32878

[문제 링크](https://www.acmicpc.net/problem/32878)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 4, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In the heart of the Glass Valley lies a mysterious star temple, a place known for its collection of magical crystals that shine like stars. Each crystal holds special power and emits a radiant glow that illuminates the entire valley, as long as it remains untouched.</p>

<p>The temple guardian’s nightly task is to touch ONLY the crystals located within the specified ranges of the valley’s residents, while honoring all of their requirements. Each resident’s request tells the guardian which range of crystals must NOT stop shining BEFORE their bedtime, as they fear the darkness.</p>

<p>The guardian starts his journey at the temple entrance and must carefully coordinate their movements to dim the crystals such that they stop shining at the correct moment. The crystals are arranged in a line, spaced one meter apart from each other (the first crystal is one meter away from the entrance). The guardian can move at a speed of one meter per second and may stop when needed. The time it takes for the guardian to touch and dim a crystal is negligible. Given the residents’ requests, the temple guardian wants to know the minimum number of seconds required to fulfill all requests (the guardian does not need to return to the starting position).</p>

### 입력

<p>In the first line is an integer $N$ ($1 ≤ N ≤ 5000$), number of residents’ requests.</p>

<p>In the next $N$ lines are integers $l_i$, $r_i$, $t_i$ ($1 ≤ l_i ≤ r_i ≤ 10^{18}$, $1 ≤ t_i ≤ 10^{18}$), representing the left and right bounds of the crystal range and the resident’s bedtime, respectively.</p>

### 출력

<p>In the first and only line output the minimum time in seconds required for the guardian to fulfill all the requests.</p>