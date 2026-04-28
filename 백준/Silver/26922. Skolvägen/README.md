# [Silver III] Skolvägen - 26922

[문제 링크](https://www.acmicpc.net/problem/26922)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 20, 정답 비율: 68.966%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/093f4b27-e33f-454a-a303-f89ed432cd74/-/preview/" /></p>

<p style="text-align: center;">Den streckade linjen visar Cissis v&auml;g i f&ouml;rsta exemplet.</p>

<p>Cissi g&aring;r fr&aring;n sitt hem till skolan l&auml;ngs en l&aring;ng gata som g&aring;r i v&auml;st-&ouml;stlig riktning. P&aring; sin v&auml;g passerar hon ett antal korsningar d&auml;r tv&auml;rgator utg&aring;r norrut (<code>N</code>), s&ouml;derut (<code>S</code>) eller b&aring;de norrut och s&ouml;derut (<code>B</code>). Vid varje korsning finns &ouml;verg&aring;ngsst&auml;llen p&aring; b&aring;de tv&auml;rgator och huvudgata (se figuren ovan), och dessa m&aring;ste givetvis f&ouml;ljas.</p>

<p>B&aring;de hemmet och skolan ligger p&aring; norra sidan av gatan. Skriv ett program som hj&auml;lper Cissi att ber&auml;kna det minsta antalet gator hon m&aring;ste korsa p&aring; sin v&auml;g till skolan. </p>

### 입력

<p>Indata best&aring;r av en enda rad med h&ouml;gst $1\,000$ bokst&auml;ver, som vardera &auml;r <code>N</code>, <code>S</code> eller <code>B</code>. Bokst&auml;verna beskriver korsningarna i precis den ordning som Cissi passerar dem.</p>

### 출력

<p>En rad med ett heltal, det minsta antalet gator Cissi beh&ouml;ver korsa.</p>