# [Gold III] Eldberget - 20842

[문제 링크](https://www.acmicpc.net/problem/20842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 21, 정답 비율: 67.742%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Under en utflykt till eldbergen <em>Yanar Dag</em> i Azerbajdzjan (v&auml;rdland f&ouml;r &aring;rets internationella programmeringsolympiad) har du g&aring;tt vilse! Bergen har formen av ett rutn&auml;t med $R$ rader och $C$ kolumner. Du st&aring;r l&auml;ngst upp till v&auml;nster i rutn&auml;tet och vill f&ouml;rflytta dig till utflyktsbussen som &auml;r l&auml;ngst ner till h&ouml;ger. Eftersom bussen g&aring;r snart vill du g&aring; dit s&aring; snart som m&ouml;jligt. F&ouml;r att ta dig till bussen kan du flytta dig till en ruta direkt ovan, till h&ouml;ger, under eller till v&auml;nster om den du st&aring;r.</p>

<p>P&aring; eldbergen finns det dock ett antal eldflammor, orsakade av naturgas som sipprar ut fr&aring;n bergen. Eftersom du har v&auml;ldigt fina kl&auml;der p&aring; dig vill du inte beh&ouml;va springa igenom fler eldflammor &auml;n n&ouml;dv&auml;ndigt. Mer specifikt &auml;r du beredd att g&aring; genom h&ouml;gst $K$ eldflammor p&aring; din v&auml;g till bussen.</p>

<p>Din uppgift &auml;r att ber&auml;kna hur snabbt du kan f&ouml;rflytta dig till bussen om du f&aring;r g&aring; genom h&ouml;gst $K$ eldflammor.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $R$ ($2 \le R \le 100$) och $C$ ($2 \le C \le 100$), antalet rader och kolumner i rutn&auml;tet som eldbergen best&aring;r av, samt $K$ ($0 \le K \le 200$).</p>

<p>De f&ouml;ljande $R$ raderna utg&ouml;r en beskrivning av hur eldbergen ser ut. Den $i$:te av dessa rader inneh&aring;ller $C$ tecken som beskriver hur den $i$:te raden ser ut. Varje tecken &auml;r antingen en punkt (<code>.</code>) om en ruta &auml;r tom eller en fyrkant (<code>\#</code>) om rutan inneh&aring;ller en flamma. Rutan l&auml;ngst upp till v&auml;nster och rutan l&auml;ngst ned till h&ouml;ger &auml;r alltid punkter.</p>

### 출력

<p>Skriv ut ett heltal $N$ -- det minsta antalet steg du beh&ouml;ver f&ouml;r att ta dig till bussen. Om du inte kan ta dig till m&aring;let utan att g&aring; genom fler &auml;n $K$ flammor ska du skriva ut &quot;<code>nej</code>&quot;.</p>