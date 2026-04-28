# [Silver V] Passport Checking - 13211

[문제 링크](https://www.acmicpc.net/problem/13211)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 500, 정답: 295, 맞힌 사람: 247, 정답 비율: 63.496%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>This task is inspired by the recent MH370 stolen passport incident.</p>

<p>The Interpol database contains a list of N stolen passport numbers. We have another list of M passport numbers to check if they are stolen or not.</p>

### 입력

<ul>
	<li>The first line of the input contains an integer N. (1 &le; N &le; 100,000)</li>
	<li>The next N lines contains the list of N stolen passport numbers, one passport number per line.</li>
	<li>The next line of the input contains an integer M. (1 &le; M &le; 100,000)</li>
	<li>The next M lines contains the list of M passport numbers, one passport number per line.</li>
</ul>

<p>Passport numbers are alphanumeric (combination of alphabetic and numeric characters) and are of length at most 15</p>

### 출력

<p>Output the total number of stolen passports in the list of M passports.</p>

### 힌트

<p>Both D327045452 and H364436380 are stolen passports.</p>