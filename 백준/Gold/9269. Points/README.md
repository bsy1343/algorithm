# [Gold IV] Points - 9269

[문제 링크](https://www.acmicpc.net/problem/9269)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 133, 정답: 47, 맞힌 사람: 33, 정답 비율: 37.500%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>John is a fan of amusement parks. He goes every weekend and plays different games. This weekend he found a challenging one - it is a target shooting game. The targets are placed along a straight line. For all target positions i (assume the target numbering goes from right to left), there are three possible points that John can win if he chooses that target: a<sub>i</sub>, if there are no neighbor targets chosen, b<sub>i</sub> if one neighbor, and c<sub>i</sub> if two neighbors. Could you help John choose the targets in order to maximize the number of points he can win?</p>

### 입력

<p>The program input is from a text file. It starts with the number n (n &lt; 1000000) of targets. Follows the values of a<sub>i</sub>, b<sub>i</sub>, and c<sub>i</sub> for each target i. (0 &le; a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub> &le; 1,000)</p>

### 출력

<p>The program prints the maximum number of points John can win.</p>

### 힌트

<p>The input data are correct and terminate with an end of file. The program prints the result to the standard output from the beginning of a line.&nbsp;</p>

<p>Input/output samples are in the table below. There are two tests. Each consists of only one target. For the first one n=1, a1=3, b1=0, c1=0, and the maximum number of points is 3. For the second one n=1, a1=1, b1=2, c1=3, and the maximum number of points is 1.The result consists of the maximum number of points John can win, printed from the beginning of the line.</p>