# [Silver V] Multi-base happiness (Small) - 12649

[문제 링크](https://www.acmicpc.net/problem/12649)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 82, 맞힌 사람: 43, 정답 비율: 60.563%

### 분류

구현, 브루트포스 알고리즘, 집합과 맵

### 문제 설명

<p>Given an integer N, replace it by the sum of the squares of its digits. A happy number is a number where, if you apply this process repeatedly, it eventually results in the number 1. For example, if you start with 82:</p>

<pre>
8*8 + 2*2       = 64 + 4    = 68,  repeat:
6*6 + 8*8       = 36 + 64   = 100, repeat:
1*1 + 0*0 + 0*0 = 1 + 0 + 0 = 1 (happy! :)
</pre>

<p>Since this process resulted in 1, 82 is a happy number.</p>

<p>Notice that a number might be happy in some bases, but not happy in others. For instance, the base 10 number 82 is not a happy number when written in base 3 (as 10001).</p>

<p>You are one of the world&#39;s top number detectives. Some of the bases got together (yes, they are organized!) and hired you for an important task: find out what&#39;s the smallest integer number that&#39;s greater than 1 and is happy in all the given bases.</p>

### 입력

<p>The first line of input gives the number of cases&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case consists of a single line. Each line contains a space separated list of distinct integers, representing the bases. The list of bases is always in increasing order.</p>

<p>Limits</p>

<ul>
	<li>2 &le; all possible input bases &le; 10</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 42</li>
	<li>2 &le; number of bases on each test case &le; 3</li>
</ul>

### 출력

<p>For each test case, output:&nbsp;</p>

<pre>
Case #<strong>X</strong>: <strong>K</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>K</strong>&nbsp;is the decimal representation of the smallest integer (greater than 1) which is happy in all of the given bases.</p>