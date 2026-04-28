# [Platinum I] Random Walk - 4856

[문제 링크](https://www.acmicpc.net/problem/4856)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 10, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

정렬, 애드 혹, 기하학, 각도 정렬

### 문제 설명

<p>Random walks are used to model a wide range of phenomena, from Brownian motion to gambling. For example, a gambler who bets on heads or tails on a coin toss wins or loses his bet each turn. The amount of money the gambler has throughout the game is a random walk. Although the bets in each turn may be different, it is easy to see that the gambler wins the maximum amount of money if he wins every turn. Similarly, he loses the maximum amount if he loses every turn.</p>

<p>We consider the following two-dimensional variation of the random walk. We are given&nbsp;<em>n</em>&nbsp;two-dimensional nonzero vectors&nbsp;<em>v<sub>i</sub>&nbsp;= (x<sub>i</sub>, y<sub>i</sub>)</em>, no two of which are parallel. In step&nbsp;<em>i</em>, a coin is flipped. If it is heads, we move&nbsp;<em>x<sub>i</sub></em>meters in the&nbsp;<em>x</em>&nbsp;direction and&nbsp;<em>y<sub>i</sub></em>&nbsp;meters in the&nbsp;<em>y</em>&nbsp;direction. If it is tails, we move&nbsp;<em>-x<sub>i</sub></em>&nbsp;and&nbsp;<em>-y<sub>i</sub></em>&nbsp;meters in the&nbsp;<em>x</em>&nbsp;and&nbsp;<em>y</em>&nbsp;directions.</p>

<p>We are interested in computing the maximum distance we can be away from our starting point. This is easy in one-dimension, but it is not so easy in the two-dimensional version.</p>

### 입력

<p>The input consists of a number of test cases. Each test case starts with a line containing the integer&nbsp;<em>n</em>, which is at most 100. Each of the next&nbsp;<em>n</em>&nbsp;lines gives a pair of integers&nbsp;<em>x<sub>i</sub></em>&nbsp;and&nbsp;<em>y<sub>i</sub></em>&nbsp;specifying&nbsp;<em>v<sub>i</sub></em>. The coordinates are less than 1000 in magnitude. The end of input is specified by&nbsp;<em>n</em>&nbsp;= 0.</p>

### 출력

<p>For each test case, print on a line the maximum distance we can be away from the starting point, in the format shown below. Output the answer to 3 decimal places.</p>