# [Gold III] Tetris Alphabet - 7858

[문제 링크](https://www.acmicpc.net/problem/7858)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 15, 맞힌 사람: 13, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>The game of Tetris is played with four-connected blocks falling down the well having N rows and 20 columns. Each figure is marked with a unique English letter from &lsquo;A&rsquo; to &lsquo;Z&rsquo;.</p>

<p>Your program must, given the state of the well, determine the order in which the blocks fell down.</p>

### 입력

<p>The first line of input file contains integer N (1 &le; N &le; 50) &mdash; number of rows. Following N lines contain 20 characters each, with characters that are either a letter from &lsquo;A&rsquo; to &lsquo;Z&rsquo; or the dot character (ASCII 46), representing an empty cell.</p>

### 출력

<p>Output file must contain a string of letters indicating the order in which figures fell down. If there is more than one order, lexicographically smallest one must be printed. Input data will guarantee that at least one nonempty order exists.</p>