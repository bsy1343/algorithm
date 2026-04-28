# [Gold IV] TV-tittande - 20819

[문제 링크](https://www.acmicpc.net/problem/20819)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Bobs v&auml;nner &auml;lskar TV-serier och brukar diskutera dem p&aring; sina f&ouml;delsedagskalas. Bob k&auml;nner sig ofta utfryst f&ouml;r att han inte har kollat p&aring; samma serier som dem.</p>

<p>Bob &auml;r bjuden p&aring; kalas vissa dagar och t&auml;nker g&aring; p&aring; alla dessa. Han vet vilka TV-serier som kommer diskuteras under varje kalas, och vill ha sett klart de serierna f&ouml;r att kunna diskutera dem med sina v&auml;nner. Bob vill inte titta p&aring; TV i mer &auml;n tio timmar per dag, och han har inte tid att titta p&aring; TV p&aring; samma dag som han &auml;r p&aring; ett kalas.</p>

<p>Han kan n&auml;r som helst pausa en TV-serie och forts&auml;tta titta p&aring; den n&aring;gon annan g&aring;ng, men n&auml;r han &auml;r p&aring; ett kalas d&auml;r serien diskuteras m&aring;ste han ha sett klart hela. Kan Bob lyckas med det?</p>

### 입력

<p>P&aring; f&ouml;rsta raden finns de tv&aring; heltalen $n$ och $k$ ($1 \leq n,k \leq 2 \times 10^5$), antalet kalas och antalet TV-serier som finns. TV-serierna &auml;r numrerade fr&aring;n $1$ till $k$.</p>

<p>P&aring; n&auml;sta rad finns $k$ heltal, d&auml;r det $i$:te talet &auml;r l&auml;ngden av TV-serie nummer $i$ m&auml;tt i timmar. Ingen serie &auml;r l&auml;ngre &auml;n $10^6$ timmar.</p>

<p>De f&ouml;ljande $n$ raderna beskriver kalasen i ordning. Rad $i$ b&ouml;rjar med tv&aring; heltal $1 \leq d_i \leq 2 \times 10^5$ och $c_i \ge 1$, vilken dag kalaset &auml;r och antalet TV-serier som kommer att diskuteras. Sedan f&ouml;ljer $c_i$ olika heltal p&aring; samma rad, de TV-serier som kommer diskuteras p&aring; kalaset. Summan av alla $c_i$ &auml;r inte st&ouml;rre &auml;n $2 \times 10^5$.</p>

<p>Bob &auml;r inte bjuden till mer ett kalas n&aring;gon dag. Det &auml;r nu morgon dag $0$ och Bob ska allts&aring; inte p&aring; kalas idag.</p>

### 출력

<p>Skriv ut <code>Ja</code> om det &auml;r m&ouml;jligt att se klart TV-serierna i tid till evenemangen d&auml;r de diskuteras. Skriv ut <code>Nej</code> om det inte &auml;r m&ouml;jligt.</p>