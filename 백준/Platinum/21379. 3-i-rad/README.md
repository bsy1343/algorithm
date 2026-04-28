# [Platinum IV] 3-i-rad - 21379

[문제 링크](https://www.acmicpc.net/problem/21379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 7, 맞힌 사람: 4, 정답 비율: 14.815%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 게임 이론, 파싱, 문자열

### 문제 설명

<p>M&aring;rten &auml;r extremt duktig p&aring; 3-i-rad. S&aring; duktig att du aldrig lyckas sl&aring; honom! Skriv ett datorprogram som spelar 3-i-rad &aring;t dig, s&aring; du kanske har en chans.</p>

<p>Om du inte vet vad 3-i-rad &auml;r, kan du l&auml;sa om hur spelet fungerar <a href="https://sv.wikipedia.org/wiki/Tre_i_rad">p&aring; Wikipedia</a>.</p>

### 입력

<p>Detta problem &auml;r interaktivt. Du ska f&ouml;rst l&auml;sa en rad som inneh&aring;ller antingen <code>first</code> or <code>second</code> - detta s&auml;ger om du ska dra f&ouml;rst eller inte.</p>

<p>Varje g&aring;ng du ska dra ska du l&auml;sa in ett 3-i-rad-br&auml;de med draget M&aring;rten gjorde (eller ett blankt br&auml;de f&ouml;r det allra f&ouml;rsta draget), och sedan skriva ut ett 3-i-rad-br&auml;de med draget du gjorde.</p>

<p>Om du skriver ut ett br&auml;de d&auml;r du vinner eller spelar oavgjort ska ditt program avslutas. Om du l&auml;ser in ett br&auml;de d&auml;r M&aring;rten vunnit eller spelat oavgjort ska ditt program avslutas.</p>

<p>Ett br&auml;de ska skrivas ut och l&auml;sas in som 3 rader med 3 tecken vardera - antingen <code>.</code> f&ouml;r tom ruta, <code>o</code> f&ouml;r M&aring;rtens pj&auml;ser, eller <code>x</code> f&ouml;r dina pj&auml;ser (obs: sm&aring; bokst&auml;ver).</p>

### 출력

<p>I exemplet nedan spelar M&aring;rten f&ouml;rst. M&aring;rtens utskrift &auml;r i fetstil.</p>

<pre>
<strong>second
..o
...
...
</strong>..o
.x.
...
<strong>.oo
.x.
...
</strong>xoo
.x.
...
<strong>xoo
.xo
...
</strong>xoo
.xo
..x
</pre>

<p>Efter det sista draget vann du mot M&aring;rten, och ska d&auml;rmed avsluta ditt program.</p>