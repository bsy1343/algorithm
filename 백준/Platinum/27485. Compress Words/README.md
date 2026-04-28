# [Platinum III] Compress Words - 27485

[문제 링크](https://www.acmicpc.net/problem/27485)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 70, 정답: 27, 맞힌 사람: 26, 정답 비율: 48.148%

### 분류

문자열, KMP

### 문제 설명

<p>Amugae has a sentence consisting of $n$ words. He want to compress this sentence into one word. Amugae doesn&rsquo;t like repetitions, so when he merges two words into one word, he removes the longest prefix of the second word that coincides with a suffix of the first word. For example, he merges &ldquo;<code>sample</code>&rdquo; and &ldquo;<code>please</code>&rdquo; into &ldquo;<code>samplease</code>&rdquo;.</p>

<p>Amugae will merge his sentence left to right (i.e. first merge the first two words, then merge the result with the third word and so on). Write a program that prints the compressed word after the merging process ends.</p>

### 입력

<p>The first line contains an integer $n$ ($1\le n\le 10^5$), the number of the words in Amugae&rsquo;s sentence.</p>

<p>The second line contains $n$ words separated by single space. Each words is non-empty and consists of uppercase and lowercase English letters and digits (&lsquo;<code>A</code>&rsquo;, &lsquo;<code>B</code>&rsquo;, &hellip;, &lsquo;<code>Z</code>&rsquo;, &lsquo;<code>a</code>&rsquo;, &lsquo;<code>b</code>&rsquo;, &hellip;, &lsquo;<code>z</code>&rsquo;, &lsquo;<code>0</code>&rsquo;, &lsquo;<code>1</code>&rsquo;, &hellip;, &lsquo;<code>9</code>&rsquo;). The total length of the words does not exceed $10^6$.</p>

### 출력

<p>In the only line output the compressed word after the merging process ends as described in the problem.</p>