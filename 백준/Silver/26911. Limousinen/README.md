# [Silver III] Limousinen - 26911

[문제 링크](https://www.acmicpc.net/problem/26911)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 20, 맞힌 사람: 18, 정답 비율: 85.714%

### 분류

그리디 알고리즘, 정렬, 기하학

### 문제 설명

<p>I Taipei har IOI satt ig&aring;ng med ett intensivt schema av f&ouml;rel&auml;sningar, lekar, f&ouml;rberedelser, matpauser, s&ouml;mnpauser och t&auml;vlingar. Men arrang&ouml;rerna har l&auml;mnat en timme fri f&ouml;r alla att g&ouml;ra vad de vill. Detta &auml;r ett problem som lagledarna inte alls f&ouml;rberett de t&auml;vlande p&aring;. F&ouml;rvirring och kaos uppst&aring;r i de t&auml;vlandes hj&auml;rnor, och n&auml;r fritidstimmen &auml;r slut s&aring; &auml;r de $N$ t&auml;vlande utspridda vid olika korsningar i storstaden och har inte en aning om hur de ska hitta tillbaka. Lyckligtvis hade t&auml;vlingsledningen installerat ett chip i varje t&auml;vlandes v&auml;ska som g&ouml;r att de kan se exakt vid vilken gatukorsning som varje vilsen t&auml;vlande befinner sig.</p>

<p>Limousinf&ouml;raren Simon har f&aring;tt i uppdrag att plocka upp de t&auml;vlande och k&ouml;ra dem, en i taget, till t&auml;vlingsarenan. Han vill naturligtvis unds&auml;tta dem i en ordning som g&ouml;r att han hinner skjutsa tillbaka s&aring; m&aring;nga som m&ouml;jligt innan n&auml;sta f&ouml;rel&auml;sning b&ouml;rjar (vilket sker om $T$ minuter). Taipei kan modelleras som ett o&auml;ndligt regelbundet rutn&auml;t d&auml;r heltalskoordinater &auml;r korsningar och det finns lodr&auml;ta och horisontella v&auml;gar. Det tar exakt 1 minut att k&ouml;ra fr&aring;n en korsning till en n&auml;rliggande korsning.</p>

<p>Simon b&ouml;rjar vid t&auml;vlingsarenan p&aring; adressen $(0, 0)$, k&ouml;r till den f&ouml;rsta personen och h&auml;mtar upp den och k&ouml;r sedan hem personen till arenan. D&auml;refter k&ouml;r han till n&auml;sta person, o.s.v. Han forts&auml;tter s&aring; tills tiden tar slut, och han kan allts&aring; bara skjutsa en i taget. Om han v&auml;ljer ordningen han h&auml;mtar upp de t&auml;vlande i optimalt, hur m&aring;nga hinner han h&auml;mta upp och skjutsa tillbaka inom $T$ minuter?</p>

### 입력

<p>P&aring; f&ouml;rsta raden i indata st&aring;r tv&aring; heltal $N$ ($1 \leq N \leq 100\,000$), antalet t&auml;vlande som ska plockas upp, och $T$ ($1 \leq T \leq 10^9$), hur l&aring;ng tid Simon har p&aring; sig i minuter.</p>

<p>Sedan f&ouml;ljer $N$ rader (en rad per t&auml;vlande). Varje rad best&aring;r av tv&aring; heltal $-10^8 \leq x, y \leq 10^8$, $x$- och $y$-koordinater f&ouml;r personens nuvarande position.</p>

### 출력

<p>Skriv ut hur m&aring;nga t&auml;vlande som Simon hinner k&ouml;ra hem innan tiden &auml;r slut, givet att han v&auml;ljer ordningen optimalt.</p>

### 힌트

<p>F&ouml;rklaring av exempelfall 1: Simon har 5 minuter p&aring; sig, och det finns tre t&auml;vlande att h&auml;mta upp. Att h&auml;mta den f&ouml;rsta t&auml;vlande tar 4 minuter, att h&auml;mta den andra tar 6 minuter, och att h&auml;mta den trejde tar 4 minuter (om han &aring;ker optimalt). Eftersom han bara har 5 minuter p&aring; sig s&aring; hinner han d&aring; bara h&auml;mta en person.</p>

<p>F&ouml;rklaring av exempelfall 2: Simon hinner inte h&auml;mta n&aring;gon alls.</p>

<p>F&ouml;rklaring av exempelfall 3: Simon hinner precis h&auml;mta en person, personen som befinner sig vid $(-100, 0)$.</p>