# [Platinum II] Moves You Need to Make - 23685

[문제 링크](https://www.acmicpc.net/problem/23685)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

자료 구조, 애드 혹, 세그먼트 트리

### 문제 설명

<p>You are given a permutation.</p>

<p>A move is one of the following:</p>

<ol>
	<li>Swap two adjacent elements.</li>
	<li>Swap the first and the last elements. Can be used at most once.</li>
</ol>

<p>What is the minimum number of moves you need to make to sort the given permutation?</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \leq n \leq 3 \cdot 10^5$), the length of the permutation.</p>

<p>The second line contains $n$ integers $a_i$ ($1 \leq a_i \leq n$), the permutation itself. </p>

### 출력

<p>Output a single integer --- the minimum number of moves you need to make to sort the given permutation.</p>