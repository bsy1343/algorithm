# [Platinum III] Sandpile on Clique - 31690

[문제 링크](https://www.acmicpc.net/problem/31690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 13, 맞힌 사람: 10, 정답 비율: 35.714%

### 분류

수학, 구현, 자료 구조, 시뮬레이션, 불변량 찾기

### 문제 설명

<p>The <em>Abelian Sandpile Model</em> is a famous dynamical system displaying self-organized criticality. It has been studied for decades since it was introduced by Per Bak, Chao Tang and Kurt Wiesenfeld in a 1987 paper. The sandpile prediction is of wide interest in physics, computer science, and mathematics, both for its beautiful algebraic structure and for its relevance to applications like load balancing and derandomization of models like internal diffusion-limited aggregation. The sandpile model is related to many other models and physical phenomena, like the rotor-routing model, avalanche models.</p>

<p>In the sandpile model, we are given an undirected graph $G$ whose vertices are indexed from $1$ to $n$. We&rsquo;re also given $n$ integers $a_1, a_2, \cdots , a_n$ where $a_i$ indicates that there are $a_i$ chips placed on vertex $i$ initially. Each turn we will pick an arbitrary vertex $v$ such that the number of chips on $v$ is not smaller than the number of edges connecting $v$, denoted as $d_v$. For each neighbor of $v$, it will receive one chip from $v$. Therefore, $v$ will lost $d_v$ chips. This process is called firing or toppling. Firing will keep happening until no vertex $v$ has at least $d_v$ chips.</p>

<p>It can be proven that the order of firing doesn&rsquo;t affect the result. Meanwhile, it is also possible that the firing will never terminate. This instance is described as &ldquo;recurrent&rdquo;. Now you are given a clique and the initial number of chips. Determine whether this instance is a recurrent one. If not, please output the final number of chips for each node respectively.</p>

<p>A clique (also called a complete graph) is a graph where every two vertices are connected with an edge.</p>

### 입력

<p>There is only one test case in each test file.</p>

<p>The first line of the input contains an integer $n$ ($2 &le; n &le; 5 \times 10^5$) indicating the size of the clique.</p>

<p>The second line contains $n$ integers $a_1, a_2, \cdots , a_n$ ($0 &le; a_i &le; 10^9$) where $a_i$ indicates the initial number of chips placed on vertex $i$.</p>

### 출력

<p>Output one line. If the given sandpile instance will terminate, output $n$ integers separated by a space where the $i$-th integer indicates the final number of chips on the $i$-th vertex. Otherwise output &ldquo;Recurrent&rdquo; (without quotes) instead.</p>

### 힌트

<p>For the first sample test case:</p>

<ul>
	<li>We can only select vertex $1$ at the beginning. The number of chips becomes $\{1, 1, 4, 1, 4\}$.</li>
	<li>We can now select vertex $3$ or $5$ because both of them have at least $4$ chips. We select vertex $3$ and the number of chips becomes $\{2, 2, 0, 2, 5\}$. Selecting vertex $5$ will lead to the same result.</li>
	<li>We now select vertex $5$. The number of chips becomes $\{3, 3, 1, 3, 1\}$. There is no vertex with at least $4$ chips so the firing terminates.</li>
</ul>

<p>For the second sample test case, we can select vertex $1$ and $2$ repeatedly. The firing never terminates.</p>