# [Gold IV] Travelling Caterpillar - 24935

[문제 링크](https://www.acmicpc.net/problem/24935)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 50, 맞힌 사람: 42, 정답 비율: 68.852%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>Lilith is a hungry caterpillar! From her vantage point at the root of a tree, she has identified some leaves she wishes to munch before returning to the root. She wants to finish munching all of them as quickly as possible so that she will grow into a plump, buttery butterfly.</p>

<p>The tree Lilith occupies is a bit unusual. We can view it as a collection of nodes, where some of the nodes contain leaves that Lilith wishes to munch. Each branch connects exactly two nodes together. It is guaranteed that between every pair of nodes, there is precisely one way to travel from one to the other.</p>

<p>Given a description of the tree and which nodes have leaves that Lilith wishes to munch, can you help Lilith route her munching by minimizing the time she must travel?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24935.%E2%80%85Travelling%E2%80%85Caterpillar/826637f6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24935.%E2%80%85Travelling%E2%80%85Caterpillar/826637f6.png" data-original-src="https://upload.acmicpc.net/59b4ce20-9b9c-409e-ba61-e3f1784fa448/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 171px;" /></p>

<center>
<p><b>Figure 1</b>: Illustration of Sample Input $1$. Lilith can munch the nodes at leaves&nbsp;$2,3,6$&nbsp;and return to the root&nbsp;$0$&nbsp;by following the following sequence of nodes:&nbsp;$0&rarr;4&rarr;6&rarr;4&rarr;0&rarr;1&rarr;2&rarr;1&rarr;3&rarr;1&rarr;0$. The total distance Lilith travels is the length of each branch she crossed in this sequence:&nbsp;$2+3+3+2+5+1+1+4+4+5=30$.</p>
</center>

### 입력

<p>The first line of input contains two integers&nbsp;$N$&nbsp;($1&le;N&le;1000$), which is the number of nodes in the tree, and&nbsp;$K$&nbsp;($1&le;K&le;N$), which is the number of leaves to be munched.</p>

<p>The next&nbsp;$N-1$&nbsp;lines of input describe the branches (edges) of the tree. The&nbsp;$i$th such line contains three integers&nbsp;$s_i$,&nbsp;$t_i$&nbsp;($0&le;s_i,t_i&lt;N$, $s_i&ne;t_i$), and&nbsp;$d_i$&nbsp;($0&le;d_i&le;10^6$). This indicates there is a branch between node&nbsp;$s_i$&nbsp;and node&nbsp;$t_i$&nbsp;which takes&nbsp;$d_i$&nbsp;time to cross. Furthermore, if we view the tree as rooted at node&nbsp;$0$, we have that&nbsp;$s_i$&nbsp;is the parent of&nbsp;$t_i$&nbsp;(i.e.&nbsp;$s_i$&nbsp;lies on the unique path from&nbsp;$0$&nbsp;to&nbsp;$t_i$). Lilith always starts at the root node&nbsp;$0$.</p>

<p>The last line of input contains&nbsp;$K$&nbsp;distinct integers&nbsp;$a_1,\dots ,a_K$&nbsp;($0&le;a_i&lt;N$), which indicates the nodes containing leaves that Lilith wants to munch.</p>

### 출력

<p>Display the length of the shortest path along the branches of the tree, starting and ending at the root, which allows Lilith to eat all leaves.</p>