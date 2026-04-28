# [Platinum II] Doing the Container Shuffle - 31891

[문제 링크](https://www.acmicpc.net/problem/31891)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 25, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

수학, 자료 구조, 세그먼트 트리, 조합론, 확률론

### 문제 설명

<p>Majestic cargo ships, each carrying thousands of shipping containers, roam the world&rsquo;s seas every day. They make modern trade possible by being so efficient that shipping goods halfway around the world costs only pennies.</p>

<p>Once the ships reach their destination, their standard-size cargo containers are unloaded from the ship onto stacks on land, from which they are moved to trains or trucks that deliver them to their destination. It turns out that moving containers is expensive, so port operators try to minimize the number of moves necessary for delivering cargo.</p>

<p>In this problem, we consider such a container-unloading scenario. We need to unload $n$ containers, which are placed into two stacks built from bottom to top. The placement of each container is at random, with equal probability it will be put onto the first or the second stack (independently of other containers). Once all containers are unloaded, they will be picked up by trucks in a given order. When a truck wants to load a specific container, there are two cases. If the container is on top of its stack, then the container can be moved to the truck without moving any other containers. Otherwise, containers have to be moved from one stack to the other until the requested container is at the top of its stack. At that point the container can be moved onto the truck.</p>

<p>As an example, consider a case of three containers that arrive in order <code>1</code>, <code>2</code>, <code>3</code>. Assume that <code>1</code> and <code>3</code> are in the first stack, and <code>2</code> is in the second. If the containers are moved onto trucks in order <code>1</code>, <code>2</code>, <code>3</code>, then five moves of containers have to take place:</p>

<table class="table table-bordered table-center-50">
	<tbody>
		<tr>
			<td>Stack 1</td>
			<td>Stack 2</td>
			<td>Comment</td>
		</tr>
		<tr>
			<td><code>1 3</code></td>
			<td><code>2</code></td>
			<td>Initial configuration (stacks bottom to top)</td>
		</tr>
		<tr>
			<td><code>1</code></td>
			<td><code>2 3</code></td>
			<td>Move container <code>3</code> from stack 1 to stack 2</td>
		</tr>
		<tr>
			<td> </td>
			<td><code>2 3</code></td>
			<td>Move container <code>1</code> to truck</td>
		</tr>
		<tr>
			<td><code>3</code></td>
			<td><code>2</code></td>
			<td>Move container <code>3</code> from stack 2 to stack 1</td>
		</tr>
		<tr>
			<td><code>3</code></td>
			<td> </td>
			<td>Move container <code>2</code> to truck</td>
		</tr>
		<tr>
			<td> </td>
			<td> </td>
			<td>Move container <code>3</code> to truck</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><b>Table 1</b>: Example moves of containers requested in order <code>1 2 3</code>.</p>

<p>We want to know how many moves are necessary to deliver all containers to the customers. Assuming that container placement is random, we ask you to compute the expected number of moves necessary for a given truck-loading order.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1&le;n&le;10^6$), the number of containers. The containers are numbered $1,2,\dots ,n$, and are unloaded from the ship in this order. The second line of input contains $n$ integers $a_1,\dots ,a_n$. These numbers are a permutation of $\{1,2,\dots ,n\}$, and specify the order in which the containers are loaded onto trucks.</p>

### 출력

<p>Output the expected number of moves necessary to load the containers onto the trucks &mdash; this excludes the cost of unloading them from the ship, but includes both moves between stacks and from a stack to a truck. Your answer should have an absolute error of at most $10^{-3}$.</p>