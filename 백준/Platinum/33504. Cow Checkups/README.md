# [Platinum V] Cow Checkups - 33504

[문제 링크](https://www.acmicpc.net/problem/33504)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 155, 정답: 83, 맞힌 사람: 73, 정답 비율: 68.224%

### 분류

수학, 이분 탐색, 정렬, 조합론

### 문제 설명

<p>Farmer John's $N$ ($1 \leq N \leq 5 \cdot 10^5$) cows are standing in a line, with cow $1$ at the front of the line and cow $N$ at the back of the line. FJ's cows also come in many different species. He denotes each species with an integer from $1$ to $N$. The $i$'th cow from the front of the line is of species $a_i$ ($1 \leq a_i \leq N$).</p>

<p>FJ is taking his cows to a checkup at a local bovine hospital. However, the bovine veterinarian is very picky and wants to perform a checkup on the $i$'th cow in the line, only if it is species $b_i$ ($1 \leq b_i \leq N$).</p>

<p>FJ is lazy and does not want to completely reorder his cows. He will perform the following operation <strong>exactly once</strong>.</p>

<ul>
	<li>Select two integers $l$ and $r$ such that $1 \leq l \le r \leq N$. Reverse the order of the cows that are between the $l$-th cow and the $r$-th cow in the line, inclusive.</li>
</ul>

<p>FJ wants to measure how effective this approach is. Find the sum of the number of cows that are checked by the veterinarian over all $N(N+1)/2$ possible operations.</p>

### 입력

<p>The first line contains an integer $N$.</p>

<p>The second line contains $a_1, a_2, \ldots, a_N$.</p>

<p>The third line contains $b_1, b_2, \ldots, b_N$.</p>

### 출력

<p>Output one line with the sum of the number of cows that are checked by the veterinarian over all possible operations.</p>