# [Gold II] Bastubad - 20890

[문제 링크](https://www.acmicpc.net/problem/20890)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

수학, 정렬

### 문제 설명

<p>Finl&auml;ndare &auml;lskar att bada bastu. Det &auml;r inte s&aring; konstigt egentligen. Bastubadande &auml;r b&aring;de sk&ouml;nt och sker oftast i trevligt s&auml;llskap.</p>

<p>I s&auml;llskap uppst&aring;r dock ofta problem. Det viktigaste n&auml;r man badar bastu &auml;r att temperaturen s&auml;tts r&auml;tt. En finl&auml;ndare &auml;r v&auml;ldigt petig med bastuns temperatur. Olika finl&auml;ndare har olika h&ouml;gstatemperaturer som de tolererar. Om temperaturen &auml;r f&ouml;r h&ouml;g f&ouml;r en viss finl&auml;ndare s&aring; g&aring;r finl&auml;ndaren hem. I temperaturintervallet som en viss finl&auml;ndare klarar blir finl&auml;ndaren dessutom olika glad beroende p&aring; temperaturen. En finl&auml;ndares gl&auml;dje ges av en kvadratisk funktion (p&aring; formen $ax^2 + bx + c$).</p>

<p>Ett stort s&auml;llskap finl&auml;ndare ska nu bada bastu, och beh&ouml;ver din hj&auml;lp. Kan du best&auml;mma den maximala summan av finl&auml;ndarnas gl&auml;dje, om bastuns temperatur s&auml;tts optimalt? Om temperaturen s&auml;tts h&ouml;gre &auml;n vad en finne tolererar, s&aring; bidrar inte denna finne till den totala gl&auml;djen alls (den har ju g&aring;tt hem). Temperaturen anges i kelvin, med en undre gr&auml;ns p&aring; $0 \textrm{ K}$ och &ouml;vre gr&auml;ns $100\,000 \textrm{ K}$.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $1 \le N \le 100\,000$: antalet finl&auml;ndare. D&auml;refter f&ouml;ljer $N$ rader, en per finl&auml;ndare. Varje rad inneh&aring;ller fyra heltal $a, b, c, t$ ($-10^9 \le a,b,c \le 10^9, 1 \le t \le 100\,000$), vilket representerar att finl&auml;ndaren har gl&auml;djefunktion $ax^2 + bx + c$, and bara klarar av temperaturer mellan $0\textrm{ K}$ och $t\textrm{ K}$, inklusive. Funktionen garanteras vara positiv &ouml;verallt mellan $0$ och $t$.</p>

### 출력

<p>Skriv ut ett enda tal: den st&ouml;rsta m&ouml;jliga lycka som kan uppn&aring;s om temperaturen s&auml;tts r&auml;tt. Svaret kommer accepteras om det har ett relativt eller absolut fel om h&ouml;gst $10^{-5}$.</p>