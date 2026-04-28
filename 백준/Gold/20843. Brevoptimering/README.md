# [Gold II] Brevoptimering - 20843

[문제 링크](https://www.acmicpc.net/problem/20843)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 12, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Progolympkommitt&eacute;n, best&aring;ende av $N$ personer, ska skicka ut kuvert med affischer f&ouml;r kvalet till alla skolor. F&ouml;r att g&ouml;ra processen snabbare har de delat upp uppgifterna som beh&ouml;ver g&ouml;ras. Uppgifterna &auml;r bland annat att skriva adresser, s&auml;tta p&aring; frim&auml;rken, l&auml;gga i affischerna och st&auml;nga kuverten. N&auml;r en person &auml;r klar med ett kuvert skickas det vidare till n&aring;gon annan person. Det g&aring;r inte lika snabbt som de hade hoppats p&aring;, och d&auml;rf&ouml;r undrar de vilka som skulle kunna jobba snabbare.</p>

<p>Varje person $p$ har en egen maximal produktionshastighet $M_p$ kuvert per sekund. Om vi l&aring;ter $I_p$ vara antalet kuvert som skickas till person $p$ per sekund och l&aring;ter $U_p$ vara antalet kuvert den blir klar med per sekund s&aring; &auml;r $U_p = \min(I_p, M_p)$. En person blir allts&aring; inte klar med fler &auml;n $M_p$ brev per sekund, &auml;ven om hen f&aring;r fler att arbeta med. Varje person har dessutom att antal personer den skickar de kuvert hen blir klar med. Den beh&ouml;ver inte skicka lika mycket kuvert till varje person, utan varje person f&aring;r en viss procent av kuverten $p$ skickar. De personer som ingen skickar kuvert till och som d&auml;rmed &auml;r i b&ouml;rjan av produktionslinjen har $I_p = \infty$, och d&auml;rmed $U_p = M_p$ (de har en o&auml;ndlig h&ouml;g med kuvert att ta av). Vissa personer skickar inte vidare n&aring;gra kuvert alls, utan l&auml;gger dem bara i h&ouml;g bredvid sig n&auml;r de &auml;r klara.</p>

<p>F&ouml;r vilka personer g&auml;ller att $U_p = M_p$, det vill s&auml;ga att de jobbar p&aring; sin maximala produktionshastighet?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $1 \le N \le 10^5$, antalet personer. De n&auml;sta $N$ raderna beskriver personerna. Rad $i$ inneh&aring;ller f&ouml;rst heltalet $M_i$, den maximala produktionshastigheten f&ouml;r person $i$ ($1 \le M_i \le 10^5$). D&auml;refter kommer ett heltal $k$, och sedan $k$ par av heltal $j$ $w$, som betyder att person $i$ skickar $w$ procent av sina kuvert till person $j$ ($1 \le w \le 100$, $1 \le j \le N, i \neq j$). Inget $j$ kan f&ouml;rekomma mer &auml;n en g&aring;ng p&aring; en given rad, och summan av $w$:na p&aring; raden kommer att vara $100$, s&aring;vida inte $k = 0$.</p>

<p>L&aring;t $S$ beteckna summan av alla $k$. D&aring; g&auml;ller $0 \le S \le 10^5$.</p>

<p>Produktionskedjan &auml;r designad p&aring; ett s&aring;dant s&auml;tt att ingen person kan f&aring; tillbaka ett brev de redan arbetat med.</p>

### 출력

<p>Skriv ut en rad med alla $i$ som uppfyller $U_p = M_p$, i stigande ordning.</p>

<p>Det garanteras att om $U_p = M_p$ s&aring; kommer detta st&auml;mma med marginal, mer specifikt $I_p - M_p &gt; 10^{-4}$. Om tv&auml;rt om $U_p \neq M_p$ s&aring; kommer det finnas marginal &aring;t andra h&aring;llet: $M_p - I_p &gt; 10^{-4}$.</p>

### 힌트

<p>H&auml;r f&ouml;ljer tre grafer som representerar de tre exempelfallen. Varje person representeras av en nod. P&aring; varje kant &auml;r m&auml;ngden kuvert som skickas utskrivet i enheten kps, kuvert per sekund.</p>

<p>Notera att i testfallsgrupp $1$ skulle enbart exempelfall $1$ kunna f&ouml;rekomma, i testfallsgrupp $2$ enbart exempelfall $2$, och i testfallsgrupp $3$ enbart exempelfall $3$. I testfallsgrupp $4$ och $5$ skulle alla tre exempelfall kunna f&ouml;rekomma.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20843.%E2%80%85Brevoptimering/0f1b4ab7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20843.%E2%80%85Brevoptimering/0f1b4ab7.png" data-original-src="https://upload.acmicpc.net/a707d4d6-ac0e-48b5-a6f4-f5a9c35570c8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 632px; height: 268px;" /></p>

<p style="text-align: center;">Figure 1: Sample $1$</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20843.%E2%80%85Brevoptimering/2e62b6c6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20843.%E2%80%85Brevoptimering/2e62b6c6.png" data-original-src="https://upload.acmicpc.net/a7132125-5f89-42cb-b9c1-281a8ee19b81/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 625px; height: 353px;" /></p>

<p style="text-align: center;">Figure 2: Sample $2$</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20843.%E2%80%85Brevoptimering/2d5d027c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20843.%E2%80%85Brevoptimering/2d5d027c.png" data-original-src="https://upload.acmicpc.net/6fcc6a5a-417c-4631-bbd9-f7f3271961d1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 743px; height: 296px;" /></p>

<p style="text-align: center;">Figure 3: Sample $3$</p>