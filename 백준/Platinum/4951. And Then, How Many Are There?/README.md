# [Platinum III] And Then, How Many Are There? - 4951

[문제 링크](https://www.acmicpc.net/problem/4951)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 24, 맞힌 사람: 10, 정답 비율: 34.483%

### 분류

다이나믹 프로그래밍, 기하학, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 비트 집합

### 문제 설명

<p>To Mr. Solitarius, who is a famous solo play game creator, a new idea occurs like every day. His new game requires discs of various colors and sizes.</p>

<p>To start with, all the discs are randomly scattered around the center of a table. During the play, you can remove a pair of discs of the same color if neither of them has any discs on top of it. Note that a disc is not considered to be on top of another when they are externally tangent to each other.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4951/D-1.png" style="height:105px; width:130px" /></p>

<p style="text-align: center;">Figure D-1: Seven discs on the table</p>

<p>For example, in Figure D-1, you can only remove the two black discs first and then their removal makes it possible to remove the two white ones. In contrast, gray ones never become removable.</p>

<p>You are requested to write a computer program that, for given colors, sizes, and initial placings of discs, calculates the maximum number of discs that can be removed.</p>

### 입력

<p>The input consists of multiple datasets, each being in the following format and representing the state of a game just after all the discs are scattered.</p>

<pre>
n
x<sub>1</sub> y<sub>1</sub> r<sub>1</sub> c<sub>1</sub>
x<sub>2</sub> y<sub>2</sub> r<sub>2</sub> c<sub>2</sub>
...
x<sub>n</sub> y<sub>n</sub> r<sub>n</sub> c<sub>n</sub></pre>

<p>The first line consists of a positive integer n representing the number of discs. The following n lines, each containing 4 integers separated by a single space, represent the colors, sizes, and initial placings of the n discs in the following manner:</p>

<ul>
	<li>(x<sub>i</sub>, y<sub>i</sub>), r<sub>i</sub>, and c<sub>i</sub> are the xy-coordinates of the center, the radius, and the color index number, respectively, of the i-th disc, and</li>
	<li>whenever the i-th disc is put on top of the j-th disc, i &lt; j must be satisfied.</li>
</ul>

<p>You may assume that every color index number is between 1 and 4, inclusive, and at most 6 discs in a dataset are of the same color. You may also assume that the x- and y-coordinates of the center of every disc are between 0 and 100, inclusive, and the radius between 1 and 100, inclusive.</p>

<p>The end of the input is indicated by a single zero.</p>

### 출력

<p>For each dataset, print a line containing an integer indicating the maximum number of discs that can be removed.</p>