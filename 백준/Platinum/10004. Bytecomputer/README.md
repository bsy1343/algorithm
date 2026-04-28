# [Platinum III] Bytecomputer - 10004

[문제 링크](https://www.acmicpc.net/problem/10004)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 95, 정답: 42, 맞힌 사람: 37, 정답 비율: 45.122%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>A sequence of n integers x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>n</sub> from the set {-1,0,1} is given. The bytecomputer is a device that allows the following operation on the sequence: incrementing x<sub>i+1</sub>&nbsp;by x<sub>i</sub> for any 1 &le; i &le; n. There is no limit on the range of integers the bytecomputer can store, i.e., each x<sub>i</sub> can (in principle) have arbitrarily small or large value.</p>

<p>Program the bytecomputer so that it transforms the input sequence into a non-decreasing sequence (i.e., such that x<sub>1</sub> &le; x<sub>2</sub> &le; &hellip;&nbsp;&le; x<sub>n</sub>) with the minimum number of operations.</p>

### 입력

<p>The first line of the standard input holds a single integer n (1 &le; n &le; 1,000,000), the number of elements in the (bytecomputer&#39;s) input sequence.</p>

<p>The second line contains n integers x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>n</sub> (x<sub>i</sub> &isin; {-1,0,1}) that are the successive elements of the (bytecomputer&#39;s) input sequence, separated by single spaces.</p>

### 출력

<p>The first and only line of the standard output should give one integer, the minimum number of operations the bytecomputer has to perform to make its input sequence non-decreasing, of the single word BRAK (Polish for none) if obtaining such a sequence is impossible.</p>

### 힌트

<p>with three operations, the bytecomputer can obtain the sequence -1,-1,-1,-1,0,1.</p>