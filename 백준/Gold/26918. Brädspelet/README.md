# [Gold III] Brädspelet - 26918

[문제 링크](https://www.acmicpc.net/problem/26918)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Ann-Charlotte och Berit har uppfunnit ett eget br&auml;dspel. Spelet spelas med ett br&auml;de av storlek $N \times M$ samt en motors&aring;g, och &auml;r till f&ouml;r tv&aring; spelare. Spelarna turas om att g&ouml;ra drag tills n&aring;gon av dem inte har n&aring;got giltigt drag l&auml;ngre, och denna spelaren f&ouml;rlorar. Ett drag g&aring;r till p&aring; f&ouml;ljande s&auml;tt:</p>

<p>Spelaren som &auml;r p&aring; tur v&auml;ljer en horisontell eller vertikal linje och delar br&auml;det i tv&aring; icke-tomma delar. Detta f&aring;r dock endast g&ouml;ras vid heltalskoordinater (s&aring; att dimensionerna av de tv&aring; delarna alltid &auml;r heltal). Motspelaren v&auml;ljer sedan en av delarna, och spelet forts&auml;tter med den medan den andra delen kastas. Eftersom dimensionerna alltid m&aring;ste vara heltal s&aring; &auml;r det alltid den som &auml;r p&aring; tur att dela n&auml;r br&auml;det har storlek $1 \times 1$ som f&ouml;rlorar.</p>

<p>Givet storleken p&aring; det ursprungliga br&auml;det, och det faktum att Ann-Charlotte alltid b&ouml;rjar, kan du avg&ouml;ra vem som vinner om de b&aring;da spelar optimalt?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26918.%E2%80%85Br%C3%A4dspelet/e7d0c80f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26918.%E2%80%85Br%C3%A4dspelet/e7d0c80f.png" data-original-src="https://upload.acmicpc.net/6b179bb0-f6c2-471c-9cb7-f521d0dadef3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">En illustration av det f&ouml;rsta exemplet.</p>

### 입력

<p>Indata best&aring;r av en rad med de tv&aring; talen $N$ och $M$ ($1 \le N,M \le 100$).</p>

### 출력

<p>Skriv ut str&auml;ngen &quot;<code>A</code>&quot; om Ann-Charlotte vinner och &quot;<code>B</code>&quot; om Berit vinner, givet att de b&aring;da spelar optimalt. Mer exakt, om Ann-Charlotte kan vinna oavsett hur Berit spelar s&aring; ska du skriva &quot;<code>A</code>&quot;, annars ska du skriva &quot;<code>B</code>&quot;.</p>

### 힌트

<p>I det f&ouml;rsta exemplet s&aring; vinner $A$ genom att dela br&auml;det i tv&aring; delar av storlek $1 \times 3$. Oavsett hur $B$ sedan g&ouml;r s&aring; f&aring;r $A$ n&auml;sta g&aring;ng v&auml;lja mellan delar av storlek $1 \times 2$ och $1 \times 1$. R&auml;tt strategi &auml;r att v&auml;lja $1 \times 2$ (det andra leder direkt till en f&ouml;rlust). $B$ tvingas sedan att v&auml;lja mellan tv&aring; delar av storlek $1 \times 1$, som b&aring;da inneb&auml;r f&ouml;rlust.</p>