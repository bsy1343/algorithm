# [Platinum III] Suluavaldised - 29868

[문제 링크](https://www.acmicpc.net/problem/29868)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 13, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

자료 구조, 누적 합, 세그먼트 트리

### 문제 설명

<p><em>Suluavaldiseks</em> nimetatakse s&otilde;net, mis on saadud j&auml;rgmiste reeglite abil:</p>

<ul>
	<li>$()$ on suluavaldis;</li>
	<li>kui $s$ on suluavaldis, siis ka $(s)$ on suluavaldis;</li>
	<li>kui $s$ ja $t$ on suluavaldised, siis ka $st$ on suluavaldis.</li>
</ul>

<p>N&auml;iteks <code>()()</code>, <code>(())()</code> ja <code>(()())</code> on suluavaldised, aga <code>(()(</code>, <code>)(</code> ja <code>kala</code> ei ole.</p>

<p>Meil on antud s&otilde;ne $A$ pikkusega $N$, mis koosneb ainult s&uuml;mbolitest <code>(</code> ja <code>)</code>. Lisaks on antud $M$ p&auml;ringut, millest iga&uuml;ks on kujul:</p>

<blockquote>
<p>Antud $L$ ja $R$. Kas leidub selline $k$, et $L &lt; k &lt; R$ ning $A_L A_{L + 1} \ldots A_k$ ja $A_{k + 1} A_{k + 2} \ldots A_R$ on m&otilde;lemad suluavaldised? V&auml;ljasta <code>JAH</code>, kui leidub, ning <code>EI</code>, kui ei leidu.</p>
</blockquote>

<p>S&otilde;ne $A$ positsioonid on nummerdatud $1, \ldots, N$.</p>

### 입력

<p>Sisendi esimesel real on t&auml;isarvud $N$ ja $M$ ($2 \le N \le 10^6$, $1 \le M \le 10^6$) --- sisends&otilde;ne pikkus ja p&auml;ringute arv.</p>

<p>Teisel real on s&otilde;ne $A$: t&auml;pselt $N$ s&uuml;mbolit, millest iga&uuml;ks on <code>(</code> v&otilde;i <code>)</code>.</p>

<p>J&auml;rgmisel $M$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu $L$ ja $R$ ($1 \le L &lt; R \le N$), mis kirjeldavad p&auml;ringuid.</p>

### 출력

<p>V&auml;ljundisse kirjutada p&auml;ringute vastused, iga&uuml;ks eraldi reale.</p>