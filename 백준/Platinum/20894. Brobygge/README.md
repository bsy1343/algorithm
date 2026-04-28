# [Platinum IV] Brobygge - 20894

[문제 링크](https://www.acmicpc.net/problem/20894)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

자료 구조, 최소 공통 조상, 희소 배열, 트리

### 문제 설명

<p>I &ouml;riket Graf Kantaria finns det $N$ &ouml;ar som &auml;r f&ouml;rbundna med $N - 1$ broar, p&aring; ett s&aring;dant s&auml;tt att det g&aring;r att ta sig mellan varje par av &ouml;ar med hj&auml;lp av dessa broar.</p>

<p>President Vick T. Adgraf och hennes man Rick T. Adgraf har insett att det finns problem med detta infrastrukturs-uppl&auml;gg. Broarna byggdes f&ouml;r att det var billigt, inte f&ouml;r att det skulle g&aring; snabbt att resa mellan &ouml;arna. F&ouml;r att &ouml;ka sina f&ouml;rtroendesiffror vill Vick och Rick bygga en extra bro var i riket. De har skrivit upp n&aring;gra f&ouml;rslag p&aring; nya broar att bygga, och vill j&auml;mf&ouml;ra hur de extra broarna f&ouml;r&auml;ndrar avst&aring;nden mellan vissa par av &ouml;ar.</p>

<p>Din uppgift &auml;r att skriva ett program som, givet alla nuvarande broar i &ouml;riket samt en lista p&aring; antingen noll, en eller tv&aring; extra broar, kan svara p&aring; vad det kortaste avst&aring;ndet mellan tv&aring; &ouml;ar blir om de extra broarna byggs.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller heltalet $2 \le N \le 10^5$. Sedan f&ouml;ljer $N - 1$ rader, en f&ouml;r vardera av de nuvarande broarna. Den $i$:te raden inneh&aring;ller heltalen $0 \le A[i] \not= B[i] &lt; N$ och $1 \le L[i] \le 1000$. $A[i]$ och $B[i]$ ger de &ouml;ar som utg&ouml;r &auml;ndpunkterna f&ouml;r den $i$:te bron, som har l&auml;ngd $L[i]$.</p>

<p>N&auml;sta rad inneh&aring;ller heltalet $0 \le E \le 2$, antalet extra broar ditt progam ska ta h&auml;nsyn till. De f&ouml;ljande $E$ raderna inneh&aring;ller beskrivningen av en bro, p&aring; samma format som de ursprungliga broarna. Inga av de extra broarna sammanfaller med de ursprungliga broarna, eller med varandra.</p>

<p>N&auml;sta rad inneh&aring;ller $0 \le Q \le 10^5$, antalet par av &ouml;ar du ska hitta det kortaste avst&aring;ndet mellan. Sedan f&ouml;ljer $Q$ rader. Den $i$:te av dessa inneh&aring;ller de tv&aring; olika heltalen $F[i]$ och $T[i]$.</p>

### 출력

<p>Du ska skriva ut $Q$ rader. Den $i$:te av dessa ska inneh&aring;lla det kortaste avst&aring;ndet mellan &ouml;arna $F[i]$ och $T[i]$.</p>