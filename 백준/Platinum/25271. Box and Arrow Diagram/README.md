# [Platinum III] Box and Arrow Diagram - 25271

[문제 링크](https://www.acmicpc.net/problem/25271)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 8, 맞힌 사람: 7, 정답 비율: 24.138%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 오프라인 쿼리

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25271.%E2%80%85Box%E2%80%85and%E2%80%85Arrow%E2%80%85Diagram/942f28cb.png" data-original-src="https://upload.acmicpc.net/57e966ed-c98e-4b2d-a593-aab82edc24ff/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 263px; height: 160px;" /></p>

<p style="text-align: center;">An example of a box and arrow diagram, taken from <a href="https://github.com/dicander/box_arrow_diagram">github.com/dicander/box_arrow_diagram</a></p>

<p>What an embarrassment! Itaf got 0/5 points in her last &quot;Fundamental programming in Python&quot; exam. She studies Engineering physics at KTH and is struggling with this course. She is not alone, as $60\%$ of her classmates failed the exam this year. The reason for this oddly high percentage is the so called <em>box and arrow diagram</em> (l&aring;d- och pildiagram).</p>

<p>In this part of the exam you are given a piece of Python code and you have to draw how the memory structure will look like when the program reaches a given line. Since Itaf is a high-rated competitive programmer her ego always came in the way whenever she tried to study for the test, because it felt &quot;too easy&quot;. But now she has become desperate and needs your help.</p>

<p>The <em>box and arrow diagram</em> is used to explain the memory structure inside Python. Simplified, the diagram can be seen as a directed graph with nodes (boxes) labeled from $1$ to $N$ and edges (arrows) labeled from $1$ to $M$. The boxes corresponds to the objects in the memory of a Python program. Box 1 is special, it represents the <em>global</em> object. An arrow being drawn from box $u$ to box $v$ in the diagram means that object $u$ stores a reference of object $v$. If $u$ stores multiple references of $v$, then you draw multiple arrows from $u$ to $v$. It is also possible for an object to contain references to itself.</p>

<p>An object $u$ is said to be <em>alive</em> if there exists a path from the <em>global</em> object to $u$ in the <em>box and arrow diagram</em>. Each object also has a reference counter. The reference counter of an object $u$ is defined as the number of arrows $(v,u)$ such that $v$ is alive.</p>

<p>Itaf now needs your help, and she will ask you $Q$ queries, each query can be one of two types.</p>

<ul>
	<li><code>1 X</code> Remove the arrow with label $X$ from the diagram.}</li>
	<li><code>2 Y</code> Output the reference counter of the object with label $Y$.}</li>
</ul>

### 입력

<p>The first line consists of two space separated integers $N,M$ ($1 \leq N,M \leq 2 \cdot 10^5$), where $N$ is the number of boxes in the diagram and $M$ is the number of arrows in the diagram.</p>

<p>The next $M$ lines describe the arrows in the diagram. The $i$-th line contains $2$ space separated integers $U_i,V_i$ ($1 \leq U_i,V_i \leq N$), meaning the arrow with label $i$ goes from box $U_i$ to box $V_i$. Note that arrows forming loops and multi-edges are allowed.</p>

<p>The next line contains an integer $Q$ ($1 \leq Q \leq 2 \cdot 10^5$), the number of queries. The next $Q$ lines describe the $Q$ queries. The $j$-th query is given as a pair of space separated integers $C_j, X_j$ ($1 \leq C_j \leq 2$).</p>

<ul>
	<li>If $C_j = 1$ then remove the arrow labeled $X_j$ from the diagram ($1 \leq X_j \leq M$).</li>
	<li>If $C_j = 2$ then output the reference counter of object $X_j$ ($1 \leq X_j \leq N$).</li>
</ul>

<p>It is guaranteed that there will not be two queries of type $1$ with same value of $X_j$, meaning the same arrow will never be deleted twice.</p>

### 출력

<p>For each query of type $2$, output a single line containing the reference count of object $Y_j$.</p>