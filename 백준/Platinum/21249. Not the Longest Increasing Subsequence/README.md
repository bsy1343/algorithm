# [Platinum I] Not the Longest Increasing Subsequence - 21249

[문제 링크](https://www.acmicpc.net/problem/21249)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>There is an array of $n$ integers. Each element $a_i$ in this array is between $1$ and $k$.</p>

<p>What is the smallest number of elements that should be removed from this array, so that its longest increasing subsequence has length smaller than $k$?</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1 \le n \le 10^6, 1 \le k \le n$) --- the length of the array and the upper bound for its elements.</p>

<p>The second line contains $n$ integers $a_i$ ($1 \le a_i \le k$) --- the elements of the array.</p>

### 출력

<p>In the first line output an integer $m$ --- the number of elements to remove.</p>

<p>In the second line output $m$ integers --- the indices of the removed elements. The indices are numbered from $1$ to $n$.</p>