# [Gold III] Elegant Diamond (Large) - 12564

[문제 링크](https://www.acmicpc.net/problem/12564)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>The king has hired you to make him an elegant diamond. An elegant diamond is a two-dimensional object made out of digits that&#39;s symmetric about a horizontal and a vertical axis. For example, the following four shapes are elegant diamonds:</p>

<pre>
   2       8      3     7
  3 3     8 8    2 2
 4 1 4     8      3
  3 3 
   2
</pre>

<p>These three shapes are diamonds, but are not elegant:</p>

<pre>
  2       1        3
 1 1     1 2      1 1
  1     1 1 1    3 1 3
         2 1      1 1
          1        2
</pre>

<p>These three shapes are not diamonds:</p>

<pre>
  1     2     8   8
 1 1   222      0
        2     00000
</pre>

<p>The king will start by giving you a diamond, which may not be elegant. Your job is to make it elegant by&nbsp;&nbsp;<em>enhancing</em>&nbsp;it, adding digits on to make a bigger diamond. Because you don&#39;t want to spend too much money, you want to do it with as little&nbsp;<em>cost</em>&nbsp;as possible.</p>

<h3>Definitions</h3>

<p>A&nbsp;<strong>diamond of size&nbsp;<em>k</em></strong>&nbsp;is 2k-1 lines of digits, 0-9, separated by single spaces, organized in the following way:</p>

<ul>
	<li>Line i (1 &le; i &le; k) contains k-i spaces, then i digits separated by single spaces.</li>
	<li>Line i (k &lt; i &lt; 2k) contains i-k spaces, then 2k-i digits separated by single spaces.</li>
</ul>

<p>An&nbsp;<strong>elegant diamond of size&nbsp;<em>k</em></strong>&nbsp;is a diamond of size k with the following two symmetry properties:</p>

<ul>
	<li>Horizontal symmetry: Let c<sub>i</sub>&nbsp;be the number of digits on line i. The j<sup>th</sup>&nbsp;digit on line i (where j=1 for the first digit) must be the same as the c<sub>i</sub>+1-j<sup>th</sup>&nbsp;digit.</li>
	<li>Vertical symmetry: The j<sup>th</sup>&nbsp;digit on line i (where i=1 for the first line) must be the same as the j<sup>th</sup>&nbsp;digit on line 2k-i.</li>
</ul>

<p>A diamond of size k can be&nbsp;<strong>enhanced</strong>&nbsp;by adding digits to it. The result of enhancing a diamond of size k has the following properties:</p>

<ul>
	<li>The result is a diamond of size &ge; k.</li>
	<li>The original diamond is part of the result. In other words, there exist some X and some Y such that, for all values of i and j such that the j<sup>th</sup>&nbsp;character of the i<sup>th</sup>&nbsp;line of the original is a digit (as opposed to a space), the j+X<sup>th</sup>&nbsp;character on the i+Y<sup>th</sup>&nbsp;line of the result is also a digit and it&#39;s the same as the j<sup>th</sup>&nbsp;character on the i<sup>th</sup>&nbsp;line of the original.</li>
</ul>

<p>The&nbsp;<strong>cost</strong>&nbsp;of enhancing a diamond is equal to the number of digits in the result of the enhancement, minus the number of digits in the original diamond.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of a single integer&nbsp;<strong>k</strong>&nbsp;in a line on its own, followed by a diamond of size&nbsp;<strong>k</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>k</strong>&nbsp;&le; 51.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum cost required to enhance the given diamond into an elegant diamond. If the diamond is already elegant, y=0.</p>

### 힌트

<p>There are four cases. The first two cases start as elegant diamonds of size 1 and 2, respectively, and don&#39;t need to be enhanced; so the cost is 0. The third case can be enhanced to look like:</p>

<pre>
  3
 1 1
1 2 1
 1 1
  3
</pre>

<p>There are several possible enhancements, but this is one with the lowest possible cost, which is 5. In the fourth case we can enhance the diamond into the following elegant diamond:</p>

<pre>
   9
  1 1
 6 3 6
9 5 5 9
 6 3 6
  1 1
   9
</pre>

<p>...for a cost of 7.</p>