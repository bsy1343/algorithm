# [Gold III] Veider funktsioon - 29952

[문제 링크](https://www.acmicpc.net/problem/29952)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

애드 혹, 비트마스킹, 런타임 전의 전처리

### 문제 설명

<p>On antud positiivne t&auml;isarv $a$. Vaja on valida t&auml;isarv $b$ ($1 \le b \le a - 1$) nii, et arvude $a \oplus b$ ja $a \otimes b$ suurim &uuml;histegur oleks maksimaalne v&otilde;imalik, ja v&auml;ljastada see &uuml;histegur. Teisis&otilde;nu on vaja leida funktsiooni $$f(a) = \max_{0&lt;b&lt;a} \gcd(a \oplus b, a \otimes b)$$ v&auml;&auml;rtus $f(A)$, kus $\oplus$ t&auml;histab tehet &quot;bitikaupa v&auml;listav V&Otilde;I&quot; ja $\otimes$ tehet &quot;bitikaupa JA&quot;. Nende tehete v&auml;&auml;rtused &uuml;hebitistel arvudel on:</p>

<table class="table table-bordered th-center td-center table-center-20">
	<tbody>
		<tr>
			<th>$a$</th>
			<th>$b$</th>
			<th>$a \oplus b$</th>
			<th>$a \otimes b$</th>
		</tr>
		<tr>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>Pikematele arvudele rakendatakse neid tehteid nii, et vaadeldakse operandide kahendesitusi, sooritatakse tehted nende vastavate bittide vahel ja saadud tulemused moodustavad vastuse kahendesituse. M&otilde;ned n&auml;ited:</p>

<table class="table table-bordered th-center td-center">
	<tbody>
		<tr>
			<th>Tehe 10-s&uuml;steemis</th>
			<th>Tehe 2-s&uuml;steemis</th>
			<th>Tulemus 2-s&uuml;steemis</th>
			<th>Tulemus 10-s&uuml;steemis</th>
		</tr>
		<tr>
			<td>$5 \oplus 3$</td>
			<td>$101 \oplus 11$</td>
			<td>$110$</td>
			<td>$6$</td>
		</tr>
		<tr>
			<td>$5 \otimes 3$</td>
			<td>$101 \otimes 11$</td>
			<td>$1$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>$7 \oplus 42$</td>
			<td>$111 \oplus 101010$</td>
			<td>$101101$</td>
			<td>$45$</td>
		</tr>
		<tr>
			<td>$7 \otimes 42$</td>
			<td>$111 \otimes 101010$</td>
			<td>$10$</td>
			<td>$2$</td>
		</tr>
	</tbody>
</table>

### 입력

<p>Faili esimesel real on p&auml;ringute arv $N$ ($1 \le N \le 1\,000$) ja j&auml;rgmisel $N$ real iga&uuml;hel &uuml;ks t&auml;isarv $A_i$ ($2 \le A_i &lt; 2^{25}$).</p>

### 출력

<p>Faili v&auml;ljastada $N$ rida. Faili reale number $i$ v&auml;ljastada $f(A_i)$ v&auml;&auml;rtus.</p>