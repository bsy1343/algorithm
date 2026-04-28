# [Platinum IV] Trevlig väg - 20869

[문제 링크](https://www.acmicpc.net/problem/20869)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 30, 맞힌 사람: 21, 정답 비율: 61.765%

### 분류

다이나믹 프로그래밍, 매개 변수 탐색, 방향 비순환 그래프

### 문제 설명

<p>N&auml;r jag g&aring;r hem&aring;t g&aring;r jag inte alltid den kortaste v&auml;gen, utan en v&auml;g som a) hela tiden tar mig n&auml;rmare hem, och b) &auml;r &quot;trevligast&quot;, i den meningen att medelv&auml;rdet av de passerade v&auml;gavsnittens &quot;trevlighetsfaktor&quot; &auml;r s&aring; h&ouml;g som m&ouml;jligt. Skriv ett program som ber&auml;knar det maximala s&aring;dana medelv&auml;rdet.</p>

<p>Kartan &ouml;ver min stad kan beskrivas med hj&auml;lp av $n$ platser numrerade fr&aring;n $1$ till $n$. Plats $1$ &auml;r min startplats och plats $n$ &auml;r mitt hem, och platserna har sorterats efter avst&aring;nd s&aring; att en plats med h&ouml;gre nummer alltid ligger n&auml;rmare hemmet &auml;n en med l&auml;gre nummer.</p>

<p>Vidare finns $m$ olika &quot;v&auml;gavsnitt&quot; som var och en leder fr&aring;n en plats $u_i$ till en annan plats $v_i$ och har en trevlighetsfaktor $w_i$, som kan bero p&aring; att d&auml;r finns n&aring;gra ovanliga tr&auml;d, n&aring;gon gullig katt i ett f&ouml;nster eller n&aring;got annat trevligt. Eftersom jag alltid vill g&aring; i riktning hem&aring;t, s&aring; har vi i beskrivningen endast tagit med v&auml;gavsnitt d&auml;r $u_i&lt;v_i$.</p>

<p>Den som &auml;r lite matematiskt intresserad (ifall det nu skulle finnas n&aring;gon s&aring;dan i detta s&auml;llskap) skulle kunna kalla detta f&ouml;r en riktad och viktad acyklisk graf.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/42823b20-ac3b-4df2-be45-90150d2e465d/-/preview/" style="width: 400px; height: 200px;" /></p>

<p style="text-align: center;">Kartan i det andra exemplet. Den trevligaste v&auml;gen &auml;r $1\rightarrow 3\rightarrow 5$.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller de tv&aring; heltalen $n$ och $m$ ($2 \leq n \leq 10^5$ , $1 \leq m \leq 2\cdot 10^5$). Var och en av de f&ouml;ljande $m$ raderna beskriver ett v&auml;gavsnitt och inneh&aring;ller tre heltal $u_i$, $v_i$ och $w_i$ ($1 \leq u_i &lt; v_i \leq n$, $1 \le w_i \le 2\cdot 10^6$), vilket betyder att v&auml;gavsnittet g&aring;r fr&aring;n plats $u_i$ till plats $v_i$ och har trevlighetsfaktor $w_i$.</p>

<p>Det kommer aldrig finnas mer &auml;n ett v&auml;gavsnitt som f&ouml;rbinder samma platser, och det garanteras att det g&aring;r att ta sig fr&aring;n plats $1$ till plats $n$.</p>

### 출력

<p>Skriv ut ett tal: det h&ouml;gsta uppn&aring;bara medelv&auml;rdet av trevlighetsfaktorer p&aring; en v&auml;g fr&aring;n plats 1 till plats $n$. Svaret anses korrekt om det har ett relativt eller absolut fel av h&ouml;gst $10^{-6}$.</p>