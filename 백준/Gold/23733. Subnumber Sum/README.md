# [Gold III] Subnumber Sum - 23733

[문제 링크](https://www.acmicpc.net/problem/23733)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 185, 정답: 57, 맞힌 사람: 50, 정답 비율: 40.323%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Let&#39;s solve this simple problem.</p>

<p>Given a positive integer, we can make a new number by taking some digits from the given number and concatenating them without changing the order. Let&#39;s call it a <strong>subnumber</strong> of a given number. For example, we can take $3, 1, 1$ from $31415$ to make a subnumber $311$.</p>

<p>A positive integer of $N$ digits is given. You can make two subnumbers by selecting $K$ digits to make one and the remaining $N-K$ digits to make the other. Given the number of digits $K$ that you have to select, find the maximum sum of two subnumbers. It is allowed for a subnumber to have leading zeros.</p>

### 입력

<p>The first line contains the number of test cases $T$ $(1 \leq T \leq 10,000)$.&nbsp;</p>

<p>For each test case, the first line contains two integers $N, K$ $(2 \leq N \leq 18, 1 \leq K &lt; N)$ and the second line contains a positive integer of $N$ digits. The input number has no leading zeros, although its subnumbers can.</p>

### 출력

<p>For each test case, output the maximum sum of two subnumbers satisfying the conditions in one line.</p>