# [Gold III] Switch - 6787

[문제 링크](https://www.acmicpc.net/problem/6787)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 24, 맞힌 사람: 24, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>You are walking by a row of K (4 &le; K &le; 25) lights, some of which are on and some of which are off. In this initial configuration, there is no consecutive sequence of four lights that are on.</p>

<p>Whenever four or more consecutive lights are on, the lights in that consecutive block will turn off.</p>

<p>You can only turn on lights that are off.</p>

<p>What is the minimum number of lights you need to turn on in order to end up with all K lights off?</p>

### 입력

<p>The first line of input will consist of the integer K, indicating the number of lights. Each of the next K lines will have either the integer 0 (to represent a light that is off) or the integer 1 (to represent a light that is on).</p>

### 출력

<p>Your program should output the minimum number of lights that must be turned on in order to have all K lights be off.</p>