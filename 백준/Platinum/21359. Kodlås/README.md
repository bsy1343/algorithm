# [Platinum V] Kodlås - 21359

[문제 링크](https://www.acmicpc.net/problem/21359)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

포함 배제의 원리

### 문제 설명

<p>&Aring;skold har just k&ouml;pt ett nytt kodl&aring;s. F&ouml;rs&auml;ljaren lovade att l&aring;set &auml;r mycket s&auml;kert, men &Aring;skold &auml;r inte &ouml;vertygad. D&auml;rf&ouml;r vill han att du ska r&auml;kna ut hur m&aring;nga olika kombinationer som &ouml;ppnar l&aring;set.</p>

<p>Kodl&aring;set best&aring;r av $N$ intilliggande skivor. Varje skiva har $M$ segment, d&auml;r ett segment antingen &auml;r ifyllt eller ett h&aring;l. F&ouml;r att skriva in en kod vrider man p&aring; skivorna. Varje skiva kan s&auml;ttas i $M$ olika l&auml;gen, eftersom mekanismen inte till&aring;ter att du vrider skivan mindre &auml;n ett helt segment. L&aring;set &ouml;ppnas om det <strong>n&aring;gonstans</strong> g&aring;r ett h&aring;l genom alla skivor p&aring; samma st&auml;lle.</p>

<p>Vi kan beskriva varje skiva som en str&auml;ng best&aring;ende av &quot;<code>.</code>&quot; och &quot;<code>#</code>&quot;, d&auml;r &quot;<code>.</code>&quot; representerar ett segment med h&aring;l i och &quot;<code>#</code>&quot; representerar ett ifyllt segment. Att rotera en skiva ett steg kan d&aring; ses som att ta sista tecknet i str&auml;ngen och l&auml;gga det i b&ouml;rjan. Om skivan roteras $M$ steg kommer den tillbaka till l&auml;get den b&ouml;rjade i.</p>

<p>Exempelvis kan skivan &quot;<code>.#..#</code>&quot; st&auml;llas in i f&ouml;ljande 5 l&auml;gen</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><code>.#..#</code></td>
			<td><code>#.#..</code></td>
			<td><code>.#.#.</code></td>
			<td><code>..#.#</code></td>
			<td><code>#..#.</code></td>
		</tr>
	</tbody>
</table>

<p>Totalt finns det allts&aring; $M^N$ m&ouml;jliga s&auml;tt att st&auml;lla in de $N$ skivorna, och l&aring;set &ouml;ppnas ifall n&aring;gon kolumn bara best&aring;r av &quot;<code>.</code>&quot; n&auml;r man skriver ut alla skivornas str&auml;ngar ovanf&ouml;r varandra. Skriv ett program som ber&auml;knar hur m&aring;nga s&auml;tt det finns att st&auml;lla in skivorna s&aring; att l&aring;set &ouml;ppnas.</p>

### 입력

<p>Ditt program ska f&ouml;rst l&auml;sa in tv&aring; heltal: $N$ ($1\le N \le 12$) &nbsp;-- antal skivor och $M$ ($1\le M \le 12$) -- antal segment.</p>

<p>D&auml;refter ska ditt program l&auml;sa in beskrivningar av de $N$ skivorna. Varje skiva beskrivs av en rad med $M$ tecken best&aring;ende av &quot;<code>.</code>&quot; och &quot;<code>#</code>&quot;.</p>

### 출력

<p>Ditt program ska skriva ut ett heltal: antalet s&auml;tt man kan st&auml;lla in skivorna s&aring; att l&aring;set &ouml;ppnas.</p>