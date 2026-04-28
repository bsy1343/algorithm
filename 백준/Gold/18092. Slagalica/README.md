# [Gold II] Slagalica - 18092

[문제 링크](https://www.acmicpc.net/problem/18092)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

많은 조건 분기, 그리디 알고리즘, 구현

### 문제 설명

<p>Little Fabian got a one-dimensional jigsaw puzzle that consists of N pieces. He quickly realized that each piece belongs to one of the following types:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cfb5dd5a-c12b-43a0-8daf-a0c918651ec5/-/preview/" style="width: 387px; height: 175px;" /></p>

<p>Additionally, it is known that among those N pieces there is exactly one piece of either type 5 or type 6 (left border) and exactly one piece of either type 7 or type 8 (right border).</p>

<p>Fabian wishes to arrange all of the pieces into a single row such that the first (leftmost) piece is of type 5 or 6 and the last (rightmost) piece is of type 7 or 8. Two pieces can be placed next to each other if and only if their neighbouring borders are of different shapes, i.e., one has a bump (also called <em>outie</em> or <em>tab</em>) and the other has a hole (also called <em>innie</em> or <em>blank</em>).</p>

<p>Simply solving the puzzle would be too easy for Fabian so he decided to write a unique positive integer on each of the pieces. Now he is interested in finding the lexicographically smallest solution to the jigsaw puzzle. The solution A is considered lexicographically smaller than solution B if at the first position (from the left) i where they differ it holds that the number written on i-th puzzle in A is smaller than the number written on i-th puzzle in B.</p>

<p>Note: the pieces cannot be rotated.</p>

### 입력

<p>The first line contains an integer N (2 &le; N &le; 10<sup>5</sup>) from the task description.</p>

<p>The next N lines contain two integers X<sub>i</sub> (1 &le; X<sub>i</sub> &le; 8) and A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>) which represent the type of the i-th piece and the number Fabian wrote on it. All numbers A<sub>i</sub> will be different.</p>

### 출력

<p>If Fabian cannot solve the jigsaw puzzle, you should output &minus;1 in a single line.</p>

<p>Otherwise, you should output the numbers that are written on the pieces in the lexicographically smallest solution to the puzzle.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>There are only two possible solutions to the puzzle:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b9589fd4-b257-4f5c-a88b-5ce71a5c7d32/-/preview/" style="width: 369px; height: 177px;" /></p>

<p>We can see that the second depicted solution has a smaller number written on the second piece. Therefore, that is the lexicographically smallest solution.</p>