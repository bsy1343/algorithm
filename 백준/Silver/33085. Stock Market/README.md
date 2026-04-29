# [Silver I] Stock Market - 33085

[문제 링크](https://www.acmicpc.net/problem/33085)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 56, 정답: 17, 맞힌 사람: 14, 정답 비율: 26.923%

### 분류

수학

### 문제 설명

<p>Adrian owns a stock that he previously purchased, and wants to sell that stock. Currently, at day $0$, the price of the stock is $P_0$. As a robot, Morgan can predict the future. Morgan tells Adrian that the price changes will repeat every $N$ days.</p>

<p>Formally, suppose that the price change from day $i$ to day $i + 1$ for $0 ≤ i ≤ N - 1$ is $D_i$. The price change from day $i$ to $i + 1$ for $i ≥ N$ is $D_i = D_{i \bmod N}$. The price of the stock at day $i$ for $i &gt; 0$ is $P_i = P_{i-1} + D_{i-1}$. It is possible for a price to be negative.</p>

<p>Moreover, Morgan also knows that the price is on a downward trend. That is, the sum of all $D_i$ is negative.</p>

<p>The following table is the stock price of each day if $N = 6$, $P_0 = 20$, and $D_{0..5} = [4, -6, -1, 4, -9, -2]$.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Day</th>
			<td>$0$</td>
			<td>$1$</td>
			<td>$2$</td>
			<td>$3$</td>
			<td>$4$</td>
			<td>$5$</td>
			<td>$6$</td>
			<td>$7$</td>
			<td>$8$</td>
			<td>$9$</td>
			<td>$10$</td>
			<td>$11$</td>
			<td>$12$</td>
			<td>$13$</td>
			<td>$14$</td>
			<td>$15$</td>
			<td>$16$</td>
			<td>$17$</td>
			<td>$\dots$</td>
		</tr>
		<tr>
			<th>Price</th>
			<td>$20$</td>
			<td>$24$</td>
			<td>$18$</td>
			<td>$17$</td>
			<td>$21$</td>
			<td>$12$</td>
			<td>$10$</td>
			<td>$14$</td>
			<td>$8$</td>
			<td>$7$</td>
			<td>$11$</td>
			<td>$2$</td>
			<td>$0$</td>
			<td>$4$</td>
			<td>$-2$</td>
			<td>$-3$</td>
			<td>$1$</td>
			<td>$-8$</td>
			<td>$\dots$</td>
		</tr>
	</tbody>
</table>

<p>Adrian can only sell the stock when the price is at least $X$, the price when he purchased the stock, to avoid any losses. As a thrill seeker, Adrian also would like to sell his stock at the lowest price possible while still being at least $X$.</p>

<p>Help Adrian to determine the lowest price of the stock that is not lower than $X$, or tell him if it is impossible. Note that Adrian can sell his stock at day $0$, if $P_0 ≥ X$.</p>

### 입력

<p>Input begins with three integers $N$ $P_0$ $X$ ($1 ≤ N ≤ 100\, 000$; $1 ≤ P_0, X ≤ 10^9$) representing the number of days in a cycle, the price at day $0$, and the price when Adrian purchased the stock, respectively. The next line contains $N$ integers $D_i$ ($-10^9 ≤ D_i ≤ 10^9$) representing the price changes that repeat every $N$ days. It is guaranteed that the sum of all $D_i$ is negative.</p>

### 출력

<p>If a price not lower than $X$ exists, output an integer in a single line representing the lowest price of the stock that is not lower than $X$. Otherwise, output <code>-1</code> in a single line.</p>