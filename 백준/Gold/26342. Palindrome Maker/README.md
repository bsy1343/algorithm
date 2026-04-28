# [Gold I] Palindrome Maker - 26342

[문제 링크](https://www.acmicpc.net/problem/26342)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 16, 맞힌 사람: 11, 정답 비율: 15.278%

### 분류

너비 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A &ldquo;palindromic integer sequence&rdquo; is a sequence that is the same when written forwards or backwards, i.e., of the form {a1, a2, a3, &hellip;. , a3, a2, a1}. Some examples of palindromic integer sequences are {78, 91, 78}, {100}, {10, 20, 20, 10}, and {5, 5, 5, 5}. But {1, 2, 3, 1} and {10, 20} are not palindromic sequences.</p>

<p>You are given an integer sequence. You want to convert the sequence into a palindromic integer sequence by a series of insertions. You can convert {1, 2, 3, 1} to a palindromic sequence by inserting a 2 at the fourth position which will become {1, 2, 3, 2, 1}, and you can convert {10, 20} to palindromic sequence by inserting 20 at the first position or inserting 10 at the last position.</p>

<p>Given an integer sequence, determine the minimum number of insertions required to convert it into a palindromic sequence. It is guaranteed that the result (number of insertions) will always be less than 100.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of integer sequences to check. The sequences are on the following 2n lines, two lines per sequence. First line contains s (1 &le; s &le; 10,000), the size of the sequence. Second line contains s integers (separated by a single space), providing the sequence. The integers in a sequence are between 1 and 50 inclusive.</p>

### 출력

<p>For each sequence, first output &ldquo;Sequence #i: &rdquo; where i is the sequence number, starting with 1. Then, output a single integer denoting the minimum number of insertions required to convert the sequence into a palindromic sequence. Leave a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>