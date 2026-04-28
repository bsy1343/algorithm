# [Gold II] Subsequences in Substrings - 17004

[문제 링크](https://www.acmicpc.net/problem/17004)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 44, 맞힌 사람: 42, 정답 비율: 87.500%

### 분류

이분 탐색, 브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>You are given two strings s, and t. Count the number of substrings of s that contain t as a subsequence at least once.</p>

<p>Note that a substring and a subsequence both consist of characters from the original string, in order. In a substring, the characters must be contiguous in the original string, but in a subsequence, they are not required to be contiguous. In the string <strong>abcde</strong>, <strong>ace</strong> is a subsequence but not a substring.</p>

<p>If s is <strong>aa</strong> and t is <strong>a</strong>, then the answer is 3: <strong>[a]a</strong>, <strong>[aa]</strong>, and <strong>a[a]</strong>.</p>

### 입력

<p>Each test case will consist of exactly two lines.</p>

<p>The first line will contain string s (1 &le; |s| &le; 10<sup>5</sup>, s&isin;[a&minus;z]<sup>*</sup>), with no other characters. The second line will contain string t (1 &le; |t| &le; 100, |t| &le; |s|, t&isin;[a&minus;z]<sup>*</sup> ), with no other characters.</p>

### 출력

<p>Output a single integer, which is the number of substrings of s that contain t as a subsequence at least once.</p>