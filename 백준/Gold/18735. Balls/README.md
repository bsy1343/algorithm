# [Gold IV] Balls - 18735

[문제 링크](https://www.acmicpc.net/problem/18735)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 116, 정답: 53, 맞힌 사람: 49, 정답 비율: 45.794%

### 분류

애드 혹

### 문제 설명

<p>Zenyk placed n balls in a row on a table, and the i-th ball is colored in color c<sub>i</sub>. Now Marichka is going to play with Zenyk&rsquo;s balls.</p>

<p>In a single turn, she can pick a sequence of consecutive balls which has a dominant color. After that, all selected balls that are colored in a different color than the dominant will be removed.</p>

<p>Marichka wants to make some number of turns (possibly zero) after which all remaining balls will be colored in the same color. Find out how many different colors could be left at the end.</p>

<p>Color is considered dominant if more than half of the selected balls are colored in it.</p>

### 입력

<p>The first line contains a single integer n (1 &le; n &le; 10<sup>5</sup>) &mdash; the number of balls. The second line contains a list of n space-separated integers c<sub>i</sub> (1 &le; c<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the initial colors of the balls in the order they are placed on the table.</p>

### 출력

<p>In the only line print a single integer &mdash; the answer to the problem.</p>