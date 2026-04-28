# [Silver V] Rearranging a Sequence - 13399

[문제 링크](https://www.acmicpc.net/problem/13399)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 422, 정답: 254, 맞힌 사람: 205, 정답 비율: 60.117%

### 분류

구현, 자료 구조

### 문제 설명

<p>You are given an ordered sequence of integers, (1, 2, 3, . . . , n). Then, a number of requests will&nbsp;be given. Each request specifies an integer in the sequence. You need to move the specified&nbsp;integer to the head of the sequence, leaving the order of the rest untouched. Your task is to find&nbsp;the order of the elements in the sequence after following all the requests successively.</p>

### 입력

<p>The input consists of a single test case of the following form.</p>

<pre>
n m
e<sub>1</sub>
.
.
.
e<sub>m</sub></pre>

<p>The integer n is the length of the sequence (1 &le; n &le; 200000). The integer m is the number&nbsp;of requests (1 &le; m &le; 100000). The following m lines are the requests, namely e<sub>1</sub>, . . . , e<sub>m</sub>, one&nbsp;per line. Each request e<sub>i</sub> (1 &le; i &le; m) is an integer between 1 and n, inclusive, designating the&nbsp;element to move. Note that, the integers designate the integers themselves to move, not their&nbsp;positions in the sequence.</p>

### 출력

<p>Output the sequence after processing all the requests. Its elements are to be output, one per&nbsp;line, in the order in the sequence.</p>

### 힌트

<p>In Sample Input 1, the initial sequence is (1, 2, 3, 4, 5). The first request is to move the integer&nbsp;4 to the head, that is, to change the sequence to (4, 1, 2, 3, 5). The next request to move the&nbsp;integer 2 to the head makes the sequence (2, 4, 1, 3, 5). Finally, 5 is moved to the head, resulting&nbsp;in (5, 2, 4, 1, 3).</p>