# [Platinum I] Kitchens of Königsberg - 32547

[문제 링크](https://www.acmicpc.net/problem/32547)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 6, 맞힌 사람: 4, 정답 비율: 13.793%

### 분류

그래프 이론, 무작위화, 백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>The year is $1764$ (or $900$ in base-$14$). During the past few decades, the bridges of Königsberg have become a major attraction for combinatorics tourism from all over the world. In a recent travel brochure, your predecessor on the Königsberg Board of Tourism has promised the existence of $k$ Bridges Alongside Palatable Cuisine, where hungry graph theorists can combine their intellectual and culinary pursuits by finishing their pilgrimage with a delicious bowl of traditional meatballs from a charming street kitchen. Alas, none of these kitchens have actually been built, so this will be your first task!</p>

<p>Naturally, you begin by modelling Königsberg as an undirected multigraph. Rivers divide the city into areas, which you model as vertices, and the bridges become the edges. With this abstraction, you start to investigate whether it is possible to select areas to place kitchens in, so that exactly $k$ bridges end in an area with a kitchen. As an example, consider the first sample case, shown in Figure K.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32547.%E2%80%85Kitchens%E2%80%85of%E2%80%85K%C3%B6nigsberg/3858f5b8.png" data-original-src="https://boja.mercury.kr/assets/problem/32547-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 193px;"></p>

<p style="text-align: center;">Figure K.1: Visualization of the first sample case. If kitchens are placed at areas $A$ and $B$, then the $6$ bridges $a$, $b$, $c$, $d$, $e$, and $f$ are serviced. Another solution would be to place kitchens at $B$ and $C$.</p>

<p style="text-align: center;"><small>Modified from <a href="https://archive.org/details/commentariiacade08impe/page/n185/mode/2up"><em>Solutio problematis ad geometriam situs pertinentis</em></a> by Leonhard Euler</small></p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $m$, and $k$ ($1 \leq n \leq 5000$, $0 \leq m \leq 50\,000$, $1 \leq k \leq 6$), the number of areas, the number of bridges, and the number of bridges that must end in an area with a kitchen.</li>
	<li>$m$ lines, each with two integers $a$ and $b$ ($1 \leq a &lt; b \leq n$), indicating a bridge between areas $a$ and $b$. Note that there can be multiple bridges between the same pair of areas.</li>
</ul>

### 출력

<p>If there is a subset of areas in which kitchens can be placed, so that exactly $k$ bridges end in an area with a kitchen, output the number of areas in this subset, followed by these areas. Otherwise, output "<code>impossible</code>".</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>