# [Silver I] A Really Odd Sequence - 19355

[문제 링크](https://www.acmicpc.net/problem/19355)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 52, 맞힌 사람: 43, 정답 비율: 46.739%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>According to our long-established tradition, the best statements are those kept short.</p>

<p>Given a sequence of integers, find the largest sum of a consecutive subsequence of odd length.</p>

### 입력

<p>The first line of input contains the number of test cases $z$. The descriptions of the test cases follow.</p>

<p>The first line of each test case contains the length of the sequence $n$ ($1 \leq n \leq 1\,000\,000$).</p>

<p>The next line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($-10^9 \leq a_i \leq 10^9$), the elements of the sequence.</p>

<p>The total length of all sequences in all test cases does not exceed $5\,000\,000$.</p>

### 출력

<p>For each test case, output the largest sum on a separate line.</p>