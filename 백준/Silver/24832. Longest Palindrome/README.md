# [Silver I] Longest Palindrome - 24832

[문제 링크](https://www.acmicpc.net/problem/24832)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 148, 정답: 106, 맞힌 사람: 90, 정답 비율: 72.581%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>Returning back to problem solving, Gildong is now studying about palindromes. He learned that a <em>palindrome</em>&nbsp;is a string that is the same as its reverse. For example, strings &quot;pop&quot;, &quot;noon&quot;, &quot;x&quot;, and &quot;kkkkkk&quot;&nbsp;are palindromes, while strings &quot;moon&quot;, &quot;tv&quot;, and &quot;abab&quot;&nbsp;are not. <strong>An empty string is also a palindrome.</strong></p>

<p>Gildong loves this concept so much, so he wants to play with it. He has $n$ <em>distinct</em>&nbsp;strings of equal length $m$. He wants to discard some of the strings (possibly none or all) and reorder the remaining strings so that the concatenation becomes a palindrome. He also wants the palindrome to be as long as possible. Please help him find one.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \le n \le 100$, $1 \le m \le 50$) &mdash; the number of strings and the length of each string.</p>

<p>Next $n$ lines contain a string of length $m$ each, consisting of lowercase Latin letters only. All strings are <em>distinct</em>.</p>

### 출력

<p>In the first line, print the length of the longest palindrome string you made.</p>

<p>In the second line, print that palindrome. If there are multiple answers, print any one of them. If the palindrome is empty, print an empty line or don&#39;t print this line at all.</p>

### 힌트

<p>In the first example, &quot;battab&quot;&nbsp;is also a valid answer.</p>

<p>In the second example, there can be 4 different valid answers including the sample output. We are not going to provide any hints for what the others are.</p>

<p>In the third example, the empty string is the only valid palindrome string.</p>