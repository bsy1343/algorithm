# [Platinum II] Arcade! - 13289

[문제 링크](https://www.acmicpc.net/problem/13289)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 가우스 소거법, 그래프 이론, 선형대수학, 수학

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13289/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-30%20%EC%98%A4%ED%9B%84%206.42.39.png" style="height:205px; width:314px" /></p>

<p>Have you recently visited an arcade? Arcade games seem to have become more boring over the years, requiring less and less skill. In fact, most arcade games these days seem to depend entirely on luck. Consider the arcade game shown in the picture, which consists of different holes arranged in a triangular shape. A ball is dropped near the hole at the top. The ball either falls into the hole, in which case the game ends, or it bounces to one of its (up to) 4 neighbors, denoted by the red arrows. Different holes have different payouts &mdash; some may even be negative! If the ball reaches another hole, the process repeats: the ball either falls into the hole, ending the game &mdash; or it bounces to one of its neighbors, possibly ad infinitum!</p>

<p>Write a program that computes the expected payout when dropping a ball into the machine!</p>

### 입력

<p>The input consists of a single test case. The first line contains an integer N (1 &le; N &le; 32) describing the number of rows of the arcade machine. The second line contains H = N(N + 1)/2 integers v<sub>i</sub> (&minus;100 &le; v<sub>i</sub> &le; 100) describing the payout (positive or negative) if the ball drops into hole i. Holes are numbered such that hole 1 is in the first row, holes 2 and 3 are in the second row, etc. The k<sup>th</sup> row starts&nbsp;with hole number k(k &minus; 1)/2 + 1 and contains exactly k holes.</p>

<p>These two lines are followed by H lines, each of which contains 5 real numbers p<sub>0</sub> p<sub>1</sub> p<sub>2 </sub>p<sub>3</sub> p<sub>4</sub>, denoting the probability that the ball bounces to its top-left (p<sub>0</sub>), top-right (p<sub>1</sub>), bottom-left (p<sub>2</sub>), or bottom-right (p<sub>3</sub>) neighbors or that the ball enters the hole (p<sub>4</sub>). Each probability is given with at most 3 decimal digits after the period. It is guaranteed that 0.0 &le; p<sub>i</sub> &le; 1.0 and &Sigma;p<sub>i</sub> = 1.0. If a hole does not have certain neighbors because it is located near the boundary of the arcade machine, the probability of bouncing to these non-existent neighbors is always zero. For instance, for hole number 1, the probabilities to jump to the top-left and top-right neighbors are both given as 0.0.</p>

<p>You can assume that after the ball has bounced b times, the probability that it has not fallen into a hole is at most (1 &minus; 10<sup>&minus;3</sup>)<sup>[b/H]</sup>.</p>

### 출력

<p>Output a single number, the expected value from playing one game. Your answer is considered correct if its absolute or relative error is less than 10<sup>&minus;4</sup>.</p>

<p>Hint: Using Monte Carlo-style simulation (throwing many balls in the machine and simulating which hole they fall into using randomly generated choices) does not yield the required accuracy!</p>