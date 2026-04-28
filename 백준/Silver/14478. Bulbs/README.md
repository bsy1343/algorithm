# [Silver III] Bulbs - 14478

[문제 링크](https://www.acmicpc.net/problem/14478)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 44, 맞힌 사람: 41, 정답 비율: 82.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Greg has an m &times; n grid of Sweet Lightbulbs of Pure Coolness he would like to turn on. Initially, some of the bulbs are on and some are off. Greg can toggle some bulbs by shooting his laser at them. When he shoots his laser at a bulb, it toggles that bulb between on and off. But, it also toggles every bulb directly below it, and every bulb directly to the left of it. What is the smallest number of times that Greg needs to shoot his laser to turn all the bulbs on?</p>

### 입력

<p>The first line of input contains a single integer T (1 &le; T &le; 10), the number of test cases. Each test case starts with a line containing two space-separated integers m and n (1 &le; m, n &le; 400). The next m lines each consist of a string of length n of 1s and 0s. A 1 indicates a bulb which is on, and a 0 represents a bulb which is off.</p>

### 출력

<p>For each test case, output a single line containing the minimum number of times Greg has to shoot his laser to turn on all the bulbs.</p>

### 힌트

<p>In the first test case, shooting a laser at the top right bulb turns on all the bulbs which are off, and does not toggle any bulbs which are on.</p>

<p>In the second test case, shooting the top left and top right bulbs will do the job.</p>