# [Silver IV] Road Net - 8073

[문제 링크](https://www.acmicpc.net/problem/8073)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 155, 정답: 111, 맞힌 사람: 81, 정답 비율: 71.681%

### 분류

그래프 이론, 브루트포스 알고리즘

### 문제 설명

<p>A diskette was enclosed to a road map. The diskette contains the table of the shortest ways (distances) between each pair of towns on the map. All the roads are two-way. The location of towns on the map has the following interesting property: if the length of the shortest way from town A&nbsp;to town B&nbsp;equals the sum of the lengths of the shortest ways from A&nbsp;to C&nbsp;and C&nbsp;to B&nbsp;then town C&nbsp;lies on (certain) shortest way from A&nbsp;to B. We say that towns A&nbsp;and B&nbsp;are neighbouring towns if there is no town C&nbsp;such that the length of the shortest way from A&nbsp;to B&nbsp;equals the sum of the lengths of the shortest ways from A&nbsp;to C&nbsp;and C&nbsp;to B.</p>

<p>Find all the pairs of neighbouring towns.</p>

<p>For the table of distances:</p>

<pre>
  A B C
A 0 1 2
B 1 0 3
C 2 3 0
</pre>

<p>the neighbouring towns are A, B&nbsp;and A, C.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the table of distances from the standard input;</li>
	<li>finds all the pairs of neighbouring towns;</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is an integer n, 1 &le; n &le; 200, which equals the number of towns on the map. Towns are numbered from 1&nbsp;to n.</p>

<p>The table of distances is written in the following n&nbsp;lines. In the (i+1)-st line, 1 &le; i &le; n, there are n&nbsp;non-negative integers not greater than 200, separated by single spaces. The j-th integer is the distance between towns i&nbsp;and j.</p>

### 출력

<p>Your program should write all the pairs of the neighbouring towns (i.e. their numbers) to the standard output. There should be one pair in each line. Each pair can appear only once. The numbers in each pair should be given in increasing order. Pairs should be ordered so that if the pair (a, b)&nbsp;precedes the pair (c, d)&nbsp;then a &lt; c&nbsp;or (a = c&nbsp;and b &lt; d).</p>