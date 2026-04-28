# [Platinum V] Absolute Game - 17965

[문제 링크](https://www.acmicpc.net/problem/17965)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 260, 정답: 176, 맞힌 사람: 158, 정답 비율: 70.852%

### 분류

게임 이론

### 문제 설명

<p>Alice and Bob are playing a game. Alice has an array a of n integers, Bob has an array b of n integers. In each turn, a player removes one element of his array. Players take turns alternately. Alice goes first.</p>

<p>The game ends when both arrays contain exactly one element. Let x be the last element in Alice&rsquo;s array and y be the last element in Bob&rsquo;s array. Alice wants to maximize the absolute difference between x and y while Bob wants to minimize this value. Both players are playing optimally.</p>

<p>Find what will be the final value of the game.</p>

### 입력

<p>The first line contains a single integer n (1 &le; n &le; 1 000) &mdash; the number of values in each array.</p>

<p>The second line contains n space-separated integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the numbers in Alice&rsquo;s array.</p>

<p>The third line contains n space-separated integers b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>n</sub> (1 &le; b<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the numbers in Bob&rsquo;s array.</p>

### 출력

<p>Print the absolute difference between x and y if both players are playing optimally.</p>

### 힌트

<p>In the first example, the x = 14 and y = 10. Therefore, the difference between these two values is 4.</p>

<p>In the second example, the size of the arrays is already 1. Therefore, x = 14 and y = 42.</p>