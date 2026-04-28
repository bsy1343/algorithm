# [Gold III] Rätblocket - 21284

[문제 링크](https://www.acmicpc.net/problem/21284)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>R&auml;tblocket &auml;r ett mobilspel som snabbt har blivit otroligt popul&auml;rt. Spelet g&aring;r ut p&aring; att man genom att vinkla mobilen &aring;t olika h&aring;ll ska f&aring; ett r&auml;tblock att rulla fr&aring;n cell $A$ till cell $B$ p&aring; en bana. R&auml;tblocket har storlek $1$x$1$x$2$ och banan &auml;r ett tv&aring;dimensionellt br&auml;de med celler av storlek $1$x$1$. Vissa celler &auml;r fria, vilket betyder att r&auml;tblocket kan r&ouml;ra sig fritt p&aring; dem, medan vissa celler &auml;r blockerade. Det &auml;r inte m&ouml;jligt att r&ouml;ra sig utanf&ouml;r banan.</p>

<p>Beroende p&aring; om r&auml;tblocket st&aring;r upp eller ligger ner s&aring; ockuperar det $1$ eller $2$ celler. I b&ouml;rjan av spelet s&aring; st&aring;r blocket upp i cellen markerad med ett $A$ och m&aring;let &auml;r att flytta det s&aring; att det st&aring;r i cellen markerat med ett $B$ (det r&auml;cker allts&aring; inte med att halva blocket ligger p&aring; cell $B$). En f&ouml;rflyttning av blocket kan g&ouml;ras i $4$ olika riktningar - upp, ner, h&ouml;ger eller v&auml;nster - och en f&ouml;rflyttning g&ouml;r att blocket rullar &ouml;ver i den givna riktningen (givet att det inte &auml;r en blockerad cell i v&auml;gen eller banan tar slut). F&ouml;r att tydligare visa hur en f&ouml;rflyttning g&aring;r till s&aring; &auml;r h&auml;r b&ouml;rjan p&aring; en l&ouml;sning till exempelfall $1$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/f3a5e528.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/f3a5e528.png" data-original-src="https://upload.acmicpc.net/d71c6096-eb7f-4e94-8c9e-9263c30b3d57/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;" />&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/8a8249d7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/8a8249d7.png" data-original-src="https://upload.acmicpc.net/5fce92e5-4ec4-4046-9f95-1f27dd33a8a7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;" />&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/1f94ccbd.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/1f94ccbd.png" data-original-src="https://upload.acmicpc.net/20727ad9-0ab6-43d3-919d-2b7445679605/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;" />&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/09f609fd.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/09f609fd.png" data-original-src="https://upload.acmicpc.net/9a235f63-347d-442f-8b15-691d489768ec/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;" />&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/200bdce6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/200bdce6.png" data-original-src="https://upload.acmicpc.net/3996d8b4-56fa-4296-b049-1040b4172c83/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;" /></p>

<p style="text-align: center;">Figur 4.&nbsp;Halva l&ouml;sningen till det f&ouml;rsta exempelfallet. R&auml;tblocket flyttas f&ouml;rst ett steg till h&ouml;ger, sedan tv&aring; steg ned&aring;t och till sist ett steg &aring;t v&auml;nster.</p>

<p>P&aring; mer avancerade banor s&aring; f&ouml;rekommer &auml;ven s&aring; kallade <em>modulo-celler</em>. Dessa &auml;r celler som kan befinna sig i tv&aring; olika tillst&aring;nd, $0$ eller $1$. I tillst&aring;nd $0$ s&aring; beter sig en modulo-cell precis som en fri cell som r&auml;tblocket kan r&ouml;ra sig p&aring;. I tillst&aring;nd $1$ s&aring; &auml;r dock modulo-celler upph&ouml;jda och beter sig som blockerade celler. Det kan &auml;ven finnas v&auml;xel-celler (markerade med ett $c$) utplacerade p&aring; banan. N&auml;r r&auml;tblocket st&auml;lls p&aring; en v&auml;xel-cell s&aring; &auml;ndras tillst&aring;nden p&aring; alla modulo-celler ($0$ blir till $1$ och vice versa).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/37a3a9dc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/37a3a9dc.png" data-original-src="https://upload.acmicpc.net/86b3ce5c-ee2a-4549-9edf-96406cb31bf7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 231px; height: 100px;" />&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/d9cb1324.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21284.%E2%80%85R%C3%A4tblocket/d9cb1324.png" data-original-src="https://upload.acmicpc.net/9ed56372-8c61-413b-826b-0ebf1f33f81e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 231px; height: 100px;" /></p>

<p style="text-align: center;">Figur 5.&nbsp;Det tredje exempelfallet, f&ouml;re och efter att v&auml;xeln har aktiverats.</p>

<p>Banorna &auml;r designade s&aring; att det alltid finns en giltig l&ouml;sning. Din uppgift &auml;r att ber&auml;kna det minsta antal f&ouml;rflyttningar som beh&ouml;vs f&ouml;r att l&ouml;sa en bana.</p>

### 입력

<p>Du kommer f&ouml;rst att f&aring; tv&aring; heltal $N$ och $M$. Detta betyder att banan har $N$ rader och $M$ kolumner. De f&ouml;ljande $N$ raderna har $M$ tecken var och beskriver hur banan ser ut. F&ouml;ljande tecken kan f&ouml;rekomma:</p>

<ul>
	<li>$A$ eller $B$: beskriver banans start- respektive slut-positioner.</li>
	<li>. (en punkt): beskriver en fri cell.</li>
	<li>#: beskriver en blockerad cell.</li>
	<li>$0$ eller $1$: beskriver en modulo-cell med givet start-tillst&aring;nd.</li>
	<li>c: beskriver en v&auml;xel-cell</li>
</ul>

<p>Det &auml;r garanterat att varje bana inneh&aring;ller precis ett $A$ och ett $B$.</p>

### 출력

<p>Skriv ut en rad med ett heltal, det minsta antal f&ouml;rflyttningar som beh&ouml;vs f&ouml;r att flytta r&auml;tblocket fr&aring;n cell $A$ till cell $B$.</p>

### 제한

<p>F&ouml;r testfall v&auml;rda $40$ po&auml;ng s&aring; har en bana upp till $7$ rader och $7$ kolumner, men inga modulo-celler.</p>

<p>F&ouml;r de resterande $60$ po&auml;ngen s&aring; beh&ouml;ver din l&ouml;sning &auml;ven kunna hantera modulo-celler.</p>