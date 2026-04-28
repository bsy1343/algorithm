# [Gold V] Hrskave hrstule - 25134

[문제 링크](https://www.acmicpc.net/problem/25134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 19, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

구현, 자료 구조, 집합과 맵, 시뮬레이션, 우선순위 큐, 트리를 사용한 집합과 맵

### 문제 설명

<p>Kile je &scaron;ef poznatog Zagrebačkog restorana. Nedavno je dao otkaz da bi uzeo posao iz snova kao pekar u slastičarnici kod Gospodina Malnara, jer kod Gospodina Malnara je ipak najbolje. A i uvijek mu je najdraži dio jela bio desert.</p>

<p>Prvog ga je dana na poslu dočekao u kuhinji stol s $n$ tanjura, a na $i$-tom tanjuru $A_i$ vrhunskih kolača. Kile je spreman za posao, no nije bio svjestan jednog ključnog problema, od rada sa svim tim slasticama svako ga malo obuzme glad.</p>

<p>Svake će minute napraviti jednu od tri akcije:</p>

<ul>
	<li>ISPECI $x$ $y$ &ndash; dodaje na $x$-ti tanjur $y$ novih slastica</li>
	<li>POJEDI $x$ $y$ &ndash; Kile je toliko gladan da je s $x$-tog tanjura uzeo i pojeo $y$ kolača</li>
	<li>POSLUZI $y$ &ndash; svaki tanjur na kojem se nalazi barem $y$ kolača iznosi iz kuhinje i poslužuje gostima</li>
</ul>

<p>Tanjuri se ne vraćaju u kuhinju, te indeksi tanjura ostaju nepromijenjeni. Kileta zanima koliko je tanjura u svakoj pojedinoj operaciji POSLUZI oti&scaron;lo iz kuhinje. Pomozite mu odgovoriti na njegovo pitanje tijekom sljedećih $q$ minuta.</p>

### 입력

<p>U prvom su retku prirodni brojevi $n$ ($1 &le; n &le; 10^5$) i $q$ ($1 &le; q &le; 10^5$) iz teksta zadatka.</p>

<p>U drugom se retku nalazi $n$ brojeva od kojih i-ti označava $a_i$ ($0 &le; a_i &le; 10^9$).</p>

<p>U sljedećih $q$ redaka nalazi se opis događaja.</p>

<p>Ako je $i$-ti događaj ISPECI u retku se nalaze brojevi $x$ ($1 &le; x &le; n$) i $y$ ($0 &le; y &le; 10^9$).</p>

<p>Ako je $i$-ti događaj POJEDI u retku se nalaze brojevi $x$ ($1 &le; x &le; n$) i $y$ ($0 &le; y &le; 10^9$). Garantiramo da će Kile uspje&scaron;no odraditi sve događaje tipa POJEDI, tj. uvijek će $x$-ti tanju sadržavati barem $y$ kolača.</p>

<p>Ako je $i$-ti događaj POSLUZI u retku se nalazi broj $y$ ($0 &le; y &le; 10^9$).</p>

### 출력

<p>Potrebno je za svaki upit tipa POSLUZI ispisati koliko je kolača izneseno.</p>