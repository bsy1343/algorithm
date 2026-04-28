# [Platinum II] Graph Traveler - 27486

[문제 링크](https://www.acmicpc.net/problem/27486)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 17, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 정수론, 방향 비순환 그래프, 함수형 그래프

### 문제 설명

<p>Gildong is experimenting with an interesting machine <em>Graph Traveler</em>. In Graph Traveler, there is a directed graph consisting of $n$ vertices numbered from $1$ to $n$. The $i$-th vertex has $m_i$ outgoing edges that are labeled as $e_i[0]$, $e_i[1]$, $\ldots$, $e_i[m_i-1]$, each representing the destination vertex of the edge. The graph can have multiple edges and self-loops. The $i$-th vertex also has an integer $k_i$ written on itself.A <em>travel</em> on this graph works as follows.</p>

<ol>
	<li>Gildong chooses a vertex to start from, and an integer to start with. Set the variable $c$ to this integer.</li>
	<li>After arriving at the vertex $i$, or when Gildong begins the travel at some vertex $i$, add $k_i$ to $c$.</li>
	<li>The next vertex is $e_i[x]$ where $x$ is an integer $0\le x\le m_i-1$ satisfying $x\equiv c\pmod{m_i}$. Go to the next vertex and go back to step 2.</li>
</ol>

<p>It&rsquo;s obvious that a travel never ends, since the 2nd and the 3rd step will be repeated endlessly.</p>

<p>For example, assume that Gildong starts at vertex $1$ with $c=5$, and $m_1=2$, $e_1[0] =1$, $e_1[1] =2$, $k_1=-3$. Right after he starts at vertex $1$, $c$ becomes $2$. Since the only integer $x$ ($0\le x\le 1$) where $x\equiv c\pmod{m_i}$ is $0$, Gildong goes to vertex $e_1[0] =1$. After arriving at vertex $1$ again, $c$ becomes $-1$. The only integer $x$ satisfying the conditions is $1$, so he goes to vertex $e_1[1] =2$, and so on.</p>

<p>Since Gildong is quite inquisitive, he&rsquo;s going to ask you $q$ queries. He wants to know how many <strong>distinct</strong> vertices will be visited <strong>infinitely many times</strong>, if he starts the travel from a certain vertex with a certain value of $c$. Note that you should <strong>not</strong> count the vertices that will be visited only finite times.</p>

### 입력

<p>The first line of the input contains an integer $n$ ($1\le n\le 1000$), the number of vertices in the graph.</p>

<p>The second line contains $n$ integers. The $i$-th integer is $k_i$ ($-10^9\le k_i\le 10^9$), the integer written on the $i$-th vertex.</p>

<p>Next $2\cdot n$ lines describe the edges of each vertex. The $(2\cdot i+1)$-st line contains an integer $m_i$ ($1\le m_i\le 10$), the number of outgoing edges of the $i$-th vertex. The $(2\cdot i+2)$-nd line contains $m_i$ integers $e_i[0]$, $e_i[1]$, $\ldots$, $e_i[m_i-1]$, each having an integer value between $1$ and $n$, inclusive.</p>

<p>Next line contains an integer $q$ ($1\le q\le 10^5$), the number of queries Gildong wants to ask.</p>

<p>Next $q$ lines contains two integers $x$ and $y$ ($1\le x\le n$, $-10^9\le y\le 10^9$) each, which mean that the start vertex is $x$ and the starting value of $c$ is $y$.</p>

### 출력

<p>For each query, print the number of <strong>distinct</strong> vertices that will be visited <strong>infinitely many times</strong>, if Gildong starts at vertex $x$ with starting integer $y$.</p>

### 힌트

<p>The first example can be shown like the following image:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27486.%E2%80%85Graph%E2%80%85Traveler/690caf45.png" data-original-src="https://upload.acmicpc.net/f98fbbf3-39b9-430d-b9e2-ed0b9a51f739/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 455px; width: 542px;" /></p>

<p>Three integers are marked on $i$-th vertex: $i$, $k_i$, and $m_i$ respectively. The outgoing edges are labeled with an integer representing the edge number of $i$-th vertex.</p>

<p>The travel for each query works as follows. It is described as a sequence of phrases, each in the format &ldquo;vertex ($c$ after $k_i$ added)&rdquo;.</p>

<ul>
	<li>$1(0)\to 2(0)\to 2(0)\to\ldots$</li>
	<li>$2(0)\to 2(0)\to\ldots$</li>
	<li>$3(-1)\to 1(-1)\to 3(-1)\to\ldots$</li>
	<li>$4(-2)\to 2(-2)\to 2(-2)\to\ldots$</li>
	<li>$1(1)\to 3(1)\to 4(1)\to 1(1)\to\ldots$</li>
	<li>$1(5)\to 3(5)\to 1(5)\to\ldots$</li>
</ul>

<p>The second example is same as the first example, except that the vertices have non-zero values. Therefore the answers to the queries also differ from the first example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27486.%E2%80%85Graph%E2%80%85Traveler/b0ba93a1.png" data-original-src="https://upload.acmicpc.net/cf8d6f53-cb28-4fab-9ca3-c98d2f329cc1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 455px; width: 542px;" /></p>

<p>The queries for the second example works as follows:</p>

<ul>
	<li>$1(4)\to 2(-1)\to 2(-6)\to\ldots$</li>
	<li>$2(-5)\to 2(-10)\to\ldots$</li>
	<li>$3(-4)\to 1(0)\to 2(-5)\to 2(-10)\to\ldots$</li>
	<li>$4(-3)\to 1(1)\to 3(-2)\to 4(-3)\to\ldots$</li>
	<li>$1(5)\to 3(2)\to 1(6)\to 2(1)\to 2(-4)\to\ldots$</li>
	<li>$1(9)\to 3(6)\to 2(1)\to 2(-4)\to\ldots$</li>
</ul>