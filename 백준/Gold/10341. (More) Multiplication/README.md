# [Gold V] (More) Multiplication - 10341

[문제 링크](https://www.acmicpc.net/problem/10341)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 22, 맞힌 사람: 21, 정답 비율: 84.000%

### 분류

구현, 문자열

### 문제 설명

<p>Educators are always coming up with new ways to teach math to students. In 2011, an educational software company, All Computer Math&nbsp;(ACM), developed an application to display products in a traditional grade school math format. ACM is now working on an updated version of the software that will display results in a lattice format that some students find to be easier when multiplying larger numbers.</p>

<p>An example would be when multiplying 345 * 56 = 19320 as given below, using a lattice grid with 2&nbsp;rows and 3&nbsp;columns, which appears inside a surrounding frame:</p>

<pre>
+---------------+
|   3   4   5   |
| +---+---+---+ |
| |1 /|2 /|2 /| |
| | / | / | / |5|
|1|/ 5|/ 0|/ 5| |
| +---+---+---+ |
|/|1 /|2 /|3 /| |
| | / | / | / |6|
|9|/ 8|/ 4|/ 0| |
| +---+---+---+ |
|/ 3 / 2 / 0    |
+---------------+
</pre>

<p>The first operand, 345, is displayed above the top of the grid with each digit centered horizontally above its column of the grid, and the second operand, 56, is displayed along the righthand side with each digit centered vertically at the center of its row in the grid. A single cell of the grid, such as </p>

<pre>
          +---+
          |3 /|
          | / |
          |/ 0|
          +---+
</pre>

<p>represents the product of the digit of the first operand that is above its column and the digit of the second operand that is to the right of its row. In our example, this cell represents the product 5 times 6 = 30 that results when multiplying the 5 in 345 and the 6 in 56. Note that the 10&#39;s digit of that product is placed in the upper left portion of this cell and the 1&#39;s digit in the lower right.<br />
<br />
The overall product is then computed by summing along the diagonals in the lattice that represent the same place values in the result. For example, in our first problem the product 19320 was computed as:</p>

<table class="table table-bordered" style="width:40%">
	<tbody>
		<tr>
			<td>1&#39;s digit</td>
			<td>= <strong>0</strong></td>
		</tr>
		<tr>
			<td>10&#39;s digit</td>
			<td>= 5 + 3 + 4 = 12, thus <strong>2</strong> with a carry of 1</td>
		</tr>
		<tr>
			<td>100&#39;s digit</td>
			<td>= (1 carry) + 2 + 0 + 2 + 8 = 13, thus <strong>3</strong> with a carry of 1</td>
		</tr>
		<tr>
			<td>1000&#39;s digit</td>
			<td>= (1 carry) + 2 + 5 + 1 = <strong>9</strong></td>
		</tr>
		<tr>
			<td>10000&#39;s digit</td>
			<td>= <strong>1</strong></td>
		</tr>
	</tbody>
</table>

<p><br />
The resulting product is placed with the one&#39;s digit below the grid at the far right and, depending on its length, with the most significant digits wrapped around the left side of the grid. Each digit of the final product appears perfectly aligned with the corresponding diagonal summands.</p>

<p>To provide an aesthetic view, we use a series of minus (<kbd>-</kbd>) characters for horizontal lines, pipe (<kbd>|</kbd>) characters for vertical lines, and slash (<kbd>/</kbd>) characters for diagonal lines. Furthermore, we use a plus (<kbd>+</kbd>) character wherever a horizontal and vertical line meet. Each multiplication lattice is subsequently &quot;boxed&quot; by an outer border. There is a row containing the first operand which is between the topmost border and the top line of the grid, and a row between the bottom of the grid and the bottom border, which contains some portion of the resulting product. There is one column between the leading&nbsp;| and the left edge of the inner grid, which may contain a portion of the resulting product, and one column after the right edge of the inner grid but before the rightmost&nbsp;| border, which contains the second operand. If the product is not long enough to wrap around the bottom-left corner, the column between the left border and the left edge of the grid will containing only spaces. (See the later example of 3 x 3.)</p>

<p>Leading zeros should be displayed within lattice grid cells, but leading zeros should never be displayed in the product, nor should there ever be a slash (<kbd>/</kbd>) character prior to the leading digit of the product. For example, consider the product of 12 * 27 = 324 below:</p>

<pre>
+-----------+
|   1   2   |
| +---+---+ |
| |0 /|0 /| |
| | / | / |2|
| |/ 2|/ 4| |
| +---+---+ |
| |0 /|1 /| |
| | / | / |7|
|3|/ 7|/ 4| |
| +---+---+ |
|/ 2 / 4    |
+-----------+
</pre>

<p>Note that in the top-right grid of the lattice, the product 2 * 2 = 04 is displayed with the zero for the tens digit. However, there is no thousands digit displayed in the product 324, nor is there any slash displayed above the digit&nbsp;3 in that product.</p>

### 입력

<p>The input contains one or more tests. Each test contains two positive integers, A and B, such that 1 &le; A &le; 9999 and 1 &le; B &le; 9999. The last data set will be followed by a line containing 0 0.</p>

### 출력

<p>For each data set, produce the grid that illustrates how to multiply the two numbers using the lattice multiplication technique.</p>

<p>The tables must be formatted precisely as outlined by the rules and examples provided. Mistakes that involve solely errant whitespace will be categorized as <code><strong>Presentation&nbsp;Error</strong></code>; all other errors will be reported as <code><strong>Wrong Answer</strong></code>.</p>