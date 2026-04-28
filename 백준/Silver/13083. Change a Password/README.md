# [Silver I] Change a Password - 13083

[문제 링크](https://www.acmicpc.net/problem/13083)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 64, 맞힌 사람: 54, 정답 비율: 43.548%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Password authentication is used in a lot of facilities. The office of JAG also uses password authentication. A password is required to enter their office. A password is a string of N digits &#39;0&#39;-&#39;9&#39;. This password is changed on a regular basis. Taro, a staff of the security division of JAG, decided to use the following rules to generate a new password from an old one.</p>

<ol>
	<li>The new password consists of the same number N of digits to the original one and each digit appears at most once in the new password. It can have a leading zero. (Note that an old password may contain same digits twice or more.)</li>
	<li>The new password maximizes the difference from the old password within constraints described above. (Definition of the difference between two passwords is described below.)</li>
	<li>If there are two or more candidates, the one which has the minimum value when it is read as an integer will be selected.</li>
</ol>

<p>The difference between two passwords is defined by min(|a&minus;b|,10<sup>N</sup>&minus;|a&minus;b|), where aa and b&nbsp;are the integers represented by the two passwords. For example, the difference between &quot;11&quot; and &quot;42&quot; is 31, and the difference between &quot;987&quot; and &quot;012&quot; is 25.</p>

<p>Taro would like to use a computer to calculate a new password correctly, but he is not good at programming. Therefore, he asked you to write a program. Your task is to write a program that generates a new password from an old password.</p>

### 입력

<p>The input consists of a single test case. The first line of the input contains a string S which denotes the old password. You can assume that the length of S&nbsp;is no less than 1&nbsp;and no greater than 10. Note that old password S may contain same digits twice or more, and may have leading zeros.</p>

### 출력

<p>Print the new password in a line.</p>

<p>&nbsp;</p>