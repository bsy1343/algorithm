# [Gold III] The Right-Turn Drivers' Club - 8115

[문제 링크](https://www.acmicpc.net/problem/8115)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 14, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 역추적

### 문제 설명

<p>We are given a rectangular city map comprising n&nbsp;&middot;&nbsp;m&nbsp;squares (1 &le; n &le; 100&nbsp;and 1 &le; m &le; 100). The rows of squares of the map are numbered successively from top to bottom by numbers from 1&nbsp;to n, and the columns from left to right successively from 1&nbsp;to m. Each square is either free or blocked. Vehicular traffic is allowed only on free squares. From each free square one may move to a free square adjacent to it (i.e. a square that shares a side with it), however one is not allowed to turn back, i.e. to go back to a square X&nbsp;immediately after moving from X&nbsp;to an adjacent square Y.</p>

<p>The Right-Turn Drivers&#39; Club ordered a computer program, which for any two different squares A&nbsp;and B&nbsp;decides whether it is possible to drive from A&nbsp;to B&nbsp;without turning left, and if so, the program finds such a route with the minimal length. The length of a route is the number of all its squares. The squares A&nbsp;and B&nbsp;are also considered squares of the route from A&nbsp;to B.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input data on a rectangular network of squares (i.e. the number of rows n, the number of columns m&nbsp;and the state of each square), and next the coordinates of two different squares A&nbsp;and B;</li>
	<li>decides whether there exists a route without left turns from A&nbsp;to B. If not, the program writes one word&nbsp;<code>NIE</code>&nbsp;(&quot;<i>no</i>&quot;) in the standard output. If so, the program finds one of the shortest routes without left turns and writes it in the standard output. If at least one of the squares A, B&nbsp;is not free, then the answer is&nbsp;<code>NIE</code>.</li>
</ul>

### 입력

<p>In the first line of the standard input there are two integers separated by a single space: the number of rows n&nbsp;and the number of columns m. In each of the following n&nbsp;lines of the file there is a description of the corresponding row of the map. Such a description has a form of one word of length m&nbsp;consisting of digits 0&nbsp;and 1. The digit 0&nbsp;means that the corresponding square is free, and the digit 1&nbsp;that it is blocked.</p>

<p>Next, in one line, there are two coordinates of the square A, separated by a single space: the row number not greater than n&nbsp;and the column number not greater than m. In the following line there are two coordinates of the square B, written the same way.</p>

<p>The data in the standard input are written correctly and your program need not verify that.</p>

### 출력

<p>The following should be written in the standard output:</p>

<ul>
	<li>either one word&nbsp;<code>NIE</code>, if there exist no route without left turns from A&nbsp;to B&nbsp;or at least one of the squares A, B&nbsp;is blocked.</li>
	<li>or a description of one of the routes with no left turns from A&nbsp;to B&nbsp;having the minimal length; in that case one should write the length of the route d&nbsp;in the first line, and in each of the following d&nbsp;lines - two coordinates of the successive square of the route, separated by a single space.</li>
</ul>