# [Platinum II] Interval - 25743

[문제 링크](https://www.acmicpc.net/problem/25743)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 14, 맞힌 사람: 11, 정답 비율: 34.375%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 스위핑, 두 포인터

### 문제 설명

<p>There are $n$ closed intervals $[l_1,r_1], [l_2,r_2], \ldots, [l_n,r_n]$. You need to choose $m$ intervals such that the $m$ intervals have nonempty intersection. In other words, there exists some $x$ such that for any selected interval $[l_i,r_i]$, $l_i \leq x \leq r_i$.</p>

<p>The cost of selecting a collection of $m$ intervals with nonempty intersection is the maximum length of the $m$ intervals minus the minimum length of the $m$ intervals. The length of interval $[l_i, r_i]$ is $r_i - l_i$.</p>

<p>Compute the minimum cost of choosing $m$ intervals with nonempty intersection. If this is impossible, output <code>-1</code>.</p>

### 입력

<p>The first line consists of two positive integers $n,m$ separated by a single space where $n$ is the total number of intervals and $m$ is the number of intervals we are going to choose. It is guaranteed that $1 \leq m \leq n$.</p>

<p>In the following $n$ lines, each line consists of two integers $l_i,r_i$ separated by a space denoting the left and right endpoints of an interval.</p>

### 출력

<p>Output a line with an integer denoting the minimum cost.</p>

### 제한

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Test case</th>
			<th>$n =$</th>
			<th>$m=$</th>
			<th>$l_i,r_i$</th>
		</tr>
		<tr>
			<td>1</td>
			<td rowspan="2">$20$</td>
			<td>$9$</td>
			<td>$0 \leq l_i \leq r_i \leq 100$</td>
		</tr>
		<tr>
			<td>2</td>
			<td>$10$</td>
		</tr>
		<tr>
			<td>3</td>
			<td>$199$</td>
			<td rowspan="2">$3$</td>
			<td rowspan="4">$0 \leq l_i \leq r_i \leq 100\,000$</td>
		</tr>
		<tr>
			<td>4</td>
			<td>$200$</td>
		</tr>
		<tr>
			<td>5</td>
			<td>$1\,000$</td>
			<td rowspan="2">$2$</td>
		</tr>
		<tr>
			<td>6</td>
			<td>$2\,000$</td>
		</tr>
		<tr>
			<td>7</td>
			<td>$199$</td>
			<td>$60$</td>
			<td rowspan="2">$0 \leq l_i \leq r_i \leq 5\,000$</td>
		</tr>
		<tr>
			<td>8</td>
			<td rowspan="2">$200$</td>
			<td rowspan="2">$50$</td>
		</tr>
		<tr>
			<td>9</td>
			<td>$0 \leq l_i \leq r_i \leq 10^9$</td>
		</tr>
		<tr>
			<td>10</td>
			<td>$1\,999$</td>
			<td>$500$</td>
			<td rowspan="2">$0 \leq l_i \leq r_i \leq 5\,000$</td>
		</tr>
		<tr>
			<td>11</td>
			<td rowspan="2">$2\,000$</td>
			<td>$400$</td>
		</tr>
		<tr>
			<td>12</td>
			<td>$500$</td>
			<td>$0 \leq l_i \leq r_i \leq 10^9$</td>
		</tr>
		<tr>
			<td>13</td>
			<td>$30\,000$</td>
			<td>$2\,000$</td>
			<td rowspan="4">$0 \leq l_i \leq r_i \leq 100\,000$</td>
		</tr>
		<tr>
			<td>14</td>
			<td>$40\,000$</td>
			<td>$1\,000$</td>
		</tr>
		<tr>
			<td>15</td>
			<td>$50\,000$</td>
			<td>$15\,000$</td>
		</tr>
		<tr>
			<td>16</td>
			<td>$100\,000$</td>
			<td rowspan="2">$20000$</td>
		</tr>
		<tr>
			<td>17</td>
			<td>$200\,000$</td>
			<td rowspan="4">$0 \leq l_i \leq r_i \leq 10^9$</td>
		</tr>
		<tr>
			<td>18</td>
			<td>$300\,000$</td>
			<td>$50\,000$</td>
		</tr>
		<tr>
			<td>19</td>
			<td>$400\,000$</td>
			<td>$90\,000$</td>
		</tr>
		<tr>
			<td>20</td>
			<td>$500\,000$</td>
			<td>$200\,000$</td>
		</tr>
	</tbody>
</table>