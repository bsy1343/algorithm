# [Silver I] Misha's Product - 19840

[문제 링크](https://www.acmicpc.net/problem/19840)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 34, 맞힌 사람: 32, 정답 비율: 58.182%

### 분류

수학, 누적 합

### 문제 설명

<p>Misha really loves to invent new operations. Recently he has invented the new operation, that he has named <em>Misha&#39;s product</em> after himself.</p>

<p>Misha&#39;s product of the set of different integer numbers $a_1, a_2, \ldots, a_n$ is defined as follows. Consider all possible ordered pairs $(a_i, a_j)$ of different numbers from this set. For each pair write these numbers one after another without a space, and get a new number $b_{ij}$. Misha&#39;s product of the initial set is the sum of all values $b_{ij}$.</p>

<p>Help Misha to calculate Misha&#39;s product for the given set of integers. Misha wants to calculate it modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains one integer $n$ --- the number of elements in the set ($2 \le n \le 10^5$).</p>

<p>The second line contains $n$ different integers $a_1, a_2, \ldots, a_n$ --- numbers from the set ($1 \le a_i \le 10^8$).</p>

### 출력

<p>Output one number --- Misha&#39;s product of the given set of numbers, modulo $10^9 + 7$.</p>

### 힌트

<p>There are six possible pairs in sample test, the following values $b_{ij}$ are obtained: 13, 31, 101, 103, 110, 310, their sum is equal to 668.</p>