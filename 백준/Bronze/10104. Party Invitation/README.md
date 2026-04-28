# [Bronze II] Party Invitation - 10104

[문제 링크](https://www.acmicpc.net/problem/10104)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 686, 정답: 441, 맞힌 사람: 364, 정답 비율: 69.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You are hosting a party and do not have room to invite all of your friends. You use the following unemotional mathematical method to determine which friends to invite.</p>

<p>Number your friends 1, 2, . . . , K and place them in a list in this order. Then perform m rounds. In each round, use a number to determine which friends to remove from the ordered list.</p>

<p>The rounds will use numbers r<sub>1</sub>, r<sub>2</sub>, . . . , r<sub>m</sub>. In round i remove all the remaining people in positions that are multiples of r<sub>i</sub> (that is, r<sub>i</sub>, 2r<sub>i</sub>, 3r<sub>i</sub>, . . .) The beginning of the list is position 1.</p>

<p>Output the numbers of the friends that remain after this removal process.</p>

### 입력

<p>The first line of input contains the integer K (1 &le; K &le; 100). The second line of input contains the integer m (1 &le; m &le; 10), which is the number of rounds of removal. The next m lines each contain one integer. The ith of these lines (1 &le; i &le; m) contains r<sub>i</sub> (2 &le; r<sub>i</sub> &le; 100) indicating that every person at a position which is multiple of r<sub>i</sub> should be removed.</p>

### 출력

<p>The output is the integers assigned to friends who were not removed. One integer is printed per line in increasing sorted order.</p>