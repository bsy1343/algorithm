# [Gold IV] Equivalent Passwords - 11807

[문제 링크](https://www.acmicpc.net/problem/11807)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 86, 정답: 22, 맞힌 사람: 20, 정답 비율: 26.316%

### 분류

백트래킹, 비트마스킹, 구현, 문자열

### 문제 설명

<p>Yesterday you arrived at the hotel, and you kept all your valuable stuff in your room&rsquo;s safe. Unfortunately, you forgot the password. But you have a very long list of passwords (each password is at most 5 digits), and you are sure that your password is one of them.</p>

<p>The safe will consider some passwords equivalent. Two passwords A and B are considered equivalent, if they are of the same length, and |A[i] - B[i]| is the same for all possible values of i, where X[i] is the i-th digit of X and |Y| is the absolute value of Y.</p>

<p>You will go through the list of passwords in the given order. For each password, you will do the following:</p>

<ol>
	<li>If the same password or any of its equivalent passwords were typed before, skip this password.</li>
	<li>Otherwise, type this password into the safe.</li>
	<li>If it&rsquo;s the correct password (or any of its equivalent passwords), the safe will open and you will stop any further processing.</li>
</ol>

<p>Now given the list of all passwords, you would like to know, in the worst case scenario, what is the maximum number of passwords you will have to type?</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T (1 &le; T &le; 50) representing the number of test cases. Followed by T test cases. Each test case starts with a line will containing an integer N (1 &le; N &le; 100,000) representing the number of passwords, followed by N lines, each one will contain a non-empty string of at most 5 digits (from &lsquo;0&rsquo; to &lsquo;9&rsquo;), representing a password (might contain leading zeros).</p>

### 출력

<p>For each test case print a single line containing &ldquo;Case n:&rdquo; (without quotes) where n is the test case number (starting from 1) followed by a space then the maximum number of passwords you will have to type.</p>

### 힌트

<p>In the first test case: all passwords are equivalent to each other. This means that the first password will open the safe for sure.</p>

<p>In the second test case:</p>

<ul>
	<li>If the first password is the correct one, you will type 1 password.</li>
	<li>If the second password is the correct one, you will type 2 passwords.</li>
	<li>If the third password is the correct one, you will type 2 passwords (because the second password is equivalent to the third one).&nbsp;</li>
	<li>If the fourth password is the correct one, you will type 1 password (because the first password is equivalent to the fourth one).</li>
</ul>

<p>In the third test case:</p>

<ul>
	<li>If the first password is the correct one, you will type 1 password.</li>
	<li>If the second password is the correct one, you will type 1 password (because the first password is equivalent to the second one).</li>
	<li>If the third password is the correct one, you will type 2 passwords. Even though the third password is equivalent to the second password, the second password was skipped, and therefore you should type the third password.</li>
</ul>