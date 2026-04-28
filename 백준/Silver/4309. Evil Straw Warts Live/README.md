# [Silver III] Evil Straw Warts Live - 4309

[문제 링크](https://www.acmicpc.net/problem/4309)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 36, 맞힌 사람: 21, 정답 비율: 47.727%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>A palindrome is a string of symbols that is equal to itself when reversed. Given an input string, not necessarily a palindrome, compute the number of swaps necessary to transform the string into a palindrome. By swap we mean reversing the order of two adjacent symbols. For example, the string &quot;mamad&quot; may be transformed into the palindrome &quot;madam&quot; with 3 swaps:</p>

<ul>
	<li>swap &quot;ad&quot; to yield &quot;mamda&quot;</li>
	<li>swap &quot;md&quot; to yield &quot;madma&quot;</li>
	<li>swap &quot;ma&quot; to yield &quot;madam&quot;</li>
</ul>

### 입력

<p>The first line of input gives n, the number of test cases. For each test case, one line of input follows, containing a string of up to 100 lowercase letters.</p>

### 출력

<p>Output consists of one line per test case. This line will contain the number of swaps, or &quot;Impossible&quot; if it is not possible to transform the input to a palindrome.</p>