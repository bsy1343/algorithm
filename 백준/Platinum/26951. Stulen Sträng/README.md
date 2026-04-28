# [Platinum IV] Stulen Sträng - 26951

[문제 링크](https://www.acmicpc.net/problem/26951)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

자료 구조, 집합과 맵, 누적 합, 슬라이딩 윈도우, 중간에서 만나기

### 문제 설명

<p>Du och din kumpan Acsel har stulit en str&auml;ng av l&auml;ngd $n$ fr&aring;n er fiende Waxel. Ni vill nu dela upp str&auml;ngen s&aring; att ni f&aring;r exakt lika m&aring;nga av varje bokstav var. Det &auml;r dock dyrt att dela en str&auml;ng, d&auml;rf&ouml;r &auml;r ditt uppdrag att hitta det minsta antalet delningar som kr&auml;vs f&ouml;r att ni ska kunna dela lika p&aring; bytet.</p>

<p>Om till exempel str&auml;ngen var &quot;<em>acabbc</em>&quot;, s&aring; kan ni dela upp str&auml;ngen i &quot;<em>a</em>+<em>cab</em>+<em>bc</em>&quot;. D&aring; kan du ta den f&ouml;rsta och sista biten medan Acsel tar mittenbiten. H&auml;r kr&auml;vdes det tv&aring; delningar, och det &auml;r ocks&aring; det minsta antalet i det h&auml;r fallet.</p>

### 입력

<p>En rad med en str&auml;ng av l&auml;ngd $n$, best&aring;ende av bokst&auml;verna &#39;a&#39;, &#39;b&#39;, ... , &#39;a&#39; $+(k-1)$. F&ouml;r gr&auml;nser p&aring; $n$ och $k$, se nedan.</p>

### 출력

<p>Ett tal, det minsta antalet delningar som kr&auml;vs. Om det inte &auml;r m&ouml;jligt att dela exakt lika p&aring; bytet, skriv &quot;$-1$&quot;.</p>