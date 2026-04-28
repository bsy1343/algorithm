# [Platinum III] A system of balance scales - 26241

[문제 링크](https://www.acmicpc.net/problem/26241)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

자료 구조, 트리, 세그먼트 트리, 오일러 경로 테크닉, 물리학

### 문제 설명

<p>A complicated system of balance scales and weights is set out on the floor. Each set of balance scales consist of a stand, a beam and two cups. The beam is <strong>not</strong> fixed and rests on the stand with a single point in such a manner that it can rotate freely around it in the vertical plane. Precise bearing point selection allows a state of nonstable equilibrium in horizontal position. Cups are attached to the beam ends, and they usually hold objects whose weights are to be compared. The distance from the bearing point to the cup is called a shoulder. The rule states that upon reaching the equilibrium shoulders correlate in the same way as do the weights of the objects in the cups. The system of balance scales and weights works in the following way: Each of the cups of all scales holds either a balance weight or another pair of balance scales. There is strictly one pair of balance scales standing directly on the floor, with all other scales standing in cups of other scales. The weights of all balance weights are known, and the weight of the scales themselves are negligibly small compared to the balance weights. All scales are always in the state of equilibrium owing to correct choice of bearing points. The sizes of balance weights, cups and stands are also negligibly small compared to the length of beams.</p>

<p>Process a sequence of queries of two types.</p>

<ol>
	<li>Change the weight of a given balance weight.</li>
	<li>Learn the position of the bearing point of a given pair of scales.</li>
</ol>

<p>After each weight change of any balance weight equilibrium must be restored in all scales in the system, with some of its bearing points shifting in the process.</p>

### 입력

<p>The first line contains two integers: $N$ --- the number of scales in the system($1 \le N \le 5 \cdot 10^4$) and $K$ --- the number of queries ($1 \le K \le 10^5$).</p>

<p>All scales are numbered with integers beginning from one and up. Scales with the number $1$ stand on the floor. All balance weights are also numbered with integers beginning from one and up.</p>

<p>The second line contains $(N+1)$ integers: the $t$-th of these numbers $W_t$ defines the initial weight of the balance weight with the number $t$ ($1 \le W_t \le 10^9$).</p>

<p>The following $N$ line describe the scales. The $i$-th of these lines contains three integers: $S_i$ --- length of the beam of the $i$-th pair of scales ($1 \le L_i \le 10^4$), $L_i$ --- number of the scales standing in the left cup of the $i$-th scales and $R_i$ --- number of the scales standing in the right cup of the $i$-th scales. If the left cup is occupied by scales, then $i &lt; L_i \le N$, if it is occupied by a balance weight, then $L_i$ equals the number of the balance weight with a &lt;&lt;minus&gt;&gt; sign, with $1 \le -L_i \le N+1$. Similarly, $R_i$ defines either the number of the standing scales ($i &lt; R_i \le N$) or the number of the balance weight with a &lt;&lt;minus&gt;&gt; ($1 \le -R_i \le N+1$).</p>

<p>This is followed by $K$ lines, with every $j$-th line containing a single query. The query description begins with an integer $t_j$, defining the query type ($1 \le t_j \le 2$). If $t_j = 1$, it is followed by two integers: $k_j$ --- number of the balance weight with its weight being changed ($1 \le k_j \le N+1$), $V_j$ --- new weight of the balance weight($1 \le V_j \le 10^9$). If $t_j = 2$, it is followed by a single integer $k_j$ --- the number of scales for which the position of its bearing point must be found ($1 \le k_j \le N$). There are no other types of queries.</p>

### 출력

<p>For each query to define the bearing point a single integer must be printed: the distance from the left cup of the scales to the bearing point. Answers must be produced in the order of occurence of the corresponding queries in the input data. The absolute or relative error of each answer should be less than or equal $10^{-13}$.</p>

### 힌트

<p>Initial state of the system from the second sample:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26241.%E2%80%85A%E2%80%85system%E2%80%85of%E2%80%85balance%E2%80%85scales/14a89c2a.png" data-original-src="https://upload.acmicpc.net/89050783-27f0-43cf-b98f-0d28fb8b4575/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 511px; height: 117px;" /></p>