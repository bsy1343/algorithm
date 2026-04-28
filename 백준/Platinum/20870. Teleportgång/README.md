# [Platinum IV] Teleportgång - 20870

[문제 링크](https://www.acmicpc.net/problem/20870)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 19, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 매개 변수 탐색, 확률론

### 문제 설명

<p>Du sitter och programmerar n&auml;r telefonen pl&ouml;tsligt ringer. Det &auml;r din kompis Erik som beh&ouml;ver hj&auml;lp med ett problem. Han sitter fast i en grotta med flera rum, d&auml;r vissa par av rum &auml;r sammankopplade med g&aring;ngar. Det tar en sekund att g&aring; mellan tv&aring; sammankopplade rum. Erik befinner sig i ett rum och vill veta hur snabbt han kan ta sig till utg&aring;ngen. &quot;L&auml;tt som en pl&auml;tt&quot; t&auml;nker du, och b&ouml;rjar skriva din favorit-kortaste-v&auml;gen-algoritm. Men d&aring; kommer du ih&aring;g att Erik har en ovanlig f&ouml;rm&aring;ga, han kan n&auml;mligen teleportera sig.</p>

<p>Erik befinner sig p&aring; nod nummer $s$ i en oriktad graf med $n$ noder och $m$ kanter, och han vill ta sig till utg&aring;ngen vid nod nummer $t$. P&aring; en sekund kan han antingen g&aring; till en n&auml;rliggande nod eller teleportera sig. Om han teleporterar sig hamnar han p&aring; en likformigt slumpm&auml;ssig nod (dvs. sannolikheten &auml;r $\frac{1}{n}$ f&ouml;r alla noder). Din uppgift &auml;r att r&auml;kna ut den minsta m&ouml;jliga genomsnittliga tid det tar f&ouml;r honom att ta sig till nod nummer $t$. Med andra ord, du ska hitta det minsta <em>v&auml;ntev&auml;rdet</em>.</p>

<p>H&auml;r kommer en kort introduktion till v&auml;ntev&auml;rden. L&aring;t oss s&auml;ga att Erik har valt en viss strategi, och l&aring;t $p_i$ vara sannolikheten att han lyckas ta sig till nod $t$ p&aring; exakt $i$ sekunder om han f&ouml;ljer strategin. V&auml;ntev&auml;rdet definieras som $$1\cdot p_1 + 2\cdot p_2 + 3\cdot p_3 + ...$$ Om man v&auml;ljer en d&aring;lig strategi (t.ex. att g&aring; fram och tillbaka mellan tv&aring; noder och aldrig komma fram) s&aring; kan v&auml;ntev&auml;rdet bli o&auml;ndligt stort. Det &auml;r dock alltid m&ouml;jligt att uppn&aring; ett &auml;ndligt v&auml;ntev&auml;rde -- om man exempelvis teleporterar sig om och om igen s&aring; blir v&auml;ntev&auml;rdet $n$.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $n$ och $m$ ($2 \leq n \leq 10^5$ , $0 \leq m \leq 2\cdot 10^5$). Den andra raden inneh&aring;ller tv&aring; heltal $s$ och $t$ ($1 \leq s,t \leq n$ , $s \neq t$): startnod och utg&aring;ng. De f&ouml;ljande $m$ raderna inneh&aring;ller tv&aring; heltal $u_i$ och $v_i$ ($1 \leq u_i , v_i \leq n$ , $u_i \neq v_i$), vilket betyder att en kant g&aring;r mellan noderna $u_i$ och $v_i$.</p>

### 출력

<p>Skriv ut ett tal: det minsta m&ouml;jliga v&auml;ntev&auml;rdet av tiden det tar att ta sig till utg&aring;ngen. Svaret anses korrekt om det har ett relativt eller absolut fel av h&ouml;gst $10^{-2}$.</p>