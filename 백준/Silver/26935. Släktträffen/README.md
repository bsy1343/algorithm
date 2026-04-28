# [Silver III] Släktträffen - 26935

[문제 링크](https://www.acmicpc.net/problem/26935)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 46, 맞힌 사람: 42, 정답 비율: 91.304%

### 분류

그래프 이론, 그래프 탐색, 트리, 최소 공통 조상

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26935.%E2%80%85Sl%C3%A4kttr%C3%A4ffen/b06fe987.png" data-original-src="https://upload.acmicpc.net/eb85b7bd-f6e9-4d5a-9382-d0dca3b8d211/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 499px; height: 213px;" /></p>

<p>Det &auml;r sl&auml;kttr&auml;ff f&ouml;r &auml;ttlingar till Ida-Ottilia Isaksson. F&ouml;r enkelhets skull har man uppr&auml;ttat ett sl&auml;kttr&auml;d och numrerat alla &auml;ttlingarna fr&aring;n $1$ till $N$, samt givit Ida-Ottilia sj&auml;lv numret $0$. Bland de M personerna vid ditt bord uppkommer en diskussion om vem som &auml;r er n&auml;rmaste gemensamma sl&auml;kting (upp&aring;t i tr&auml;det). Skriv ett program som r&auml;knar ut detta.</p>

<p>Programmet ska fr&aring;ga efter antalet &auml;ttlingar, $N$, och d&auml;refter fr&aring;ga efter numret p&aring; varje persons f&ouml;r&auml;lder, vilket naturligtvis alltid &auml;r mellan $0$ och $N$. D&auml;refter ska programmet fr&aring;ga efter antalet personer vid bordet, M ($2 \le M \le N$), och l&auml;sa in numret p&aring; var och en av dem. Programmet ska skriva ut numret p&aring; den person som &auml;r n&auml;rmast gemensam sl&auml;kting (upp&aring;t i tr&auml;det) till alla vid bordet. Observera att detta ibland kan vara n&aring;gon vid bordet.</p>

### 입력

<p>P&aring; f&ouml;rsta raden i indata st&aring;r talen $N$ och $M$ ($2 \le M \le N \le 20$). P&aring; andra raden st&aring;r $N$ tal, f&ouml;r&auml;ldrarna f&ouml;r varje &auml;ttling (alla mellan $0$ och $N$). P&aring; tredje raden st&aring;r $M$ tal, personerna runt bordet (alla mellan $1$ och $N$, utan dubbletter).</p>

### 출력

<p>Programmet ska skriva ut ett enda tal: numret p&aring; personernas n&auml;rmaste gemensamma sl&auml;kting.</p>