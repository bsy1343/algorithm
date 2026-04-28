# [Platinum V] Snökaos - 20885

[문제 링크](https://www.acmicpc.net/problem/20885)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Ett sn&ouml;ov&auml;der har dragit in och det &auml;r kaos i trafiken. Inte nog med det, utan vissa delar av j&auml;rnv&auml;gssp&aring;ret har sn&ouml;at igen vilket gjort att all t&aring;gtrafik stoppats. Detta &auml;r naturligtvis inte s&aring; bra, eftersom m&auml;ngder av resen&auml;rer nu st&aring;r vid sina stationer och inte kommer n&aring;gonstans. Fredrika har d&auml;rf&ouml;r f&aring;tt i uppgift att r&ouml;ja bort sn&ouml;n mellan stationerna innan rusningstiden b&ouml;rjar och katastrofen &auml;r ett faktum.</p>

<p>J&auml;rnv&auml;gssp&aring;ret &auml;r helt utan f&ouml;rgreningar och har $n$ stationer, numrerade fr&aring;n $1$ till $n$ i den ordning de f&ouml;rekommer p&aring; sp&aring;ret (s&aring; att station $i$ kommer precis f&ouml;re station $i+1$). Det finns d&auml;rmed $n - 1$ str&auml;ckor mellan stationerna. Av dessa &auml;r $s$ t&auml;ckta med sn&ouml;.</p>

<p>Fredrika &auml;r lite orolig eftersom hon r&auml;knat ut att hon endast hinner r&ouml;ja bort sn&ouml;n fr&aring;n $p$ str&auml;ckor. F&ouml;r att g&ouml;ra det b&auml;sta av situationen best&auml;mmer sig Fredrika f&ouml;r att v&auml;lja de str&auml;ckor som g&ouml;r att s&aring; m&aring;nga som m&ouml;jligt av de v&auml;ntande resen&auml;rerna kan &aring;ka dit de vill. Till sin hj&auml;lp har hon svaren fr&aring;n en enk&auml;t som hon skickat ut till alla som v&auml;ntar, d&auml;r de f&aring;tt svara p&aring; vilka stationer de vill &aring;ka mellan.</p>

<p>F&ouml;rutsatt att Fredrika v&auml;ljer str&auml;ckorna optimalt, ber&auml;kna hur m&aring;nga v&auml;ntande resen&auml;rer som kommer kunna &aring;ka d&aring; hon &auml;r klar.</p>

<p>Notera att t&aring;g kan endast k&ouml;ra p&aring; sn&ouml;fria str&auml;ckor. Alla stationer har t&aring;g parkerade, s&aring; samtliga sn&ouml;fria str&auml;ckor kommer att kunna trafikeras, &auml;ven om stationerna inte kan n&aring;s fr&aring;n sp&aring;rets slutstationer. T&aring;gtrafiken &auml;r helt stoppad fram tills Fredrika &auml;r klar, s&aring; &auml;ven resen&auml;rer som fr&aring;n b&ouml;rjan har en sn&ouml;fri resv&auml;g r&auml;knas in i svaret.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20885.%E2%80%85Sn%C3%B6kaos/d8b151bb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20885.%E2%80%85Sn%C3%B6kaos/d8b151bb.png" data-original-src="https://upload.acmicpc.net/b0c05a66-716f-4216-99b4-e32277a3791b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 277px; height: 269px;" /></p>

<p style="text-align: center;">Figure 1: Sample 1</p>

### 입력

<p>F&ouml;rsta raden inneh&aring;ller fyra heltal, $2 \le n \le 200$, $ 1 \le m \le 100000 $, $ 0 \le s, p \le n - 1$: antalet stationer, antalet resen&auml;rer, antalet igensn&ouml;ade str&auml;ckor och antalet str&auml;ckor Fredrika hinner ploga.</p>

<p>D&auml;refter f&ouml;ljer $m$ rader d&auml;r rad $i$ inneh&aring;ller tv&aring; heltal $1 \le a_i \not= b_i \le n$, stationerna d&auml;r resen&auml;r $i$ vill starta respektive sluta.</p>

<p>D&auml;refter f&ouml;ljer $s$ rader d&auml;r rad $j$ inneh&aring;ller ett heltal $ 1 \le c_j \le n - 1$, stationen som ligger <em>precis innan</em> den igensn&ouml;ade str&auml;ckan $j$. En str&auml;cka f&ouml;rekommer h&ouml;gst en g&aring;ng i denna lista.</p>

### 출력

<p>Ditt program ska skriva ut ett enda heltal: det st&ouml;rsta antalet resen&auml;rer som kan genomf&ouml;ra sina resor genom att ploga h&ouml;gst $p$ str&auml;ckor.</p>