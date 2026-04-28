# [Platinum III] Tea Sort - 23422

[문제 링크](https://www.acmicpc.net/problem/23422)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

정렬, 해 구성하기, 분할 정복

### 문제 설명

<p>After a long day of laborious coding, Stepan decided to have five o&#39;clock tea. Programmers love tea of all kinds: kocha, sencha, matcha, mocha and the like. Stepan went into the kitchen and discovered that all packs with tea in the drawer had been mixed. What a mess! Stepan likes order. He wants to have the packs arranged in the usual order.</p>

<p>There are $N$ packs of tea in the drawer, arranged in $K$ rows. In each row, the packs are lined up, from the pack closest to Stepan to the most distant. But the drawer is very low, and you can only pick the closest pack of tea in each row. So, the only possible operation here is to pick the closest pack from a row $i$ and put it into the row $j$, where it becomes the closest pack. In the programming mumbo-jumbo, each row is a stack, or &quot;LIFO&quot;.</p>

<p>Each pack is marked with an integer, which denotes the type of tea. Stepan likes it when:</p>

<ol>
	<li>the number of packs in every row is the same,</li>
	<li>the type number of the pack from the row $i$ is less than or equals the type number of the pack from the row $j$ (for any $i &lt; j$),</li>
	<li>in every row, packs are arranged by type in the ascending order from the closest to the most distant pack.</li>
</ol>

<p>Suggest a plan with no more than $13 \cdot N$ operations of moving packs, resulting in everything being in place according to Stepan&#39;s taste. You do not need to minimize the number of operations.</p>

### 입력

<p>The first line of the input file contains two integers $N$ and $K$ --- the number of packs of tea and the number of rows ($1 \le N \le 10^5$, $11 \le K \le 111$).</p>

<p>It is followed by $K$ lines, with each $r$-th line defining the $r$-th row of tea packs. For each row, an integer $T_r$ is provided, denoting the number of packs in the row, followed by $T_r$ integers --- the types of tea in the packs of this row ($0 \le T_r \le N$). Packs in a row are listed from the closest to the most distant.</p>

<p>It is guaranteed that the sum of all &nbsp;$T_r$ equals $N$, and that $N$ is divisible by $K$. Integers denoting tea types are not greater than $10^9$ in absolute value.</p>

### 출력

<p>In the first line of the output file, print one integer $M$ --- the number of operations in your plan ($0 \le M \le 13 \cdot N$).</p>

<p>In the remaining $M$ lines, print the operations in the order of their execution. For each operation, print two space-separated integers: $i$ --- the number of the row, from which Stepan must pick the closest pack, and $j$ --- the number of the row where he must put it ($1 \le i, j \le K$).</p>

### 힌트

<p>In the first example, all packs are already placed in Stepan&#39;s favorite order, so there&#39;s nothing to do here.</p>

<p>In the second example, the row 4 is empty, and the packs that should be there have been placed in the rows 5 and 6. The first seven operations of the plan pick the packs of the type 3 from the row 6. Note that this pack is the most distant, so to pick it, the preceding three packs must be picked first. These packs are placed to the row 7 in reverse order; upon the removal of the desired pack of the type 3, they are placed back in the right order. The remaining six operations move two packs of the type 3 from the row 5 to the row 4. This shifts a pack of the type 4 further in this row.</p>