# [Gold V] IOI-uttagning - 20883

[문제 링크](https://www.acmicpc.net/problem/20883)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

구현

### 문제 설명

<p>Programmeringsolympiadens arrang&ouml;rsgrupp vill ut och leka i sn&ouml;n. Tyv&auml;rr har man som arrang&ouml;r otaliga plikter, som kommer f&ouml;re lekandet. Man m&aring;ste g&ouml;ra uppgifter, &ouml;vervaka t&auml;vlingar, &aring;ka som ledare, och ber&auml;kna vilka deltagare som &auml;r uttagna till landslaget utifr&aring;n &aring;rets resultat.</p>

<p>Det slog dock arrang&ouml;rerna att den sista biten kan ju n&aring;gon annan ordna. T.ex. du.</p>

<p>Reglerna f&ouml;r uttagning till landslaget g&aring;r till som f&ouml;ljer. Totalt finns det fyra t&auml;vlingar som ligger till grund f&ouml;r uttagning; finalt&auml;vlingen samt tre s.k. KATT-t&auml;vlingar (KATT1, KATT2 och KATT3).</p>

<p>Efter alla t&auml;vlingar r&auml;knas resultaten samman, och de fyra t&auml;vlanden med b&auml;st po&auml;ng blir uttagna till International Olympiad in Informatics, IOI. Ut&ouml;ver IOI ska &auml;ven ett lag v&auml;ljas till Baltic Olympiad in Informatics, BOI. Detta lag best&aring;r dels av IOI-laget, samt de tv&aring; b&auml;sta t&auml;vlanden <em>som inte g&aring;r i trean</em> och inte kvalificerade sig till IOI.</p>

<p>N&auml;r resultaten r&auml;knas samman v&auml;ljs de tv&aring; b&auml;sta resultaten fr&aring;n de tre KATT-t&auml;vlingarna ut, samt resultatet fr&aring;n finalen, och summeras.</p>

<p>Inom en t&auml;vling r&auml;knas resultatet ut genom att <em>normalisera</em> po&auml;ngen en t&auml;vlande fick. F&ouml;rst ber&auml;knar man den b&auml;sta po&auml;ngen bland alla deltagare $MAX$, samt medianpo&auml;ngen bland alla deltagare $MED$. Om en deltagare fick $x \le MED$ po&auml;ng blir deltagarens resultat $50 \cdot \frac{x}{MED}$. Om en deltagare fick $MED \le x \le MAX$ po&auml;ng blir deltagarnas resultat $50 + 50 \cdot \frac{x - MED}{MAX - MED}$. Detta inneb&auml;r att resultatet &ouml;kar linj&auml;rt fr&aring;n 0 till 50 n&auml;r po&auml;ngen &ouml;kar fr&aring;n 0 till $MED$, och fr&aring;n 50 till 100 n&auml;r po&auml;ngen &ouml;kar fr&aring;n $MED$ till $MAX$.</p>

<p>F&ouml;r varje deltagare i t&auml;vlingen kommer du f&aring;r deltagarens resultat i de fyra t&auml;vlingarna, samt deltagarens &aring;rskurs. Avg&ouml;r vilka som blir uttagna till IOI och BOI.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $6 \le N \le 40$, antalet deltagare.</p>

<p>De $N$ n&auml;sta raderna beskriver en deltagare och dess resultat. En rad b&ouml;rjar med deltagarens namn, som best&aring;r av upp till 20 sm&aring; bokst&auml;ver fr&aring;n $a$ till $z$, utan mellanslag. D&auml;refter f&ouml;ljer ett tal som &auml;r antingen $7, 8, 9, 1, 2, 3$ och beskriver deltagarens &aring;rskurs. &Aring;rskurserna $7, 8, 9$ representerar h&auml;r h&ouml;gstadieelever. Slutligen kommer fyra heltal $0 \le F, K1, K2, K3 \le 700$ - po&auml;ngen fr&aring;n finalen, KATT1, KATT2 och KATT3 respektive.</p>

<p>I en t&auml;vling kommer medianen och maxpo&auml;ngen alltid vara skiljda fr&aring;n varandra. Det kommer alltid finnas precis ett m&ouml;jligt lag enligt reglerna ovan.</p>

### 출력

<p>P&aring; den f&ouml;rsta raden ska du skriva ut namnen p&aring; de fyra deltagare som blev uttagna till IOI.</p>

<p>N&auml;sta rad ska inneh&aring;lla tv&aring; namn - de ytterligare deltagare som kvalificerade sig till BOI.</p>

<p>P&aring; varje rad ska namnen du skriver ut vara sorterade i bokstavsordning.</p>