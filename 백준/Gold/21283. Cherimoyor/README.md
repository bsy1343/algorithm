# [Gold III] Cherimoyor - 21283

[문제 링크](https://www.acmicpc.net/problem/21283)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Farah &auml;lskar den exotiska cherimoya-frukten. Eftersom den kommer fr&aring;n ett fj&auml;rran land s&aring; s&auml;ljs den bara en dag om &aring;ret i Sverige! Farah har givetvis passat p&aring; att k&ouml;pa n&aring;gra Cherimoyor just denna dag.</p>

<p>Cherimoyorna &auml;r olika mogna. Vissa har precis blivit mogna samma dag medan en del blir &auml;tmogna senare.</p>

<p>Mer precist &auml;r det under totalt 3 dagar varje cherimojafrukt &auml;r &auml;tmogen. Vi s&auml;ger at frukten blir &auml;tmogen den dagen. F&ouml;re kan man inte &auml;ta den och efter de tre dagarna m&aring;ste den sl&auml;ngas.</p>

<p>Farah vill f&aring; ut s&aring; mycket som m&ouml;jligt utav cherimoyas&auml;songen. Hon vill maximera njutningen, njutning r&auml;knas ut s&aring;h&auml;r: F&ouml;r en given dag s&aring; f&aring;r hon 10 njutningspo&auml;ng f&ouml;r den f&ouml;rsta cherimoyan, d&auml;refter 9 f&ouml;r den andra, 8 f&ouml;r den tredje o.s.v. Hon orkar aldrig &auml;ta mer &auml;n 10 Cherimoyor p&aring; en dag.</p>

<p>Skriv ett program som givet hur m&aring;nga cherimoyor som blir &auml;tmogna varje dag, avg&ouml;r hur mycket njutningspo&auml;ng Farah kommer att f&aring; ut under &aring;rets cherimoyas&auml;song.</p>

### 입력

<p>Du kommer f&ouml;rst f&aring; ett heltal $N$ och d&auml;refter $N$ heltal $C_i$. Det &auml;r d&aring; allts&aring; under $N+2$ dagar som det &auml;r aktuellt att &auml;ta cherimoyor. Inget enskilt heltal kommer att vara st&ouml;rre &auml;n 30.</p>

### 출력

<p>Skriv ut en rad med ett heltal. Heltalet &auml;r hur mycket njutningspo&auml;ng Farah som mest kan f&aring; med den b&auml;sta &auml;tstrategin.</p>

### 제한

<p>F&ouml;r testfall v&auml;rda upp till $60$ po&auml;ng, kommer $N$ vara som mest 5. F&ouml;r full po&auml;ng s&aring; ska ditt program klara $N$ som mest 15.</p>