# [Bronze III] Förvirrad föreläsare - 21280

[문제 링크](https://www.acmicpc.net/problem/21280)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 297, 정답: 248, 맞힌 사람: 224, 정답 비율: 87.843%

### 분류

구현

### 문제 설명

<p>Bjarki undervisar p&aring; en kurs p&aring; universitetet, men &auml;r inte s&auml;rskilt organiserad av sig. S&auml;rskilt f&ouml;rvirrad blir han av att antalet f&ouml;rel&auml;sningar varierar fr&aring;n vecka till vecka.</p>

<p>F&ouml;rsta veckan h&aring;ller Bjarki sina $A$ schemalagda f&ouml;rel&auml;sningar. Men varje vecka utom den f&ouml;rsta kommer han att f&ouml;ruts&auml;tta att schemat &auml;r likadant som det var f&ouml;reg&aring;ende vecka. Andra veckan h&aring;ller han allts&aring; exakt $A$ f&ouml;rel&auml;sningar igen. D&auml;rf&ouml;r kan det ibland h&auml;nda att Bjarki h&aring;ller lektion inf&ouml;r tomt klassrum och ibland att han inte dyker upp n&auml;r han ska. I slutet av veckan f&aring;r han dock ett argt brev av sin chef med vilka tider han skulle h&aring;llit f&ouml;rel&auml;sningar och kommer ist&auml;llet att anv&auml;nda dessa tider veckan d&auml;rp&aring;.&nbsp;</p>

<p>Skriv ett program som, givet antalet schemalagda f&ouml;rel&auml;sningar under $N$ veckor, skriver ut antalet f&ouml;rel&auml;sningar Bjarki kommer h&aring;lla inf&ouml;r tomma klassrum samt antalet f&ouml;rel&auml;sningar Bjarki inte dyker upp p&aring;.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a42b4005-f57d-413c-a250-d96a942ecc84/-/preview/" style="width: 660px; height: 249px;" /></p>

<p style="text-align: center;">Figur 1.&nbsp;Schemat i det f&ouml;rsta exemplet. F markerar schemalagda f&ouml;rel&auml;sningar. En bl&aring; cirkel markerar att Bjarki h&aring;ller lektionen inf&ouml;r tomt klassrum och en r&ouml;d triangel markerar att han inte dyker upp. <strong>F&ouml;rklaring:</strong> F&ouml;rsta veckan har Bjarki alltid koll p&aring; vilka f&ouml;rel&auml;sningar han ska h&aring;lla. Veckan d&auml;rp&aring; tror han att han bara ska h&aring;lla en f&ouml;rel&auml;sning, och missar d&auml;rf&ouml;r tv&aring; stycken. Tredje veckan h&aring;ller han tre f&ouml;rel&auml;sningar, varav en inf&ouml;r tomt klassrum, och sista veckan missar han tv&aring; f&ouml;rel&auml;sningar. Totalt har han h&aring;llt 1 tom f&ouml;rel&auml;sning och missat 4 f&ouml;rel&auml;sningar.</p>

### 입력

<p>F&ouml;rst kommer talet $N$ p&aring; en egen rad, d&auml;r $1\le N \le 9$. D&auml;refter kommer $N$ heltal, antalet schemalagda f&ouml;rel&auml;sningar under var och en av veckorna.</p>

<p>Det kan aldrig vara mer &auml;n 10 f&ouml;rel&auml;sningar under en vecka och tiderna fylls alltid p&aring; fr&aring;n b&ouml;rjan av veckan utan luckor (se figuren ovan).&nbsp;</p>

### 출력

<p>Skriv ut antalet tomma f&ouml;rel&auml;sningar Bjarki har h&aring;llt, ett mellanslagtecken, d&auml;refter antalet f&ouml;rel&auml;sningar Bjarki har missat.</p>