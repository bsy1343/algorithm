# [Platinum V] IQ Test - 18665

[문제 링크](https://www.acmicpc.net/problem/18665)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 701, 정답: 257, 맞힌 사람: 209, 정답 비율: 36.926%

### 분류

그리디 알고리즘, 애드 혹, 집합과 맵, 재귀

### 문제 설명

<p>You are given a set S of integers. Initially, S contains 0, 1, and 2.</p>

<p>You can perform zero or more steps. On each step, you choose two elements (possibly equal) x and y such that x &isin; S and y &isin; S, and insert the number x<sup>2</sup> &minus; y into the set S.</p>

<p>You can not perform more than 43 steps.</p>

<p>Your task is to get the integer n in your set.</p>

### 입력

<p>The first line contains a single integer n (0 &le; n &le; 10<sup>18</sup>), the number you have to get in the set.</p>

### 출력

<p>For each step, print x and y on a separate line. The condition 0 &le; x<sup>2</sup> &minus; y &le; 10<sup>18</sup> must be satisfied.</p>

<p>The number of steps must be at most 43. Note that you don&rsquo;t have to minimize it. If there are several possible solutions, print any one of them.</p>