# [Platinum II] Funfair - 13068

[문제 링크](https://www.acmicpc.net/problem/13068)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 139, 정답: 39, 맞힌 사람: 28, 정답 비율: 25.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>We are going to a funfair where there are n games G<sub>1</sub>, . . . , G<sub>n</sub>. We want to play k games out of the n games, and we can choose the order in which we play them&mdash;note that we cannot play any game more than once. We have to specify these k games and their order before starting any game.</p>

<p>At each point in time, we have some amount of money, which we use in playing the games. At the beginning, we have x<sub>0</sub> Oshloobs of money. If before playing game G<sub>i</sub>, we have x Oshloobs and we win in G<sub>i</sub>, our money increases to x+A<sub>i</sub> for some A<sub>i</sub> &ge;&nbsp;0. If we have x Oshloobs before playing game G<sub>i</sub> and we lose in G<sub>i</sub>, we lose L<sub>i</sub> percent of x. The probability that we win game G<sub>i</sub> (independently of other games) is P<sub>i</sub> percents.</p>

<p>The goal is to play k of the games in such an order to maximize the expected amount of money we end up with after playing all k selected games in that order.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains three space-separated integers n, k, and x<sub>0</sub> (1 &le; k &le; n &le; 100, 0 &le; x<sub>0</sub> &le; 10<sup>6</sup>). Each of the next n lines specifies the properties of game G<sub>i</sub> with three space-separated integers A<sub>i</sub>, L<sub>i</sub>, and P<sub>i</sub> (0 &le; A<sub>i</sub>, L<sub>i</sub>, P<sub>i</sub> &le; 100). The input terminates with a line containing 0 0 0 which should not be processed.</p>

### 출력

<p>For each test case, output a single line containing the maximum expected amount of our final money rounded to exactly two digits after the decimal point.</p>