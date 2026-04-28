# [Platinum V] Swapping Seats - 19609

[문제 링크](https://www.acmicpc.net/problem/19609)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 39, 맞힌 사람: 37, 정답 비율: 41.111%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>There are N people sitting at a circular table for a long session of negotiations. Each person belongs to one of the three groups: <code>A</code>, <code>B</code>, or <code>C</code>. A group is <em>happy</em> if all of its members are sitting contiguously in a block of consecutive seats. You would like to make all groups happy by some sequence of swap operations. In each swap operation, two people exchange seats with each other. What is the minimum number of swaps required to make all groups happy?</p>

### 입력

<p>The input consists of a single line containing N (1 &le; N &le; 1 000 000) characters, where each character is <code>A</code>, <code>B</code>, or <code>C</code>. The i-th character denotes the group of the person initially sitting at the i-th seat at the table, where seats are numbered in clockwise order.</p>

### 출력

<p>Output a single integer, the minimum possible number of swaps.</p>