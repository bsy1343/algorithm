# [Gold III] Liquid Cats - 23545

[문제 링크](https://www.acmicpc.net/problem/23545)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 64 MB

### 통계

제출: 153, 정답: 40, 맞힌 사람: 22, 정답 비율: 39.286%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 분리 집합, 매개 변수 탐색

### 문제 설명

<p>It is well known that when cats get into a hollow vessels they demonstrate properties of a liquid.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23545.%E2%80%85Liquid%E2%80%85Cats/7e365a80.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23545.%E2%80%85Liquid%E2%80%85Cats/7e365a80.png" data-original-src="https://upload.acmicpc.net/33462e06-2840-4fe0-8407-498e6c2f7d0a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 179px;" /></p>

<p>Mathematician Petrov often observed this phenomena by example of his cats and even conducted a series of experiments constructing different kinds of vessels and putting cats into them. It turned out that cats always choose their position to be as low as possible, more precisely --- to minimize level of highest point of their body. In case of several pits in the vessel, cats choose the lowest one but only from those in which they would fit.</p>

<p>A brilliant thought came into Petrov&#39;s head: in fact, cats can be used as an analog computers for solving some problems of quantum optimization! To check his hypothesis, mathematician Petrov developed the following mathematical model:</p>

<p>Let&#39;s imagine a vessel as a table $T$ of size $n \times m$. Some cells are walls, the rest of the cells are empty. A placement of a cat in the vessel is <em>optimal</em> if the following conditions met:</p>

<ol>
	<li>The cat occupies several empty cells. And all of the cells occupied by the cat form a <em>connected</em> shape of $k$ cells. A shape is connected if each of its cells can be reached from any other cell by moving through adjacent by-side cells (and all the transitional cells are also occupied by the cat).</li>
	<li>Level of the highest cell $h$ occupied by the cat should be as low as possible. Rows of the table are numbered from $1$ to $n$ and a row is higher if its number is less.</li>
</ol>

<p>Unfortunately, mathematician Petrov is not skilled in programming. He asks you to determine the height of the highest cell $h$ occupied by a cat for a given table $T$ and a cat&#39;s volume $k$.</p>

### 입력

<p>The first line contains integers $n$, $m$, and $k$ ($1 \le n,m \le 1000$, $1 \le k \le 10^6$).</p>

<p>The following $n$ lines contain $m$ symbols each --- a description of table $T$. The $j$-th symbol of the $i$-th row corresponds to a cell on intersection of the $i$-th row and the $j$-th column of $T$. &quot;<code>\#</code>&quot; means that this cell is a wall, and &quot;<code>.</code>&quot; means that this cell is empty.</p>

### 출력

<p>Output the number of a row which contains the highest occupied cell for any optimal placement of a cat. If a cat cannot by placed in vessel, output &quot;<code>-1</code>&quot; (without quotes).</p>

### 힌트

<p>An optimal placement of a cat for each sample can be the following:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23545.%E2%80%85Liquid%E2%80%85Cats/01e80f39.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23545.%E2%80%85Liquid%E2%80%85Cats/01e80f39.png" data-original-src="https://upload.acmicpc.net/0520cd8f-52b5-4cde-a18a-6361b95079d6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>