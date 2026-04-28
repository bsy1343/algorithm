# [Bronze II] Lamps - 26938

[문제 링크](https://www.acmicpc.net/problem/26938)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 108, 정답: 71, 맞힌 사람: 62, 정답 비율: 65.957%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Anv&auml;ndningen av gl&ouml;dlampor &auml;r p&aring; v&auml;g att avskaffas inom EU, men redan nu kan det l&ouml;na sig att anv&auml;nda l&aring;genergilampor. Du ska skriva ett program som, givet hur mycket en lampa &auml;r t&auml;nd varje dag samt elpriset, ber&auml;knar efter hur m&aring;nga dagar totalkostnaden (ink&ouml;p av lampor + elkostnad) f&ouml;r f&ouml;rsta g&aring;ngen &auml;r l&auml;gre f&ouml;r l&aring;genergilampan &auml;n f&ouml;r gl&ouml;dlampan. Vi antar f&ouml;ljande data:</p>

<table class="table table-bordered table-center-30 th-center td-center">
	<tbody>
		<tr>
			<th> </th>
			<th>Gl&ouml;dlampa</th>
			<th>L&aring;genergilampa</th>
		</tr>
		<tr>
			<th>Effekt (watt)</th>
			<td>60</td>
			<td>11</td>
		</tr>
		<tr>
			<th>Livsl&auml;ngd (timmar)</th>
			<td>1000</td>
			<td>8000</td>
		</tr>
		<tr>
			<th>Ink&ouml;pspris (kronor)</th>
			<td>5</td>
			<td>60</td>
		</tr>
	</tbody>
</table>

<p>F&ouml;r enkelhets skull antar vi att alla exemplar har exakt den givna livsl&auml;ngden. Detta inneb&auml;r allts&aring; att f&ouml;r att ha lampan t&auml;nd i $1000$ timmar r&auml;cker det att k&ouml;pa en gl&ouml;dlampa, men f&ouml;r att ha den t&auml;nd i $1001$ timmar m&aring;ste man k&ouml;pa ytterligare en gl&ouml;dlampa eftersom den f&ouml;rsta g&aring;r s&ouml;nder efter $1000$ timmar.</p>

<p>Elkostnaden $K$ f&ouml;r att ha lampan t&auml;nd i $H$ timmar kan ber&auml;knas med formeln $$ K = \frac{E \cdot H \cdot P}{100\,000} $$ d&auml;r $E$ &auml;r lampans effekt i watt och $P$ &auml;r elpriset i &ouml;re/kWh.</p>

<p>I samtliga testfall kommer endast en l&aring;genergilampa att beh&ouml;va k&ouml;pas (l&aring;genergi blir allts&aring; billigast redan innan man beh&ouml;ver byta l&aring;genergilampan).</p>

### 입력

<p>Indatan best&aring;r av tv&aring; heltal p&aring; en rad: $h$ ($1 \le h \le 24$), antalet timmar per dag lampan &auml;r p&aring;slagen, och $P$ ($1 \le P \le 200$), elpriset.</p>

### 출력

<p>Skriv ut efter hur m&aring;nga dagar l&aring;genergilampan &auml;r billigare &auml;n gl&ouml;dlampan.</p>

### 힌트

<p>Efter $149$ dagar &auml;r kostnaden med gl&ouml;dlampor $71.32840$ kronor (varav ink&ouml;pskostnad $10$ kronor; man m&aring;ste byta gl&ouml;dlampa en g&aring;ng) och med l&aring;genergilampa $71.24354$ kronor (varav ink&ouml;pskostnad $60$ kronor).</p>