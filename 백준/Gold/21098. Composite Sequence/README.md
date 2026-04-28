# [Gold III] Composite Sequence - 21098

[문제 링크](https://www.acmicpc.net/problem/21098)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 158, 정답: 76, 맞힌 사람: 60, 정답 비율: 49.587%

### 분류

수학, 정수론, 많은 조건 분기, 소수 판정

### 문제 설명

<p>A sequence $S$ of positive integers is a <em>composite sequence</em> if and only if there is a non-empty subsequence $T$ of $S$ such that the sum of all integers in $T$ is a composite number.</p>

<p>Given $S$, your task is to check whether $S$ is a composite sequence.</p>

<p>Note that $1$ is not a composite number.</p>

<p>Recall that $T$ is a subsequence of $S$ if and only if we can obtain $T$ by removing some elements of $S$ (possibly none or all).</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 10^5$), the size of $S$.</p>

<p>The second line contains $n$ integers $S_1, S_2, \ldots, S_n$: the elements of $S$ ($1 \le S_i \le 10^9$).</p>

### 출력

<p>If $S$ is a composite sequence, output &quot;<code>Yes</code>&quot;. Otherwise, output &quot;<code>No</code>&quot;.</p>