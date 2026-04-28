# [Bronze I] Volleybollmatchen - 20840

[문제 링크](https://www.acmicpc.net/problem/20840)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 88, 정답: 57, 맞힌 사람: 47, 정답 비율: 61.842%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Du har blivit inhyrd av PO-Volley (P&aring;hittade Organisationen f&ouml;r Volleyboll), f&ouml;r att h&aring;lla koll p&aring; po&auml;ngen i en volleybollmatch mellan de tv&aring; lagen Algoritmikerna och B&auml;verbusarna.</p>

<p>I volleyboll spelar man b&auml;st av $3$ set, det vill s&auml;ga det laget som f&ouml;rst vunnit $2$ set vinner matchen. I de tv&aring; f&ouml;rsta setten g&auml;ller f&ouml;rst till $25$, och ifall det blir ett tredje set spelar man d&aring; f&ouml;rst till $15$. Man m&aring;ste vinna med $2$ po&auml;ng, s&aring; det &auml;r allts&aring; det lag som f&ouml;rst har minst $25$ resp $15$ po&auml;ng, och som dessutom har $2$ po&auml;ng mer &auml;n motst&aring;ndaren som vinner det settet. Givet vilket lag som vinner varje boll, skriv ut resultatet av matchen.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$ ($1 \le N \le 200$). D&auml;refter f&ouml;ljer en $N$ tecken l&aring;ng str&auml;ng best&aring;ende av &quot;<code>A</code>&quot; och &quot;<code>B</code>&quot;, som beskriver en hel match. Den $i$:te bokstaven &auml;r &quot;<code>A</code>&quot; ifall Algoritmikerna vinner den $i$:te bollen, och &quot;<code>B</code>&quot; ifall lag B&auml;verbusarna vinner den $i$:te bollen.</p>

<p>Matchen kommer att vara fullst&auml;ndig, d.v.s. n&aring;got av lagen kommer ha kommit upp i $2$ po&auml;ng i slutet, och inga extra bollar kommer ha spelats.</p>

### 출력

<p>Skriv ut en rad med tv&aring; heltal. Det f&ouml;rsta talet ska vara antalet set Algoritmikerna vann och det andra talet ska vara antalet set B&auml;verbusarna vann.</p>

### 힌트

<p>I det f&ouml;rsta exempelfallet vinner lag A f&ouml;rsta settet med $25-0$, lag B vinner andra settet med $0-25$, och lag A vinner det avg&ouml;rande tredje settet med $15-0$. Resultatet av matchen blir allts&aring; $2-1$.</p>

<p>I det andra exempelfallet vinner Lag B b&aring;de f&ouml;rsta och andra settet med $25-27$, och resultatet av matchen blir allts&aring; $0-2$.</p>

<p>Notera att enbart det f&ouml;rsta exempelfallet skulle kunna f&ouml;rekomma i testfallsgrupp $1$.</p>