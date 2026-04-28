# [Gold IV] Klockan - 21358

[문제 링크](https://www.acmicpc.net/problem/21358)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

자료 구조, 집합과 맵, 누적 합, 두 포인터

### 문제 설명

<p>Timla &aring;kte hemifr&aring;n vid midnatt och kom hem n&auml;sta midnatt, 24 timmar senare. D&aring; hade det varit inbrott i huset! Tjuven m&aring;ste ha brutit sig in 00:00:00 eller senare och l&auml;mnat huset tidigare &auml;n 24:00:00.</p>

<p>I huset har Timla en digital klocka som visar tiden i 24-timmarsformat med timmar, minuter och sekunder. Timla gillar att spara el, s&aring; hennes klocka st&auml;nger av sig automatiskt n&auml;r ingen &auml;r i huset. F&ouml;r att kunna m&auml;ta exakt hur mycket el hon sparar har hon ocks&aring; en mycket exakt elm&auml;tare. Enligt denna m&auml;tare f&ouml;rbrukade klockan $n$ energienheter under dygnet d&aring; hon var bortrest. Varje siffersegment i klockan drar en energienhet f&ouml;r varje sekund som det siffersegmentet lyser. Siffrorna ser ut som p&aring; bilden.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8ed70e38-e194-4d44-97ff-30d93ae87609/-/preview/" style="width: 335px; height: 57px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Siffrorna i en digital klocka. Exempelvis lyser 27 siffersegment d&aring; klockan &auml;r 20:41:35.</p>

<p>Timla vill hj&auml;lpa polisen genom att ta reda p&aring; vilken tid tjuven kan ha brutit sig in i huset. Man kan se p&aring; skoavtrycken att tjuven gick in i huset en g&aring;ng och ut en g&aring;ng, s&aring; klockan kan inte ha t&auml;nts och sl&auml;ckts flera g&aring;nger. Klockans display t&auml;nds och sl&auml;cks alltid vid en hel sekund och kan som tidigast ha t&auml;nts 00:00:00 och kan som senast ha slocknat efter att ha visat 23:59:59.</p>

### 입력

<p>Ett positivt heltal $n$. F&ouml;r givna $n$ finns minst ett tidsintervall under dygnet d&aring; klockan f&ouml;rbrukar $n$ energienheter.</p>

### 출력

<p>Skriv ut ett tal: antalet olika klockslag d&aring; klockans display kan ha t&auml;nts.&nbsp;</p>

### 제한

<ul>
	<li>$n \le 3\,000\,000$</li>
</ul>

### 힌트

<p>I det f&ouml;rsta exemplet m&aring;ste klockan ha varit ig&aring;ng i exakt en sekund. Det kan ha varit under 11:11:17, 11:17:11 eller 17:11:11.</p>

<p>I det andra exemplet &auml;r den enda m&ouml;jligheten att klockan var p&aring; hela dygnet, fr&aring;n 00:00:00 till och med 23:59:59.</p>

<p>I det tredje exemplet finns 3196 m&ouml;jligheter f&ouml;r n&auml;r klockan kan ha startat. Exempelvis kan den ha startat 20:02:06 och slocknat efter att ha visat 20:02:08.</p>