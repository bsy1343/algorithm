# [Platinum III] Coloring - 24172

[문제 링크](https://www.acmicpc.net/problem/24172)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 12, 맞힌 사람: 11, 정답 비율: 34.375%

### 분류

조합론, 수학, 정수론

### 문제 설명

<p>You will color an array consisting of $N$ cells numbered $1$ to $N$ for the array game party.</p>

<p>In the attic, there are two types of crayons,&nbsp;<em>A</em> and <em>B</em>, and $M$ bags for each type, which&nbsp;the $i$-th bag has crayons with color $i$.</p>

<p>In each bag,&nbsp;there are&nbsp;several crayons having pairwise&nbsp;different thicknesses.</p>

<p>You have&nbsp;to color the cells like the following:</p>

<ul>
	<li>First, choose two crayon bags, one from type <em>A</em> and the other from <em>B</em>. The color of the crayons in bags from types <em>A</em>&nbsp;and <em>B</em>&nbsp;must be different.</li>
	<li>Second, open the two bags and use the crayons in them to color the $N$ cells(in the order of $1, \, 2, \, \cdots, \,&nbsp; N$). Skipping coloring&nbsp;some cells or using multiple&nbsp;crayons to color a single&nbsp;cell&nbsp;is forbidden. You can use a single crayon as many times as you want.</li>
</ul>

<p>How many ways&nbsp;are there to&nbsp;color the $N$ cells? Consider&nbsp;as a different way if at least one of the two bags you chose is different&nbsp;or the crayon you used to color a particular cell has a different type, color, or thickness.</p>

### 입력

<p>The first line contains two integers $N$ and $M$&nbsp;&mdash; the number of cells and the number of bags of each crayon type, respectively.</p>

<p>The second line contains $M$ integers $A_1, \, A_2, \, \cdots, \, A_M$, where $A_i$ is the number of crayons in the $i$-th bag of type <em>A</em>.</p>

<p>The third line contains $M$ integers&nbsp;$B_1, \, B_2, \, \cdots, \, B_M$, where $B_j$ is the number of crayons in the $j$-th bag of type <em>B</em>.</p>

### 출력

<p>Print the number of ways to color the $N$ cells, modulo $10^9+7$.</p>

### 제한

<ul>
	<li>$1 \le N \le 3 \times 10^2$</li>
	<li>$1 \le M \le 10^5$</li>
	<li>$1 \le A_i, \, B_j \le 10^9$ ($1 \le i, \, j \le M$)</li>
	<li>All values in input are integers.</li>
</ul>