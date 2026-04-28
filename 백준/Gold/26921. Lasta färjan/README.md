# [Gold II] Lasta färjan - 26921

[문제 링크](https://www.acmicpc.net/problem/26921)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵

### 문제 설명

<p>En bilf&auml;rja ska lastas med bilar, och en samling bilar st&aring;r p&aring; k&ouml; f&ouml;r att komma med f&auml;rjan. Tiden mellan turerna &auml;r v&auml;ldigt l&aring;ng, och d&auml;rf&ouml;r &auml;r det viktigt f&ouml;r de resande att s&aring; m&aring;nga bilar som m&ouml;jligt kan komma med f&auml;rjan vid en s&aring;dan tur. Bolaget Kass Sj&ouml;fart AB (som driver bilf&auml;rjan) har p&aring; sistone mottagit ett stort antal klagobrev fr&aring;n en organisation som kallar sig <em>Arga Unga Algoritmiker</em> som menar att packningen av bilar p&aring; f&auml;rjan &auml;r <em>&quot;d&aring;lig&quot;</em>, <em>&quot;suboptimal&quot;</em>, <em>&quot;heuristisk&quot;</em> och <em>&quot;oh&aring;llbar&quot;</em>. Bolagets verkst&auml;llande direkt&ouml;r Ernst E. Kass bekr&auml;ftar att man slarvat vid packningen av f&auml;rjan, och g&aring;r nu ut med ett uttalande om att man h&auml;danefter alltid kommer att packa f&auml;rjan s&aring; att s&aring; m&aring;nga bilar som m&ouml;jligt kommer med. Hur man ska lyckas med det har Ernst inte velat svara p&aring;, men ryktet s&auml;ger att man bett den svenska Programmeringsolympiaden om hj&auml;lp.</p>

<p>Bilf&auml;rjan har fyra filer, d&auml;r varje fil har en viss l&auml;ngd i meter, och alla filar &auml;r lika l&aring;nga. En samling bilar st&aring;r p&aring; k&ouml; f&ouml;r att f&aring; &aring;ka ombord p&aring; f&auml;rjan, och bilarna kommer att &aring;ka p&aring; f&auml;rjan i den ordning som de st&aring;r i k&ouml;n. Personalen p&aring; f&auml;rjan kan dock v&auml;lja vilken fil som en viss bil ska &aring;ka in i (givet att den f&aring;r plats). N&auml;r en bil inte l&auml;ngre f&aring;r plats i n&aring;gon av filerna s&aring; anses f&auml;rjan vara fullastad (man hoppar allts&aring; inte &ouml;ver bilar). Dessutom &auml;r det viktigt att det &auml;r minst en meters avst&aring;nd mellan varje par av bilar som st&aring;r intill varandra i samma fil (ifall det skulle b&ouml;rja gunga, och bilarna s&auml;tts i r&ouml;relse).</p>

<p>Du kommer att f&aring; veta hur l&aring;ng f&auml;rjan &auml;r, och vilka bilar som st&aring;r i k&ouml;n. Din uppgift &auml;r att hj&auml;lpa f&auml;rjepersonalen med att r&auml;kna ut hur m&aring;nga bilar man som mest kan lasta, om man &auml;r smart n&auml;r man v&auml;ljer fil &aring;t bilarna.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26921.%E2%80%85Lasta%E2%80%85f%C3%A4rjan/e6952d13.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26921.%E2%80%85Lasta%E2%80%85f%C3%A4rjan/e6952d13.png" data-original-src="https://upload.acmicpc.net/f5d42fab-459a-4e38-b87f-001499634bad/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Ett exempel p&aring; hur f&auml;rjan kan se ut efter en optimal packning. F&auml;rjan &auml;r $5$ meter l&aring;ng, och l&auml;ngden p&aring; bilarna som stod i k&ouml;n &auml;r $2, 1, 2, 5, 1, 1, 2, 1, 1, 2$, varav bara de f&ouml;rsta $8$ fick plats p&aring; f&auml;rjan.</p>

### 입력

<p>P&aring; f&ouml;rsta raden i indata st&aring;r ett heltal $N$, antal bilar. Antalet bilar i k&ouml;n &auml;r max $200$. P&aring; andra raden i indata st&aring;r ett heltal $L$, l&auml;ngden p&aring; filerna. Filerna &auml;r inte l&auml;ngre &auml;n $60$ meter. Sedan f&ouml;ljer $N$ heltal p&aring; en rad (separerade av mellanslag), d&auml;r varje heltal beskriver l&auml;ngden p&aring; en bil. Bilarna &auml;r minst $1$ meter l&aring;nga och h&ouml;gst $10$ meter l&aring;nga och samtidigt h&ouml;gst L. Bilarna f&ouml;rst i denna sekvens &auml;r de som st&aring;r f&ouml;rst i k&ouml;n.</p>

### 출력

<p>Utdata ska best&aring; av ett enda heltal: det h&ouml;gsta antal bilar som f&aring;r plats p&aring; f&auml;rjan.</p>