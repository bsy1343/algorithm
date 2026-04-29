# [Silver III] Identical Letters - 32318

[문제 링크](https://www.acmicpc.net/problem/32318)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 33, 맞힌 사람: 28, 정답 비율: 56.000%

### 분류

두 포인터, 문자열

### 문제 설명

<p>Streak of identical letters always fascinates computer scientists and, as such, the scientists always look for such consecutive sequence of identical letters.</p>

<p>Given a string of lowercase letters and an integer m, determine the maximum number of consecutive identical letters in the string if you can remove up to m letters from the string. Note that you do not have to remove exactly m letters.</p>

### 입력

<p>The first input line provides the string (1 ≤ string length ≤ 2×10<sup>5</sup>); it starts in column 1 and contains only lowercase letters. The second input line contains an integer, m (0 ≤ m ≤ string length), indicating the maximum number of letters you can remove from the string.</p>

### 출력

<p>Print the maximum number of consecutive identical letters in the string if you can remove up to m letters from the string.</p>

### 힌트

<p>For the first Sample Input, we can remove the two letters at positions 10 and 11.</p>

<p>For the second Sample Input, we can remove the letters at positions 3, 4, 6, 10 and 11.</p>

<p>For the third Sample Input, we can create ”…aa…” or ”…yy…”, each of length 2.</p>