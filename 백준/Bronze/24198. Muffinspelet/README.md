# [Bronze III] Muffinspelet - 24198

[문제 링크](https://www.acmicpc.net/problem/24198)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 311, 정답: 265, 맞힌 사람: 241, 정답 비율: 90.262%

### 분류

수학, 구현, 사칙연산, 시뮬레이션

### 문제 설명

<p>Alf och Beata var tv&aring; ungdomar som levde f&ouml;r l&auml;nge, l&auml;nge sedan, p&aring; tiden innan man kunde spendera sina eftermiddagar med programmeringst&auml;vlingar. Deras liv var s&aring;ledes mycket tr&aring;kigare &auml;n vad dagens ungdomars liv &auml;r. Hur man kan &ouml;verleva utan datorer, kanske du fr&aring;gar dig. Svaret &auml;r enkelt: man bakar!</p>

<p>V&aring;ra tv&aring; ungdomar &auml;lskade att baka muffins, och hade ofta stora h&ouml;gar n&auml;r de var klara med bakningen. F&ouml;r att inte fylla sina k&ouml;k med muffins utmanade Beata sin kompis p&aring; ett spel varje kv&auml;ll - <em>Muffinspelet</em>.</p>

<p>Muffinspelet spelas av tv&aring; spelare (i v&aring;rt fall, Alf och Beata), samt en stor h&ouml;g med $N$ muffins. Spelarna turas nu om att g&ouml;ra drag. Ett drag g&aring;r ut p&aring; att spelare $A$ delar upp muffinsh&ouml;gen i tv&aring; delar (d&auml;r en av h&ouml;garna kanske &auml;r tom). Motspelaren v&auml;ljer sedan en av h&ouml;garna, och &auml;ter upp alla muffins i h&ouml;gen. I n&auml;sta drag byter spelarna roll, s&aring; spelare $B$ delar upp muffinsh&ouml;gen och spelare $A$ &auml;ter upp en av h&ouml;garna. De turas om p&aring; detta vis &auml;nda tills alla muffins &auml;r slut.</p>

<p>Alf b&ouml;rjar med att g&ouml;ra ett drag (dvs att dela upp den stora h&ouml;gen), och Beata b&ouml;rjar med att &auml;ta upp en av h&ouml;garna. Kan du ber&auml;kna hur m&aring;nga muffins Alf och Beata kommer &auml;ta under spelets g&aring;ng om de b&aring;da spelar s&aring; bra som m&ouml;jligt (allts&aring; vill ha s&aring; m&aring;nga muffins som m&ouml;jligt sj&auml;lva)?</p>

<p><em>Ledning: n&auml;r man delar en h&ouml;g med muffins vill man alltid g&ouml;ra det i tv&aring; h&ouml;gar vars storlekar &auml;r s&aring; lika som m&ouml;jligt (se exempelf&ouml;rklaringarna).</em></p>

### 입력

<p>Den f&ouml;rsta och enda raden i indatan inneh&aring;ller heltalet $N$, antalet muffins i h&ouml;gen fr&aring;n b&ouml;rjan.</p>

### 출력

<p>Du ska skriva ut tv&aring; heltal: antalet muffins som Alf kommer &auml;ta och antalet muffins som Beata kommer &auml;ta om de b&aring;da spelar s&aring; bra som m&ouml;jligt.</p>

### 제한

<ul>
	<li>$N \le 10\,000$</li>
</ul>