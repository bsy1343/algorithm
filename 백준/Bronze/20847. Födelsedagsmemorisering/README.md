# [Bronze I] Födelsedagsmemorisering - 20847

[문제 링크](https://www.acmicpc.net/problem/20847)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 61, 맞힌 사람: 52, 정답 비율: 86.667%

### 분류

구현, 정렬

### 문제 설명

<p>Krarkl vill l&auml;ra sig alla sina $N$ kompisars f&ouml;delsedagar utantill, s&aring; att han varje dag vet vem han ska gratta. Tyv&auml;rr s&aring; uppst&aring;r det ofta krockar, det vill s&auml;ga flera kompisar som fyller &aring;r p&aring; samma dag. Det h&auml;r g&ouml;r Krarkl f&ouml;rvirrad, s&aring; han best&auml;mmer sig f&ouml;r att f&ouml;r varje datum som har en krock bara komma ih&aring;g f&ouml;delsedagen f&ouml;r den kompis han tycker mest om. Givet en lista med f&ouml;delsedagen f&ouml;r varje kompis och hur mycket Krarkl tycker om kompisen, skriv ut vilka kompisar Krarkl kommer minnas f&ouml;delsedagen f&ouml;r.</p>

### 입력

<p>Den f&ouml;rsta raden i indata inneh&aring;ller heltalet $N$ ($1 \leq N \leq 2\,000$), antalet kompisar.</p>

<p>Sedan f&ouml;ljer $N$ rader, en f&ouml;r varje kompis. Den $i$:te raden best&aring;r av en str&auml;ng med den $i$:te kompisens f&ouml;rnamn, $S_i$ ($S_i$ &auml;r mellan $1$ och $10$ tecken l&aring;ng), ett heltal $C_i$ ($0 \leq C_i \leq 100\,000$) som s&auml;ger hur mycket Krarkl gillar kompisen samt kompisens f&ouml;delsedag p&aring; formatet <code>DD/MM</code> (d&auml;r <code>DD</code> &auml;r en dag mellan <code>01</code> och <code>31</code> och <code>MM</code> &auml;r en m&aring;nad mellan <code>01</code> och <code>12</code>). Ett h&ouml;gre v&auml;rde p&aring; $C_i$ betyder att Krarkl gillar kompisen mer.</p>

<p>F&ouml;delsedagarna kommer att vara riktiga datum under 2020 (ett skott&aring;r), t.ex. <code>28/02</code> f&ouml;r den tjugo&aring;ttonde februari. Namnen kommer best&aring; av enbart sm&aring; engelska bokst&auml;ver (<code>a-z</code>), med stor f&ouml;rsta bokstav (<code>A-Z</code>). Alla $C_i$ kommer att vara olika.</p>

### 출력

<p>Du ska skriva ut en rad med ett heltal $K$, antalet kompisar vars f&ouml;delsedag Krarkl kommer minnas.</p>

<p>Den ska f&ouml;ljas av $K$ rader med ett ord vardera, f&ouml;rnamnen p&aring; de utvalda kompisarna, <strong>i alfabetisk ordning</strong>.</p>

### 힌트

<p>I det f&ouml;rsta exemplet har Sanna och Simon samma f&ouml;delsedag. Eftersom Krarkl gillar Sanna mindre &auml;n Simon ($1 &lt; 2$) s&aring; kommer Krarkl bara komma ih&aring;g Simons och Sagas f&ouml;delsedagar.</p>

<p>I det andra exemplet har Krarkl j&auml;tteotur och komma att missa h&auml;lften av sina kompisars f&ouml;delsedagar.</p>