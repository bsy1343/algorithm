# [Bronze II] Average Character - 24608

[문제 링크](https://www.acmicpc.net/problem/24608)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 346, 정답: 198, 맞힌 사람: 176, 정답 비율: 57.516%

### 분류

수학, 문자열, 사칙연산

### 문제 설명

<p>Have you ever wondered what the average ASCII character of any given string is? No? Never? Really? Well, is it a character in the string or something else?</p>

<p>Would you do this calculation by hand with an ASCII table? Probably not! All modern programming languages include functions for converting an ASCII character to an integer, and to convert an integer to an ASCII character. Of course, these functions often also handle unicode characters as well, but that is not part of this problem.</p>

<p>Given a string of ASCII characters, compute the average character. If the average character lies between two integer ASCII values, return the smaller one.</p>

### 입력

<p>The single line of input contains a single string $s$ ($1 \le |s| \le 100$), which consists of ASCII text. All of the characters of $s$ will be printable ASCII, between ASCII $32$ (space:<code>&#39; &#39;</code>) and ASCII $126$ (tilde:<code>&#39;~&#39;</code>). It will <strong>NOT</strong> contain any control characters such as carriage returns, line feeds, tabs, etc. It is <strong>NOT</strong> guaranteed to begin, end, or even contain a non-space character.</p>

### 출력

<p>Output a single ASCII character, which is the average of all of the ASCII characters in $s$.</p>