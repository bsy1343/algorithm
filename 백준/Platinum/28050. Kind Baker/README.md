# [Platinum III] Kind Baker - 28050

[문제 링크](https://www.acmicpc.net/problem/28050)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 149, 정답: 49, 맞힌 사람: 35, 정답 비율: 38.462%

### 분류

애드 혹, 해 구성하기, 비트마스킹

### 문제 설명

<p>Flora loves baking cakes, and for her company&rsquo;s $K$-th birthday she promised to bring a special treat: a cake, with $K$ different combinations of toppings to choose from! Unfortunately, she doesn&rsquo;t have much time, so she needs to simplify things a bit.</p>

<p>A cake can be described as a $100 \times 100$ grid of square cake pieces. A collection of pieces is connected if, for every pair of pieces in the collection, they are connected directly (they share a side) or indirectly (there is a sequence of pieces such that you can go from one piece to the other through directly connected pieces). The figure below depicts two collections of pieces (only a relevant part of the grid is shown). One collection is connected, while the other one is not.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/bdc91f69-a552-4262-abef-218ac34aa4eb/-/crop/273x282/0,0/-/preview/" style="width: 137px; height: 141px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/bdc91f69-a552-4262-abef-218ac34aa4eb/-/crop/273x282/343,0/-/preview/" style="width: 137px; height: 141px;" /></td>
		</tr>
		<tr>
			<td>(a) Connected</td>
			<td>(b) Not connected</td>
		</tr>
	</tbody>
</table>

<p>Flora has a machine that accepts a connected collection of cake pieces and puts a certain topping on each of those pieces. A different topping is applied each time the machine runs. After using the machine a given number of times, each piece will have a (possibly empty) combination of toppings on it. Two pieces are considered to be of different types if they have a different combination of toppings. Flora wants to know the minimum number of times she has to use the machine to achieve exactly $K$ different types of cake pieces, and a possible way to choose a connected collection of cake pieces for each time she will use the machine.</p>

### 입력

<p>The input consists of a single line that contains an integer $K$ ($1 &le; K &le; 4000$) indicating the number of different types of pieces that the cake must have.</p>

### 출력

<p>The first line must contain an integer $T$ indicating the minimum number of times that Flora has to use the machine. Each of the next T lines describes a connected collection of cake pieces to drive into the machine the successive times that Flora will use it; the line must contain a positive integer $N$ followed by $N$ different pairs of integers $X_1, Y_1, X_2, Y_2, \dots , X_N , Y_N$ ($1 &le; X_i , Y_i &le; 100$ for $i = 1, 2, \dots , N$), indicating that the collection consists of the pieces with coordinates $(X_1, Y_1),(X_2, Y_2), \dots ,(X_N , Y_N )$. It is guaranteed that there exists at least one solution. The coordinates $(1, 1)$ identify the square piece in any corner of the cake.</p>

### 힌트

<p>The picture below explains the first sample (only a relevant part of the grid is shown). To get exactly $K = 6$ combinations of toppings, Flora has to use the machine a minimum of $T = 3$ times. In the picture, the first topping applied by the machine is represented as a pineapple (★), the second as a cherry (■), and the third as a blueberry (●). The lists of pieces having each combination of toppings are as follows:</p>

<ol>
	<li>Only topping $1$ (★): $(2, 3)$;</li>
	<li>Only topping $2$ (■): $(3, 2)$;</li>
	<li>Only topping $3$ (●): $(4, 4)$;</li>
	<li>Toppings $2$ (■) and $3$ (●): $(4, 3)$;</li>
	<li>All three toppings: $(3, 3)$;</li>
	<li>No toppings: rest of the pieces.</li>
</ol>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c2eb3fe9-240b-4610-a5b8-3620653bcd0a/-/preview/" style="width: 141px; height: 141px;" /></p>