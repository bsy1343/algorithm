# [Gold V] Röksignaler - 20882

[문제 링크](https://www.acmicpc.net/problem/20882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 19, 맞힌 사람: 15, 정답 비율: 100.000%

### 분류

자료 구조, 구현, 파싱, 스택, 문자열

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20882.%E2%80%85R%C3%B6ksignaler/dcd6f979.png" data-original-src="https://upload.acmicpc.net/ca1c37bf-7ccd-48b7-add0-7f19f1ba05ff/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 188px; height: 180px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Morsealfabetet</p>

<p>Din kompis &auml;r ute p&aring; en polarexpedition, och f&ouml;r att h&aring;lla kontakten skickar hon r&ouml;ksignaler kodade med morse. Du tycker det &auml;r jobbigt att l&auml;ra dig morsealfabetet utantill, och vill d&auml;rf&ouml;r skriva ett program som &ouml;vers&auml;tter signalen &aring;t dig. Indata &auml;r en str&auml;ng av ettor och nollor, d&auml;r en sekvens av ettor motsvarar ett r&ouml;kmoln. R&ouml;kmoln motsvarar streck och prickar, och tomrum motsvarar pauser mellan streck och punkter, bokst&auml;ver och mellanslag.</p>

### 입력

<p>De f&ouml;rsta $26$ raderna inneh&aring;ller en tabell &ouml;ver morsekoden f&ouml;r alla bokst&auml;ver. Varje s&aring;dan rad inneh&aring;ller en stor bokstav (A-Z), ett mellanslag, och sedan morsekodningen f&ouml;r den bokstaven.</p>

<p>Efter tabellen f&ouml;ljer en rad med tv&aring; olika heltal: $S$ och $P$. $S$ &auml;r antalet ettor som utg&ouml;r ett streck, och $P$ &auml;r antalet ettor som utg&ouml;r en punkt.</p>

<p>D&auml;refter kommer en rad med tre olika heltal: $T$, $B$ och $M$. $T$ nollor utg&ouml;r en paus mellan punkt och streck, $B$ nollor signalerar ny bokstav och $M$ nollor &auml;r ett mellanslag.</p>

<p>Till sist kommer en rad som inneh&aring;ller talet $N$, f&ouml;ljt av en $N$ bokst&auml;ver l&aring;ng str&auml;ng av ettor och nollor.</p>

### 출력

<p>Din program ska skriva ut en rad som inneh&aring;ller det avkodade meddelandet.</p>

### 제한

<ul>
	<li>$1 \le S, P, T, B, M \le 1000$</li>
	<li>$1 \le N \le 300\,000$</li>
</ul>