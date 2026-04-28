# [Gold I] Maximum Non-Overlapping Increasing Subsequences - 25888

[문제 링크](https://www.acmicpc.net/problem/25888)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Given a list of integers, we can find an increasing subsequence from that list, i.e., select specific elements from the list where the selected numbers are in increasing order. There is a classic problem that asks to find the longest increasing subsequence, i.e., increasing subsequence with the maximum number of elements. In our problem, we are going to do a modified version of that problem. Instead of finding one increasing subsequence, we will find multiple increasing subsequences with the following two constraints:</p>

<ol>
	<li>The length of each subsequence should be at least of a given size k.</li>
	<li>If a subsequence starts at index i and ends at index j, no other subsequence can start or end in the range i to j (inclusive), i.e., no other subsequence can have any elements in between index i and j (inclusive), i.e., the subsequences cannot overlap.</li>
</ol>

<p>The objective is to find subsequences (satisfying the above two conditions) resulting in the maximum number of elements being selected, i.e., the total number of elements in all these subsequences combined is the maximum.</p>

<p>For example, consider the list 2 1 9 3 4 4 5 6. If k = 2, we can get three non-overlapping increasing subsequences with maximum of 7 elements: [2, 9], [ 3, 4], [4, 5, 6]. If k = 3, we can get two non-overlapping increasing subsequences with maximum of 6 elements: [2, 3, 4], [ 4, 5, 6].</p>

<p>Given a list of n integers, determine the maximum number of integers you can include in the non-overlapping increasing subsequences for all k where 1 &le; k &le; n.</p>

### 입력

<p>The first input line contains an integer, t (1 &le; t &le; 50), indicating the number of test cases to process. Each test case starts with an integer, n (1 &le; n &le; 100), indicating the number of integers in the list. The second line of each test case contains the list of n integers (each in the range of -10<sup>6</sup> to 10<sup>6</sup>, inclusive).</p>

### 출력

<p>For each test case, output n integers (on a single line) indicating, respectively, the maximum number of integers in the non-overlapping subsequences for all k where 1 &le; k &le; n.</p>