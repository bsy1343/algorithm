# [Platinum IV] Bilda ord - 20880

[문제 링크](https://www.acmicpc.net/problem/20880)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Fatimeh studerar sitt hemspr&aring;k som anv&auml;nder det arabiska alfabetet. Just nu sitter hon med en &ouml;vning d&auml;r hon ska svara p&aring; hur m&aring;nga s&auml;tt hon kan bilda ett ord med de givna bokst&auml;verna i uppgiften.</p>

<p>Om det hade varit p&aring; svenska kunde &ouml;vningen ha se ut s&aring; h&auml;r:</p>

<p style="text-align: center;">r M e a</p>

<p>Eftersom fyra bokst&auml;ver &auml;r givna vet Fatimeh att hon m&aring;ste testa $4*3*2*1 = 24$ permutationer. Men eftersom bokstaven M &auml;r &quot;stor&quot; s&aring; vet vi att den m&aring;ste placeras i ordets b&ouml;rjan. Med det villkoret kan bara $6$ ord bildas, exempelvis $Mera$, men inte $raMe$. I det arabiska alfabetet har man inte stora och sm&aring; bokst&auml;ver p&aring; samma s&auml;tt, men man har andra regler om var i ordet bokstaven kan f&ouml;rekomma, &auml;ven i relation till andra bokst&auml;ver.&nbsp;</p>

<p>I denna uppgift antar vi att det finns tv&aring; typer av restriktioner: Antingen m&aring;ste en bokstav komma precis f&ouml;re n&aring;gon annan bokstav, eller s&aring; kan en bokstav bara st&aring; p&aring; vissa positioner. Exempel p&aring; dessa regler och den notation vi anv&auml;nder finns i f&ouml;ljande tabell:</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th><strong>Regel</strong></th>
			<th><strong>Notation</strong></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Bokstav $B$ m&aring;ste st&aring; p&aring; p&aring; plats $1$ eller plats $4$</td>
			<td><code>B@01,04</code></td>
		</tr>
		<tr>
			<td>Bokstav $D$ m&aring;ste direkt f&ouml;reg&aring; $C$ eller $B$</td>
			<td><code>D:CB</code></td>
		</tr>
	</tbody>
</table>

<p>Skriv ett program som ber&auml;knar p&aring; hur m&aring;nga s&auml;tt som $N$ olika bokst&auml;ver (f&ouml;r enkelhets skull kallade A, B, C,... etc.) kan placeras ut, givet ett antal regler av dessa tv&aring; typer.&nbsp;</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r tv&aring; heltal, antalet bokst&auml;ver $N$ och antalet regler $K$. D&auml;refter f&ouml;ljer $K$ rader vardera beskrivande en regel enligt notationen ovan. En viss bokstav kan inte st&aring; f&ouml;rst i mer &auml;n en regel av vardera typen. Observera att alla platsnummer skrivs med tv&aring; siffror.</p>

### 출력

<p>Programmet ska skriva ut ett heltal: antalet s&auml;tt bokst&auml;verna kan placeras ut. Svaret kommer alltid att understiga 10 miljoner.</p>

### 제한

<ul>
	<li>$2\le N\le 15$</li>
</ul>