# [Gold II] Boris - 24191

[문제 링크](https://www.acmicpc.net/problem/24191)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

다이나믹 프로그래밍, 그래프 이론, 정렬, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>P&aring; t&aring;gen i Philips hemstad brukar man kunna hitta v&auml;rldens finaste reklamskylt. Denna skylt har en bild p&aring; ingen mindre &auml;n mattel&auml;raren Boris, tillsammans med texten &quot;R&auml;kna med Boris&quot;. Naturligtvis har Philip blivit helt besatt av att samla p&aring; dessa fina reklamskyltar, och nu beh&ouml;ver han din hj&auml;lp med att optimera sin rutt mellan t&aring;gstationerna i staden f&ouml;r att f&aring; tag p&aring; s&aring; m&aring;nga Borisar som m&ouml;jligt.</p>

<p>Genom sitt breda kontaktn&auml;t har Philip f&aring;tt veta att i den n&auml;rmaste framtiden kommer $N$ t&aring;g att avg&aring; fr&aring;n staden. F&ouml;r varje t&aring;g vet han avg&aring;ngstiden r&auml;knat i sekunder efter starten av hans jakt, antalet Borisar som kommer finnas p&aring; t&aring;get samt koordinaterna f&ouml;r t&aring;gstationen, angett i meter. F&ouml;r att kunna ta Borisarna p&aring; t&aring;get m&aring;ste han som senast vara p&aring; plats exakt den sekunden som t&aring;get ska g&aring;, men om han vill kan han ju ocks&aring; komma dit i f&ouml;rv&auml;g och v&auml;nta p&aring; t&aring;get i lugn och ro. Eftersom Philip &auml;lskar Boris s&aring; pass mycket, och inte heller vill r&aring;ka fastna p&aring; ett t&aring;g som kommer f&ouml;ra bort honom fr&aring;n sin hemstad, &auml;r han supersnabb med att plocka upp alla Borisar p&aring; t&aring;get och grejar det p&aring; 0 sekunder. Notera att oavsett hur l&aring;ng tid i f&ouml;rv&auml;g han kommer fram kan han &auml;nd&aring; inte ta Borisarna innan t&aring;gets avg&aring;ngstid, f&ouml;r det &auml;r f&ouml;rst d&aring; som d&ouml;rrarna in till t&aring;get &ouml;ppnas.</p>

<p>I s&aring;dana stressiga situationer som att jaga efter Borisar blir det v&auml;ldigt p&aring;frestande f&ouml;r Philip att h&aring;lla n&aring;gon noggrannare koll p&aring; v&auml;derstrecken. F&ouml;r att inte riskera att g&aring; vilse vill han d&auml;rf&ouml;r bara r&ouml;ra sig rakt norrut, s&ouml;derut, &ouml;sterut eller v&auml;sterut, s&aring; att han l&auml;ttare vet vart han &auml;r p&aring; v&auml;g.</p>

<p>Eftersom Philip har gott om tid till att f&ouml;rbereda sitt &auml;ventyr kan han b&ouml;rja vart som helst i staden. N&auml;r han sedan b&ouml;rjar r&ouml;r han sig med hastigheten 1 meter/sekund. Philip har en v&auml;ldigt stor ryggs&auml;ck, s&aring; han kan b&auml;ra hur m&aring;nga Borisar som helst p&aring; en g&aring;ng.</p>

<p>Vad &auml;r det st&ouml;rsta antalet Borisar som Philip kan samla p&aring; sig?</p>

### 입력

<p>Den f&ouml;rsta raden ineh&aring;ller ett heltal $N$ ($1 \le N \le 2\,000$), antalet t&aring;g.&nbsp;</p>

<p>D&auml;refter f&ouml;ljer en rad per t&aring;g. Varje rad inneh&aring;ller fyra heltal: avg&aring;ngstiden $t$ i sekunder efter start ($0 \le t \le 5 \cdot 10^8$), antalet Borisar $s$ p&aring; t&aring;get ($1 \le s \le 500\,000$), samt koordinaterna $x, y$ p&aring; den station t&aring;get avg&aring;r fr&aring;n ($0 \le x, y \le 5 \cdot 10^8$).</p>

<p>Inga tv&aring; t&aring;g kommer avg&aring; samtidigt fr&aring;n exakt samma station.</p>

### 출력

<p>Skriv ut en rad med ett heltal -- det st&ouml;rsta antalet Borisar som Philip kan samla p&aring; sig.</p>

### 힌트

<p>I det tredje exempelfallet finns det fyra avg&aring;ngar. Vi kallar dessa f&ouml;r t&aring;g $0$ - t&aring;g $3$, i den ordning de visas i indatan.</p>

<p>Om Philip b&ouml;rjar i punkten $(493,377)$ kan han ta $952$ Borisar fr&aring;n t&aring;g $3$ vid tiden $148$. Sedan har han exakt $164$ meter att g&aring; (vilket tar $164$ sekunder) till t&aring;g $1$. Det har avg&aring;ngstid $312$, d.v.s. $164$ sekunder efter t&aring;g $3$. Han hinner allts&aring; precis till t&aring;g $1$ och kan ta dess $911$ Borisar. D&auml;rifr&aring;n hinner han, med $6$ sekunders marginal, g&aring; till t&aring;g $2$ och ta $927$ Borisar d&auml;rifr&aring;n. Totalt f&aring;r han allts&aring; $952+911+927=2790$ Borisar.&nbsp;</p>