# [Platinum II] Viruses - 8044

[문제 링크](https://www.acmicpc.net/problem/8044)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 22, 맞힌 사람: 20, 정답 비율: 35.088%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 트라이, 아호-코라식

### 문제 설명

<p>Binary Viruses Investigation Committee detected, that certain sequences of zeroes and ones are codes of viruses. The committee isolated a set of all the virus codes. A sequence of zeroes and ones is called safe, if any of its segments (i.e. sequence of consecutive elements) is not a virus code. The committee is aiming at finding, whether an infinite, safe sequence of zeroes and ones exists.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads from the standard input virus codes,</li>
	<li>determines, whether an infinite, safe sequence of zeroes and ones exists</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input consists of one integer n standing for the number of all virus codes. Each of the next n lines consists of one non-empty word composed from 0s and 1s - a virus code. The total length of all words does not exceed 30000.</p>

### 출력

<p>In the first and the only line of the standard output one should find a word:</p>

<ul>
	<li>TAK - if an infinite, safe sequence of zeroes and ones exists.</li>
	<li>NIE - otherwise.</li>
</ul>

### 힌트

<p>For a set of codes {011,11,00000}, the sample infinite safe sequence is 010101&hellip; For a set of codes {01,11,00000} an infinite safe sequence of zeroes and ones does not exist.</p>