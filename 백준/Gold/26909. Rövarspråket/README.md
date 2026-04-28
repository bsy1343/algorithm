# [Gold III] Rövarspråket - 26909

[문제 링크](https://www.acmicpc.net/problem/26909)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

다이나믹 프로그래밍, 문자열, 최장 공통 부분 수열 문제

### 문제 설명

<p>I r&ouml;varspr&aring;ket &ouml;vers&auml;tter man text man skrivit genom att ers&auml;tta alla konsonanter $x$ med $x$<code>o</code>$x$, medan alla vokaler &auml;r of&ouml;r&auml;ndrade. T.ex. &ouml;vers&auml;tts <code>hej</code> till <code>hohejoj</code>, <code>moo</code> till <code>momoo</code> och <code>ojoj</code> till <code>ojojojoj</code>.</p>

<p>Oskar har precis l&auml;rt sig r&ouml;varspr&aring;ket, men gl&ouml;mmer ibland bort att &auml;ndra vissa konsonanter. Oskar &ouml;vers&auml;tter allts&aring; bara en <em>delm&auml;ngd</em> av konsonanterna p&aring; ovanst&aring;ende vis. Du kommer att f&aring; en ursprungstext och en potentiell &ouml;vers&auml;ttning som Oskar har gjort. Du ska avg&ouml;ra om det &auml;r m&ouml;jligt att Oskar &ouml;versatte den f&ouml;rsta str&auml;ngen till den andra enligt beskrivningen ovan.</p>

<p>Om Oskar hade skrivit <code>hejoj</code> kan den ursprungliga texten till exempel varit <code>hej</code> eller <code>hejoj</code>. F&ouml;r tydlighets skull s&aring; definierar vi f&ouml;ljande bokst&auml;ver som vokaler: <code>a,e,i,o,u,y</code> och alla andra bokst&auml;ver &auml;r d&aring; konsonanter.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ordet som vi undrar om det kan ha varit usprungstexten. Den andra raden inneh&aring;ller ett ord som Oskar har skrivit. B&aring;da orden inneh&aring;ller minst ett tecken och bara tecken <code>a-z</code> och endast sm&aring; bokst&auml;ver. Ingen str&auml;ng &auml;r l&auml;ngre &auml;n 1000 tecken.</p>

### 출력

<p>Utdata ska best&aring; av ett enda ord: <code>ja</code> om det &auml;r m&ouml;jligt att det andra ordet &auml;r en &ouml;vers&auml;ttning av det f&ouml;rsta, annars <code>nej</code>. Svaret ska allts&aring; vara <code>ja</code> om och endast om det g&aring;r att v&auml;lja n&aring;gon delm&auml;ngd av konsonanterna i det f&ouml;rsta ordet och applicera r&ouml;varspr&aring;ktransform s&aring; att man f&aring;r det senare ordet.</p>

### 힌트

<p>F&ouml;rklaring av exempelfall 1: det spelar ingen roll vilken av konsonanterna som Oskar v&auml;ljer att applicera r&ouml;varspr&aring;kstranform p&aring; - s&aring; l&auml;nge han v&auml;ljer precis ett av de <code>j</code> som finns. L&aring;t s&auml;ga att Oskar gl&ouml;mde att omvandla alla <code>j</code> utom det f&ouml;rsta - d&aring; f&ouml;rvandlas <code>ojojoj</code> till <code>ojojojoj</code>. Svaret &auml;r allts&aring; &quot;<code>ja</code>&quot;.</p>

<p>F&ouml;rklaring av exempelfall 2: det &auml;r om&ouml;jligt att omvandla den f&ouml;rsta str&auml;ngen till den andra. Ett s&auml;tt att visa detta p&aring; &auml;r att observera att det i den f&ouml;rsta str&auml;ngen finns tv&aring; <code>j</code> intill varandra, vilket inneb&auml;r att det alltid kommer finnas tv&aring; <code>j</code> intill varandra. Allts&aring; g&aring;r det inte att omvandla den f&ouml;rsta str&auml;ngen till den andra, och svaret &auml;r &quot;<code>nej</code>&quot;.</p>