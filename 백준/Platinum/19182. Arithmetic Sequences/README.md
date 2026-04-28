# [Platinum V] Arithmetic Sequences - 19182

[문제 링크](https://www.acmicpc.net/problem/19182)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 11, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

수학, 다이나믹 프로그래밍, 자료 구조, 그리디 알고리즘, 정렬, 이분 탐색, 집합과 맵

### 문제 설명

<p>An arithmetic sequence is a sequence of numbers such that the difference between consecutive elements is constant. For example, the sequence $5, 7, 9, 11, 13$ is an arithmetic sequence (the common difference is $2$), but the sequence $1, 2, 4, 5$ is not (the differences between consecutive elements are $1$, $2$ and $1$).</p>

<p>Given the set of integers $\{a_1, a_2, \ldots, a_n\}$, find the size of its largest subset that forms an arithmetic sequence.</p>

<p>The set $A$ is said to form an arithmetic sequence if there exists an ordering of $A$ that is an arithmetic sequence.</p>

### 입력

<p>The first line of input contains a single integer $z$, the number of test cases. The descriptions of the test cases follow.</p>

<p>Each test case consists of a separate line containing an integer $n$ ($1 \leq n \leq 2000$) followed by $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \leq a_i \leq 10^9$). The numbers $a_i$ are pairwise distinct.</p>

### 출력

<p>For each test case, output a single line containing the size of the largest arithmetic sequence found in the given set.</p>