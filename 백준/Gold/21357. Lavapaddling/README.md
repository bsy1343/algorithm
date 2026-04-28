# [Gold II] Lavapaddling - 21357

[문제 링크](https://www.acmicpc.net/problem/21357)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

매개 변수 탐색

### 문제 설명

<p>Lav &auml;r tillf&aring;ngatagen av en ond h&auml;xa i en vulkan och m&aring;ste nu utf&ouml;ra ett uppdrag &aring;t henne.</p>

<p>I det stora lavahavet i vulkanen ligger $N$ &ouml;ar p&aring; en l&aring;ng rad. Avst&aring;ndet mellan den $i$:te och den $i+1$:te &ouml;n &auml;r $d_i$. Avst&aring;nden &auml;r givna i enheten &quot;h&auml;xameter&quot;, vilket motsvarar exakt $H$ meter. H&auml;xan bor p&aring; den f&ouml;rsta &ouml;n i raden, och det &auml;r h&auml;r Lav befinner sig just nu.</p>

<p>H&auml;xan har gl&ouml;mt sin bok med alla trollformler p&aring; den sista &ouml;n i raden, och Lav m&aring;ste &aring;ka och h&auml;mta den. Till sin hj&auml;lp har han en lavab&aring;t och ett antal paddlar. Varje paddel h&aring;ller f&ouml;r att ta $K$ paddeltag, d&auml;r varje paddeltag f&ouml;r b&aring;ten fram&aring;t en meter, innan paddeln brunnit upp p&aring; grund av lavan. Lav f&aring;r med sig ett antal paddlar fr&aring;n h&auml;xan, och beh&ouml;ver inte g&ouml;ra slut helt p&aring; en paddel innan han byter till en annan paddel.</p>

<p>Lav f&aring;r dessutom med sig en trollformel fr&aring;n h&auml;xan som han kan anv&auml;nda n&auml;r han st&aring;r p&aring; en &ouml;. Trollformeln lagar en paddel som han paddlat lite grann med utan att den brann upp helt. D&aring; kan han &aring;terigen anv&auml;nda den f&ouml;r att paddla $K$ meter. Lav kan anv&auml;nda trollformeln hur m&aring;nga g&aring;nger han vill n&auml;r han st&aring;r p&aring; en &ouml;. Vad &auml;r det minsta antalet paddlar h&auml;xan beh&ouml;ver ge Lav s&aring; att han kan klara uppdraget?</p>

### 입력

<p>P&aring; den f&ouml;rsta raden st&aring;r tre heltal: $1 \le N \le 20$ -- antalet &ouml;ar, $1 \le K \le 15$ -- antalet meter du kan paddla med en paddel innan den brinner upp och $1 \le H \le 10^{12}$ -- antal meter en h&auml;xameter motsvarar. P&aring; den andra raden st&aring;r $N-1$ heltal $1 \le d_1, d_2, \dots, d_{n-1} \le 1000$, avst&aring;nden mellan intilliggande &ouml;ar i raden.</p>

### 출력

<p>Programmet ska skriva ut ett heltal: det minsta antalet paddlar h&auml;xan beh&ouml;ver ge Lav s&aring; att han kan klara av uppdraget.</p>

### 힌트

<p>I f&ouml;rsta exemplet finns det tv&aring; &ouml;ar, med avst&aring;nd 7 h&auml;xameter, vilket motsvarar $7\cdot H = 7\cdot 10=70$ meter. Med varje paddel kan han ta max 5 paddeltag, s&aring; $70/5 = 14$ paddlar kr&auml;vs.</p>

<p>I andra exemplet finns tre &ouml;ar, med 200 meter mellan den f&ouml;rsta och den andra, och 100 meter mellan den andra och den tredje. Varje paddel kan ta 7 paddeltag. Om Lav b&ouml;rjar med 31 paddlar, anv&auml;nder 14 av dem fullt, och tar 6 paddeltag med de resterande 17 paddlarna, s&aring; kommer kan han ta sig $14\cdot 7+6\cdot 17=200$ meter, tillr&auml;ckligt f&ouml;r att komma till andra &ouml;n. D&aring; har han 17 paddlar kvar som han lagar med trollformeln, vilket r&auml;cker f&ouml;r att ta sig mellan andra och tredje &ouml;n. Det hade inte g&aring;tt med f&auml;rre &auml;n 31 paddlar.</p>