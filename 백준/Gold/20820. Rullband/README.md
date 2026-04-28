# [Gold III] Rullband - 20820

[문제 링크](https://www.acmicpc.net/problem/20820)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Det svenska laget till Internationella Programmeringsolympiaden har just landat i Singapore f&ouml;r att t&auml;vla i <a href="https://ioi2020.sg/">IOI 2020</a>. P&aring; v&auml;gen till bagageupph&auml;mtningen ska de genom en l&aring;ng korridor med massa rullband. Korridoren &auml;r $M$ meter l&aring;ng, och laget st&aring;r just nu i b&ouml;rjan av den och funderar p&aring; hur snabbt de kan ta sig till bagageupph&auml;mtningen. Det finns $N$ <a href="https://sv.wikipedia.org/wiki/Rullande_trottoar">rullband</a> i korridoren. Varje rullband b&ouml;rjar p&aring; ett visst avst&aring;nd fr&aring;n b&ouml;rjan av korridoren, slutar p&aring; ett visst avst&aring;nd fr&aring;n b&ouml;rjan av korridoren och tar en viss tid att &aring;ka l&auml;ngs. Alla rullband g&aring;r i korridorens riktning, och man kan endast kliva p&aring; ett rullband i b&ouml;rjan av det och endast kliva av vid slutet av det. N&auml;r laget inte g&aring;r p&aring; n&aring;got rullband tar det $g$ sekunder att g&aring; en meter. Korridoren och rullbanden &auml;r s&aring; pass smala att endast tiden det tar att g&aring; parallellt med korridoren spelar roll. Allts&aring;, ifall ett rullband slutar samma avst&aring;nd fr&aring;n b&ouml;rjan som ett annat rullband b&ouml;rjan s&aring; tar det ingen tid att g&aring; mellan rullbanden. Vad &auml;r den snabbate tiden laget kan ta sig genom hela korridoren p&aring;?</p>

<p>Notera att det kan vara gynnsamt att ibland g&aring; lite bak&aring;t genom korridoren f&ouml;r att komma p&aring; ett rullband som tar en l&aring;ngt fram. Det finns dock inga rullband som g&aring;r bak&aring;t genom korridoren.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $N$, $M$, $g$ ($1 \le N \le 2\times10^5$, $2 \le M \le 2\times10^5$, $1 \le g \le 100$): antal rullband, l&auml;ngden p&aring; korridoren i meter, och lagets g&aring;nghastighet i sekunder per meter. De f&ouml;ljande $N$ raderna beskriver rullbanden och inneh&aring;ller 3 heltal vardera: $s_i, e_i$ och $t_i$ ($1\leq s_i &lt; e_i\leq M,1\leq t_i\leq100$). $s_i$ &auml;r antal meter fr&aring;n b&ouml;rjan av korridoren till rullbandets b&ouml;rjan, $e_i$ &auml;r antal meter fr&aring;n b&ouml;rjan av korridoren till rullbandets slut och $t_i$ &auml;r hur l&aring;ng tid det tar att &aring;ka l&auml;ngs rullbandet.</p>

### 출력

<p>Skriv ut en rad med ett heltal: antal sekunder det tar f&ouml;r laget att komma genom korridoren.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20820.%E2%80%85Rullband/ab6211e7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20820.%E2%80%85Rullband/ab6211e7.png" data-original-src="https://upload.acmicpc.net/94efdaa9-0f20-4efb-9663-20c88bc4be4e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 147px;" /></p>

<p style="text-align: center;">Figure 1: Exempelfall 1</p>

<p>I exempelfall 1 tar det 2 sekunder att g&aring; en meter n&auml;r laget inte g&aring;r p&aring; n&aring;got rullband. Det snabbaste s&auml;ttet att ta sig till slutet &auml;r att g&aring; till rullbandet som tar 5 sekunder, &aring;ka p&aring; det, g&aring; till det som tar 2 sekunder och sen &aring;ka p&aring; det. Totala tiden detta tar &auml;r $4+5+2+2=13$ sekunder.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20820.%E2%80%85Rullband/57c5e572.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20820.%E2%80%85Rullband/57c5e572.png" data-original-src="https://upload.acmicpc.net/b9495147-968e-4641-a82c-645e4fc34668/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 486px; height: 133px;" /></p>

<p style="text-align: center;">Figure 2: Exempelfall 2</p>

<p>I exempelfall 2 tar det ist&auml;llet 5 sekunder att g&aring; en meter n&auml;r laget inte g&aring;r p&aring; n&aring;got rullband. Det snabbaste s&auml;ttet att ta sig till slutet &auml;r att g&aring; till rullbandet som tar 8 sekunder, &aring;ka p&aring; det, g&aring; tillbaka en meter och &aring;ka p&aring; rullbandet som tar 2 sekunder, och sen g&aring; sista metern. Totala tiden detta tar &auml;r $5+8+5+2+5=25$ sekunder.</p>