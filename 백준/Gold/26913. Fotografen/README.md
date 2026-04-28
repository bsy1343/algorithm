# [Gold IV] Fotografen - 26913

[문제 링크](https://www.acmicpc.net/problem/26913)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 22, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>En fotograf har tagit m&aring;nga fina foton med sin digitalkamera och kopplar in den i sin dator f&ouml;r att &ouml;verf&ouml;ra bilderna. Bilderna har tagits med olika vridningar av kameran s&aring; nu &auml;r vissa av bilderna roterade. Vi kallar de fyra m&ouml;jliga rotationerna ett foto kan ha f&ouml;r <em>upp</em>, <em>h&ouml;ger</em>, <em>ner</em> och <em>v&auml;nster</em> och definierar det som den sida som motsvarar upp&aring;t i bilden. En bild &auml;r v&auml;nd r&auml;tt om den &auml;r roterad <em>upp</em>. Datorn visar bilderna i en lista och har en funktion som roterar en bild $90^\circ$ medurs. Rotationen sker allts&aring; enligt f&ouml;ljande ordning:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26913.%E2%80%85Fotografen/66429f13.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26913.%E2%80%85Fotografen/66429f13.png" data-original-src="https://upload.acmicpc.net/0ca2cd1e-4b0c-41a1-9619-5f23d50c5e2c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 475px; height: 100px;" /></p>

<p style="text-align: center;">Hur en bild roteras</p>

<p>Fotografen tycker det verkar tr&aring;kigt att rotera foton och best&auml;mmer sig f&ouml;r att g&ouml;ra det till ett roligt spel. Fotografen v&auml;ljer ett positivt heltal $k$ och best&auml;mmer att det enda s&auml;ttet att rotera foton &auml;r att markera exakt $k$ intill varandra liggande foton ur listan och rotera alla dessa samtidigt. Formellt har fotografen $N$ foton, kalla dem $a_1, a_2, \dots a_N$. Fotografen kan nu v&auml;lja ett index $i$ ($1 \leq i \leq N-k+1$) och bilderna $a_i, a_{i+1}, ... , a_{i+k-1}$ roteras d&aring; $90^\circ$ medurs. Detta kallar vi en operation.</p>

<p>M&aring;let med spelet &auml;r att v&auml;nda alla foton r&auml;tt med s&aring; f&aring; operationer som m&ouml;jligt. Skriv ett program som ber&auml;knar det minsta antalet operationer som kr&auml;vs.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r tv&aring; heltal $N$ och $k$ ($1 \leq k \leq N \leq 100\,000$), antalet foton totalt respektive antalet foton som m&aring;ste roteras samtidigt.</p>

<p>P&aring; andra raden st&aring;r $N$ tecken som representerar fotografiernas rotation fr&aring;n b&ouml;rjan: <code>U</code> f&ouml;r upp, <code>H</code> f&ouml;r h&ouml;ger, <code>N</code> f&ouml;r ner och <code>V</code> f&ouml;r v&auml;nster.</p>

### 출력

<p>Skriv ut det minsta antalet operationer som kr&auml;vs. Om det inte g&aring;r att v&auml;nda alla foton r&auml;tt, skriv ut $-1$.</p>

### 힌트

<p>En m&ouml;jlig optimal l&ouml;sning &auml;r denna: Rotera tre g&aring;nger p&aring; position 3-4 f&ouml;r att f&aring; <code>UVVU</code>, rotera sedan en g&aring;ng p&aring; position 2-3 f&ouml;r att slutligen f&aring; <code>UUUU</code>, och vi &auml;r klara med fyra operationer utf&ouml;rda.</p>