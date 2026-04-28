# [Gold V] Watson and Intervals (Small) - 14318

[문제 링크](https://www.acmicpc.net/problem/14318)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 23, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

브루트포스 알고리즘, 정렬, 스위핑

### 문제 설명

<p>Sherlock and Watson have mastered the intricacies of the language C++ in their programming course, so they have moved on to algorithmic problems. In today&#39;s class, the tutor introduced the problem of merging one-dimensional intervals.&nbsp;N&nbsp;intervals are given, and the&nbsp;<code>i</code>th interval is defined by the inclusive endpoints [L<sub>i</sub>, R<sub>i</sub>], where&nbsp;L<sub>i</sub>&nbsp;&le; R<sub>i</sub>.&nbsp;</p>

<p>The tutor defined the&nbsp;covered area&nbsp;of a set of intervals as the number of integers appearing in at least one of the intervals. (Formally, an integer p contributes to the covered area if there is some j such that&nbsp;L<sub>j</sub>&nbsp;&le;&nbsp;<code>p</code>&nbsp;&le;&nbsp;R<sub>j</sub>.)&nbsp;</p>

<p>Now, Watson always likes to challenge Sherlock. He has asked Sherlock to remove exactly one interval such that the covered area of the remaining intervals is minimized. Help Sherlock find this minimum possible covered area, after removing exactly one of the&nbsp;N&nbsp;intervals.</p>

### 입력

<p>Each test case consists of one line with eight integers&nbsp;N,&nbsp;L<sub>1</sub>, R<sub>1</sub>,&nbsp;A,&nbsp;B,&nbsp;C<sub>1</sub>,&nbsp;C<sub>2</sub>, and&nbsp;M.&nbsp;N&nbsp;is the number of intervals, and the other seven values are parameters that you should use to generate the other intervals, as follows:&nbsp;</p>

<p>First define&nbsp;<code>x<sub>1</sub></code>&nbsp;=&nbsp;L<sub>1</sub>&nbsp;and&nbsp;<code>y<sub>1</sub></code>&nbsp;=&nbsp;R<sub>1</sub>. Then, use the recurrences below to generate&nbsp;<code>x<sub>i</sub>, y<sub>i</sub></code>&nbsp;for&nbsp;<code>i</code>&nbsp;= 2 to&nbsp;N:</p>

<ul>
	<li><code>x<sub>i</sub></code>&nbsp;= (&nbsp;A*<code>x<sub>i-1</sub></code>&nbsp;+&nbsp;B*<code>y<sub>i-1</sub></code>&nbsp;+&nbsp;C<sub>1</sub>&nbsp;) modulo&nbsp;M.</li>
	<li><code>y<sub>i</sub></code>&nbsp;= (&nbsp;A*<code>y<sub>i-1</sub></code>&nbsp;+&nbsp;B*<code>x<sub>i-1</sub></code>&nbsp;+&nbsp;C<sub>2</sub>&nbsp;) modulo&nbsp;M.</li>
</ul>

<p>We define&nbsp;L<sub>i</sub>&nbsp;=&nbsp;<code>min(x<sub>i</sub>, y<sub>i</sub>)</code>&nbsp;and&nbsp;R<sub>i</sub>&nbsp;=&nbsp;<code>max(x<sub>i</sub>, y<sub>i</sub>)</code>, for all&nbsp;<code>i</code>&nbsp;= 2 to&nbsp;N.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum possible covered area of all of the intervals remaining after removing exactly one interval.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 50.</li>
	<li>0 &le;&nbsp;L<sub>1</sub>&nbsp;&le;&nbsp;R<sub>1</sub>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>0 &le;&nbsp;A&nbsp;&le; 10<sup>9</sup>.</li>
	<li>0 &le;&nbsp;B&nbsp;&le; 10<sup>9</sup>.</li>
	<li>0 &le;&nbsp;C<sub>1</sub>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>0 &le;&nbsp;C<sub>2</sub>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;M&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 1000.</li>
</ul>

### 힌트

<p>In case 1, using the generation method, the set of intervals generated are: {[1, 1]}. Removing the only interval, the&nbsp;<em>covered area</em>&nbsp;is 0.</p>

<p>In case 2, using the generation method, the set of intervals generated are: {[2, 5], [3, 5], [4, 7]}. Removing the first, second or third interval would cause the covered area of remaining intervals to be 5, 6 and 4, respectively.</p>

<p>In case 3, using the generation method, the set of intervals generated are: {[3, 4], [1, 9], [0, 8], [2, 4]}. Removing the first, second, third or fourth interval would cause the covered area of remaining intervals to be 10, 9, 9 and 10, respectively.</p>