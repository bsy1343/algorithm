# [Platinum IV] Laserschack - 26879

[문제 링크](https://www.acmicpc.net/problem/26879)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 6, 맞힌 사람: 6, 정답 비율: 12.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 이분 탐색, 시뮬레이션, 너비 우선 탐색, 매개 변수 탐색

### 문제 설명

<p>Fredrik och Abdullah spelar ett parti Laserschack mot varandra. Spelet spelas p&aring; ett rutn&auml;t, och g&aring;r ut p&aring; att skjuta en laserstr&aring;le p&aring; motst&aring;ndarens kung. Abdullah har en attackpj&auml;s som n&auml;r man trycker p&aring; en knapp skjuter ut laser i alla fyra riktningar (upp, ned, h&ouml;ger och v&auml;nster), markerad med <code>A</code> i rutn&auml;tet. Fredriks kung &auml;r markerad med <code>K</code>. Det finns ocks&aring; spegelpj&auml;ser i rutn&auml;tet, markerade med <code>o</code>. N&auml;r en laser tr&auml;ffar en spegelpj&auml;s studsar str&aring;len ut i all fyra riktningar.</p>

<p>Spelet har just hamnat i en position d&auml;r Abdullah kommer vinna om han bara trycker p&aring; knappen f&ouml;r att skjuta lasern. F&ouml;r att stoppa Abdullah fr&aring;n att vinna har nu Fredrik lagt ut r&ouml;kbomber p&aring; planen, markerade med <code>R</code>. R&ouml;ken stoppar laserstr&aring;lar fr&aring;n att f&auml;rdas genom den rutan. Varje sekund sprider sig r&ouml;ken till alla dom fyra angr&auml;nsande rutorna. Om attackpj&auml;sen eller kungen &auml;r i r&ouml;k kan inte Abdullah vinna. </p>

<p>Hur m&aring;nga sekunder tar det innan Abdullah inte l&auml;ngre vinner genom att trycka p&aring; knappen? Allts&aring;, hur m&aring;nga sekunder tar det tills att r&ouml;ken spridit sig s&aring; att lasern inte l&auml;ngre n&aring;r kungen fr&aring;n attackpj&auml;sen? Det &auml;r garanterat att spelet ursprungligen &auml;r i en position d&auml;r lasern n&aring;r kungen fr&aring;n attackpj&auml;sen utan att g&aring; genom n&aring;gon r&ouml;k.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $R$ och $C$ ($1\le R, 1 \le C, R\times C \le 40 000$) , antalet rader och kolumner i rutn&auml;tet som utg&ouml;r spelplanen.</p>

<p>De f&ouml;ljande $R$ raderna utg&ouml;r en beskrivning av hur spelplanen ser ut. Den $i$:te av dessa rader inneh&aring;ller $C$ tecken som beskriver hur den $i$:te raden ser ut. Varje tecken &auml;r n&aring;got av f&ouml;ljande:</p>

<ul>
	<li><code>.</code> f&ouml;r en tom ruta</li>
	<li><code>o</code> f&ouml;r en spegelpj&auml;s</li>
	<li><code>R</code> f&ouml;r en r&ouml;kbomb</li>
	<li><code>A</code> f&ouml;r attackpj&auml;sen</li>
	<li><code>K</code> f&ouml;r kungen</li>
</ul>

<p>Det garanteras att <code>A</code> och <code>K</code> f&ouml;rekommer exakt en g&aring;ng vardera, att <code>R</code> f&ouml;rekommer minst en g&aring;ng, och att laserstr&aring;len n&aring;r fram till kungen fr&aring;n attackpj&auml;sen fr&aring;n b&ouml;rjan.</p>

### 출력

<p>Skriv ut ett positivt heltal -- antal sekunder det tar tills lasern inte l&auml;ngre n&aring;r kungen.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f0752fe8-6272-4b07-9476-ba99065d29f3/-/preview/" style="width: 300px; height: 300px;" /></p>

<p style="text-align: center;">Exempelfall 1 efter en sekund.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/facc7f1e-c817-4000-92ed-b424cf04fbc6/-/preview/" style="width: 793px; height: 596px;" /></p>

<p style="text-align: center;">Exempelfall 2 efter tre sekunder.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2374452c-9e87-4159-b4bc-74009789bfd6/-/preview/" style="width: 891px; height: 989px;" /></p>

<p style="text-align: center;">Exempelfall 3 efter tv&aring; sekunder.</p>