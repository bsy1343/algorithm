# [Silver IV] Card - 9834

[문제 링크](https://www.acmicpc.net/problem/9834)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 95, 맞힌 사람: 78, 정답 비율: 75.728%

### 분류

구현, 자료 구조, 시뮬레이션, 덱

### 문제 설명

<p>Alice is a card dealer at the poker table in newly opened ResortWorld casino. As a strange personal quirk, she has two ways of moving a card when she shuffles the deck:</p>

<ul>
	<li><code>A</code>: She takes the card at the top of the deck and moves it to the bottom.</li>
	<li><code>B</code>: She takes the second card from the top of the deck and moves it to the bottom.</li>
</ul>

<p>Initially, Alice has m cards (note that m can be very much more than the standard 52 cards found in a deck) which are labeled consecutively: the card at the top is labeled 0 and the card at the bottom is labeled m &minus; 1. Consider a sequence of moves like:</p>

<p style="text-align: center;"><code>ABBABA</code></p>

<p>The table below shows the deck after each move in the sequence is applied.</p>

<table class="table table table-bordered" style="width: 30%;">
	<tbody>
		<tr>
			<th style="text-align: center;">Next move</th>
			<th style="text-align: center;"><code>A</code></th>
			<th style="text-align: center;"><code>B</code></th>
			<th style="text-align: center;"><code>B</code></th>
			<th style="text-align: center;"><code>A</code></th>
			<th style="text-align: center;"><code>B</code></th>
			<th style="text-align: center;"><code>A</code></th>
			<th style="text-align: center;">&nbsp;</th>
		</tr>
		<tr>
			<th rowspan="6" style="text-align: center; vertical-align: middle;">Current<br />
			deck<br />
			arrangement</th>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">0</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">1</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">5</td>
		</tr>
		<tr>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">4</td>
		</tr>
	</tbody>
</table>

<p>In this question we want to know: given a sequence of moves and a k, where 0 &lt; k &lt; m&minus;1, what is the label of the (k &minus; 1)&ndash;th, k&ndash;th and (k + 1)&ndash;th cards from the top of the deck after the entire sequence is applied? Here, we treat top-most card as the 0&ndash;th card. In our example above, if k = 3, then the answer is &ldquo;3 1 5&rdquo;.</p>

### 입력

<p>Your program must read from the standard input. The input consists of m and k, where 0 &lt; k &lt; m &minus; 1, and 3 &le; m &le; 1, 000, 000, and the sequence of moves in a single line. The last character in the input is the period &ldquo;.&rdquo;, indicating the end of input. The total number of moves is at least 1 and at most 100,000.</p>

### 출력

<p>Your program must write to the standard output the (k &minus; 1)&ndash;th, k&ndash;th and (k + 1)&ndash;th cards from the top of the deck after the entire sequence of card moves have been applied.</p>