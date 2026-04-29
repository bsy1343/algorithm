# [Platinum V] Average Value - 33333

[문제 링크](https://www.acmicpc.net/problem/33333)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 166, 정답: 48, 맞힌 사람: 32, 정답 비율: 27.826%

### 분류

분할 정복을 이용한 거듭제곱, 수학, 임의 정밀도 / 큰 수 연산, 정수론, 해싱

### 문제 설명

<p>You are given an array $a$ of $n$ integers. Find any index $i$ ($1 \le i \le n$) such that the element $a_i$ equals to the geometric mean of all the other elements. In other words, find any index $i$ that satisfies the following formula: $$ a_i = \root{n-1}\of{\prod_{\substack{k=1 \\ k \neq i}}^n a_k}\text{.} $$</p>

### 입력

<p>The first line contains one integer $n$ ($2 \leq n \leq 10^5$): the length of the array.</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($a_k \geq 1$; the total number of digits in all numbers does not exceed $300\,000$).</p>

<p>It is guaranteed that the answer exists for the given array.</p>

### 출력

<p>Output one integer: the index of the element that equals to geometric mean of the others items. It there are several answers, output any one of them.</p>