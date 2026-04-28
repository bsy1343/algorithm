# [Platinum I] Cram - 25227

[문제 링크](https://www.acmicpc.net/problem/25227)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 88, 정답: 46, 맞힌 사람: 43, 정답 비율: 65.152%

### 분류

다이나믹 프로그래밍, 자료 구조, 문자열, 세그먼트 트리, 접미사 배열과 LCP 배열

### 문제 설명

<p>You want to compress a given text passage using backreferences.  A <em>backreference</em> is a pair of numbers $[a,b]$ indicating that the next $b$ characters of the string are the same as the $b$ characters starting $a$ characters back from the current position. The two strings may overlap, <em>i.e.</em>, $a$ may be smaller than $b$.</p>

<p>Each backreference costs three bytes to encode, regardless of the number of characters represented by the backreference. String characters cost one byte each to encode.</p>

<p>For instance, the string</p>

<p style="text-align: center;"><code>abcabcabcabc</code></p>

<p>has 12 characters.  But the last nine can be represented as a backreference to the first nine, as follows:</p>

<p style="text-align: center;"><code>abc[3,9]</code></p>

<p>The total cost of this encoded string is $6$: $3$ bytes for the string <code>abc</code>, and $3$ bytes for the backreference.</p>

<p>Output the minimum cost to encode the text passage.</p>

### 입력

<p>The single line of input contains a string $s$, with $1 \le |s| \le 10^5$.  This line of text consists of upper-case letters (&#39;<code>A</code>&#39;--&#39;<code>Z</code>&#39;), lower-case letters (&#39;<code>a</code>&#39;--&#39;<code>z</code>&#39;), and spaces.  There will not be any spaces at the beginning or end of the line, and no space character will be adjacent to another space character.</p>

### 출력

<p>Output a single integer, which is the minimum cost to represent the input string using backreferences.</p>