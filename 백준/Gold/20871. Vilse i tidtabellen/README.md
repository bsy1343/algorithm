# [Gold III] Vilse i tidtabellen - 20871

[문제 링크](https://www.acmicpc.net/problem/20871)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 3, 맞힌 사람: 3, 정답 비율: 25.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Rakso &auml;r p&aring; semester i Duln f&ouml;r att titta p&aring; dyk-makron. Hon st&aring;r vid en bussh&aring;llplats och ska &aring;ka till sitt hotell &quot;de nio&quot;. Det brukar alltid regna i Duln men idag &auml;r det isande kallt.</p>

<p>I gl&auml;djen att vara p&aring; semester, l&aring;ngt borta fr&aring;n sitt hem i den bedr&ouml;vliga staden Stomholck, har Rakso totalt tappat tidsuppfattningen -- hon vet inte vad klockan &auml;r. N&auml;r hon tar upp sin j&auml;ttesmarta fickdator f&ouml;r att ta reda p&aring; saken d&ouml;r den -- det &auml;r f&ouml;r kallt ute f&ouml;r att den ska fungera!</p>

<p>Men Rakso ger inte upp. Hon best&auml;mmer sig f&ouml;r att ta reda p&aring; vad klockan &auml;r &auml;nd&aring;. Till sin hj&auml;lp har hon:</p>

<ol>
	<li>En tidtabell p&aring; v&auml;ggen. Den visar vid vilka tider en buss anl&auml;nder till h&aring;llplatsen hon st&aring;r vid. Samma tidtabell g&auml;ller f&ouml;r alla dagar, och enbart en busslinje passerar stationen.</li>
	<li>En display som visar hur snart de kommande $N$ bussarna anl&auml;nder till h&aring;llplatsen.</li>
</ol>

<p>Bussar kommer alltid exakt n&auml;r de lovar (detta &auml;r ju inte Stomholck), och anl&auml;nder bara vid hela sekunder. Just nu n&auml;r Rakso observerar tidtabellerna och displayen &auml;r det ocks&aring; vid en hel sekund. Om en buss anl&auml;nder precis just nu kommer den synas p&aring; displayen med v&auml;rde $0$.</p>

<p>Kan du hj&auml;lpa Rakso att skriva ett program som svarar p&aring; vad klockan &auml;r? Om det finns flera m&ouml;jliga svar, s&aring; skriv ut alla. Om det inte finns n&aring;gon giltig l&ouml;sning (d.v.s. displayen m&aring;ste visa fel), skriv ut <code>&quot;fel&quot;</code>.</p>

<p>(Baserat p&aring; en verklig h&auml;ndelse. Rakso heter egentligen n&aring;got annat.)</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $N$ och $M$ ($1 \leq N \leq 10^6$ , $1 \leq M \leq 3\,000$). Den andra raden inneh&aring;ller $N$ tal: tiderna $t_i$ till n&auml;stkommande bussar som visas p&aring; displayen, i sekunder ($0 \le t_i \le 10^9$). Dessa garanteras komma i stigande ordning, och inga tider &auml;r samma.</p>

<p>De f&ouml;ljande $M$ raderna inneh&aring;ller tiderna i tidtabellen i stigande ordning, p&aring; formatet <code>hh:mm:ss</code> (mellan <code>00:00:00</code> och <code>23:59:59</code>). Tidtabellen kommer inte att inneh&aring;lla n&aring;gra upprepade tider.</p>

### 출력

<p>Skriv ut en enda rad: m&ouml;jligheterna f&ouml;r vad klockan kan vara, separerade med mellanslag. Tiderna ska vara sorterade i &ouml;kande ordning, och formateras p&aring; samma s&auml;tt som i indata.</p>

<p>Om det inte finns n&aring;gon m&ouml;jlighet alls f&ouml;r vad klockan kan vara, skriv ut <code>&quot;fel&quot;</code> (utan citattecken).</p>