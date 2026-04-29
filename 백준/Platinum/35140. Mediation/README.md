# [Platinum I] Mediation - 35140

[문제 링크](https://www.acmicpc.net/problem/35140)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 수학, 조합론

### 문제 설명

<p>You are the mayor of a tree-structured city with $N$ districts, numbered from $1$ to $N$, connected by $N - 1$ roads, numbered from $1$ to $N - 1$. Road $i$ connects district $U_i$ and district $V_i$ bidirectionally with weight $W_i$. Two districts $S_1$ and $S_2$ have been marked as <strong>mediator districts</strong>. The travel cost between district $x$ and district $y$, denoted by $d(x, y)$, is the minimum sum of weights of the roads you need to pass through.</p>

<p>Whenever a conflict arise between any two districts, the mediator districts are required to travel to the conflicting districts. The <strong>mediation cost</strong> for two conflicting districts $u$ and $v$, denoted by $M(u, v)$, is the maximum travel cost of the mediator districts to the nearest conflicting district. Formally, $M(x, y)$ can be calculated as follows.</p>

<p>\[M(u, v) = \max(\min(d(u, S_1), d(v, S_1)), \min(d(u, S_2), d(v, S_2)))\]</p>

<p>Calculate the sum of mediation cost $M(u, v)$ over all $1 \leq u &lt; v \leq N$.</p>

### 입력

<p>The first line contains three integers: $N$, $S_1$, and $S_2$ ($2 \le N \le 200\,000$; $1 \leq S_1 &lt; S_2 \leq N$).</p>

<p>The next $N-1$ lines contains integers $U_i$, $V_i$, and $W_i$ ($1 \le U_i &lt; V_i \le N$; $1 \leq W_i \leq 100$) describing an edge.</p>

### 출력

<p>Output the sum of mediation cost in a single line.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> The city is illustrated as follows.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35140.%E2%80%85Mediation/fe29567c.png" data-original-src="https://boja.mercury.kr/assets/problem/35140-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 158px;"></p>

<p>The values of $M(u, v)$ over all $1 \leq u &lt; v \leq N$ are presented as follows.</p>

<table class="table-center-30 th-center td-center table table-bordered">
<thead>
<tr>
<th>u \ v</th>
<th>1</th>
<th>2</th>
<th>3</th>
<th>4</th>
<th>5</th>
<th>6</th>
</tr>
</thead>
<tbody>
<tr>
<th>1</th>
			<td style="background-color:#EFEFEF;"> </td>
<td>3</td>
<td>4</td>
<td>3</td>
<td>2</td>
<td>5</td>
</tr>
<tr>
<th>2</th>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
<td>1</td>
<td>0</td>
<td>1</td>
<td>3</td>
</tr>
<tr>
<th>3</th>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
<td>3</td>
<td>2</td>
<td>2</td>
</tr>
<tr>
<th>4</th>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
<td>2</td>
<td>2</td>
</tr>
<tr>
<th>5</th>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
			<td style="background-color:#EFEFEF;"> </td>
<td>2</td>
</tr>
</tbody>
</table>

<p>The sum of all $M(u, v)$ is 35.</p>