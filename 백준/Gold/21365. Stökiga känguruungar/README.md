# [Gold I] Stökiga känguruungar - 21365

[문제 링크](https://www.acmicpc.net/problem/21365)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 문자열, 이분 탐색

### 문제 설명

<p>Ett <a href="https://en.wikipedia.org/wiki/Kangaroo_word">k&auml;nguruord</a>&nbsp;&auml;r ett ord som b&auml;r p&aring; en synonym till sig sj&auml;lvt (en &quot;unge&quot;), p&aring; s&aring; vis att alla synonymens bokst&auml;ver f&ouml;rekommer i ordet, i samma ordning. T.ex. &auml;r <code>pastej</code>&nbsp;ett k&auml;nguruord, eftersom det b&auml;r p&aring; synonymen <code>paj</code>&nbsp;(<code><strong>pa</strong>ste<strong>j</strong></code>). &Auml;ven <code>aste</code>&nbsp;och <code>atj</code>&nbsp;hade r&auml;knats som ungar om vi l&aring;tsas att de vore ord, men d&auml;remot inte <code>paaj</code>&nbsp;eller <code>etsa</code>. Formellt uttryckt m&aring;ste ungen vara en <em>subsekvens</em>&nbsp;till ordet.</p>

<p>Vidare kan vi s&auml;ga att en unge &auml;r <em>st&ouml;kig</em>&nbsp;om den f&aring;r plats i ordet p&aring; tv&aring; olika s&auml;tt. <code>paj</code>&nbsp;&auml;r inte en st&ouml;kig unge, men om ursprungsordet hade varit <code>paastej</code>&nbsp;hade den varit det -- d&aring; hade den kunnat g&ouml;mmas som antingen <code><strong>pa</strong>aste<strong>j</strong></code>&nbsp;eller <code><strong>p</strong>a<strong>a</strong>ste<strong>j</strong></code>.</p>

<p>Givet ett (p&aring;hittat) ord $S$, och en lista med (p&aring;hittade) synonymer, hur m&aring;nga av synonymerna &auml;r st&ouml;kiga ungar till $S$?</p>

### 입력

<ul>
	<li>Den f&ouml;rsta raden inneh&aring;ller en icke-tom str&auml;ng best&aring;ende av bokst&auml;ver <code>a-z</code>, ordet $S$ som vi undrar &ouml;ver.</li>
	<li>Den andra raden inneh&aring;ller heltalet $N$ ($1 \le N \le 100\,000$): antalet synonymer till ordet.</li>
	<li>De f&ouml;ljande $N$ raderna inneh&aring;ller synonymerna, vardera en icke-tom str&auml;ng best&aring;ende av bokst&auml;ver <code>a-z</code>.</li>
</ul>

<p>Ingen synonym kommer f&ouml;rekomma tv&aring; g&aring;nger, eller vara lika med $S$.</p>

<p>L&aring;t $M$ beteckna antalet bokst&auml;ver i $S$, och $K$ summan av antalet bokst&auml;ver i synonymerna. D&aring; g&auml;ller att $M \le 100\,000$, $K \le 500\,000$.</p>

### 출력

<p>Skriv ut ett heltal -- antalet ord som &auml;r st&ouml;kiga ungar till $S$.</p>

### 힌트

<p>I exempel 1 &auml;r de f&ouml;rsta tre orden ungar till $S$, och dessutom st&ouml;kiga. Testfallet skulle d&auml;rmed kunna finnas med i testgrupp 2 eller 4.</p>

<p>I exempel 2 &auml;r de fyra f&ouml;rsta orden ungar, varav de tv&aring; f&ouml;rsta dessutom st&ouml;kiga ungar. Det h&auml;r testfallet skulle inte kunna vara med i testgrupp 2 eller 4.</p>