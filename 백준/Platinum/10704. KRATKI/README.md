# [Platinum V] KRATKI - 10704

[문제 링크](https://www.acmicpc.net/problem/10704)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 149, 정답: 74, 맞힌 사람: 57, 정답 비율: 45.968%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>All of you are probably very familiar with the problem of finding the longest monotone subsequence. You probably think you know all about it. In order to convince us, solve the problem &ldquo;opposite&rdquo; to finding the longest monotone subsequence.</p>

<p>For given N and K, find the sequence that consists of numbers from 1 to N such that each of the numbers in it appears exactly once and the length of its longest monotone subsequence (ascending or descending) is exactly K.</p>

### 입력

<p>The first line of input contains the integers N and K (1 &le; K &le; N &le; 10<sup>6</sup>), the length of the sequence and the required length of the longest monotone subsequence.</p>

### 출력

<p>If the required sequence doesn&rsquo;t exist, output -1 in the first and only line.</p>

<p>If the required sequence exists, output the required sequence of N numbers in the first and only line. Separate the numbers with a single space.</p>

<p>The required sequence (if it exists) is not necessarily unique, so you can output any valid sequence.</p>

### 힌트

<p><strong>Clarification of the first sample test:</strong> A sequence of length 4 with longest monotone subsequence of length 3 is (1, 4, 2, 3). The longest monotone sequence is (1, 2, 3).</p>