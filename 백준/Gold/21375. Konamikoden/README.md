# [Gold V] Konamikoden - 21375

[문제 링크](https://www.acmicpc.net/problem/21375)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 22, 맞힌 사람: 20, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>En vanlig fuskkod i m&aring;nga gamla spel &auml;r den s&aring; kallade <em>konamikoden</em>, som best&aring;r av sekvensen <code>upp upp ned ned v&auml;nster h&ouml;ger v&auml;nster h&ouml;ger B A</code>.</p>

<p>Du h&aring;ller p&aring; att programmera ett spel, d&auml;r du vill l&auml;gga in ett fusk som aktiveras n&auml;r man skriver in konamikoden. Dock vill du g&ouml;ra det med en twist - det ska vara till&aring;tet att trycka p&aring; h&ouml;gst $K$ andra knappar mellan din konamikod.</p>

<p>Om $K = 3$ betyder detta att vi f&aring;r s&auml;tta in tre extra knapptryckningar. Allts&aring; skulle <code>upp upp ned <strong>v&auml;nster</strong>&nbsp;ned v&auml;nster <strong>B B</strong>&nbsp;h&ouml;ger v&auml;nster h&ouml;ger B A</code>&nbsp;vara en korrekt konamikod, d&auml;r de tre extra knapptryckningarna &auml;r markerade i fetstil.</p>

<p>Du ska nu skriva ett program som, givet en sekvens av knapptryckningar, avg&ouml;r det l&auml;gsta $K$-v&auml;rde som beh&ouml;vs f&ouml;r att konamikoden ska f&ouml;rekomma i sekvensen. Notera att knapptryckningar som sker f&ouml;re den f&ouml;rsta konamikodstryckningen och efter den sista konamikodstryckningen inte r&auml;knas. Detta betyder att f&ouml;r sekvensen <code><strong>B B v&auml;nster</strong>&nbsp;upp upp ned <strong>v&auml;nster</strong>&nbsp;ned v&auml;nster <strong>B B</strong>&nbsp;h&ouml;ger v&auml;nster h&ouml;ger B A <strong>A B upp</strong></code>&nbsp;ska vi fortfarande svara $K = 3$.</p>

### 입력

<p>Indata inneh&aring;ller en enda rad med $N$ tecken - sekvensen av knapptryckningar. Den kommer ges som en sekvens av bokst&auml;verna <code>U, N, V, H, B, A</code>, som st&aring;r f&ouml;r knapptryckningarna <code>upp, ned, v&auml;nster, h&ouml;ger, B, A</code>.</p>

<p>Det &auml;r garanterat att konamikoden finns som en delsekvens av knapptryckningarna.</p>

### 출력

<p>Du ska skriva ut en enda rad med heltalet $K$ som beskrivet i uppgiften.</p>