# [Platinum III] Evolutionary Algorithms - 29799

[문제 링크](https://www.acmicpc.net/problem/29799)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

자료 구조, 트리, 세그먼트 트리, 오일러 경로 테크닉

### 문제 설명

<p>Ada is working on a science project for school. She is studying evolution and she would like to compare how different species of organisms would perform when trying to solve a coding competition problem.</p>

<p>The $\mathbf{N}$ species are numbered with integers between $1$ and $\mathbf{N}$, inclusive. Species $1$ has no direct ancestor, and all other species have exactly one direct ancestor each, from which they directly evolved. A (not necessarily direct) ancestor of species $x$ is any other species $y$ such that $y$ can be reached from $x$ by moving one or more times to a species direct ancestor starting from $x$. In this way, species $1$ is a (direct or indirect) ancestor of every other species.</p>

<p>Through complex genetic simulations, she calculated the average score each of the $\mathbf{N}$ species would get in a particular coding competition. $\mathbf{S_i}$ is that average score for species $i$.</p>

<p>Ada is looking for <i>interesting triplets</i> to showcase in her presentation. An interesting triplet is defined as an ordered triplet of distinct species $(a, b, c)$ such that:</p>

<ol>
	<li>Species $b$ is a (direct or indirect) ancestor of species $a$.</li>
	<li>Species $b$ is not a (direct or indirect) ancestor of species $c$.</li>
	<li>Species $b$ has an average score strictly more than $\mathbf{K}$ times higher than both of those of $a$ and $c$. That is, $\mathbf{S_b} \ge \mathbf{K} \times \max(\mathbf{S_a}, \mathbf{S_c}) + 1$.</li>
</ol>

<p>Given the species scores and ancestry relationships, help Ada by writing a program to count the total number of interesting triplets.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains two integers $\mathbf{N}$ and $\mathbf{K}$, denoting the number of species and the factor which determines interesting triplets, respectively.</p>

<p>The second line of each test case contains $\mathbf{N}$ integers $\mathbf{S_1}, \mathbf{S_2}, \dots, \mathbf{S_N}$, where $\mathbf{S_i}$ denotes the average score of species $i$.</p>

<p>The third line of each test case contains $\mathbf{N}-1$ integers $\mathbf{P_2}, \mathbf{P_3}, \dots, \mathbf{P_N}$, meaning species $\mathbf{P_i}$ is the direct ancestor of species $i$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the total number of interesting triplets according to Ada&#39;s definition.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{K} \le 10^9$.</li>
	<li>$1 \le \mathbf{S_i} \le 10^9$, for all $i$.</li>
	<li>$1 \le \mathbf{P_i} \le \mathbf{N}$, for all $i$.</li>
	<li>Species $1$ is a (direct or indirect) ancestor of all other species.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7d9bf284-cba9-4e9f-86c5-747c8d65e38a/-/preview/" /></p>

<p>In Sample Case #1, there is only one possible interesting triplet: $(5, 3, 4)$. Indeed, we can verify that:</p>

<ol>
	<li>Species $b = 3$ is an ancestor of species $a = 5$.</li>
	<li>Species $b = 3$ is not an ancestor of species $c = 4$.</li>
	<li>The score of species $b = 3$ is more than $\mathbf{K}$ times higher than the scores of both $a = 5$ and $c = 4$: $6 = \mathbf{S_3} \ge \mathbf{K} \times \max(\mathbf{S_4}, \mathbf{S_5}) + 1 = 2 \times \max(2, 2) + 1 = 5$.</li>
</ol>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3d414cf8-5016-4dff-bd4c-c87cd8bf8628/-/preview/" /></p>

<p>In Sample Case #2, there are seven interesting triplets:</p>

<ul>
	<li>$(4, 3, 1)$</li>
	<li>$(4, 3, 6)$</li>
	<li>$(4, 7, 1)$</li>
	<li>$(4, 7, 5)$</li>
	<li>$(4, 7, 6)$</li>
	<li>$(5, 3, 1)$</li>
	<li>$(5, 3, 6)$</li>
</ul>