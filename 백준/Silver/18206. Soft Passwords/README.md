# [Silver V] Soft Passwords - 18206

[문제 링크](https://www.acmicpc.net/problem/18206)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 132, 정답: 77, 맞힌 사람: 73, 정답 비율: 58.400%

### 분류

구현, 문자열

### 문제 설명

<p>Your favourite social media website is changing their policy on login password validation: a slight error when logging in is now acceptable! In particular, assuming the password you chose when creating the account is S, a password P entered while logging in will be accepted if any of the following conditions are met:</p>

<ul>
	<li>P and S are identical;</li>
	<li>S can be formed from P by prepending a single digit (0&ndash;9);</li>
	<li>S can be formed from P by appending a single digit;</li>
	<li>S is equal to P after reversing the case of all letters in P.</li>
</ul>

<p>To reverse the case of a string, replace all uppercase letters with their equivalent lowercase letters, and all lowercase letters with their equivalent uppercase letters, while leaving all other characters the same. For example, the case-reversal of pa55WORD is PA55word.</p>

<p>Any other attempted password P will be rejected. So for example, if S is c0deninja5, then c0deninja will be accepted, but not C0deninja5 or c0deninja51.</p>

<p>Write a program which, given alphanumeric strings S and P, determines whether P should be accepted.</p>

### 입력

<p>The first line of the input is the string S, the stored password, and the second line of input is the password P that a user has entered while attempting to log in. Each string consists of only digits 0&ndash;9, lowercase letters a&ndash;z, and uppercase letters A&ndash;Z. The strings won&rsquo;t contain spaces or any other extraneous characters, and will each contain at least one and at most 101 characters.</p>

### 출력

<p>Print Yes if P should be accepted according to the above rules, and No otherwise.</p>