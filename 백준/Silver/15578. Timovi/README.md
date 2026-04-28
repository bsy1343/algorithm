# [Silver II] Timovi - 15578

[문제 링크](https://www.acmicpc.net/problem/15578)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 164, 정답: 75, 맞힌 사람: 67, 정답 비율: 48.551%

### 분류

구현, 수학

### 문제 설명

<p>We need to arrange M kids in N teams. We begin by placing K kids in each team, starting from the first to the N<sup>th</sup> team. When we finish with the N<sup>th</sup> team, we switch directions and continue, placing K kids in each team, from the (N-1)<sup>th</sup> to the first team, respectively. When we finish with the first team, we switch directions again and continue the process from the second to the N<sup>th</sup> team, respectively, and so on until there are no kids left to distribute. For example, if we have three teams, we will place K kids in teams in the following order: first team, second team, third team, second team, first team, second team, etc.</p>

<p>If, at any points, there are less than K kids left to place in the current team, we place all the remaining kids in that team and end the process.</p>

<p>Output the number of kids in each team when the process ends.</p>

### 입력

<p>The first line of input contains the integers N (2 &le; N &le; 200 000), K and M (1 &le; K &le; M &le; 2 000 000 000) from the task.</p>

### 출력

<p>In a single line, output the number of kids in each of the N teams, respectively from the first to the N<sup>th</sup> team.</p>