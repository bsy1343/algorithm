# [Gold V] Börsen - 26930

[문제 링크](https://www.acmicpc.net/problem/26930)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Evelina vill bli rik och t&auml;nker b&ouml;rja spekulera p&aring; b&ouml;rsen. Egentligen &auml;r hon r&auml;tt ointresserad av ekonomi och orkar aldrig l&auml;sa mer &auml;n den f&ouml;rsta aktiekursen i tidningen. Men, t&auml;nker hon, det &auml;r ni andra som kr&aring;nglar till det. Om man bara k&ouml;per och s&auml;ljer i r&auml;tt l&auml;gen kan man ju lika v&auml;l tj&auml;na pengar p&aring; detta enda f&ouml;retag, som vi kan kalla $A$. Genom att st&auml;ndigt fr&aring;ga sina v&auml;nner hur mycket fiskbullar de &auml;ter l&auml;r hon sig att f&ouml;ruts&auml;ga exakt hur $A$:s aktiekurs kommer att variera under $N$ dagar fram&aring;t. Skriv ett program som ber&auml;knar hur mycket pengar hon har i slutet av denna period om hon hade $100$ kronor fr&aring;n b&ouml;rjan och investerar optimalt. Hon kan aldrig l&aring;na pengar utan endast anv&auml;nda sina egna.</p>

<p>Aktiekursen uppdateras en g&aring;ng om dagen och &auml;r densamma f&ouml;r k&ouml;p och f&ouml;rs&auml;ljning. Varje dag kan Evelina antingen k&ouml;pa valfri m&auml;ngd aktier, s&auml;lja valfri m&auml;ngd aktier eller inte g&ouml;ra n&aring;gonting. M&auml;ngden hon k&ouml;per eller s&auml;ljer beh&ouml;ver inte vara ett heltal. F&ouml;r varje transaktion hon g&ouml;r m&aring;ste hon betala en fast avgift. Avgiften betalas med kontanter, d.v.s. innan hon k&ouml;per aktier m&aring;ste hon f&ouml;rst betala avgiften, och efter att hon har s&aring;lt aktier m&aring;ste hon betala avgiften. </p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $N$ ($2 \le N \le 100\,000$), antalet dagar. P&aring; andra raden st&aring;r ett flyttal $Q$ ($0 \le Q \le 100$), avgiften i kronor per transaktion. D&auml;refter f&ouml;ljer $N$ rader med vardera ett flyttal, aktiekursen f&ouml;r dag $1$, dag $2$, o.s.v., t.o.m. dag $N$. Kursen ligger alltid mellan $1$ och $1\,000$ kr per aktie. </p>

<p>Alla flyttal har h&ouml;gst $10$ siffror efter decimaltecknet.</p>

### 출력

<p>Skriv ut den st&ouml;rsta m&auml;ngden pengar Evelina kan ha i slutet av perioden. Ditt svar anses r&auml;tt om det har ett relativt eller absolut fel om h&ouml;gst $10^{-5}$.</p>