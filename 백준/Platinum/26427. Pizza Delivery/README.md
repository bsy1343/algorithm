# [Platinum IV] Pizza Delivery - 26427

[문제 링크](https://www.acmicpc.net/problem/26427)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Ada delivers pizzas in a city consisting of a grid of $\mathbf{N}$ horizontal and $\mathbf{N}$ vertical streets, heading from North to South and from West to East, respectively, and numbered from $1$ to $\mathbf{N}$. The top left street crossing of the grid is $(1,1)$.</p>

<p>Today, Ada has to deliver $\mathbf{P}$ pizzas, one for each of $\mathbf{P}$ customers. Each customer lives at a different street crossing; the $k$-th customer lives at street crossing $(\mathbf{X_k}, \mathbf{Y_k})$ and will pay Ada $\mathbf{C_k}$ coins after the pizza is delivered to their location.</p>

<p>Ada starts at her pizza restaurant at $(\mathbf{A_r}, \mathbf{A_c})$ with $0$ coins and carrying $\mathbf{P}$ pizzas. Her goal is to deliver all of the pizzas within $\mathbf{M}$ minutes. She is free to take any path she likes around the city and finish deliveries anywhere, as long as she manages to drop off all $\mathbf{P}$ pizzas to their respective customers within $\mathbf{M}$ minutes. It takes one minute to walk between two adjacent street crossings, and takes no additional time to drop off a pizza at a customer&#39;s location. There are some additional rules and constraints to note:</p>

<ul>
	<li>Ada is not allowed to go outside the grid.</li>
	<li>No customer lives at the same street crossing as the pizza restaurant Ada starts her trip.</li>
	<li>At any point in time Ada can choose to stay in her current location and not move.</li>
	<li>Ada can also choose not to deliver a pizza when at a customer&#39;s location.</li>
</ul>

<p>Formally, if Ada is currently at street crossing $(i,j)$, where $i$ is $i$-th row from the top, and $j$ is $j$-th column from the left, she can decide to do any of the following as long as she does not go outside the grid:</p>

<ul>
	<li>Go north, she reaches street crossing $(i-1, j)$.</li>
	<li>Go east, she reaches street crossing $(i, j+1)$.</li>
	<li>Go west, she reaches street crossing $(i, j-1)$.</li>
	<li>Go south, she reaches street crossing $(i+1, j)$.</li>
	<li>Stay at street crossing $(i, j)$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6545fe5c-63d1-4f18-8ea2-9ffd535b2b75/-/preview/" style="width: 500px; height: 453px;" /></p>

<p>The city has a unique toll system in place for using the streets. There is a toll for using each street and the toll depends on Ada&#39;s current number of coins and the direction in which she is travelling to. The toll function is defined for every cardinal direction (North, East, West, South) separately. The toll function $F_d$ for $d \in \{ North, East, West, South \}$ returns the amount of coins Ada will have after moving in the direction $d$ and is defined as follows:</p>

<p align="center">$F_d$ = $c$ $\mathbf{OP_d}$ $\mathbf{K_d}$</p>

<p>where $c$ is the current number of coins that Ada has and $\mathbf{OP_d}$ is an operator and $\mathbf{K_d}$ is a fixed positive integer. The allowed operators are:</p>

<ul>
	<li><code>+</code> (addition),</li>
	<li><code>-</code> (subtraction),</li>
	<li><code>*</code> (multiplication),</li>
	<li><code>/</code> (<a href="https://mathworld.wolfram.com/IntegerDivision.html" target="_blank">integer division</a>).</li>
</ul>

<p>For example, we can have $F_{North}$ = $c$ + $3$, $F_{East}$ = $c$ * $4$, $F_{West}$ = $c$ - $4$, $F_{South}$ = $c$ / $2$. That means that if Ada moves North one street then she will have $3$ more coins; if Ada moves East then Ada&#39;s coins will quadruple; if Ada moves West then she loses $4$ coins; and if Ada moves South then her coins are halved.</p>

<p>All divisions are <a href="https://mathworld.wolfram.com/IntegerDivision.html" target="_blank">integer divisions</a> and are computed by using <a href="https://en.wikipedia.org/wiki/Floor_and_ceiling_functions" target="_blank">floor function</a>. For example, $\frac{-1}{4} = \lfloor\frac{-1}{4}\rfloor = -1$. Notice that Ada is allowed to have a negative number of coins. Note that the tolls might actually give Ada coins.</p>

<p>Find out if Ada can deliver all the $\mathbf{P}$ pizzas in $\mathbf{M}$ minutes and, if so, the maximum number of coins Ada could have after $\mathbf{M}$ minutes.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains $\mathbf{N}$, $\mathbf{P}$, $\mathbf{M}$, $\mathbf{A_r}$, $\mathbf{A_c}$ denoting the grid size, the number of pizzas to deliver, the minutes in which all pizzas should be delivered, and the coordinates of the street crossing at which Ada starts respectively.</p>

<p>The next four lines denote the toll functions for North, East, West, South respectively. Each of these lines contains $\mathbf{OP_d}$, denoting the operator (one of <code>+</code>, <code>-</code>, <code>*</code>, <code>/</code>), and $\mathbf{K_d}$, the positive integer used in toll function.</p>

<p>The following $\mathbf{P}$ lines describe the customers. Each of these lines consists of three integers $\mathbf{X_k}$, $\mathbf{Y_k}$, $\mathbf{C_k}$ denoting the row number of the $k$-th customer from the top of the grid, the column number of the $k$-th customer from the left of the grid, and the amount of coins they pay on delivery, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is <code>IMPOSSIBLE</code> if all pizzas cannot be delivered within $\mathbf{M}$ minutes; otherwise, the output should be the maximum number of coins Ada can have after $\mathbf{M}$ minutes (which could be negative).</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{N} \le 10$.</li>
	<li>$1 \le \mathbf{M} \le 20$.</li>
	<li>$1 \le \mathbf{A_r}, \mathbf{A_c} \le \mathbf{N}$.</li>
	<li>$1 \le \mathbf{X_k}, \mathbf{Y_k} \le \mathbf{N}$, for all $k$.</li>
	<li>$1 \le \mathbf{C_k} \le 4$, for all $k$.</li>
	<li>$1 \le \mathbf{K_d} \le 4$, for all $d$.</li>
	<li>$\mathbf{OP_d}$ is one of (<code>+</code>, <code>-</code>, <code>*</code>, <code>/</code>), for all $d$.</li>
	<li>It is guaranteed that no customer lives at the same street crossing as the pizza restaurant Ada starts her trip, i.e. $(\mathbf{X_k}, \mathbf{Y_k}) \neq (\mathbf{A_r}, \mathbf{A_c})$, for all $1 \le k \le \mathbf{P}$.</li>
	<li>It is guaranteed that every customer lives at a different street crossing, i.e. $(&#39;X_k, \mathbf{Y_k}) \neq (\mathbf{X_l}, \mathbf{Y_l})$, for all $1 \le k, l \le \mathbf{P}$ and $k \neq l$.</li>
</ul>