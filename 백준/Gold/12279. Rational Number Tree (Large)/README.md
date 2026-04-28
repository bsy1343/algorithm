# [Gold IV] Rational Number Tree (Large) - 12279

[문제 링크](https://www.acmicpc.net/problem/12279)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 192, 정답: 95, 맞힌 사람: 91, 정답 비율: 49.189%

### 분류

수학, 트리

### 문제 설명

<p>Consider an infinite complete binary tree where the root node is 1/1 and left and right childs of node p/q are p/(p+q) and (p+q)/q, respectively. This tree looks like:</p>

<pre>
         1/1
    ______|______
    |           |
   1/2         2/1
 ___|___     ___|___
 |     |     |     |
1/3   3/2   2/3   3/1
...
</pre>

<p>It is known that every positive rational number appears exactly once in this tree. A level-order traversal of the tree results in the following array:</p>

<pre>
1/1, 1/2, 2/1, 1/3, 3/2, 2/3, 3/1, ...
</pre>

<p>Please solve the following two questions:</p>

<ol>
	<li>Find the&nbsp;<b>n</b>-th element of the array, where&nbsp;<b>n</b>&nbsp;starts from 1. For example, for the input 2, the correct output is 1/2.</li>
	<li>Given&nbsp;<b>p/q</b>, find its position in the array. As an example, the input 1/2 results in the output 2.</li>
</ol>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case consists of one line. The line contains a problem id (1 or 2) and one or two additional integers:</p>

<ol>
	<li>If the problem id is 1, then only one integer&nbsp;<b>n</b>&nbsp;is given, and you are expected to find the&nbsp;<b>n</b>-th element of the array.</li>
	<li>If the problem id is 2, then two integers&nbsp;<b>p</b>&nbsp;and&nbsp;<b>q</b>&nbsp;are given, and you are expected to find the position of&nbsp;<b>p/q</b>&nbsp;in the array.</li>
</ol>

### 출력

<p>For each test case:</p>

<ol>
	<li>If the problem id is 1, then output one line containing &quot;<code>Case #x: p q</code>&quot;, where&nbsp;<code>x</code>&nbsp;is the case number (starting from 1), and&nbsp;<code>p</code>,&nbsp;<code>q</code>&nbsp;are numerator and denominator of the asked array element, respectively.</li>
	<li>If the problem id is 2, then output one line containing &quot;<code>Case #x: n</code>&quot;, where&nbsp;<code>x</code>&nbsp;is the case number (starting from 1), and&nbsp;<code>n</code>&nbsp;is the position of the given number.</li>
</ol>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100;&nbsp;<b>p</b>&nbsp;and&nbsp;<b>q</b>&nbsp;are relatively prime.</li>
	<li>1 &le;&nbsp;<b>n</b>,&nbsp;<b>p</b>,&nbsp;<b>q</b>&nbsp;&le; 2<sup>64</sup>-1;&nbsp;<b>p</b>/<b>q</b>&nbsp;is an element in a tree with level number &le; 64.</li>
</ul>