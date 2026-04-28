# [Silver IV] Secret Code - 13046

[문제 링크](https://www.acmicpc.net/problem/13046)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 85, 맞힌 사람: 67, 정답 비율: 78.824%

### 분류

구현, 문자열, 집합과 맵

### 문제 설명

<p>Now Marty is in the past, and he wants to get back home to his 1985. He has already made his parents fall in love with each other, and has found plutonium. What is left to do is to activate the time machine and start the time travel. However, there is a problem for Marty. To activate the time machine one needs to enter the secret code. Only Doc know the secret code. All that Marty knows is that it consists of several different characters. Also he knows the length of the code. While Marty is waiting for Doc, he is trying to guess the code and enters different character combinations.</p>

<p>Now Doc has returned and entered the code. Marty would like to know how close he was to entering the correct code. For each Marty&#39;s attempt to enter the code, find the number of correct characters in the code that are at their correct positions, and the number of correct characters that are however at incorrect positions.</p>

### 입력

<p>The first line contains s &mdash; the correct secret code. The code consists of uppercase letters of the English alphabet and digits. All characters in the code are different.</p>

<p>The second line contains a positive integer n (1 &le; n &le; 10<sup>5</sup>) &mdash; the number of Marty&#39;s attempts.</p>

<p>Each of the following n lines contain information about Marty&#39;s attempts. Each of these lines contains the code of the same length as s that contains uppercase letters of the English alphabet and digits. All characters within one code are different.</p>

### 출력

<p>For each Marty&#39;s attempt print two integers: a and b &mdash; the number of correct characters at correct positions, and the number of correct characters, but at incorrect positions.</p>

<p>&nbsp;</p>