# [Silver III] Kaninhål - 24199

[문제 링크](https://www.acmicpc.net/problem/24199)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 19, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘, 구현, 수학, 시뮬레이션

### 문제 설명

<p>I den nyss avslutade t&auml;vlingen Datab&auml;vern <a href="http://www.databavern.se/">(se hemsida)</a>&nbsp;fick eleverna se ett exempel p&aring; djurens m&auml;rkliga samspel:</p>

<p>En grupp med $N$ b&auml;vrar ska g&aring; p&aring; promenad i skogen. De g&aring;r p&aring; ett led efter varandra, den ena b&auml;vern efter den andra. Men de busiga kaninerna har gr&auml;vt en massa h&aring;l utefter stigen som b&auml;vrarna g&aring;r p&aring;.</p>

<p>H&aring;len &auml;r tillr&auml;ckligt djupa f&ouml;r att ett visst antal b&auml;vrar ska falla i dem. N&auml;r h&aring;let v&auml;l &auml;r fullt med b&auml;vrar kan de bakomvarande b&auml;vrarna passera ovanp&aring; b&auml;vrarna i h&aring;let, tills slutligen den sista b&auml;vern i raden drar upp b&auml;vrarna ur h&aring;let, den &ouml;versta f&ouml;rst och den understa sist. Allts&aring;, om vi har fem b&auml;vrar (5 4 3 2 1) som vandrar &aring;t h&ouml;ger (nummer 1 g&aring;r allts&aring; f&ouml;rst och nummer 5 sist i ledet), och de kommer till ett h&aring;l d&auml;r tre b&auml;vrar f&aring;r plats, s&aring; skulle f&ouml;ljande h&auml;nda:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24199.%E2%80%85Kaninh%C3%A5l/c6e3e18e.png" data-original-src="https://upload.acmicpc.net/060274a5-c3ba-4642-a64b-ba7955c0eec1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 493px; height: 140px;" /></p>

<p style="text-align: center;">En illustration av ett kanin h&aring;l och hur b&auml;vrarna vandrar &ouml;ver h&aring;let.</p>

<p>T&auml;nk dig nu att kaninerna har gjort tre h&aring;l p&aring; v&auml;gen (vardera med ett djup mellan $1$ och $N-1$). Skriv ett program som, givet hur raden ser ut efter att b&auml;vrarna passerat alla h&aring;len, ber&auml;knar djupet f&ouml;r varje h&aring;l.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $N$, antalet b&auml;vrar, d&auml;r $2 \leq N &lt; 10$. P&aring; andra raden st&aring;r $N$ olika heltal, vardera mellan 1 och N. Dessa beskriver ordningen p&aring; b&auml;vrarna n&auml;r de passerat de tre kaninh&aring;len. Fr&aring;n b&ouml;rjan &auml;r ordningen $N$, $N-1$, $N-2,\ldots,1$. Observera att de vandrar &aring;t h&ouml;ger, s&aring; b&auml;ver $1$ g&aring;r f&ouml;rst i ledet.</p>

### 출력

<p>Tre heltal mellan $1$ och $N-1$, djupet p&aring; det f&ouml;rsta, andra respektive tredje kaninh&aring;let. Du kan f&ouml;ruts&auml;tta att det finns exakt en l&ouml;sning f&ouml;r varje givet testfall.</p>