# [Gold I] DuTub - 20860

[문제 링크](https://www.acmicpc.net/problem/20860)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 18, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Du vet att du borde l&auml;gga dig vid det h&auml;r laget! Men du ska bara kolla <em>lite</em> mer p&aring; DuTub innan du l&auml;gger dig.</p>

<p>Det finns ett antal <em>kategorier</em> du &auml;r intresserad av. Varje video p&aring; DuTub kan tillh&ouml;ra en eller flera kategorier. Innan du l&auml;gger dig m&aring;ste du ha sett minst en video i varje kategori. Men du vill f&ouml;rst&aring;s inte vara uppe l&auml;ngre &auml;n n&ouml;dv&auml;ndigt.</p>

<p>Skriv ett program som, givet en lista p&aring; videor, ber&auml;knar den minsta m&ouml;jliga tid du m&aring;ste titta f&ouml;r att ha sett minst en video fr&aring;n varje kategori.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r antalet videor $N$ ($1 &le; N &le; 30$). D&auml;refter f&ouml;ljer $N$ rader, som beskriver videorna. Vardera av dessa rader inneh&aring;ller f&ouml;rst ett heltal $d_i$ ($1 \le d_i \le 900$), videons l&auml;ngd i sekunder, och sedan en str&auml;ng som anger de kategorier som videon tillh&ouml;r. Varje bokstav (som &auml;r mellan <code>a</code> och <code>j</code>) betecknar en kategori. Varje video tillh&ouml;r minst en kategori, och inga kategorier upprepas i en videos beskrivning. Det kan sammanlagt finnas h&ouml;gst 10 olika kategorier.&nbsp;</p>

### 출력

<p>Programmet ska skriva ut det minsta antalet sekunder du beh&ouml;ver spendera p&aring; DuTub innan du sett videor ur alla kategorier.</p>