# [Bronze II] Count <s>Down</s> Up 2020 - 20224

[문제 링크](https://www.acmicpc.net/problem/20224)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 239, 정답: 205, 맞힌 사람: 186, 정답 비율: 86.916%

### 분류

구현

### 문제 설명

<p>The countdown to the Olympic and Paralympic Games Tokyo 2020 continues until summer 2021. That aside, you are asked to count up the occurrences of the four integers 2, 0, 2, and 0 appearing consecutively in this order in given lists of integers.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<blockquote><i>n</i> <i>d</i><sub>1</sub>&nbsp;&hellip;&nbsp;<i>d</i><sub><i>n</i></sub></blockquote>

<p>Each of the datasets consists of two lines. The first line has an integer&nbsp;<i>n</i>&nbsp;(4 &le;&nbsp;<i>n</i>&nbsp;&le; 1000), which is the number of integers listed in the second line. The second line contains&nbsp;<i>n</i>&nbsp;integers&nbsp;<i>d</i><sub>1</sub>, &hellip;,&nbsp;<i>d<sub>n</sub></i>&nbsp;separated by spaces. Here, all of&nbsp;<i>d</i><sub>1</sub>&nbsp;to&nbsp;<i>d<sub>n</sub></i>&nbsp;are between 0 and 9, inclusive.</p>

<p>The end of the input is indicated by a line containing a zero.</p>

<p>The number of datasets does not exceed 100.</p>

### 출력

<p>For each of the datasets, output one line containing the number of times the four integers&nbsp;<code>2</code>,&nbsp;<code>0</code>,&nbsp;<code>2</code>, and&nbsp;<code>0</code>&nbsp;appear consecutively in this order in the list of integers in its second line. Overlapping occurrences are separately counted. &ldquo;<code>2 0 2 0 2 0 2 0</code>&rdquo;, for example, is said to have three occurrences, rather than two.</p>