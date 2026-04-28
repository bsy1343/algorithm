# [Gold II] Planetbacke - 20815

[문제 링크](https://www.acmicpc.net/problem/20815)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>I en inte alltf&ouml;r avl&auml;gsen framtid har forskare uppt&auml;ckt inte bara {\em en} tidigare ok&auml;nd planet h&auml;r i v&aring;rt egna solsystem (se uppgiften Planet X) utan nu {\em ytterligare en}, kallad planet Y.</p>

<p>Forskarna &auml;r intresserade av hur topografin p&aring; Planet Y ser ut, och har lyckats m&auml;ta detta med stor noggrannhet. Vi representerar ytan som ett $N \times M$ rutn&auml;t, d&auml;r varje ruta har en uppm&auml;tt h&ouml;jd mellan 0 och 9.</p>

<p>Till m&aring;ngas gl&auml;dje visar det sig att planet Y har perfekt klimat f&ouml;r skid&aring;kning (som du s&auml;kert f&ouml;rst&aring;r finns det inte l&auml;ngre n&aring;gon sn&ouml; p&aring; jorden vid det h&auml;r laget). Skriv ett program som ber&auml;knar den l&auml;ngsta skidbacke som kan byggas p&aring; planet Y.</p>

<p>Kravet p&aring; en skidbacke &auml;r att det ska vara en sammanh&auml;ngande sekvens av rutor d&auml;r varje par av rutor gr&auml;nsar till varandra antingen via en gemensam sida eller ett gemensamt h&ouml;rn (se figurerna nedan), och d&auml;r varje ruta i sekvensen inte har h&ouml;gre h&ouml;jd &auml;n den f&ouml;reg&aring;ende. Det &auml;r allts&aring; i princip till&aring;tet att alla rutor i skidbacken har samma h&ouml;jd. Samma ruta f&aring;r inte anv&auml;ndas flera g&aring;nger men skidbacken skulle &auml;nd&aring; kunna korsa sig sj&auml;lv genom ett h&ouml;rn som i det andra exemplet nedan.</p>

### 입력

<p>P&aring; den f&ouml;rsta raden st&aring;r tv&aring; heltal $1 \le N,M \le 7$, antalet rader och kolumner i rutn&auml;tet. D&auml;refter f&ouml;ljer $N$ rader med $M$ tecken p&aring; varje. Det $j:te$ tecknet p&aring; rad $i$ &auml;r en siffra mellan 0 och 9 som motsvarar h&ouml;jden f&ouml;r rutan. Det finns aldrig fler &auml;n $7$ rutor i rutn&auml;tet som har samma h&ouml;jd.</p>

### 출력

<p>Programmet ska skriva ut ett heltal: det st&ouml;rsta antalet rutor som kan ing&aring; i en godk&auml;nd skidbacke.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20815.%E2%80%85Planetbacke/4cfd0916.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20815.%E2%80%85Planetbacke/4cfd0916.png" data-original-src="https://upload.acmicpc.net/d220f0d0-298c-4d22-9d0e-3f178fafc721/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 88px;" /></p>