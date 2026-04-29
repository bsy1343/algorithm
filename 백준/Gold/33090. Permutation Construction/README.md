# [Gold III] Permutation Construction - 33090

[문제 링크](https://www.acmicpc.net/problem/33090)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 스택, 자료 구조, 정렬

### 문제 설명

<p>Adrian challenges you to construct a permutation of $1$ to $N$ (inclusive) that satisfies his requirements. Suppose that your permutation is denoted as $P$. There are $N$ requirements, numbered from $1$ to $N$. Requirement $i$ is represented by $A_i$, which can be one of the followings:</p>

<ul>
	<li>if $A_i = -1$, then there is no $x$ that satisfy $x &gt; i$ and $P_x &gt; P_i$; or</li>
	<li>if $i &lt; A_i ≤ N$, then $A_i$ is the smallest index larger than $i$ that satisfy $P_{A_i} &gt; P_i$.</li>
</ul>

<p>Construct any permutation that satisfies all of the requirements, or tell Adrian if it is impossible to construct such a permutation.</p>

<p>Note that a permutation of $1$ to $N$ (inclusive) is a sequence where each integer from $1$ to $N$ appears in the sequence exactly once.</p>

### 입력

<p>Input begins with an integer $N$ ($1 ≤ N ≤ 100\, 000$). The next line contains $N$ integers $A_i$ ($A_i = -1$ or $i &lt; A_i ≤ N$) representing the given requirements.</p>

### 출력

<p>If at least one permutation that satisfies all the requirements can be found, output $N$ space-separated integers in a single line representing the permutation. If there are several permutations that satisfy all of the requirements, output any of them.</p>

<p>If there is no permutation that satisfies all the requirements, output <code>-1</code> in a single line.</p>