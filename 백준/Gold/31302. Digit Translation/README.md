# [Gold III] Digit Translation - 31302

[문제 링크](https://www.acmicpc.net/problem/31302)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 19, 정답 비율: 67.857%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>You are given a string of lowercase letters. In one operation, if you can find a substring that is one of the written-out forms of one of the digits from zero to nine (&quot;zero&quot;, &quot;one&quot;, &quot;two&quot;, &quot;three&quot;, &quot;four&quot;, &quot;five&quot;, &quot;six&quot;, &quot;seven&quot;, &quot;eight&quot;, &quot;nine&quot;), you can replace that substring with the numeric digit.</p>

<p>Your goal is to find the shortest possible string you can end up with after applying zero or more of these operations, as well as how many distinct strings of that length there are.</p>

### 입력

<p>The single line of input contains a string of lowercase letters with length at least one and at most $10^6$.</p>

### 출력

<p>Output two separate lines.</p>

<p>On the first line output a single integer, which is the length of the shortest possible string.</p>

<p>On the second line output a single integer, which is the number of distinct strings of that length that can be obtained after applying zero or more of the specified operations, modulo 9302023.</p>