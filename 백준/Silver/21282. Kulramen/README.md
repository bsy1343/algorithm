# [Silver III] Kulramen - 21282

[문제 링크](https://www.acmicpc.net/problem/21282)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 19, 정답 비율: 79.167%

### 분류

구현, 수학

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/21282.%E2%80%85Kulramen/d855ed8b.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/21282.%E2%80%85Kulramen/d855ed8b.png" data-original-src="https://upload.acmicpc.net/9f712b98-1001-4f96-9d0b-3f3e65512d40/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 387px; height: 100px;" /></p>

<p style="text-align: center;">Figur 2.&nbsp;S&aring; h&auml;r kunde Simons kulram (med $R=4$) se ut innan han b&ouml;rjade &auml;ta upp kulorna. D&aring; var det l&auml;tt att &ouml;vers&auml;tta st&auml;llningen till ett decimaltal.</p>

<p>Lille Simon har f&aring;tt en kulram i present. Kulramen har $R$ rader och i varje rad fanns fr&aring;n b&ouml;rjan 9 kulor, s&aring; att man kunde representera $R$-siffriga decimaltal -- en siffra p&aring; varje rad. Om en rad hade $X$ kulor p&aring; v&auml;nstra sidan, sedan ett mellanrum och &ouml;vriga kulor p&aring; h&ouml;ger sida representerade raden siffran X.</p>

<p>Tyv&auml;rr tyckte Simon att kulorna p&aring; ramen s&aring;g v&auml;ldigt smaskiga ut, och &aring;t helt enkelt upp n&aring;gra kulor. Det finns dock minst en kula kvar p&aring; varje rad.</p>

<p>Simon l&auml;rde sig snabbt att r&auml;kna p&aring; sin nya kulram. Han representerar talet d&auml;r alla kulor &auml;r p&aring; h&ouml;gersidan som talet 0, och adderar sedan 1 precis som han hade gjort p&aring; en vanlig kulram, genom att flytta en kula fr&aring;n h&ouml;ger till v&auml;nster p&aring; den nedersta raden som har n&aring;gon kula kvar p&aring; h&ouml;ger sida (l&aring;t oss kalla den <em>flyttningsraden</em>) samt flytta alla kulor p&aring; raderna nedanf&ouml;r flyttningsraden till h&ouml;ger sida (om inte flyttningsraden &auml;r den nedersta raden). Om 1 adderas n&auml;r alla kulorna p&aring; <em>alla</em> rader redan &auml;r p&aring; v&auml;nster sida (s&aring; att det inte finns n&aring;gon flyttningsrad) blir resultatet 0.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/21282.%E2%80%85Kulramen/96963354.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/21282.%E2%80%85Kulramen/96963354.png" data-original-src="https://upload.acmicpc.net/d0e8f205-3e2c-4bfb-a39a-9fbab5749a08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 510px; height: 300px;" /></p>

<p style="text-align: center;">Figur 3.&nbsp;N&aring;gra exempel p&aring; hur Simon adderar 1 p&aring; den kulram som &aring;terfinns i de tv&aring; f&ouml;rsta exemplen. Dubbelpilen markerar &quot;flyttningsraden&quot; vid de olika additionerna.</p>

<p>Simon h&aring;ller p&aring; att r&auml;kna sandkornen i sin sandl&aring;da och skulle beh&ouml;va hj&auml;lp att skriva ett program som, givet ett visst utg&aring;ngsl&auml;ge p&aring; kulramen, r&auml;knar ut hur kulramen ser ut n&auml;r han $N$ g&aring;nger har adderat 1.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r antalet rader $R$. D&auml;refter f&ouml;ljer $R$ rader med vardera tv&aring; heltal, antalet kulor till v&auml;nster respektive h&ouml;ger p&aring; varje rad (uppifr&aring;n och ned). Slutligen finns en rad med det positiva heltalet $N$.&nbsp;</p>

### 출력

<p>Programmet ska skriva ut $R$ rader med tv&aring; tal p&aring; varje rad: antalet kulor till v&auml;nster respektive h&ouml;ger p&aring; varje rad efter additionerna.</p>

### 제한

<ul>
	<li>$R\le 12$</li>
	<li>$N\le 10^{12}$</li>
</ul>