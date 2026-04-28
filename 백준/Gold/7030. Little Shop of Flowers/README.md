# [Gold IV] Little Shop of Flowers - 7030

[문제 링크](https://www.acmicpc.net/problem/7030)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 79, 정답: 35, 맞힌 사람: 25, 정답 비율: 56.818%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You want to arrange the window of your flower shop in a most pleasant way. You have&nbsp;<i>F&nbsp;</i>bunches of flowers, each being of a different kind, and at least as many vases ordered in a row. The vases are glued onto the shelf and are numbered consecutively 1 through&nbsp;<i>V</i>, where&nbsp;<i>V</i>&nbsp;is the number of vases, from left to right so that the vase 1 is the leftmost, and the vase&nbsp;<i>V</i>&nbsp;is the rightmost vase. The bunches are moveable and are uniquely identified by integers between 1 and&nbsp;<i>F</i>. These id-numbers have a significance: They determine the required order of appearance of the flower bunches in the row of vases so that the bunch&nbsp;<i>i</i>&nbsp;must be in a vase to the left of the vase containing bunch&nbsp;<i>j</i>&nbsp;whenever&nbsp;<i>i</i>&nbsp;&lt;&nbsp;<i>j</i>. Suppose, for example, you have bunch of azaleas (id-number=1), a bunch of begonias (id-number=2) and a bunch of carnations (id-number=3). Now, all the bunches must be put into the vases keeping their id-numbers in order. The bunch of azaleas must be in a vase to the left of begonias, and the bunch of begonias must be in a vase to the left of carnations. If there are more vases than bunches of flowers then the excess will be left empty. A vase can hold only one bunch of flowers.</p>

<p>Each vase has a distinct characteristic (just like flowers do). Hence, putting a bunch of flowers in a vase results in a certain aesthetic value, expressed by an integer. The aesthetic values are presented in a table as shown below. Leaving a vase empty has an aesthetic value of 0.</p>

<table class="table table-bordered td-center" width="100%">
	<tbody>
		<tr>
			<td colspan="2" rowspan="2">&nbsp;</td>
			<td colspan="5"><b>V A S E S</b></td>
		</tr>
		<tr>
			<td><b>1</b></td>
			<td><b>2</b></td>
			<td><b>3</b></td>
			<td><b>4</b></td>
			<td><b>5</b></td>
		</tr>
		<tr>
			<td rowspan="3"><b>Bunches</b></td>
			<td><b>1 (Azaleas)</b></td>
			<td>7</td>
			<td>23</td>
			<td>-5</td>
			<td>-24</td>
			<td>16</td>
		</tr>
		<tr>
			<td><b>2 (Begonias)</b></td>
			<td>5</td>
			<td>21</td>
			<td>-4</td>
			<td>10</td>
			<td>23</td>
		</tr>
		<tr>
			<td><b>3 (Carnations)</b></td>
			<td>-21</td>
			<td>5</td>
			<td>-4</td>
			<td>-20</td>
			<td>20</td>
		</tr>
	</tbody>
</table>

<p>According to the table, azaleas, for example, would look great in vase 2, but they would look awful in vase 4.</p>

<p>To achieve the most pleasant effect you have to maximize the sum of aesthetic values for the arrangement while keeping the required ordering of the flowers. If more than one arrangement has the maximal sum value, any one of them will be acceptable. You have to produce exactly one arrangement.</p>

### 입력

<ul>
	<li>The first line contains two numbers:&nbsp;<i>F</i>,&nbsp;<i>V</i>.</li>
	<li>The following&nbsp;<i>F</i>&nbsp;lines: Each of these lines contains&nbsp;<i>V</i>&nbsp;integers, so that&nbsp;<i>A<sub>ij</sub></i>&nbsp;is given as the&nbsp;<i>j<sup>th</sup></i>&nbsp;number on the (<i>i</i>+1)<sup><i>st</i></sup>&nbsp;line of the input file.</li>
</ul>

### 출력

<ul>
	<li>The first line will contain the sum of aesthetic values for your arrangement.</li>
	<li>The second line must present the arrangement as a list of&nbsp;<i>F</i>&nbsp;numbers, so that the&nbsp;<i>k</i>&rsquo;th number on this line identifies the vase in which the bunch&nbsp;<i>k</i>&nbsp;is put.</li>
</ul>

### 제한

<ul>
	<li>1 &le;&nbsp;<i>F</i>&nbsp;&le; 100 where&nbsp;<i>F</i>&nbsp;is the number of the bunches of flowers. The bunches are numbered 1 through&nbsp;<i>F</i>.</li>
	<li><i>F</i>&nbsp;&le;&nbsp;<i>V</i>&nbsp;&le; 100 where&nbsp;<i>V</i>&nbsp;is the number of vases.</li>
	<li>-50 &le;&nbsp;<i>A<sub>ij</sub>&nbsp;</i>&le; 50 where&nbsp;<i>A<sub>ij&nbsp;</sub></i>is the aesthetic value obtained by putting the flower bunch&nbsp;<i>i</i>&nbsp;into the vase&nbsp;<i>j</i>.</li>
</ul>