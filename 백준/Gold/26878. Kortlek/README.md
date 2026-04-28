# [Gold V] Kortlek - 26878

[문제 링크](https://www.acmicpc.net/problem/26878)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 18, 맞힌 사람: 18, 정답 비율: 90.000%

### 분류

브루트포스 알고리즘, 그리디 알고리즘, 누적 합, 정렬

### 문제 설명

<p>Nicole och Simon spelar ett kortspel som best&aring;r av $N$ rundor. I runda $i$ l&auml;gger Nicole ut ett kort som har ett tal $a_i$ skrivet p&aring; sig. Simon m&aring;ste d&aring; svara med att l&auml;gga ut ett kort fr&aring;n sin hand. Om Simons kort har v&auml;rde $b_i$ s&aring; f&aring;r Nicole $|a_i-b_i|$ po&auml;ng. Simon vill allts&aring; l&auml;gga ett kort som &auml;r s&aring; n&auml;ra det Nicole lade som m&ouml;jligt.</p>

<p>Givet exakt vilka kort Nicole kommer l&auml;gga ut och vilka $M$ kort Simon har p&aring; sin hand fr&aring;n b&ouml;rjan, vad &auml;r den minsta po&auml;ngen Nicole kan f&aring; om Simon spelar optimalt? $M$ &auml;r alltid lika med $N$ eller $N+1$.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller de tv&aring; heltalen $N$ ($1\leq N \leq 2 \cdot 10^5$) och $M$ ($N\leq M \leq N+1$).</p>

<p>Den andra raden inneh&aring;ller $N$ heltal, d&auml;r det $i$:te talet $a_i$ ($0\le a_i \le 10^9$) &auml;r v&auml;rdet p&aring; kortet Nicole l&auml;gger ut i runda $i$.</p>

<p>Den tredje raden inneh&aring;ller $M$ heltal, d&auml;r det $i$:te talet $b_i$ ($0\le b_i \le 10^9$) &auml;r v&auml;rdet av det $i:$te kortet Simon har p&aring; sin hand.</p>

### 출력

<p>Skriv ut ett heltal -- den minsta totala po&auml;ngen Nicole f&aring;r om Simon spelar optimalt.</p>

### 힌트

<p>I exempelfall 1 &auml;r det optimalt f&ouml;r Simon att i f&ouml;rsta rundan l&auml;gga ut kortet med v&auml;rde 1, och i andra rundan l&auml;gga ut kortet med v&auml;rde 2. D&aring; f&aring;r Nicole $|1-1| + |10-2|=8$ po&auml;ng.</p>

<p>I exempelfall 2 spelar Simon ut korten av v&auml;rde 2, 5, 1, i den ordningen.</p>

<p>I exempelfall 3 spelar Simon ut korten av v&auml;rde 4, 6, 3, 1, i den ordningen.</p>