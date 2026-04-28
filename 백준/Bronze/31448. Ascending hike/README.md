# [Bronze II] Ascending hike - 31448

[문제 링크](https://www.acmicpc.net/problem/31448)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 202, 정답: 132, 맞힌 사람: 111, 정답 비율: 68.519%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>Participating in the Olympics requires training, e.g., climbing from deep valleys to high peaks. Hence, you decided to go out for a hike in which you would be continuously walking on an upward slope, with the largest possible elevation gain.</p>

<p>You have noted the altitude of several remarkable points through which your hike would go: these altitudes are pairwise distinct integers $A_1, A_2, \dots , A_N$. The slope between the $k$<sup>th</sup> and $(k + 1)$<sup>th</sup> remarkable points is upward if $A_k &lt; A_{k+1}$, and downward if $A_k &gt; A_{k+1}$ . Given this list of altitudes, what is the maximal elevation gain of a continuously upward slope on your hike?</p>

### 입력

<p>The input consists of two lines. The first line contains the number $N$. The second line contains $N$ space-separated integers $A_1, A_2, \dots , A_N$.</p>

### 출력

<p>The output should contain a single line, consisting of a single number: the maximal integer $G$ for which there exist integers $k, k + 1, k + 2, \dots , \ell$ such that $A_k &lt; A_{k+1} &lt; A_{k+2} &lt; \dots &lt; A_{\ell} = A_k + G$.</p>

### 제한

<ul>
	<li>$2 \le N \le 1\, 000\, 000$</li>
	<li>$0 \le A_k \le 1\, 000\, 000\, 000$ for all $k ⩽ N$</li>
</ul>