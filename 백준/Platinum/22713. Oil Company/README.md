# [Platinum III] Oil Company - 22713

[문제 링크](https://www.acmicpc.net/problem/22713)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 5, 맞힌 사람: 3, 정답 비율: 18.750%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Irving &amp; Cohen Petroleum Corporation has decided to develop a new oil field in an area. A preliminary survey has been done and they created a detailed grid map of the area which indicates the reserve of oil.</p>

<p>They are now planning to construct mining plants on several grid blocks according this map, but they decided not to place any two plants on adjacent positions to avoid spreading of fire in case of blaze. Two blocks are considered to be adjacent when they have a common edge. You are one of the programmers working for the company and your task is to write a program which calculates the maximum amount of oil they can mine, given the map of the reserve.</p>

### 입력

<p>The first line of the input specifies N, the number of test cases. Then&nbsp;<i>N</i>&nbsp;test cases follow, each of which looks like the following:</p>

<pre>
<i>W H</i>
<i>r</i><sub>1,1</sub> <i>r</i><sub>2,1</sub> . . . <i>r</i><sub><i>W</i>,1</sub>
...
<i>r</i><sub>1,<i>H</i></sub> <i>r</i><sub>2,<i>H</i></sub> . . . <i>r</i><sub><i>W</i>,<i>H</i></sub>
</pre>

<p>The first line of a test case contains two integers&nbsp;<i>W</i>&nbsp;and&nbsp;<i>H</i>&nbsp;(1 &le;&nbsp;<i>W</i>,&nbsp;<i>H</i>&nbsp;&le; 20). They specifies the dimension of the area. The next&nbsp;<i>H</i>&nbsp;lines, each of which contains&nbsp;<i>W</i>&nbsp;integers, represent the map of the area. Each integer&nbsp;<i>r</i><sub><i>x</i>,<i>y</i></sub>&nbsp;(0 &le;&nbsp;<i>r</i><sub><i>x</i>,<i>y</i></sub>&nbsp;&lt; 10000) indicates the oil reserve at the grid block (<i>x</i>,&nbsp;<i>y</i>).</p>

### 출력

<p>For each test case, output the case number (starting from 1) and the maximum possible amount of mining in a line. Refer to the sample output section about the format.</p>