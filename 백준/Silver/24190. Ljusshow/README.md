# [Silver III] Ljusshow - 24190

[문제 링크](https://www.acmicpc.net/problem/24190)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 26, 맞힌 사람: 23, 정답 비율: 92.000%

### 분류

수학, 구현, 자료 구조, 문자열, 조합론, 비트마스킹, 해시를 사용한 집합과 맵

### 문제 설명

<p>Din v&auml;n h&aring;ller p&aring; att designa en ljusshow f&ouml;r avslutningsceremonin i &aring;rets Programmeringsolympiadsfinal. Salen d&auml;r ceremonin h&aring;lls kan ses som ett rutn&auml;t med $R$ rader och $C$ kolumner. Utmed de fyra sidorna &auml;r olika lampor monterade, vilka kan lysa med en av tre olika f&auml;rger: r&ouml;tt, bl&aring;tt eller gr&ouml;nt. Under ceremonin &auml;r tanken att lamporna skiftar i olika m&ouml;nster.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24190.%E2%80%85Ljusshow/5e4ab670.png" data-original-src="https://upload.acmicpc.net/a43c546a-dee6-41e0-9ad5-18ef5766aad3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 347px;" /></p>

<p>En lampa lyser upp samtliga rutor l&auml;ngs med samma kolumn eller rad som den &auml;r monterad. Om en viss ruta lyses upp av minst en lampa av varje f&auml;rg kommer ljuset i rutan att uppfattas som ett otrevligt bl&auml;ndande vitt. Din v&auml;n har redan designat ett utkast till ljusshowen, och undrar nu om vissa av de valda ljuskonfigurationerna orsakar att f&ouml;r m&aring;nga rutor blir vita. F&ouml;r att kunna avg&ouml;ra om en konfiguration &auml;r okej eller inte har du f&aring;tt i uppgift att skriva ett program som l&auml;ser in vilken f&auml;rg samtliga lampor ska lysa med, och ber&auml;knar antalet rutor som kommer lysa vitt.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal: $R$ ($1 \le R \le 10^6$) och $C$ ($1 \le C \le 10^6$), antalet rader och kolumner i den rutn&auml;tsformade salen.</p>

<p>De fyra n&auml;sta raderna inneh&aring;ller en textstr&auml;ng vardera och beskriver vilka f&auml;rger alla lampor har. Den f&ouml;rsta raden beskriver de $C$ lamporna i toppen av rutn&auml;tet som skiner ned&aring;t i ordning v&auml;nster till h&ouml;ger, den andra de $R$ lamporna i rutn&auml;tet till h&ouml;ger om rutn&auml;tet som skiner till v&auml;nster i ordning uppifr&aring;n och ned, den tredje de $C$ lamporna under rutn&auml;tet som skiner upp&aring;t i ordning v&auml;nster till h&ouml;ger, den fj&auml;rde de $R$ lamporna i rutn&auml;tet till v&auml;nster om rutn&auml;tet som till h&ouml;ger i ordning uppifr&aring;n och ned.</p>

<p>F&auml;rgen p&aring; en lampa beskrivs med hj&auml;lp av tecknen <code>RGB</code> beroende p&aring; om lampan lyser r&ouml;tt, gr&ouml;nt eller bl&aring;tt.</p>

### 출력

<p>Skriv ut ett heltal -- antalet rutor i salen som lyser vitt. <strong>Not: svaret ryms inte n&ouml;dv&auml;ndigtvis i ett 32-bitars heltal.</strong></p>

### 힌트

<p>I det f&ouml;rsta fallet lyses samtliga rutor p&aring; den enda raden upp av r&ouml;tt b&aring;de fr&aring;n v&auml;nster och h&ouml;ger. Den f&ouml;rsta rutan lyses upp av gr&ouml;nt b&aring;de upp- och nedifr&aring;n, den andra och fj&auml;rde av b&aring;de gr&ouml;nt och bl&aring;tt, medan den tredje bara lyses upp av bl&aring;tt. S&aring;ledes &auml;r det tv&aring; av rutorna som lyses upp av alla tre f&auml;rger och blir vita.</p>

<p>I det tredje exemplet saknas bl&aring;tt ljus helt och h&aring;llet. D&auml;rf&ouml;r kan inga rutor vara vita.</p>