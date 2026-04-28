# [Silver V] TV-tittande - 26907

[문제 링크](https://www.acmicpc.net/problem/26907)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 35, 맞힌 사람: 23, 정답 비율: 88.462%

### 분류

구현, 문자열, 시뮬레이션, 파싱

### 문제 설명

<p>Johan &auml;lskar att titta p&aring; TV hela dagarna, men klarar inte av reklampauser. N&auml;r det blir en reklampaus i programmet han tittar p&aring; byter han till n&auml;sta kanal, och upprepar detta &auml;nda tills han hittar en kanal utan reklam. Om han tittar p&aring; den sista kanalen n&auml;r detta h&auml;nder s&aring; b&ouml;rjar han ist&auml;llet om p&aring; den f&ouml;rsta kanalen. Sedan tittar han p&aring; denna kanal tills det blir reklam, och s&aring; vidare.</p>

<p>Johan undrar i efterhand hur mycket han faktiskt tittade p&aring; varje kanal under en dag. Givet mellan vilka tider det var reklampauser p&aring; varje kanal, r&auml;kna ut detta &aring;t honom. Han tittade mellan tiderna <code>00:00</code> och ett dygn fram&aring;t, och b&ouml;rjade titta p&aring; den f&ouml;rsta kanalen. Du kan anta att ett kanalbyte tar 1 minut, och att under kanalbytet sker inget tv-tittande (f&ouml;r varje kanalbyte s&aring; f&ouml;rsvinner allts&aring; en minut av tv-tittande).</p>

### 입력

<p>Indata b&ouml;rjar med ett heltal $N$ ($1 \leq N \leq 1000$), antalet kanaler.</p>

<p>Sedan f&ouml;ljer en rad per kanal: varje rad b&ouml;rjar med ett heltal $r_i$, antalet reklampauser p&aring; kanalen. Sedan f&ouml;ljer i kronologisk ordning $r_i$ ($0 \leq r_i \leq 1440$) reklampauser p&aring; samma rad, separerade av mellanslag. Varje reklampaus anges med sluttid och starttid p&aring; formen <code>HH:MM-HH:MM</code>, t.ex. betyder <code>05:24-22:23</code> att kanalen hade reklampaus fr&aring;n <code>05:24</code> fram till och med <code>22:23</code>, och den var exakt 17 timmar l&aring;ng. Observera att under minut <code>22:23</code> s&aring; forts&auml;tter reklamen, och den &auml;r slut f&ouml;rst <code>22:24</code>. En reklampaus b&ouml;rjar tidigast vid midnatt och slutar senast vid midnatt (<code>00:00</code> och <code>23:59</code>, respektive). Inga reklampauser &ouml;verlappar varandra p&aring; samma kanal.</p>

### 출력

<p>Skriv ut $N$ rader. F&ouml;r varje rad $1 \leq k_i \leq N$ s&aring; ska du skriva ut ett enda heltal: antalet minuter Johan tittade p&aring; kanal $k_i$.</p>

### 힌트

<p>Det finns tre kanaler som Johan tittar p&aring;. Han b&ouml;rjar direkt med att titta p&aring; den f&ouml;rsta kanalen klockan 00.00, och r&aring;kar direkt ut f&ouml;r en reklampaus Han byter d&aring; kanal (vilket tar en minut), och st&ouml;ter oturligt p&aring; en reklampaus igen. Han byter d&auml;rf&ouml;r kanal igen, och samma sak upprepar sig p&aring; den tredje kanalen. Johan byter efter tre minuter kanal till f&ouml;rsta kanalen igen, och kan nu &auml;ntligen b&ouml;rja r&auml;kna minuterna av kvalitets-TV. Han tittar nu resten av tiden p&aring; f&ouml;rsta kanalen, dvs 1437 minuter.</p>