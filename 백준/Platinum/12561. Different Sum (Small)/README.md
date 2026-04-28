# [Platinum V] Different Sum (Small) - 12561

[문제 링크](https://www.acmicpc.net/problem/12561)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

백트래킹, 구현

### 문제 설명

<p>We have come up with a wonderful problem for Google Code Jam 2010 that involves contestants solving a cryptarithm. But we need your help in creating testcases for the problem; more precisely, we&#39;re concerned with addition equations that are good enough (in the sense defined below) for conversion into cryptarithms.&nbsp;</p>

<p>You don&#39;t need to know what a cryptarithm is to solve this problem, as we&#39;ll provide all required definitions. We define a&nbsp;<em>cryptarithm equation</em>&nbsp;to be an addition equation written in such a way that all summands (numbers being added) and the sum are aligned to the same right border like this:</p>

<pre>
124
 31
 25
---
180</pre>

<p>Additionally, for each column of a cryptarithm equation, all digits of the summands in that column must be different. Note that we don&#39;t include the sum in this constraint. So for example in the above equation the first column contains only digit 1, the second column contains digits 2,3 and 2, and the third column contains digits 4, 1 and 5. This equation is not a cryptarithm equation since the second column contains two 2&#39;s. However, it would be a cryptarithm equation if we replaced the last summand with 15 (and the sum with 170).</p>

<p>Note that summands in a cryptarithm equation are always positive and written without leading zeros. The order of summands is not important (in other words, two equations which differ only in the order of the summands are considered the same).</p>

<p>The example above was in base 10, but we&#39;re also interested in cryptarithm equations in other bases. Note that a &quot;digit&quot; in base b could mean any integer between 0 and b-1. Here is a cryptarithm equation in base 23:</p>

<pre>
 I7B
 JJJ
----
1F47
</pre>

<p>In this example, &quot;I&quot; stands for digit 18, &quot;B&quot; stands for digit 11, &quot;J&quot; stands for digit 19, and &quot;F&quot; stands for digit 15. In decimal notation, the two summands are 18*23<sup>2</sup>&nbsp;+ 7*23 + 11 = 9694 and 19*23<sup>2</sup>&nbsp;+ 19*23 + 19 = 10507, and the sum is 1*23<sup>3</sup>&nbsp;+ 15*23<sup>2</sup>&nbsp;+ 4*23 + 7 = 20201. Please note that denoting digits of 10 and more with letters was done purely for the clarity of the example; it doesn&#39;t really matter in this problem how exactly we denote such digits in writing.</p>

<p>How many cryptarithm equations are there with the given sum&nbsp;<strong>N</strong>&nbsp;in the given base&nbsp;<strong>B</strong>?</p>

<p>Since the answer might be very large, please output it modulo 1000000007.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each contains two positive integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>B</strong>. All input numbers are given in base 10.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>B</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of different cryptarithm equations with the given sum. Since this number can be very big, please output it modulo 1000000007. Of course, the output itself should be in base 10.</p>

### 힌트

<p>Here are the 4 cryptarithm equations with sum 6:</p>

<pre>
6   1   2   1
-   5   4   2
6   -   -   3
     6   6   -
               6
</pre>

<p>And here are the 4 cryptarithm equations in base 4 with sum 8=20<sub>4</sub>:</p>

<pre>
20   11   13   10
--    3    1    3
20   --   --    1
      20   20   --
                   20</pre>