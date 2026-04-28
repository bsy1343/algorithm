# [Silver II] Shuffle - 6809

[문제 링크](https://www.acmicpc.net/problem/6809)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 151, 정답: 69, 맞힌 사람: 58, 정답 비율: 49.573%

### 분류

수학, 구현, 문자열, 집합과 맵

### 문제 설명

<p>You want to keep some secrets, so you invent a simple encryption algorithm.</p>

<p>You will map each uppercase character and underscore to some other uppercase character and underscore. In other words, this is a permutation of the characters, or, to put it another way, you create a 1:1 and onto map from {&rsquo;A&rsquo;, &rsquo;B&rsquo;, ...., &rsquo;Z&rsquo;, &rsquo; &rsquo;} to {&rsquo;A&rsquo;, &rsquo;B&rsquo;, ...., &rsquo;Z&rsquo;, &rsquo; &rsquo;}.</p>

<p>However, you will repeatedly apply this encryption in an attempt to make your message more secure.</p>

### 입력

<p>The input will be 29 lines long. The first 27 lines will each contain a single character from the set {&rsquo;A&rsquo;, &rsquo;B&rsquo;, ...., &rsquo;Z&rsquo;, &rsquo; &rsquo;}. The first of these lines represents what the character &rsquo;A&rsquo; maps to, the second of these lines represents what the character &rsquo;B&rsquo; maps to, and so on, until the 27th line represents what the underscore character maps to.</p>

<p>On the 28th line will be an integer N (1 &le; N &le; 2, 000, 000, 000) which represents the number of times this encryption should be applied.</p>

<p>On the 29th line is T, a string of less than 80 characters from the set {&rsquo;A&rsquo;, &rsquo;B&rsquo;, ...., &rsquo;Z&rsquo;, &rsquo; &rsquo;}.</p>

### 출력

<p>On one line, output the string created after shuffling T a total of N times, using the given shuffle permuation.</p>