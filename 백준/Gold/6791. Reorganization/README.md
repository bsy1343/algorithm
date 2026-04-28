# [Gold II] Reorganization - 6791

[문제 링크](https://www.acmicpc.net/problem/6791)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

자료 구조, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Alice and Bob own a huge company. This company was losing money consistently over the last 30 years, since its owners spent too much time playing games with mathematicians. Alice and Bob decide to make a change.</p>

<p>Alice and Bob start by giving unique employee IDs to each of the n employees (1 &le; n &le; 100, 000), where each ID I is in the range (1 &le; I &le; 100, 000).</p>

<p>Then, Alice and Bob give unique ranks to each employee. Each rank R is an integer such that 1 &le; R &le; 10, 000, 000. After this, they plan to reorganize the company, by making sure that the employees satisfy the following conditions:</p>

<ol>
	<li>There is exactly one director, who has no supervisor;</li>
	<li>Except for the director, each employee has a supervisor, and this supervisor has a smaller employee ID and a higher rank (the value of rank is smaller); and</li>
	<li>Each employee can supervise at most 2 people.</li>
</ol>

<p>Alice and Bob are eager to know whether their company can be reorganized successfully.</p>

### 입력

<p>The input is a total of n + 1 lines. The first line contains n (1 &le; n &le; 100, 000), indicating the number of employees. On the next n lines are n distinct integers R (1 &le; R &le; 10, 000, 000), one integer per line, where the ith integer indicates the rank of the employee with ID i.</p>

### 출력

<p>Output <code>YES</code> if the company can be reorganized successfully; output <code>NO</code> otherwise.</p>