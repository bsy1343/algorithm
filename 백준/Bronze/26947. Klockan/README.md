# [Bronze I] Klockan - 26947

[문제 링크](https://www.acmicpc.net/problem/26947)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 57, 맞힌 사람: 48, 정답 비율: 82.759%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Om n&aring;gon fr&aring;gar hur mycket klockan &auml;r, svarar de flesta &quot;kvart &ouml;ver fem&quot;, <code>15:29</code> eller n&aring;got liknande. Vill man g&ouml;ra det lite sv&aring;rare s&aring; kan man annars svara med vinkeln mellan tim- och minutvisaren, eftersom man ur denna information entydigt kan best&auml;mma klockslaget. Dock &auml;r det m&aring;nga m&auml;nniskor som &auml;r ovana vid detta s&auml;tt att ange tider, s&aring; det vore bra att ha ett datorprogram som &ouml;vers&auml;tter till ett mer normalt format. Du ska skriva ett s&aring;dant program.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9037f234-5e7a-4151-86f0-94ea1d20e6f2/-/preview/" style="width: 706px; height: 300px;" /></p>

<p style="text-align: center;">Klockan till v&auml;nster &auml;r <code>01:21</code> och den till h&ouml;ger &auml;r <code>03:08</code>.</p>

<p>Vi f&ouml;ruts&auml;tter att v&aring;r klocka saknar sekundvisare och endast visar ett helt antal minuter (det vill s&auml;ga: b&aring;da visarna hoppar fram&aring;t bara p&aring; hel minut). Vinkeln avl&auml;ses genom att utg&aring; fr&aring;n timvisaren och sedan m&auml;ta hur m&aring;nga grader medurs minutvisaren ligger (se figuren). F&ouml;r att undvika decimaler anges vinkeln i tiondels grader (s&aring; att $85.5$ grader skrivs som $855$). Detta tal &auml;r alltid ett heltal mellan $0$ och $3595$ (inklusive) och &auml;r, som en f&ouml;ljd av att endast hela minuter visas, alltid delbart med $5$.</p>

### 입력

<p>Indatan best&aring;r av ett enda heltal mellan $0$ och $3595$ -- vinkel mellan de tv&aring; visarna, i tiondels grader.</p>

### 출력

<p>Skriv ut det klockslag som vinkeln motsvarar, p&aring; formatet <code>hh:mm</code>. Om antalet timmar &auml;r ensiffrigt ska du &auml;nd&aring; skriva ut en ledande nolla i svaret. Vi f&ouml;ruts&auml;tter att det &auml;r morgon, s&aring; alla tider ska dessutom ligga mellan <code>00:00</code> och <code>11:59</code> (inklusive).</p>