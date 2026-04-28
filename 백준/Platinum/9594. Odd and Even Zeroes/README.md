# [Platinum IV] Odd and Even Zeroes - 9594

[문제 링크](https://www.acmicpc.net/problem/9594)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 37, 맞힌 사람: 30, 정답 비율: 88.235%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 분할 정복

### 문제 설명

<p>In mathematics, the factorial of a positive integer number n is written as n! and is defined as follows:</p>

<p style="text-align: center;">n! = 1 &times; 2 &times; 3 &times; 4 &times; &middot; &middot; &middot; &times; (n &minus; 1) &times; n&nbsp;</p>

<p>The value of 0! is considered as 1. n! grows very rapidly with the increase of n. Some values of n! are:</p>

<ul>
	<li>0! = 1&nbsp;</li>
	<li>1! = 1&nbsp;</li>
	<li>2! = 2</li>
	<li>3! = 6</li>
	<li>4! = 24</li>
	<li>5! = 120</li>
	<li>10! = 3628800</li>
	<li>14! = 87178291200</li>
	<li>18! = 6402373705728000</li>
	<li>22! = 1124000727777607680000</li>
</ul>

<p>You can see that for some values of n, n! has odd number of trailing zeroes (eg 5!, 18!) and for some values of n, n! has even number of trailing zeroes (eg 0!, 10!, 22!). Given the value of n, your job is to find how many of the values 0!, 1!, 2!, 3!, ... , (n &minus; 1)!, n! has even number of trailing zeroes.</p>

### 입력

<p>Input file contains at most 1000 lines of input. Each line contains an integer n(0 &le; n &le; 10<sup>18</sup>). Input is terminated by a line containing a -1.</p>

### 출력

<p>For each line of input produce one line of output. This line contains an integer which denotes how many of the numbers 0!, 1!, 2!, 3!, . . ., n!, contains even number of trailing zeroes.</p>