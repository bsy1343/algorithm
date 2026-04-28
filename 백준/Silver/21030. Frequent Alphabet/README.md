# [Silver V] Frequent Alphabet - 21030

[문제 링크](https://www.acmicpc.net/problem/21030)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 134, 정답: 116, 맞힌 사람: 91, 정답 비율: 89.216%

### 분류

문자열

### 문제 설명

<p>Your social media account has just been hacked, and you are advised to change your password. You have two favorite strings S and T, each contains exactly N lowercase alphabets. You want the new password to be some combinations of these two strings. Specifically, the new password P should contain N alphabets such that the i<sup>th</sup> character of P is either the i<sup>th</sup> character of S or the i<sup>th</sup> character of T.</p>

<p>For example, let S = &ldquo;<code>icyz</code>&rdquo; and T = &ldquo;<code>ixpc</code>&rdquo;. There are 8 different possible new passwords which you can choose: &ldquo;<code>icyz</code>&rdquo;, &ldquo;<code>icyc</code>&rdquo;, &ldquo;<code>icpz</code>&rdquo;, &ldquo;<code>icpc</code>&rdquo;, &ldquo;<code>ixyz</code>&rdquo;, &ldquo;<code>ixyc</code>&rdquo;, &ldquo;<code>ixpz</code>&rdquo;, and &ldquo;<code>ixpc</code>&rdquo;.</p>

<p>The score of a password P is defined as the number of occurences of the most frequent alphabet in P. For example, let P = &ldquo;<code>icpc</code>&rdquo;. The password &ldquo;<code>icpc</code>&rdquo; has one occurence of &lsquo;<code>i</code>&rsquo;, two occurences of &lsquo;<code>c</code>&rsquo;, and one occurence of &lsquo;<code>p</code>&rsquo;. The most frequent alphabet in P is &lsquo;<code>c</code>&rsquo; with the number of occurences of 2. Therefore, the score of &ldquo;<code>icpc</code>&rdquo; is 2.</p>

<p>Given two strings S and T, your task is to find the highest score you can get for your new password.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100 000) representing the length of the password. The next line contains a string S containing N lowercase alphabets representing your first favorite string. The next line contains a string T containing N lowercase alphabets representing your second favorite string.</p>

### 출력

<p>Output in a line an integer representing the highest score you can get for your new password.</p>