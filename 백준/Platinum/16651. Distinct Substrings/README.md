# [Platinum II] Distinct Substrings - 16651

[문제 링크](https://www.acmicpc.net/problem/16651)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 33, 맞힌 사람: 25, 정답 비율: 32.895%

### 분류

문자열, KMP

### 문제 설명

<p>Diana bought a Long Random String Generator on some weird website. She planned to generate a long string s of length n and then use its contiguous substrings as passwords for other weird websites.</p>

<p>Soon she discovered that the generated string s of length n was not random at all, but rather a string p of length k repeated many times and then cut to length n. Thus, s[i] = p[i mod k] for all i from 0 to n &minus; 1.</p>

<p>Diana wonders how many different passwords she can get from the generated string. Help her find the number of distinct non-empty substrings in string s.</p>

### 입력

<p>The first line of the input contains a string p consisting of k lowercase English letters (1 &le; k &le; 1000).</p>

<p>The second line contains an integer n (k &le; n &le; 10<sup>9</sup>).</p>

### 출력

<p>Output the number of distinct non-empty substrings in s.</p>

### 힌트

<p>In the first example, the generated string is abbaabb. It contains 20 distinct non-empty substrings: <code>a</code>, <code>b</code>, <code>aa</code>, <code>ab</code>, <code>ba</code>, <code>bb</code>, <code>aab</code>, <code>abb</code>, <code>baa</code>, <code>bba</code>, <code>aabb</code>, <code>abba</code>, <code>baab</code>, <code>bbaa</code>, <code>abbaa</code>, <code>baabb</code>, <code>bbaab</code>, <code>abbaab</code>, <code>bbaabb</code>, <code>abbaabb</code>.</p>