# [Gold I] Kudzu Kniving - 23374

[문제 링크](https://www.acmicpc.net/problem/23374)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 36, 맞힌 사람: 33, 정답 비율: 55.932%

### 분류

수학, 다이나믹 프로그래밍, 자료 구조, 애드 혹, 트리, 집합과 맵, 비트마스킹, 해시를 사용한 집합과 맵, 트리에서의 다이나믹 프로그래밍, 트리를 사용한 집합과 맵, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>You can&#39;t deny it anymore: the kudzu vines in your garden have grown out of control. Some years ago, you planted a single seedling which you received as a gift from your Mathematics teacher. You vaguely remember her explaining how it grows:</p>

<ul>
	<li>It started as a single root vertex, labelled $0$.</li>
	<li>Every year, it grows some new vertices and edges: if at the start of the year it has $n$ vertices, then during this year, it will grow a new edge and vertex from each of the $n$ vertices. If an old vertex had index $v$, then the new vertex which grows from it will have index $v+n$.</li>
	<li>It can be shown that after $i$ years, your kudzu plant has exactly $2^i$ vertices, numbered $0$ to $2^i-1$.</li>
</ul>

<p>Today, it is time to get out your machete knife and remove a number of branches (subtrees) from the kudzu, one by one. You plan on pruning the tree in a fancy shape, which will probably not stay intact for a long time given how fast your kudzu is growing, but at least you promise yourself to keep pruning every year. After deciding which branches you want to cut off today, you call up the Branching And Pruning Company to ask if they can dispose of the plant waste. They want to know exactly how much they need to clean up. You feel like you should be able to compute that, but how?</p>

<p>When a subtree rooted at some vertex $v$ is removed, this means that vertex $v$ will be removed, together with all vertices which have grown from it (and the vertices which have grown from those, and so on). Figure K.1 shows this process for the second sample case.</p>

<p>Given the indices of the roots of the subtrees which you will remove, compute the number of vertices which will be removed for each of these removed subtrees. Since these numbers may be large, you should find them modulo $10^9 + 7$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23374.%E2%80%85Kudzu%E2%80%85Kniving/936cd73d.png" data-original-src="https://upload.acmicpc.net/639d528e-36d3-4e20-87a2-c6fe74713af6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 305px; height: 150px;" /></p>

<p style="text-align: center;">Figure K.1:&nbsp;The tree of the second sample case.&nbsp;The different colours indicate in which removal the vertices are removed.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $a$ ($0 \leq a \leq 10^6$), the age of the tree in years, and $m$ ($1 \leq m \leq 10^5$), the number of subtrees which will be removed.</li>
	<li>$m$ lines, each with an integer $v$ ($0 \leq v \leq 10^9$), the index of a vertex to be removed from the tree. It is guaranteed that $v$ will not yet have been removed.</li>
</ul>

### 출력

<p>Output $m$ lines. The $i$th line should contain the number of vertices removed in the $i$th removal, modulo $10^9+7$.</p>