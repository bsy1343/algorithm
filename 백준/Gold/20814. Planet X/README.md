# [Gold IV] Planet X - 20814

[문제 링크](https://www.acmicpc.net/problem/20814)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현

### 문제 설명

<p>&Aring;ret &auml;r 2109 och en grupp forskare har just uppt&auml;ckt &quot;Planet X&quot;, en tidigare ok&auml;nd planet h&auml;r i v&aring;rt egna solsystem, bortom Plutos omloppsbana. Genast skickar forskargruppen ut en sond f&ouml;r att g&ouml;ra m&auml;tningar, och kort d&auml;refter f&aring;r de tillbaka m&auml;tdata.</p>

<p>Forskarna &auml;r specifikt intresserade av hur ytan p&aring; Planet X ser ut. Vi representerar h&auml;r ytan som ett $N \times M$ rutn&auml;t, d&auml;r varje ruta har en h&ouml;jd mellan 0 och 9.</p>

<p>Ett m&auml;tinstrument p&aring; sonden har lyckats m&auml;ta den specifika h&ouml;jden p&aring; vissa, men inte alla, rutor. Utifr&aring;n den kemiska sammans&auml;ttningen i ytan vet vi att det inte &auml;r s&auml;rskilt brant p&aring; planeten: h&ouml;jden mellan tv&aring; intilliggande rutor (rutor som delar en kant) aldrig kan skilja med mer &auml;n ett.&nbsp;</p>

<p>Nu beh&ouml;ver forskarna din hj&auml;lp f&ouml;r att f&aring; ut s&aring; mycket information fr&aring;n denna data som m&ouml;jligt. N&auml;rmare best&auml;mt vill de att du givet h&ouml;jden p&aring; n&aring;gra av rutorna hittar h&ouml;jden p&aring; alla andra rutor som g&aring;r att best&auml;mma entydigt.</p>

### 입력

<p>P&aring; den f&ouml;rsta raden st&aring;r tv&aring; heltal $1 \le N,M \le 10$, h&ouml;jden p&aring; rutn&auml;tet och bredden p&aring; rutn&auml;tet respektive. D&auml;refter f&ouml;ljer $N$ rader med $M$ tecken p&aring; varje. Det $j:te$ tecknet p&aring; rad $i$ &auml;r en <code>.</code> ifall inget v&auml;rde f&ouml;r denna ruta finns, och &auml;r en siffra mellan 0 och 9 som motsvarar h&ouml;jden p&aring; rutan annars.</p>

### 출력

<p>Programmet ska skriva ut $N$ rader med $M$ tecken p&aring; varje: rutn&auml;tet som det ser ut efter att korrekta h&ouml;jder &auml;r ifyllda p&aring; alla rutor d&auml;r h&ouml;jden g&aring;r att best&auml;mma.</p>