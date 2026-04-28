# [Platinum I] Hectic Harbour - 20908

[문제 링크](https://www.acmicpc.net/problem/20908)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 8, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

다이나믹 프로그래밍, 구현

### 문제 설명

<p>There are two gantry cranes operating on the same gantry of length $n$. The gantry has some fixed integral positions, labelled from $1$ to $n$, at which the cranes must perform loading/unloading operations. In the beginning the first gantry crane is located on the very left of the gantry at position $1$, while the second one is located on the very right of the gantry at position $n$. In each time step a gantry crane can either move to a neighbouring integral position or stay at its current position (and potentially perform a loading/unloading operation). To prevent the gantry cranes from hitting each other, the first crane needs to stay strictly to the left of the second crane at all times. For both cranes you are given a task list consisting of gantry positions at which the cranes must perform loading/unloading operations. Both cranes must perform their assigned operations in the given order. What is the minimal amount of time necessary for both gantry cranes to finish their tasks? It is guaranteed that the first gantry crane never has to operate at position $n$ of the gantry while the second gantry crane never has to operate at position $1$. For both gantry cranes the first and last loading/unloading operation in the task list is their initial position.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with integers $n$, $a$ and $b$ where</li>
	<li>$n$ ($2 \le n \le 2\,000$) is the length of the gantry;</li>
	<li>$a$ ($2 \le a \le 50$) is the number of operations in the task list of the first gantry crane;</li>
	<li>$b$ ($2 \le b \le 50$) is the number of operations in the task list of the second gantry crane.&nbsp;</li>
	<li>One line with $a$ integers $k_1, \ldots, k_a$ ($1 \le k_i \le n-1$ for all $i$), the tasks of the first gantry crane.&nbsp;</li>
	<li>One line with $b$ integers $\ell_1, \ldots, \ell_b$ ($2 \le \ell_i \le n$ for all $i$), the tasks of the second gantry crane.&nbsp;</li>
</ul>

<p>The first and last task of both gantry cranes are at their initial position, i.e., $k_1 = k_a = 1$ and $\ell_1 = \ell_b = n$.</p>

### 출력

<p>Output the minimum number of time steps necessary for both gantry cranes to finish their assigned tasks.</p>

### 힌트

<p>In the first sample test case the gantry is of length 3, the first gantry crane has 2 operations in its task list while the second gantry crane has 4 operations in its task list. At least 6 time steps are necessary for both gantry cranes to finish their assigned tasks.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Time</th>
			<th>Gantry Crane 1</th>
			<th>Gantry Crane 2</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>Operate at 1</td>
			<td>Operate at 3</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Operate at 1</td>
			<td>Operate at 3</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Idle at 1</td>
			<td>Move from 3 to 2</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Idle at 1</td>
			<td>Operate at 2</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Idle at 1</td>
			<td>Move from 2 to 3</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Idle at 1</td>
			<td>Operate at 3</td>
		</tr>
	</tbody>
</table>

<p>In the second sample test case the gantry is of length 4 and both gantry cranes have to perform 4 operations. At least 9 time steps are necessary for both gantry cranes to finish their assigned tasks.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Time</th>
			<th>Gantry Crane 1</th>
			<th>Gantry Crane 2</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>Operate at 1</td>
			<td>Operate at 4</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Move from 1 to 2</td>
			<td>Move from 4 to 3</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Operate at 2</td>
			<td>Operate at 3</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Move from 2 to 3</td>
			<td>Move from 3 to 4</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Operate at 3</td>
			<td>Idle at 4</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Move from 3 to 2</td>
			<td>Move from 4 to 3</td>
		</tr>
		<tr>
			<td>7</td>
			<td>Move from 2 to 1&amp; Operate at 3</td>
		</tr>
		<tr>
			<td>8</td>
			<td>Operate at 1</td>
			<td>Move from 3 to 4</td>
		</tr>
		<tr>
			<td>9</td>
			<td>Idle at 1</td>
			<td>Operate at 4</td>
		</tr>
	</tbody>
</table>