# [Silver III] Lisp till C - 20863

[문제 링크](https://www.acmicpc.net/problem/20863)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 95, 정답: 82, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

구현, 문자열, 재귀

### 문제 설명

<p>C &auml;r ett gammalt programmeringsspr&aring;k fr&aring;n 70-talet, som trots dess &aring;lder &auml;r v&auml;ldigt v&auml;lanv&auml;nt. I spr&aring;ket skrivs funktionsanrop till en funktion med namnet <code>namn</code> p&aring; formen <code>namn(parameter1, parameter2, ..., parameterN)</code>. En parameter kan antingen vara en variabel (som i v&aring;rt fall best&aring;r av en sekvens av tecken <code>a-z</code>), eller ett funktionsanrop i sig. T.ex. kan ett fullst&auml;ndigt funktionsanrop se ut p&aring; f&ouml;ljande vis:</p>

<pre>
a(b, c(d), e(f, g(h, i, j)))</pre>

<p>Ett funktionsanrop utan parametrar skrivs som <code>funktion()</code>.</p>

<p>Lisp &auml;r ett annat programmeringsspr&aring;k fr&aring;n 50-talet. I spr&aring;ket skrivs funktionsanrop till en funktion med namnet <code>namn</code> p&aring; formen <code>(namn parameter1 parameter2 ... parameter N)</code>. &Aring;terigen kan en parameter i sig vara en variabel eller ett funktionsanrop. Funktionsanropet i C som beskrivs ovan kan ist&auml;llet skrivas</p>

<pre>
(a b (c d) (e f (g h i j)))</pre>

<p>Ett funktionsanrop utan parametrar skrivs som <code>(funktion)</code>.</p>

<p>Varf&ouml;r denna spr&aring;khistoria? Jo, det visar sig att domaren Simon gillar C, men inte Lisp. Domaren Johan, &aring; andra sidan, gillar Lisp, men inte C.</p>

<p>Simon blev d&auml;rf&ouml;r v&auml;ldigt sur n&auml;r Johan programmerade alla sina exempell&ouml;sningar i Lisp, och vill konvertera Johans program till C. Hj&auml;lp Simon med detta, genom att skriva ett program som, givet ett funktionsanrop i Lisp konverterar det till ett funktionsanrop i C.</p>

### 입력

<p>Indatan best&aring;r av en rad med ett korrekt formaterat funktionsanrop i Lisp-format, h&ouml;gst $100\,000$ tecken l&aring;ng. Alla parametrar kommer att vara separerade med exakt ett blanksteg, och det finns inga extra blanksteg d&auml;r det inte beh&ouml;vs.</p>

### 출력

<p>Skriv ut en enda rad, med funktionsanropet konverterat till C-format. Inkludera ett blanksteg efter varje kommatecken, som i exempelfallen.</p>