# [Gold III] Clock Captcha - 6633

[문제 링크](https://www.acmicpc.net/problem/6633)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

구현

### 문제 설명

<p>The digital display clock installed in problem 6634 is only one part of the solution to eliminate antedating documents. The second part is a camera which takes pictures of the office regularly and records at what times was each document signed and stamped. These records can later serve as an evidence.</p>

<p>Your task is to scan a picture take by the camera and decode numbers on the digital display.</p>

### 입력

<p>The input will exactly follow Output Specification for Problem 6634, with only one important exception: Since image scanning is always an error-prone process, some of the characters representing the display may not be recognized correctly. Fortunately, we know which characters are incorrect, because a very sophisticated error-detecting mechanism is used. These characters are replaced by dots (&ldquo;.&rdquo;) in the input. Such spots can represent any of the allowed characters.</p>

### 출력

<p>Your output must follow Input Specification for Problem 6634. For each display, output the time shown on it. You may assume that at least one such time exists.</p>

<p>However, due to the scanning errors, sometimes there may be several possible valid times that could be represented by the same picture. In such cases, we may not risk giving an incorrect information &mdash; print the word &ldquo;ambiguous&rdquo; instead of the time.</p>