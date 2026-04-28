# [Platinum II] Faraway - 18591

[문제 링크](https://www.acmicpc.net/problem/18591)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 12, 맞힌 사람: 12, 정답 비율: 42.857%

### 분류

수학, 구현, 브루트포스 알고리즘, 애드 혹, 기하학, 정수론, 많은 조건 분기, 비트마스킹, 백트래킹

### 문제 설명

<p>A squad of n soldiers is dispatched to somewhere in Byteland. Currently, i-th soldier is at location (x<sub>i</sub>, y<sub>i</sub>). The soldiers are going to set off now, but the target location is not so clear.</p>

<p>Assume the target location is at (x<sub>e</sub>, y<sub>e</sub>). It is clear for all soldiers that x<sub>e</sub> and y<sub>e</sub> are both non-negative integers within the range [0, m]. Apart from that, for i-th soldier, the only thing he knows is that (|x<sub>i</sub> &minus; x<sub>e</sub>| + |y<sub>i</sub> &minus; y<sub>e</sub>|) mod k<sub>i</sub> = t<sub>i</sub>.</p>

<p>To find the correct target location, these soldiers are working on the information they have now. Please write a program to figure out the number of possible target locations.</p>

### 입력

<p>The first line of the input contains an integer T (1 &le; T &le; 10), denoting the number of test cases.</p>

<p>Each test case starts with a line containing two integers n and m (1 &le; n &le; 10, 1 &le; m &le; 10<sup>9</sup>), denoting the number of soldiers and the upper bound for x<sub>e</sub> and y<sub>e</sub>.</p>

<p>Each of the next n lines contains four integers, x<sub>i</sub>, y<sub>i</sub>, k<sub>i</sub>, and t<sub>i</sub> (0 &le; x<sub>i</sub>, y<sub>i</sub> &le; m, 2 &le; k<sub>i</sub> &le; 5, 0 &le; t<sub>i</sub> &lt; k<sub>i</sub>), denoting what i-th soldier knows.</p>

### 출력

<p>For each test case, print a single line containing a single integer: the number of possible target locations.</p>