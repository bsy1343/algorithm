# [Platinum I] Hungry Arachnid - 32737

[문제 링크](https://www.acmicpc.net/problem/32737)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 깊이 우선 탐색, 트리

### 문제 설명

<p>You are given a tree on $n$ nodes rooted at node $1$. A spider and a fly are in the tree. The spider has three legs which are initially on nodes $a$, $b$, and $c$. The fly is on node $f$ and does not move. </p>

<p>Some nodes are considered to be in the shadow of the spider. A node is in the shadow of the spider if it lies on any of the three shortest paths between its legs, $a$--$b$, $a$--$c$, and $b$--$c$. </p>

<p>The spider can move its legs from vertices $a$, $b$, $c$ to vertices $a'$, $b'$, $c'$ if the size of its shadow remains constant and $\max\{\textrm{dist}(a, a'), \textrm{dist}(b, b'), \textrm{dist}(c, c')\}\leq 1$. The function $\textrm{dist}(u,\,v)$ indicates the number of edges on the shortest path between nodes $u$ and $v$ in the tree.</p>

<p>For example, here is one possible sequence of two moves by a spider with $6$ nodes in its shadow. The vertices that have a red outline are in the shadow of the spider, and the vertices that are colored red are the spider's legs.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32737.%E2%80%85Hungry%E2%80%85Arachnid/9c73590a.png" data-original-src="https://boja.mercury.kr/assets/problem/32737-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 661px; height: 200px;"></p>

<p>The spider eats through its legs. Determine whether the spider can move any of its legs to the fly's location, after any number of moves (possibly zero).</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1\le t\le  10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains a single integer $n$ ($2\leq n\leq 2\cdot 10^5$) --- the number of vertices in the tree.</p>

<p>The next line of each test case contains $n-1$ integers $p_2,\,p_3,\,\ldots,\,p_n$ ($1 \le p_i &lt; i$) --- the parents of each vertex in the tree, except the root.</p>

<p>The next line of each test case contains three integers $a$, $b$, and $c$ ($1\leq a,\,b,\,c\leq n$) --- the initial positions of each of the spider's legs.</p>

<p>The fourth and final line of each test case contains an integer $f$ ($1\leq f\leq n$) --- the position of the fly.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print "<code>YES</code>" if the spider is able to catch the fly, and "<code>NO</code>" otherwise.</p>

<p>You can output the answer in any case (upper or lower). For example, the strings "<code>yEs</code>", "<code>yes</code>", "<code>Yes</code>", and "<code>YES</code>" will be recognized as positive responses.</p>

### 힌트

<p>In the first test case, all legs of the spider are initially on vertex $2$, so that is the only vertex in the shadow. By moving all legs to vertex $1$ at the same time, the spider can reach the food while keeping its shadow the same size.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32737.%E2%80%85Hungry%E2%80%85Arachnid/2697718e.png" data-original-src="https://boja.mercury.kr/assets/problem/32737-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 110px; height: 89px;"></p>

<p>In the second test case, the spider can use this move to reach the food with one of its legs:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32737.%E2%80%85Hungry%E2%80%85Arachnid/5c07136d.png" data-original-src="https://boja.mercury.kr/assets/problem/32737-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 296px; height: 165px;"></p>

<p>In the third test case, the food is located at vertex $1$, which is in the shadow of the spider, but the spider cannot move any of its legs to the food:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32737.%E2%80%85Hungry%E2%80%85Arachnid/3ccb8f23.png" data-original-src="https://boja.mercury.kr/assets/problem/32737-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 158px;"></p>