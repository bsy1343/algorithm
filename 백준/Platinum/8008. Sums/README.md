# [Platinum I] Sums - 8008

[문제 링크](https://www.acmicpc.net/problem/8008)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 184, 정답: 61, 맞힌 사람: 42, 정답 비율: 37.168%

### 분류

수학, 그래프 이론, 정수론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>We are given a set of positive integers A. Consider a set of non-negative integers A&rsquo;, such that a number x belongs to A&rsquo; if and only if &nbsp;is a sum of some elements from A (the elements may be repeated). For example, if A={2,5,7}, then sample numbers belonging to the set A&rsquo; are: 0 (the sum of 0 elements), 2, 4 (2+2) and 12 (5+7 or 7+5 or 2+2+2+2+2+2); and the following do not belong to A&rsquo;: 1 and 3.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the description of the set A and the sequence of numbers bi,</li>
	<li>for each number b<sub>i</sub> determines whether it belongs to the set A&rsquo;,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line there is one integer n: the number of elements of the set A, 1 &le; n &le; 5,000. The following n lines contain the elements of the set A, one per line. In the (i+1)-st line there is one positive integer a<sub>i</sub>, 1 &le; a<sub>i</sub> &le; 50,000. A={a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>n</sub>}, a<sub>1</sub> &lt; a<sub>2</sub> &lt; &hellip; &lt; a<sub>n</sub>.</p>

<p>In the (n+2)-nd line there is one integer k, 1 &le; k &le; 10,000. Each of the following k lines contains one integer in the range from 0 to 1,000,000,000, they are respectively the numbers b<sub>1</sub>,b<sub>2</sub>,&hellip;,b<sub>k</sub>.</p>

### 출력

<p>The output should consist of k lines. The i-th line should contain the word TAK (&quot;yes&quot; in Polish), if bi belongs to A&rsquo;, and it should contain the word NIE (&quot;no&quot;) otherwise.</p>