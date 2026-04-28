# [Silver V] Spotify Connect - 26883

[문제 링크](https://www.acmicpc.net/problem/26883)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 42, 맞힌 사람: 32, 정답 비율: 65.306%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>Spotify har precis lanserat den nya funktionen Spotify Connect, som m&ouml;jligg&ouml;r f&ouml;r en anv&auml;ndare att fj&auml;rrstyra sin uppspelning fr&aring;n mobiltelefonen. Det medf&ouml;r en m&auml;ngd nya tekniska utmaningar, och en av dem &auml;r hur loggningen av uppspelningsdata g&ouml;rs. F&ouml;r att kunna rapportera till skivbolagen s&aring; m&aring;ste man n&auml;mligen veta exakt hur l&auml;nge en anv&auml;ndare har lyssnat p&aring; musik.</p>

<p>Du kommer att f&aring; loggdata f&ouml;r <code>play</code> och <code>paus</code>-tryckningarna f&ouml;r en anv&auml;ndare. Anv&auml;ndaren anv&auml;nder b&aring;de sin laptop f&ouml;r att styra musiken, men fj&auml;rrstyr ocks&aring; ibland med mobiltelefonen via Spotify Connect. Loggarna inneh&aring;ller b&aring;de datorns och mobilens <code>play</code> och <code>paus</code>-tryckningar. N&auml;r anv&auml;ndaren trycker p&aring; mobilen s&aring; &auml;r det exakt $100$ millisekunder delay tills laptopen (d&auml;r musiken spelas upp ifr&aring;n) reagerar. Ditt uppdrag &auml;r att avg&ouml;ra exakt hur m&aring;nga millisekunder totalt som laptopen spelade upp musik. Innan f&ouml;rsta kommandot utf&ouml;rs s&aring; &auml;r spelaren i pausat l&auml;ge.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller heltalet $1 \le N &lt; 1000$, antalet loggrader.</p>

<p>De efterf&ouml;ljande $N$ raderna inneh&aring;ller en lista med loggar. Loggarna kommer i den ordning knapptryckningar sker med en tidsst&auml;mpel i millisekunder, enhet (<code>laptop</code> eller <code>mobile</code>) och kommando (<code>play</code> eller <code>paus</code>). Den sista loggen kommer alltid vara ett <code>paus</code>-kommnado. Dessutom kommer tv&aring; loggar aldrig ha samma tidsst&auml;mpel eller ligga exakt 100 millisekunder ifr&aring;n varandra.</p>

<p>F&ouml;r att g&ouml;ra indatat extra l&auml;ttl&auml;st s&aring; &auml;r loggradernas f&auml;lt alignerade. Tidsst&auml;mpeln fylls ut med nollor v&auml;nsterifr&aring;n s&aring; att talet alltid blir 7 tecken l&aring;ngt, och mobil stavas ist&auml;llet mobile, allts&aring; med lika m&aring;nga tecken som i laptop. Se indataexemplet.</p>

### 출력

<p>Ditt program ska skriva ut ett heltal - antalet millisekunder anv&auml;ndaren lyssnat p&aring; musik.</p>

### 힌트

<p>I det f&ouml;rsta indataexemplet s&aring; spelar anv&auml;ndaren 500 millisekunder. Sedan anv&auml;nder hen mobilen f&ouml;r att starta musiken och avslutar den fr&aring;n laptopen $500$ millisekunder senare, men p&aring; grund av delayen s&aring; spelar musiken bara i 400 millisekunder. Totalt spelas allts&aring; musiken i $900$ millisekunder.</p>