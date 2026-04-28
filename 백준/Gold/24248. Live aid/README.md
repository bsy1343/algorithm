# [Gold IV] Live aid - 24248

[문제 링크](https://www.acmicpc.net/problem/24248)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 24, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

이분 탐색, 다이나믹 프로그래밍

### 문제 설명

<p>You are organizing the annual &quot;Boost the Global Opulence&quot; fundraiser concert and have received an extraordinarily amount of requests from musicians that want to perform. However, you only have one stage, so you can not invite all of them.&nbsp;</p>

<p>Each musician has a certain potential for attention, and you want to maximize the total attention potential for the concert.</p>

<p>But the musicians are very stubborn. They require that they can choose when their performance starts and for how long it lasts. More specifically, all of them have given you a start time and end time for their performance. If you cannot guarantee this, they will not perform at all.</p>

### 입력

<p>The first line contains a single integer $1 \leq n \leq 150\,000$, the number of musicians. Then follows $n$ lines, one for each musician. Each line contains three space-separated integers $s$, $e$ and $a$, where $0 \leq s \leq 10^6$ is the start time, $s &lt; e \leq 10^6$ is the end time, and $0 \leq a \leq 10^6$ is the attention potential of the musician.</p>

### 출력

<p>Output the maximum total attention for the concert. In other words, pick a subset of the musicians to perform on the stage that maximize the sum of their attention potential, subject to the requirements that every musician gets their preferred time slot and there are no overlapping performances.</p>