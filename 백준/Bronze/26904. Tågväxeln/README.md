# [Bronze II] Tågväxeln - 26904

[문제 링크](https://www.acmicpc.net/problem/26904)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 57, 맞힌 사람: 41, 정답 비율: 83.673%

### 분류

수학, 구현, 사칙연산, 시뮬레이션

### 문제 설명

<p>V&auml;xelholm &auml;r en v&auml;ldigt liten stad som ligger l&aring;ngt ute p&aring; landet. Den best&aring;r faktiskt endast av en enda byggnad - V&auml;xelholms t&aring;gstation. Staden har ocks&aring; bara en inv&aring;nare, n&auml;mligen t&aring;gstationens f&ouml;rest&aring;ndare, Lokas. </p>

<p>Lokas jobb g&aring;r i huvudsak ut p&aring; att operera stationens manuella t&aring;gv&auml;xel, s&aring; att de tv&aring; pendelt&aring;gen som passerar genom staden &aring;ker &aring;t r&auml;tt h&aring;ll. T&aring;gen g&aring;r periodiskt med $n$ respektive $m$ minuters mellanrum, med f&ouml;rsta avg&aring;ng $n$ och $m$ minuter <strong>efter midnatt</strong>. T&aring;gen &aring;ker allts&aring; ut fr&aring;n stationen &aring;t samma h&aring;ll men &aring;ker sedan ut p&aring; tv&aring; olika sp&aring;r, som delas upp av en v&auml;xel.</p>

<p>Nu har Lokas arbetsgivare JS, J&auml;rnv&auml;garnas Stat, best&auml;mt att Lokas ska f&aring; l&ouml;n baserat p&aring; hur m&aring;nga g&aring;nger han m&aring;ste &auml;ndra v&auml;xeln p&aring; en dag. De undrar nu hur m&aring;nga g&aring;nger som Lokas m&aring;ste &auml;ndra p&aring; v&auml;xeln under ett helt dygn (dvs 1440 minuter). T&aring;gen avg&aring;r allts&aring; bara under minuterna 00:00 till 23:59. </p>

<p>Lokas ska &auml;ndra v&auml;xeln enligt reglerna:</p>

<ol>
	<li>Om ett t&aring;g ska avg&aring;, och v&auml;xeln &auml;r fel inst&auml;lld, m&aring;ste Lokas &auml;ndra v&auml;xeln till r&auml;tt sp&aring;r.</li>
	<li>Om b&aring;da t&aring;g ska avg&aring; samma minut, s&aring; avg&aring;r f&ouml;rst det t&aring;g som v&auml;xeln &auml;r inst&auml;lld f&ouml;r, och sedan ska Lokas &auml;ndra v&auml;xeln till det andra t&aring;gets sp&aring;r.</li>
</ol>

<p>I b&ouml;rjan &auml;r v&auml;xeln inst&auml;lld p&aring; sp&aring;ret f&ouml;r det t&aring;g som avg&aring;r f&ouml;rst. </p>

<p>Skriv ett program som ber&auml;knar hur m&aring;nga g&aring;nger som Lokas m&aring;ste &auml;ndra v&auml;xeln under ett helt dygn.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r tv&aring; heltal $n$ och $m$ ($1 \leq n, m \leq 1399, n \not= m$), perioderna f&ouml;r t&aring;gens avg&aring;ng angivna i minuter.</p>

### 출력

<p>Skriv ut ett heltal, minsta antalet g&aring;nger som Lokas m&aring;ste &auml;ndra v&auml;xeln.</p>