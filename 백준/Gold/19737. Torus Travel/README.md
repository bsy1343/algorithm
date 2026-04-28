# [Gold V] Torus Travel - 19737

[문제 링크](https://www.acmicpc.net/problem/19737)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 26, 맞힌 사람: 23, 정답 비율: 35.385%

### 분류

수학, 기하학, 3차원 기하학

### 문제 설명

<p>Torus is a surface that composed of points at a distance of $r$ from a circle $C$ with radius $R$ in 3D space. $C$ is then called a <em>central circle</em> of a torus; line perpendicular to the plane of $C$ that also contais the center of $C$ is called torus&#39; <em>axis</em>; $R$ and $r$ are <em>major</em> and <em>minor</em> torus radiuses, accordingly. A circle on a torus is called <em>bigger</em> if it&#39;s center is on torus&#39; axis and <em>lesser</em> if it&#39;s radius is $r$ and it&#39;s plane contains torus&#39; axis.</p>

<p>Young traveler Senya lives on a torus-shaped planet with major radius $R$ and minor radius $r$. There is a regular road map on this planet: $n$ lesser roads at equal distance from each other (located on lesser circles), and $4$ bigger roads (on bigger circles): outer --- the most distant from the axis, inner --- the least distant one, and also nothern and southern equal to the central circle on the opposite sides of the planet.&nbsp;</p>

<p>Each lesser road is a property of one of $n$ countries. Each country has only $4$ cities on the intersections of it&#39;s lesser road with all $4$ bigger roads.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0fa6e4c5-4074-45a4-be0e-cfb6b5f6d82e/-/preview/" style="width: 227px; height: 170px;" /><img alt="" src="https://upload.acmicpc.net/1a2113c3-7e1a-4cbe-b5ae-2f90923ce820/-/preview/" style="width: 261px; height: 170px;" /></p>

<p style="text-align: center;">Left picture illustrates the definition and shows minor and major radiuses. The right one shows $4$ greater roads and $n = 3$ lesser roads with cities on their intersections.</p>

<p>Senya wants to become The Great Traveler, which means that he wants to visit every country on the planet. He considers a country visited if he has traveled along the road between two different cities of this country. Of course, movement on his planet is allowed only by the roads.</p>

<p>Please, help Senya to find the distance he need to cover to become The Great Traveler, if he starts his journey in a city on the inner road.</p>

### 입력

<p>The first line of input contains three integers: $r$, $R$ --- minor and major torus radiuses and $n$ --- number of countries ($ 1 \le r &lt; R \le 10^9$; $ 1 \le n \le 10^9 $).</p>

### 출력

<p>Output should contain one real number --- minimal distance Senya has to cover. Your answer should have an absolute or relative error not greater than $10^{-9}$.</p>

### 힌트

<p>In the second example let $i_k, s_k, n_k, o_k$ represent the cities of $k$-th country on the inner, southern, nothern and outer roads, accordingly. One of the minimal paths looks like: $i_1 \rightarrow s_1 \rightarrow s_2 \rightarrow i_2 \rightarrow i_3 \rightarrow n_3 \rightarrow i_3 \rightarrow i_4 \rightarrow s_4 $. Covered distance equals to $\frac{5}{4}$ of country length, two segments of inner road and one of southern. So the answer is $\frac{5}{4} \cdot 2 \pi \cdot 1 + 2 \cdot \frac{2 \pi \cdot 2}{4} + \frac{2 \pi \cdot 3}{4} = 6 \pi \approx 18.849555922$.</p>