# [Gold III] Ent Numbers - 7000

[문제 링크](https://www.acmicpc.net/problem/7000)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>Ents are a race of beings in Middle-Earth who closely resemble trees, and are ancient shepherds of the forest. When Bilbo visits the forest of Fangorn to meet with the Ents, he notices very very long numbers in their texts, and asks Treebeard (eldest of the Ents) about them. Treebeard explains that the numbers refer to the convergence rates of certain sequences (that were introduced to the Ents by a mathematician named Reuben Goodstein). After a few days of explanation, Bilbo understands the basic process through which such numbers were generated.</p>

<p>Consider a sequence defined by two numbers, N and B. The first number in the sequence is N itself. However, to get the next number, we decrease the number (N) by 1, but we increase the base B by 1.</p>

<p>Say we start with N = 42 and B = 10. We will write it as <u><code>(4)(2) Base 10</code></u>, parenthesizing the digits as shown. Hence the next number will be: <u><code>(4)(1) Base 11</code></u>, which is <u><code>45 Base 10</code></u>. We get this by first reducing the number by one (which gives <u><code>(4)(1) Base 10</code></u>) and then increasing the base by 1 (while keeping the digits in the number the same). The next number will be: <u><code>(4)(0) Base 12</code></u>, which is <u><code>48 Base 10</code></u>. The table below shows how the sequence continues.</p>

<table class="table table-bordered" style="td-center th-center">
	<thead>
		<tr>
			<th>B</th>
			<th>N Base B</th>
			<th>N Base 10</th>
			<th>Explanation</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>10</td>
			<td>(4)(2)</td>
			<td>42</td>
			<td>Sequence is defined by the two starting numbers</td>
		</tr>
		<tr>
			<td>11</td>
			<td>(4)(1)</td>
			<td>4&nbsp;&times; 11 + 1 = 45</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>12</td>
			<td>(4)(0)</td>
			<td>4&nbsp;&times; 12 + 0 = 48</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>13</td>
			<td>(3)(11)</td>
			<td>3&nbsp;&times; 13 + 11 = 50</td>
			<td>Note that, we subtract 1 first (in the previous base) and then increase the base.</td>
		</tr>
		<tr>
			<td>14</td>
			<td>(3)(10)</td>
			<td>3&nbsp;&times; 14 + 10 = 52</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>15</td>
			<td>(3)(9)</td>
			<td>3&nbsp;&times; 15 + 9 = 54</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>Although it seems like the sequence will continue to increase like this, it actually eventually converges to zero at base B = 192 (i.e., the sequence goes to <u><code>(1) Base 191</code></u>, and then to <u><code>(0) Base 192</code></u>). The table below shows the sequence for another starting point, and another base. As you can see, the sequence can grow very very rapidly (at Base 100, the sequence reaches 1000707070428).</p>

<table class="table table-bordered" style="td-center th-center">
	<thead>
		<tr>
			<th>B</th>
			<th>N Base B</th>
			<th>N Base 10</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>2</td>
			<td>(1)(1)(0)(0)(1)(0)(0)</td>
			<td>100</td>
		</tr>
		<tr>
			<td>3</td>
			<td>(1)(1)(0)(0)(0)(1)(1)</td>
			<td>976</td>
		</tr>
		<tr>
			<td>4</td>
			<td>(1)(1)(0)(0)(0)(1)(0)</td>
			<td>5124</td>
		</tr>
		<tr>
			<td>5</td>
			<td>(1)(1)(0)(0)(0)(0)(3)</td>
			<td>18753</td>
		</tr>
		<tr>
			<td>6</td>
			<td>(1)(1)(0)(0)(0)(0)(2)</td>
			<td>54434</td>
		</tr>
		<tr>
			<td>7</td>
			<td>(1)(1)(0)(0)(0)(0)(1)</td>
			<td>134457</td>
		</tr>
	</tbody>
</table>

<p>Treebeard explains to Bilbo that this sequence always converges to zero, even though it may first increase to very large numbers. Bilbo finds this hard to believe, and would like your help to understand this better. Specifically given two starting numbers N and B, he would like you to tell him if the sequence converges to 0 before the base reaches 2<sup>60</sup> (which is pretty much the largest number he can imagine).</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). For each such test case there are two integers on a line, N and B, separated by a space.</p>

### 출력

<p>For each test case, you are to decide whether the sequence converges to 0 before the base reaches 2<sup>60</sup>. If yes, you are to output the base at which it reaches zero. Exact output format is shown below.</p>