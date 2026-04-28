# [Platinum V] Spacious Sets - 29786

[문제 링크](https://www.acmicpc.net/problem/29786)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 24, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

다이나믹 프로그래밍, 자료 구조, 그리디 알고리즘, 이분 탐색, 집합과 맵, 희소 배열

### 문제 설명

<p>Ada and John are best friends. Since they are getting bored, Ada asks John to solve a puzzle for her.</p>

<p>A set $S$ is considered <i>spacious</i> if the absolute difference between each pair of distinct elements of $S$ is at least $\mathbf{K}$, that is, $|x - y| \ge \mathbf{K}$ for all $x, y \in S$, with $x \ne y$.</p>

<p>Ada has a list of distinct integers $\mathbf{A}$ of size $\mathbf{N}$, and an integer $\mathbf{K}$. For each $\mathbf{A_i}$, she asks John to find the maximum size of a set $S_i$ made of elements from $\mathbf{A}$, such that $S_i$ contains $\mathbf{A_i}$ and is spacious.</p>

<p>Note: The sets $S_i$ do not need to be made of consecutive elements from the list.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains two integers $\mathbf{N}$ and $\mathbf{K}$.</p>

<p>The next line contains $\mathbf{N}$ integers $\mathbf{A_1} \mathbf{A_2} \dots \mathbf{A_N}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y<sub>1</sub> y<sub>2</sub> ... y<sub>N</sub>$</code>, where $x$ is the test case number (starting from 1) and $y_i$ is the maximum size of a spacious set of elements from $\mathbf{A}$ that contains $\mathbf{A_i}$.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$-10^9 \le \mathbf{A_i} \le 10^9$, for all $i$.</li>
	<li>$\mathbf{A_i} \ne \mathbf{A_j}$, for all $i \ne j$.</li>
</ul>

### 힌트

<p>In Sample Case #1, a spacious set cannot contain $1$ and $2$, nor it can contain $2$ and $3$. That implies that $S_2 = \{2\}$ and using $S_1 = S_3 = \{1,3\}$ makes them of maximum size.</p>

<p>In Sample Case #2, possible sets of maximum size are:</p>

<ul>
	<li>$S_1 = S_2 = S_3 = S_4 = \{2,7,11,19\}$,</li>
	<li>$S_5 = \{11,19,5\}$, and</li>
	<li>$S_6 = \{7,11,19,3\}$.</li>
</ul>

<p> </p>