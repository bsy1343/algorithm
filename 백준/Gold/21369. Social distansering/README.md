# [Gold II] Social distansering - 21369

[문제 링크](https://www.acmicpc.net/problem/21369)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>I en skola g&aring;r det $N$ elever som varje dag ska &auml;ta lunch i skolmatsalen. Precis innan matsalen &ouml;ppnar st&aring;r alla elever p&aring; k&ouml; utanf&ouml;r. Det finns $K$ k&ouml;platser totalt, numrerade fr&aring;n $0$ till $K-1$. P&aring; varje k&ouml;plats kan maximalt en person st&aring;. Vissa k&ouml;platser m&aring;ste p&aring; grund av brandrisk vara tomma. N&auml;rmare best&auml;mt finns det $M$ intervall av k&ouml;platser som m&aring;ste vara tomma -- intervallet $l_i,r_i$ indikerar att man inte f&aring;r st&aring; p&aring; n&aring;gon av k&ouml;platserna $l_i,l_i+1,...r_i$. Det garanteras att inget intervall &ouml;verlappar med n&aring;got annat.</p>

<p>Skolans rektor har just f&aring;tt h&ouml;ra om n&aring;n slags &quot;pandemi&quot;, och best&auml;mmer att det &auml;r dags f&ouml;r drastiska &aring;tg&auml;rder. Rektorn vill inf&ouml;ra social distansering i lunchk&ouml;n. Han t&auml;nker v&auml;lja ett heltal $D$, och sedan s&auml;ga att varje elev m&aring;ste minst h&aring;lla ett avst&aring;nd $D$ fr&aring;n n&auml;rmsta andra elev. En elev p&aring; k&ouml;plats $i$ och en elev p&aring; k&ouml;plats $j$ har avst&aring;nd $|i-j|$.</p>

<p>Hj&auml;lp rektorn hitta det st&ouml;rsta $D$ han kan v&auml;lja s&aring; att alla elever fortfarande kan st&aring; i lunchk&ouml;n samtidigt!</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $N$, $M$ och $K$ ($2 \leq N \leq 10^9$, $0 \leq M \leq 10^6$ och $N \leq K \leq 10^{12}$) -- antal elever, antal f&ouml;rbjudna intervall och antal k&ouml;platser. D&auml;refter f&ouml;ljer $M$ rader med $2$ heltal p&aring; varje, $l_i$, $r_i$ &nbsp;($0 \le l_i \le r_i \le K-1$) start och slut f&ouml;r intervall nummer $i$. Det garanteras att inget par av dessa intervall &ouml;verlappar, och att det finns minst $N$ k&ouml;platser som inte &auml;r f&ouml;rbjudna.</p>

### 출력

<p>Skriv ut ett heltal -- den st&ouml;rsta m&ouml;jliga sociala distanseringen.&nbsp;</p>