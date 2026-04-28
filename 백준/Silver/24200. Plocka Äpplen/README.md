# [Silver II] Plocka Äpplen - 24200

[문제 링크](https://www.acmicpc.net/problem/24200)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 29, 맞힌 사람: 22, 정답 비율: 29.333%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p><em>Detta &auml;r skolkvalsvarianten av uppgiften Plocka &Auml;pplen. Det inneb&auml;r att po&auml;ngs&auml;ttningen sker som i skolkvalet och att antalet testfall &auml;r mycket f&auml;rre.</em></p>

<p>IOI 2015 avg&ouml;rs i Almaty, som ungef&auml;r betyder &quot;&auml;pplets fader&quot;. Olga bor i Almaty, och har en &auml;ppelodling med tv&aring; rader tr&auml;d. P&aring; varje rad finns det $N$ tr&auml;d. Varje tr&auml;d har ett visst antal mogna &auml;pplen.</p>

<p>Olga b&ouml;rjar bes&ouml;ka tr&auml;det i det sydv&auml;stra h&ouml;rnet (det l&auml;ngst till v&auml;nster p&aring; den undre raden), och plockar alla dessa &auml;pplen. Sedan g&aring;r hon till ett av de n&auml;rmsta tr&auml;den (i norr, &ouml;ster, v&auml;ster eller syd) och plockar dess &auml;pplen.</p>

<p>Din uppgift &auml;r att ber&auml;kna, givet hur m&aring;nga &auml;pplen som &auml;r p&aring; de olika tr&auml;den, hur m&aring;nga &auml;pplen Olga sammanlagt kan plocka om hon totalt hinner plocka &auml;pplena fr&aring;n h&ouml;gst $K$ tr&auml;d.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller heltalen $N$ och $K$, separerade med ett blanksteg.</p>

<p>N&auml;sta rad inneh&aring;ller $N$ heltal - antalet &auml;pplen p&aring; tr&auml;den i den norra raden, listade fr&aring;n tr&auml;det l&auml;ngst till v&auml;st till det l&auml;ngst till &ouml;st.</p>

<p>Den tredje och sista raden inneh&aring;ller ocks&aring; $N$ heltal - antalet &auml;pplen p&aring; tr&auml;den i den s&ouml;dra raden.</p>

### 출력

<p>Ditt program ska skriva ut ett heltal - antalet &auml;pplen Olga hinner plocka.</p>

### 제한

<p>Gr&auml;nserna i alla testfall &auml;r $1 \le N \le 15$ och $1 \le K \le 15$. Antalet &auml;pplen p&aring; varje tr&auml;d &auml;r mellan $0$ och $1000$.</p>

### 힌트

<p>I exemplet hinner hon bara plocka &auml;pplena fr&aring;n tv&aring; tr&auml;d. Tr&auml;det hon b&ouml;rjar p&aring; har $6$ &auml;pplen. Tr&auml;det till norr har $7$ &auml;pplen, medan tr&auml;det direkt till &ouml;st bara har $4$ &auml;pplen. Hon hinner d&auml;rf&ouml;r som mest plocka $6 + 7 = 13$ &auml;pplen.</p>