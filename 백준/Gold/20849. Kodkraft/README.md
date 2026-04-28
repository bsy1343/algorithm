# [Gold II] Kodkraft - 20849

[문제 링크](https://www.acmicpc.net/problem/20849)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 이분 탐색

### 문제 설명

<p>Nicolas vill b&ouml;rja t&auml;vla i programmering p&aring; hemsidan kodkraft\texttrademark. Det finns j&auml;ttem&aring;nga olika divisioner man kan t&auml;vla i, men eftersom Nicolas &auml;r en ny deltagare p&aring; kodkraft&trade; s&aring; m&aring;ste han b&ouml;rja i den l&auml;gsta divisionen (division 1). Nicolas m&aring;l &auml;r att s&aring; snabbt som m&ouml;jligt komma upp till h&ouml;gsta divisionen (division $K$) och vinna en t&auml;vling i den.</p>

<p>Enligt kodkrafts&trade; regler f&aring;r man bara g&aring; upp en division per t&auml;vling, s&aring; han kommer beh&ouml;va g&ouml;ra minst en t&auml;vling i varje division. Nicolas &auml;r dock v&auml;ldigt sj&auml;lvs&auml;ker och tror d&auml;rf&ouml;r att han kommer beh&ouml;va g&ouml;ra exakt en t&auml;vling i varje division f&ouml;r att g&aring; upp till n&auml;sta division. N&auml;r det &auml;r t&auml;vling p&aring; kodkraft&trade; s&aring; &auml;r det bara en division i taget som t&auml;vlar, och tv&aring; t&auml;vlingar &ouml;verlappar aldrig i tiden. T&auml;vlingarna f&ouml;ljer dessutom samma schema varje &aring;r.</p>

<p>Nicolas f&aring;r p&aring;b&ouml;rja sitt t&auml;vlande p&aring; kodkraft&trade; vilket datum p&aring; &aring;ret han vill. Det Nicolas menar med s&aring; snabbt som m&ouml;jligt &auml;r att s&aring; f&aring; t&auml;vlingar som m&ouml;jligt ska g&aring; p&aring; kodkraft&trade; (oavsett om han deltar i dessa eller inte) mellan den f&ouml;rsta t&auml;vling han deltar i, och den f&ouml;rsta vinsten Nicolas har i den h&ouml;gsta divisionen. Hj&auml;lp Nicolas att ber&auml;kna hur m&aring;nga t&auml;vlingar som kr&auml;vs!</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $N$ och $K$ ($1 \leq K \leq N \leq 10^6$), antalet t&auml;vlingar per &aring;r, samt antalet divisioner.</p>

<p>D&auml;refter kommer en rad med $N$ heltal $x_1, \dots, x_N$, ($1 \leq x_i \leq K$), schemat f&ouml;r t&auml;vlingarna under ett &aring;r. $x_i$ &auml;r divisionen som t&auml;vlar under den $i$:te t&auml;vlingen efter ny&aring;r. Varje division mellan $1$ och $K$ har minst en t&auml;vling under &aring;ret.</p>

### 출력

<p>Ett heltal, det minsta antalet t&auml;vlingar som beh&ouml;ver g&aring; p&aring; kodkraft&trade; fr&aring;n det att han b&ouml;rjar t&auml;vla d&auml;r tills han har vunnit division $K$.</p>