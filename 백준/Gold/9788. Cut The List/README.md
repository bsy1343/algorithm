# [Gold IV] Cut The List - 9788

[문제 링크](https://www.acmicpc.net/problem/9788)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are given a list L of N integers.</p>

<p>Let&#39;s define an operation of cutting the list as follows:</p>

<p>Suppose L = {l<sub>1</sub>, l<sub>2</sub>, ..., l<sub>i</sub>, l<sub>i+1</sub>, ..., l<sub>N</sub>}, then, cutting the list L at index i will split L into two nonempty sub-lists L1 = {l<sub>1</sub>, l<sub>2</sub>, ..., l<sub>i</sub>} and L<sub>2</sub> = {l<sub>i+1</sub>, l<sub>i+2</sub>, ..., l<sub>N</sub>}.</p>

<p>Now, for each of sub-list L<sub>i</sub>, we can find the difference between the maximum value (M<sub>i</sub>) and minimum value (m<sub>i</sub>) of L<sub>i</sub> and call it d<sub>i</sub>.</p>

<p>Your task is to cut the list into K sub-list (1 &le; K &le; N) so that ans = &sum;<sub>i=1 to K</sub> (d<sub>i</sub>) is minimized and then report this ans.</p>

### 입력

<p>The first line of input contains an integer TC that denotes the number of test cases (1 &le; TC &le; 120).</p>

<p>Each test case starts with a blank line, followed by two integers in one line: N and K (1 &le; K &le; N &le; 400).</p>

<p>This is followed by list L in form of N positive integers less than 1000 in the last line of that test case.</p>

<p>Note that the integers in L are not necessarily pairwise distinct.</p>

### 출력

<p>For each test case, output an integer ans as in the problem description.</p>

### 힌트

<p>The answer for the second test case is 6; Split L into {8} and {1,5,4,7}, we have ans = (8-8) + (7-1) = 0 + 6 = 6.</p>

<p>The answer for the third test case is 3; Split L into {8}, {1}, and {5,4,7}, we have ans = (8-8) + (1-1) + (7-4) = 0 + 0 + 3 = 3.</p>

<p>The answer for the fourth test case is 1; Split L into {8}, {1}, {5,4}, and {7}, we have ans = (8-8) + (1-1) + (5-4) + (7-7) = 0 + 0 + 1 + 0 = 1.</p>

<p>The answer of the first and the fifth test cases should be obvious.</p>