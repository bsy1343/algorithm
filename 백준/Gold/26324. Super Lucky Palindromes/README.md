# [Gold I] Super Lucky Palindromes - 26324

[문제 링크](https://www.acmicpc.net/problem/26324)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

수학, 다이나믹 프로그래밍, 문자열, 해 구성하기, 조합론

### 문제 설명

<p>Lucky numbers are positive integers composed only of the digits &lsquo;4&rsquo; and &lsquo;7&rsquo;. For example, 47477 and 777 are lucky numbers while 457 and 1232 are not.</p>

<p>Super lucky numbers have the following additional properties:</p>

<ul>
	<li>They are a lucky number themselves</li>
	<li>Number of digits in them is a lucky number</li>
	<li>The number of &lsquo;4&rsquo;s or the number of &lsquo;7&rsquo;s in them is a lucky number (or both counts are lucky numbers).</li>
</ul>

<p>A palindrome is an integer that reads the same forwards and backwards. For example, 547745 and 343 are palindromes while 74 and 12345 are not. A super lucky palindrome is a positive integer that is both a super lucky number and a palindrome.</p>

<p>Given a number k, print the k th smallest super lucky palindrome.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the quantity of numbers to check. Each of the next n lines contains a single integer, k (1 &le; k &le; 10<sup>18</sup>).</p>

### 출력

<p>For each query, first output the heading &ldquo;Query #d: &rdquo;, where d is the query number, starting with 1. Then, for the value k given in the query, print the k th smallest super lucky palindrome. Follow the format illustrated in Sample Output.</p>