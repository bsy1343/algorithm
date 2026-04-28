# [Gold II] Bound Found - 6559

[문제 링크](https://www.acmicpc.net/problem/6559)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 20, 맞힌 사람: 4, 정답 비율: 14.286%

### 분류

정렬, 누적 합, 두 포인터

### 문제 설명

<p>Signals of most probably extra-terrestrial origin have been received and digitalized by The Aeronautic and Space Administration (that must be going through a defiant phase: &quot;But I <em>want</em> to use feet, not meters!&quot;). Each signal seems to come in two parts: a sequence of <em>n</em> integer values and a non-negative integer <em>t</em>. We&#39;ll not go into details, but researchers found out that a signal encodes two integer values. These can be found as the lower and upper bound of a subrange of the sequence whose absolute value of its sum is closest to <em>t</em>.</p>

<p>You are given the sequence of <em>n</em> integers and the non-negative target <em>t</em>. You are to find a non-empty range of the sequence (i.e. a continuous subsequence) and output its lower index <em>l</em> and its upper index <em>u</em>. The absolute value of the sum of the values of the sequence from the <em>l</em>-th to the <em>u</em>-th element (inclusive) must be at least as close to <em>t</em> as the absolute value of the sum of any other non-empty range.</p>

### 입력

<p>The input file contains several test cases. Each test case starts with two numbers <em>n</em> and <em>k</em>. Input is terminated by <em>n=k=0</em>. Otherwise, <em>1&lt;=n&lt;=100000</em> and there follow <em>n</em> integers with absolute values <em>&lt;=10000</em> which constitute the sequence. Then follow <em>k</em> queries for this sequence. Each query is a target <em>t</em> with <em>0&lt;=t&lt;=1000000000</em>.</p>

### 출력

<p>For each query output 3 numbers on a line: some closest absolute sum and the lower and upper indices of some range where this absolute sum is achieved. Possible indices start with <em>1</em> and go up to <em>n</em>.</p>