# [Gold V] Googlements (Small) - 14823

[문제 링크](https://www.acmicpc.net/problem/14823)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 27, 맞힌 사람: 20, 정답 비율: 46.512%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Chemists work with periodic table elements, but here at Code Jam, we have been using our advanced number smasher to study&nbsp;<em>googlements</em>. A googlement is a substance that can be represented by a string of at most nine digits. A googlement of length L must contain only decimal digits in the range 0 through L, inclusive, and it must contain at least one digit greater than 0. Leading zeroes are allowed. For example,&nbsp;<code>103</code>&nbsp;and&nbsp;<code>001</code>&nbsp;are valid googlements of length 3.&nbsp;<code>400</code>&nbsp;(which contains a digit, 4, greater than the length of the googlement, 3) and&nbsp;<code>000</code>&nbsp;(which contains no digit greater than 0) are not.</p>

<p>Any valid googlement can appear in the world at any time, but it will eventually decay into another googlement in a deterministic way, as follows. For a googlement of length L, count the number of&nbsp;<code>1</code>s in the googlement (which could be 0) and write down that value, then count the number of&nbsp;<code>2</code>s in the googlement (which could be 0) and write down that value to the right of the previous value, and so on, until you finally count and write down the number of Ls. The new string generated in this way represents the new googlement, and it will also have length L. It is even possible for a googlement to decay into itself!</p>

<p>For example, suppose that the googlement&nbsp;<code>0414</code>&nbsp;has just appeared. This has one&nbsp;<code>1</code>, zero&nbsp;<code>2</code>s, zero&nbsp;<code>3</code>s, and two&nbsp;<code>4</code>s, so it will decay into the googlement&nbsp;<code>1002</code>. This has one&nbsp;<code>1</code>, one&nbsp;<code>2</code>, zero&nbsp;<code>3</code>s, and zero&nbsp;<code>4</code>s, so it will decay into&nbsp;<code>1100</code>, which will decay into&nbsp;<code>2000</code>, which will decay into&nbsp;<code>0100</code>, which will decay into&nbsp;<code>1000</code>, which will continuously decay into itself.</p>

<p>You have just observed a googlement&nbsp;<strong>G</strong>. This googlement might have just appeared in the world, or it might be the result of one or more decay steps. What is the total number of possible googlements it could have been when it originally appeared in the world?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with a string&nbsp;<strong>G</strong>, representing a googlement.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>Each digit in&nbsp;<strong>G</strong>&nbsp;is a decimal digit between 0 and the length of&nbsp;<strong>G</strong>, inclusive.</li>
	<li><strong>G</strong>&nbsp;contains at least one non-zero digit.</li>
	<li>1 &le; the length of&nbsp;<strong>G</strong>&nbsp;&le; 5.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of different googlements that the observed googlement could have been when it first appeared in the world.</p>

### 힌트

<p>In sample case #1, the googlement could have originally been&nbsp;<code>20</code>, or it could have decayed from&nbsp;<code>11</code>, which could have itself decayed from&nbsp;<code>12</code>&nbsp;or&nbsp;<code>21</code>. Neither of the latter two could have been a product of decay. So there are four possibilities in total.</p>

<p>In sample case #2, the googlement must have originally been&nbsp;<code>1</code>, which is the only possible googlement of length 1.</p>

<p>In sample case #3, the googlement must have been&nbsp;<code>123</code>; no other googlement could have decayed into it.</p>