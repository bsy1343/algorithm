# [Bronze II] Password check - 15239

[문제 링크](https://www.acmicpc.net/problem/15239)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 446, 정답: 313, 맞힌 사람: 271, 정답 비율: 75.910%

### 분류

구현, 문자열

### 문제 설명

<p dir="ltr">Dublin City University wants to prevent students and staff from using weak passwords. The Security Department has commissioned you to write a program that checks that some passwords meet all the quality requirements defined by the Password Guidelines Council.</p>

<p>These requirements are as follows. A password is considered strong enough if it has the following properties:</p>

<ul dir="ltr">
	<li>At least one lowercase letter.</li>
	<li>At least one uppercase letter.</li>
	<li>At least one digit</li>
	<li>At least one symbol from the set +_)(*&amp;^%$#@!./,;{}</li>
	<li>Minimum length is 12.</li>
</ul>

<p>Examples:</p>

<ul dir="ltr">
	<li>The password &ldquo;Aa1_&rdquo; (without the quotes) meets the first 4 requirements but its length is less than 12.</li>
	<li>The password &ldquo;Aa1234567890_&rdquo; is perfectly fine.</li>
</ul>

### 입력

<p dir="ltr">You&rsquo;ll have to process a batch of password in every test case.</p>

<p dir="ltr">The first line will contain an integer N with the number of passwords to process.</p>

<p dir="ltr">Each password will be presented in two lines. The first line will contain an integer S with the size of the password. The next line will contain a sequence of S characters, the password to check.</p>

<p dir="ltr">The password will only contain the letters from a to z (both lowercase and uppercase) the digits from 0 to 9 and the following symbols: &ldquo;+_)(*&amp;^%$#@!./,;{}&rdquo; without the quotes.</p>

<p>The maximum size of a password will be 30 characters. Each test case will contain at most 100 passwords to process.</p>

### 출력

<p dir="ltr">For each password write a line with the word &ldquo;valid&rdquo; if the password meets that quality requirement or &ldquo;invalid&rdquo; otherwise.</p>