# [Platinum I] Hay - 19492

[문제 링크](https://www.acmicpc.net/problem/19492)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 113, 정답: 22, 맞힌 사람: 20, 정답 비율: 21.053%

### 분류

자료 구조, 정렬, 스택

### 문제 설명

<p>Byteasar, a farmer, bought a field of area equal to $n$ ares, where he intends to sow grass seeds. Mown and dried hay will be used as a fodder for livestock kept on Byteasar&#39;s farm.</p>

<p>A mix of $n$ grass species will be sown in the field -- each species will take up a total of $1$ ares. For the $i$-th species it is known that its grass blades grow by $a_i$ centimetres each day, regardless of weather conditions or soil fertility. It is also known that as a result of mowing one are of any grass type by one centimetre, exactly $1$ kilogram of hay is obtained.</p>

<p>Byteasar has a mower that can be set in such a way that it cuts grass to any height $b$. With this setting each blade of grass higher than $b$ centimetres will be trimmed down to the height of exactly $b$ centimetres.</p>

<p>Byteotian law requires that after each grass mowing the amount of hay obtained is to be documented. Byteasar faced a choice: he must either buy a weighing machine, or write a program that based on the dates of mowing and mowers settings, could estimate the weight of the hay obtained after each mowing. The second of these options seemed more convenient and cheaper to him.</p>

<p>We assume that the grass will be sown on day $0$ at midnight and always be mown at midnight. We also assume that the time it takes to mow the grass in the field to any height $b$ is negligible.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($1\leq n,m\leq 500\,000$), denoting Byteasar&#39;s field area in ares (and at the same time the number of grass species sown) and the number of times the grass has been mown. The second line contains a sequence of $n$ integers $a_1, a_2, \ldots, a_n$ ($1\leq a_i\leq 10^6$) indicating the rate of growth of successive species of grass.</p>

<p>The next $m$ lines contain the details of how Byteasar mowed the grass: the $i$-th mowing is described by two integers $d_i$ and $b_i$ ($1\leq d_i \leq 10^{12}$, $0\leq b_i \leq 10^{12}$) contained in the $i$-th of these lines and indicating that on day $d_i$ Byteasar trimmed the grass to the length of $b_i$ centimetres. You can assume that this data is listed in chronological order, i.e., $d_1 &lt; d_2 &lt; \ldots &lt; d_m$.</p>

<p>Furthermore, you can also assume that Byteasar would never allow a situation when the grass has height exceeding $10^{12}$ centimetres at any place in the field.</p>

### 출력

<p>The output should contain exactly $m$ lines. The $i$-th of these lines should include a total weight of hay (in kilograms) obtained after the $i$-th grass mowing.</p>

### 힌트

<table class="table table-bordered" style="width: 30%;">
	<thead>
		<tr>
			<th style="text-align: center;">Day</th>
			<th style="text-align: center;">Before mowing</th>
			<th style="text-align: center;">After mowing</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align: center;">$1$</td>
			<td style="text-align: center;">$1, 2, 4, 3$</td>
			<td style="text-align: center;">$1, 1, 1, 1$</td>
		</tr>
		<tr>
			<td style="text-align: center;">$2$</td>
			<td style="text-align: center;">$2, 3, 5, 4$</td>
			<td style="text-align: center;">$2, 2, 2, 2$</td>
		</tr>
		<tr>
			<td style="text-align: center;">$3$</td>
			<td style="text-align: center;">$3, 4, 6, 5$</td>
			<td style="text-align: center;">$0, 0, 0, 0$</td>
		</tr>
		<tr>
			<td style="text-align: center;">$4$</td>
			<td style="text-align: center;">$1, 2, 4, 3$</td>
			<td style="text-align: center;">$1, 2, 4, 3$</td>
		</tr>
	</tbody>
</table>