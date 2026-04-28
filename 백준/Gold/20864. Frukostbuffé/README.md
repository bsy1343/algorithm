# [Gold II] Frukostbuffé - 20864

[문제 링크](https://www.acmicpc.net/problem/20864)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

누적 합, 게임 이론

### 문제 설명

<p>P&auml;r och Oskar ska &auml;ta frukostbuff&eacute;. Den best&aring;r av $N$ olika r&auml;tter numrerade fr&aring;n $1$ till $N$. Dessa &auml;r placerade p&aring; rad p&aring; ett l&aring;ngt bord. P&auml;r tycker att vissa r&auml;tter &auml;r godare &auml;n andra. D&auml;rf&ouml;r har han gett varje r&auml;tt ett betyg som beskriver hur god den &auml;r. Den $i$:te r&auml;tten har betyg $a_i$.</p>

<p>I b&ouml;rjan v&auml;ljer P&auml;r en r&auml;tt och &auml;ter den. Sedan v&auml;ljer Oskar en r&auml;tt och &auml;ter den. B&aring;da &auml;r mycket hungriga, s&aring; de &auml;ter alltid upp allt som finns av sin valda r&auml;tt.</p>

<p>N&auml;r b&aring;da har &auml;tit upp f&aring;r de v&auml;lja en ny r&auml;tt. P&auml;r och Oskar tycker att det &auml;r jobbigt att g&aring; s&aring; de v&auml;ljer alltid en r&auml;tt som &auml;r precis bredvid den de just &aring;t. D.v.s., om n&aring;gon just &auml;tit r&auml;tt $i$ kan han v&auml;lja r&auml;tt $i-1$ eller $i+1$. Om den nya r&auml;tten inte &auml;r upp&auml;ten tar den som valde den och &auml;ter den. Om den redan &auml;r upp&auml;ten m&aring;ste personen v&auml;nta till n&auml;sta tur. I varje tur &auml;r det P&auml;r som v&auml;ljer f&ouml;rst.</p>

<p>P&auml;r vill inte vara kr&auml;sen, s&aring; han t&auml;nker inte g&aring; f&ouml;rbi en r&auml;tt som finns kvar utan att &auml;ta den. Han &auml;r ocks&aring; som sagt mycket hungrig, s&aring; han vill alltid &auml;ta minst en r&auml;tt. B&aring;de P&auml;r och Oskar har efter att ha &auml;tit en r&auml;tt m&ouml;jligheten att h&ouml;gt utropa &quot;Nu &auml;r jag m&auml;tt!&quot; och l&auml;mna frukosten utan att &auml;ta n&aring;got mer.</p>

<p>Frukosten &auml;r slut n&auml;r alla r&auml;tter &auml;r upp&auml;tna eller b&aring;da har l&auml;mnat frukosten. Hur n&ouml;jd Per &auml;r beror p&aring; hur goda r&auml;tter han har &auml;tit. Vi definierar hans n&ouml;jdhet som summan av betygen av alla r&auml;tter han &aring;t.</p>

<p>P&auml;r vet inte riktigt hur Oskar kommer att bete sig. D&auml;rf&ouml;r vill han veta vilken maximala n&ouml;jdhet han kan garantera sig utan att veta n&aring;got om Oskars beteende.</p>

### 입력

<p>Indatan b&ouml;rjar med en rad som inneh&aring;ller antalet r&auml;tter $N$ i buff&eacute;n. D&auml;refter f&ouml;ljer en rad med $N$ stycken heltal, varje r&auml;tts godhet $a_i$.</p>

### 출력

<p>Programmet ska skriva ut ett heltal - den maximala n&ouml;jdhet P&auml;r garanterat kan f&aring;.</p>

### 제한

<ul>
	<li>$2 \le N \le&nbsp;300000$</li>
	<li>$-100 \le a_i \le 100$</li>
</ul>