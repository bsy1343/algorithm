# [Bronze I] Hockeymatchen - 24189

[문제 링크](https://www.acmicpc.net/problem/24189)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 49, 맞힌 사람: 43, 정답 비율: 75.439%

### 분류

수학, 구현, 사칙연산, 많은 조건 분기

### 문제 설명

<p>Malin &auml;lskar att kolla p&aring; ishockey. Tyv&auml;rr hade hon alldeles f&ouml;r m&aring;nga l&auml;xor att g&ouml;ra f&ouml;rra kv&auml;llen och kunde inte kolla p&aring; direkts&auml;ndningen av hennes favoritlags senaste match, s&aring; nu &auml;r hon nyfiken p&aring; vad som h&auml;nde under matchen.</p>

<p>Vanligtvis g&aring;r hon in p&aring; Kv&auml;llspapprets sportsidor f&ouml;r att ta reda p&aring; det, men tyv&auml;rr &auml;r en stor del av deras hemsida trasig (de beh&ouml;ver b&auml;ttre programmerare, lika bra som PO-deltagare) och endast en viss del av statistiken g&aring;r att utl&auml;sa. Malin &auml;r fr&auml;mst intresserad av tre olika fr&aring;gor f&ouml;r varje lag: antalet m&aring;l de gjorde, antalet skott deras m&aring;lvakt r&auml;ddade, och det totala antalet skott de sk&ouml;t p&aring; motst&aring;ndarens m&aring;l. Givet en del av denna statistik f&ouml;r respektive lag, &aring;terkonstruera s&aring; mycket av statistiken som m&ouml;jligt.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal: antalet r&auml;ddningar det f&ouml;rsta lagets m&aring;lvakt gjorde, antalet m&aring;l som gjordes av det f&ouml;rsta laget, samt antalet skott som det f&ouml;rsta laget sk&ouml;t p&aring; motst&aring;ndarens m&aring;l. Den andra raden inneh&aring;ller motsvarande information f&ouml;r det andra laget.</p>

<p>Alla tal i statistiken som &auml;r k&auml;nda &auml;r mellan $0$ och $10^9$. Om ett tal i statistiken saknas ers&auml;tts det med $-1$.</p>

<p>Det &auml;r garanterat att det finns minst ett s&auml;tt att ers&auml;tta alla $-1$ med tal s&aring; att den resulterande statistiken &auml;r korrekt.</p>

### 출력

<p>Skriv ut statistiken f&ouml;r de tv&aring; lagen p&aring; samma format som i indatan. All saknad statistik som g&aring;r att unikt best&auml;mma utifr&aring;n &ouml;vriga tal ska skrivas ut ist&auml;llet f&ouml;r $-1$. Om det inte g&aring;r att unikt best&auml;mma ett visst tal, skriv ut $-1$.</p>