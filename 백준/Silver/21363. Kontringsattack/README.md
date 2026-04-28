# [Silver I] Kontringsattack - 21363

[문제 링크](https://www.acmicpc.net/problem/21363)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 21, 맞힌 사람: 14, 정답 비율: 58.333%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Friberg och Skog spelar ofta datorspelet Kontringsattack tillsammans. I varje match f&aring;r man ett antal po&auml;ng, som visar hur bra man har presterat under matchen. Ibland h&auml;vdar Skog att han &auml;r b&auml;ttre &auml;n Friberg p&aring; Kontringsattack, eftersom han har f&aring;tt fler po&auml;ng &auml;n Friberg i ett antal matcher. Friberg kontrar genom att h&auml;vda att om skillnaden mellan Fribergs och Skogs po&auml;ng i en match &auml;r mindre &auml;n eller lika med n&aring;got visst tal $K\ge 0$, s&aring; g&aring;r det inte att avg&ouml;ra vem som var b&auml;st i matchen. Mer formellt: om Friberg har f&aring;tt $F$ po&auml;ng och Skog har f&aring;tt $S$ po&auml;ng, s&aring; r&auml;knas de som lika bra om $|F - S| \le K$, annars &auml;r spelaren med h&ouml;gre po&auml;ng b&auml;ttre.</p>

<p>Naturligtvis &auml;r det Friberg som best&auml;mmer talet $K$. Givet ett antal matcher och Fribergs och Skogs po&auml;ng i dem, vad ska Friberg s&auml;tta f&ouml;r v&auml;rde p&aring; $K$ f&ouml;r att differensen mellan antalet matcher d&aring; Fribergs &auml;r b&auml;ttre och antalet matcher d&aring; Skog &auml;r b&auml;ttre blir s&aring; stor som m&ouml;jligt? Om det finns flera s&aring;dana v&auml;rden, hitta det minsta.</p>

### 입력

<ul>
	<li>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$ ($1 \le N \le 100\,000$).</li>
	<li>De f&ouml;ljande $N$ raderna inneh&aring;ller tv&aring; heltal $F$, $S$ ($0 \le F, S \le 1\,000\,000$), Fribergs po&auml;ng respektive Skogs po&auml;ng.</li>
</ul>

### 출력

<p>En rad med heltalet $K$.</p>