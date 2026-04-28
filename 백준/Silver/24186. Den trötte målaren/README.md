# [Silver I] Den trötte målaren - 24186

[문제 링크](https://www.acmicpc.net/problem/24186)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>Ilad Rodavlas har jobbat som m&aring;lare i hela sitt liv men b&ouml;rjar nu bli tr&ouml;tt p&aring; sitt jobb. Dra penseln upp, ned och upp igen. Samma sak varje dag. Men en dag n&auml;r han ska m&aring;la ett golv, indelat i $N \times N$ rutor, f&aring;r han en snilleblixt. &quot;T&auml;nk om en robot skulle kunna g&ouml;ra allt jobb &aring;t mig&quot; utbrister han. Det finns dock tv&aring; problem med den &nbsp;id&eacute;n. F&ouml;r det f&ouml;rsta kan roboten endast f&ouml;rflytta sig rakt fram&aring;t, s&aring; den m&aring;lar alltid en hel rad eller kolumn med samma f&auml;rg. F&ouml;r det andra kan Ilad inte programmera. Han vet dock att du &auml;r en skicklig programmerare och undrar d&auml;rf&ouml;r om du kan hj&auml;lpa honom.&nbsp;</p>

<p>Ilad har en bild som visar exakt hur golvet ska se ut till slut. Hela golvet &auml;r fr&aring;n b&ouml;rjan om&aring;lat. Skriv ett program som ber&auml;ttar f&ouml;r roboten hur den ska m&aring;la golvet. F&ouml;r att inte sl&ouml;sa p&aring; f&auml;rg f&aring;r den inte m&aring;la samma rad eller kolumn flera g&aring;nger.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett tal $1 \leq N \leq 9$, antalet rader och kolumner p&aring; golvet som roboten ska m&aring;la. D&auml;refter f&ouml;ljer $N$ rader och med $N$ tecken p&aring; varje rad, en punkt ($.$) f&ouml;r en om&aring;lad ruta, $S$ f&ouml;r en svart ruta och $V$ f&ouml;r en vit ruta.</p>

<p>Golvet kommer alltid vara m&ouml;jligt att m&aring;la enligt det givna m&ouml;nstret.&nbsp;</p>

### 출력

<p>Skriv f&ouml;rst ut en teckenstr&auml;ng med de rader och kolumner roboten ska m&aring;la, i ordning. Rader beskrivs med siffrorna $1$, $2$, $\dots$ och kolumner med bokst&auml;verna $A$, $B$, $\dots$.</p>

<p>Skriv sedan ut en teckenstr&auml;ng med de f&auml;rger roboten ska m&aring;la varje g&aring;ng, med tecknen <code>V</code> f&ouml;r vitt och <code>S</code> f&ouml;r svart.</p>