# [Gold V] ASM – The Abelian Sandpile Model - 5415

[문제 링크](https://www.acmicpc.net/problem/5415)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 22, 맞힌 사람: 22, 정답 비율: 81.481%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 격자 그래프

### 문제 설명

<p>Modeling sandpiles is an interesting problem in statistical physics. When dropping a sand grain on an existing pile, most of the time the grain will stick to it or a couple of grains will slide down. Occasionally, however, adding one extra grain to a pile will lead to a huge avalanche of sand grains falling down.</p>

<p>A simple way to model sandpiles is the Abelian Sandpile Model. In this simple model the sandpile is described as a two-dimensional lattice with on each lattice site a height (the number of sand grains on that lattice site). When an additional grain is dropped on a lattice site, its height is increased by one. If the height becomes larger than a certain critical height, sand grains begin to topple. This is modeled by reducing the number of sand grains on the site that is too high by four, and increasing the heights of its four neighbors by one. If some of the neighbors exceed the critical height after this toppling, sand grains topple from those points too until the situation is stable again. If a sand grain falls off the lattice, the grain is gone.</p>

<p>Given an initial sandpile and the positions where the grains are dropped, determine the final sandpile.</p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with four integers, y, x, n and h with 1 &le; y, x &le; 100, 0 &le; n &le; 100 and 3 &le; h &le; 9: the dimensions of the sandpile, the number of dropped sand grains and the critical height.</li>
	<li>y lines, each with x characters in the range &rsquo;0&rsquo;. . . &rsquo;9&rsquo;: the heights of the initial sandpile. Each height is less than or equal to the critical height.</li>
	<li>n lines with two integers y<sub>i</sub> and x<sub>i</sub> with 1 &le; y<sub>i</sub> &le; y and 1 &le; x<sub>i</sub> &le; x: the positions where the grains are dropped.</li>
</ul>

### 출력

<p>For every test case in the input file, the output should contain y lines, each with x characters in the range &rsquo;0&rsquo;. . . &rsquo;9&rsquo;: the heights of the final sandpile.</p>