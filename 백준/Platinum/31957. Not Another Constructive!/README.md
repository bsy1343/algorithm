# [Platinum I] Not Another Constructive! - 31957

[문제 링크](https://www.acmicpc.net/problem/31957)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 129, 정답: 55, 맞힌 사람: 42, 정답 비율: 39.252%

### 분류

다이나믹 프로그래밍, 비트 집합

### 문제 설명

<p>Sick of solving geometry problems, you decide to solve the following constructive problem: find a string of length $n$ that contains exactly $k$ not necessarily contiguous subsequences of <code>NAC</code>.</p>

<p>This problem seems too familiar though. Here&#39;s the twist - your friend has given you part of the string, so you must fill in the remaining characters!</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 40$) and $k$ ($0 \le k \le 2\,500$), where $n$ is the length of the string and $k$ is the number of not necessarily contiguous subsequences of <code>NAC</code> that the output must contain.</p>

<p>The second line contains a string of length exactly $n$, consisting only of uppercase letters and/or question marks.</p>

### 출력

<p>Output a string of upper case letters, replacing each question mark in the input string with an uppercase letter so that the resulting string has exactly $k$ subsequences of <code>NAC</code>. If this is not possible, output <code>-1</code>. Any uppercase letters in the input string must be kept in their position. There may be multiple possible solutions for any given test case; any correct solution will be accepted.</p>