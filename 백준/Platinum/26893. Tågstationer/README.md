# [Platinum IV] Tågstationer - 26893

[문제 링크](https://www.acmicpc.net/problem/26893)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 21, 맞힌 사람: 14, 정답 비율: 28.571%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Zohan och Jim&oacute;n &auml;r p&aring; v&auml;g till tr&auml;ningsl&auml;ger i programmering. Det episka tr&auml;ningsl&auml;gret &auml;ger rum i staden Petrozavodsk, och de har beslutat sig f&ouml;r att resa med t&aring;g.</p>

<p>Under resans g&aring;ng s&aring; sitter Jim&oacute;n av n&aring;gon anledning och r&auml;knar antalet personer som g&aring;r av och p&aring; vid varje station som t&aring;get stannar vid. Dessa antal skriver han upp i sin anteckningsbok -- en stations data antecknas per sida.</p>

<p>N&auml;r Jim&oacute;n ska kliva av t&aring;get s&aring; ramlar han och hans anteckningsbok slits i bitar -- allt han har kvar &auml;r en h&ouml;g med anteckningar huller om buller. Zohan utmanar nu Jim&oacute;n att &aring;terst&auml;lla ordningen i vilken stationerna upptr&auml;dde, givet siffrorna som st&aring;r p&aring; sidorna som ligger p&aring; marken. Kan du hj&auml;lpa honom, eller kan du bevisa att Jim&oacute;n m&aring;ste ha r&auml;knat fel?</p>

### 입력

<p>P&aring; f&ouml;rsta rader st&aring;r ett heltal $N$, antalet sidor i anteckningsblocket.</p>

<p>Efter det f&ouml;ljer $N$ rader (en per papperssida), vardera med tv&aring; icke-negativa heltal: antalet personer som stiger p&aring; vid stationen, och antalet som stiger av.</p>

<p>En person g&aring;r aldrig av p&aring; samma plats som hen g&aring;r p&aring;. Det garanteras att det totala antalet p&aring;stigande och det totala antalet avstigande &auml;r samma, och att detta antal &auml;r h&ouml;gst $10^9$. T&aring;get &auml;r alltid tomt n&auml;r Jim&oacute;n b&ouml;rjar r&auml;kna och t&aring;get &auml;r alltid tomt n&auml;r han har r&auml;knat klart. F&ouml;r enkelhets skull s&aring; antar vi att Jim&oacute;n inte r&auml;knar med sig sj&auml;lv eller Zohan -- och det &auml;r garanterat att de g&aring;r p&aring; f&ouml;rst och stiger av sist (de missar allts&aring; inte att r&auml;kna n&aring;gon).</p>

### 출력

<p>Om det &auml;r m&ouml;jligt f&ouml;r stationerna att ordnas p&aring; s&aring; s&auml;tt att det aldrig &auml;r fler personer som stiger av &auml;n som finns p&aring; t&aring;get, skriv ut f&ouml;rst en rad &quot;<code>JA</code>&quot;, och sedan en rad med en m&ouml;jlig ordning, d&auml;r varje tal $1$ till $N$ f&ouml;rekommer exakt en g&aring;ng. I annat fall, d.v.s. om Jim&oacute;n gjort n&aring;got fel, skriv ut &quot;<code>NEJ</code>&quot;.</p>

### 제한

<ul>
	<li>$ 2 \le N \le 60\,000 $</li>
</ul>