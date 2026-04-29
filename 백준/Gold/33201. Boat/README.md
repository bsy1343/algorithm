# [Gold II] Boat - 33201

[문제 링크](https://www.acmicpc.net/problem/33201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 51, 정답: 17, 맞힌 사람: 15, 정답 비율: 33.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>A river separates Upper Barareh from Lower Barareh. To transport people between these two towns, a <strong>two-seater</strong> boat (a boat that can carry at most two people) with a certain weight capacity has been provided. This boat must be steered by at least one person. i.e. it can not move across the river without any passengers.</p>

<p>The National Barareh Festival is scheduled to be held in Upper Barareh. All Lower Barareh residents want to participate in this celebration and need to move to Upper Barareh as quickly as possible. Your task is to help them move to Upper Barareh with the minimum number of boat trips across the river.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $w$, where $n$ is the number of Lower Barareh residents ($1 \le n \le 1\, 000$), and $w$ is the maximum weight the boat can carry ($1 \le w \le 10^6$). The next line contains $n$ space-separated integers, describing the weights of the residents of Lower Barareh. All the weights are positive integers not exceeding $10^6$.</p>

### 출력

<p>If it is not possible to transfer all the residents of Lower Barareh, print a single line containing “<code>-1</code>” in the output. Otherwise, print the minimum number of times the boat must travel between Lower Barareh and Upper Barareh (in both directions) in order to transfer all residents of Lower Barareh to Upper Barareh.</p>