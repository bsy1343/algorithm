# [Bronze I] Arbiter Login - 9388

[문제 링크](https://www.acmicpc.net/problem/9388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 319, 정답: 154, 맞힌 사람: 125, 정답 비율: 52.301%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>Finally, the budget for enhancing Arbiter web site (which is an online judge) is allocated and your job is to improve the functionality of its login page. The new login page should help users on two common login mistakes:</p>

<ol>
	<li>When the &ldquo;caps lock&rdquo; key is ON, each lowercase letter is typed as uppercase and vice versa.</li>
	<li>When &ldquo;num lock&rdquo; key is OFF, numeric characters (digits &lsquo;0&rsquo; through &lsquo;9&rsquo;) are not typed.</li>
</ol>

<p>Given a username and a password in the login page, the system compares the entered password with the original one (for that username). If they were the same, the login step is successfully finished and the user is redirected to the appropriate page. Otherwise, the login is unsuccessful. But, some extra hints should be given to the user if the entered password was related to the original one in the following ways:</p>

<ol>
	<li>If the two passwords were case-insensitively the same, but the case of all their English letters were completely opposite, then the &ldquo;caps lock&rdquo; key might be ON by mistake.</li>
	<li>If the entered password was the same as the original one after removing the numeric characters of the original password, then the &ldquo;num lock&rdquo; key might be OFF by mistake.</li>
	<li>The two cases above might happen together.</li>
</ol>

<p>Given both the entered password and its original one, you have to write a program which prints the appropriate message.</p>

### 입력

<p>The input contains n test cases. The first line of input has only the integer n. Each of the next n lines is a test case having two strings of at least one and at most 10 alphanumeric characters. The first string is the original password, and the second one is the password entered by the user in the login page.</p>

### 출력

<p>Write the result of the ith test case, on the ith line of output. As you see in the sample output, you should write the test case number and then, one of the following messages:</p>

<ul>
	<li>Login successful.</li>
	<li>Wrong password. Please, check your caps lock key.</li>
	<li>Wrong password. Please, check your num lock key.</li>
	<li>Wrong password. Please, check your caps lock and num lock keys.</li>
	<li>Wrong password.</li>
</ul>