# [Platinum II] Julklappsköp - 20892

[문제 링크](https://www.acmicpc.net/problem/20892)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 비트마스킹, 최대 유량, 비트필드를 이용한 다이나믹 프로그래밍, 최소 비용 최대 유량

### 문제 설명

<p>Sn&auml;lla Alln&auml;s ska k&ouml;pa <em>en julklapp vardera</em> till sina $K$ v&auml;nner (trots att det &auml;r februari -- Alln&auml;s tror p&aring; att ha god marginal). Butiken hon &auml;r i har <em>exakt ett</em> exemplar av varje vara. Det finns totalt $N$ varor. Alln&auml;s k&auml;nner sina v&auml;nner mycket bra -- hon vet exakt vem som gillar vad och hur mycket. Hon har skrivit ner en lista med alla $a_{ij}$ tal, talen som s&auml;ger hur mycket v&auml;n $i$ gillar present $j$.</p>

<p>Nu vill Alln&auml;s maximera sina v&auml;nners gl&auml;dje. Hon vill ge sina v&auml;nner presenter p&aring; ett s&aring;nt s&auml;tt, att summan av gl&auml;djen f&ouml;r varje v&auml;n (d.v.s. talen $a_{ij}$) blir maximal. Vilka julklappar ska hon k&ouml;pa f&ouml;r att maximera summan av sina v&auml;nners gl&auml;dje?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $K$ (antal v&auml;nner) och $N$ (antal presenter).</p>

<p>De f&ouml;ljande $K$ raderna inneh&aring;ller $N$ heltal vardera. P&aring; den $i$:te raden &auml;r det $j$:te heltalet $0 \le a_{ij} \le 10^8$ -- hur glad den $i$:te v&auml;nnen blir om den f&aring;r den $j$:te presenten.</p>

### 출력

<p>Du ska skriva ut ett heltal -- den maximala summan av v&auml;nnernas gl&auml;dje.</p>

### 제한

<ul>
	<li>$1 \le K \le 14$</li>
	<li>$1 \le N \le 100 000$</li>
</ul>