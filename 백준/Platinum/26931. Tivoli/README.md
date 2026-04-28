# [Platinum V] Tivoli - 26931

[문제 링크](https://www.acmicpc.net/problem/26931)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 역추적, 외판원 순회 문제

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26931.%E2%80%85Tivoli/3fb01a3b.png" data-original-src="https://upload.acmicpc.net/6d56b385-00fc-4b67-b61a-e05f152e35c8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">En illustration av det f&ouml;rsta exempelfallet och en optimala l&ouml;sningen.</p>

<p>Lisa har kommit till tivolit och har best&auml;mt vilka $N$ attraktioner hon vill &aring;ka, hon vill &aring;ka varje attraktion en g&aring;ng. F&ouml;r varje attraktion finns det tv&aring; stycken anl&auml;ggningar som &auml;r likv&auml;rdiga, det finns allts&aring; totalt $2N$ anl&auml;ggningar. Givet positionerna f&ouml;r samtliga anl&auml;ggninar, hj&auml;lp Lisa att planera vilka $N$ anl&auml;ggningar hon ska v&auml;lja och i vilken ordning f&ouml;r att minimera den str&auml;cka hon m&aring;ste g&aring; f&ouml;r att ha &aring;kt alla $N$ attraktioner. Hon b&ouml;rjar dessutom vid entr&eacute;n och ska ocks&aring; sluta d&auml;r. Entr&eacute;n &auml;r vid origo.</p>

### 입력

<p>F&ouml;rsta raden best&aring;r av heltalet $N$, antalet attraktioner Lisa vill &aring;ka ($1 \le N \le 15$). D&auml;refter f&ouml;ljer $N$ rader, d&auml;r den f&ouml;rsta raden beskriver attraktion nummer $1$, den andra raden attraktion nummer $2$ o.s.v. Varje rad inneh&aring;ller fyra heltal: x- och y-koordinat f&ouml;r den f&ouml;rsta anl&auml;ggningen av denna attraktion, samt x- och y-koordinat f&ouml;r den andra anl&auml;ggningen av denna attraktion. Koordinaternas absolutbelopp understiger en miljon.</p>

<p>Ingen anl&auml;ggning &auml;r p&aring; samma plats som en annan, eller p&aring; origo.</p>

### 출력

<p>Den f&ouml;rsta raden av utdatan ska best&aring; av ett flyttal: hur l&aring;ngt Lisa m&aring;ste g&aring;. D&auml;refter ska $N$ rader f&ouml;lja med tv&aring; heltal vardera, varav det f&ouml;rsta inom (mellan $1$ och $N$) s&auml;ger vilken attraktion hon ska g&aring; till, och det andra inom ($1$ eller $2$) vilken av anl&auml;ggningarna.</p>

<p>Om det finns flera v&auml;gar som ger lika kort str&auml;cka (det finns ju &aring;tminstone alltid tv&aring; h&aring;ll att g&aring;) kan du ange vilken som helst av dem.</p>

<p>Det relativa eller absoluta felet ska understiga $10^{-5}$.</p>