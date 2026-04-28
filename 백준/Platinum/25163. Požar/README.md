# [Platinum V] Požar - 25163

[문제 링크](https://www.acmicpc.net/problem/25163)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 8, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

그래프 이론, 그래프 탐색, 누적 합, 너비 우선 탐색, 스위핑, 오프라인 쿼리

### 문제 설명

<p>Zbog globalnog zatopljenja sve če&scaron;će ljeti viđamo velike požare. Za&scaron;tićena &scaron;uma &bdquo;Matričin lug&rdquo; smatra se osobito rizičnom pa vatrogasci mole da napi&scaron;e&scaron; program koji će predvidjeti &scaron;irenje nekoliko požara u toj &scaron;umi.</p>

<p>Matričin lug poznat je po tome &scaron;to se može vizualizirati kao tablica s N redaka i M stupaca. Ono &scaron;to je manje poznato je da požari u toj &scaron;umi uvijek počinju u obliku kvadrata ili romba. Označimo polje u x-tom retku i y-tom stupcu Matričinog luga oznakom (x, y).</p>

<p>Požar koji počinje u obliku kvadrata sa sredi&scaron;tem u (X<sub>i</sub>, Y<sub>i</sub>) ra&scaron;irenosti A<sub>i</sub> nalazi se na svim poljima (x, y) za koja vrijedi max(|X<sub>i</sub> - x|, |Y<sub>i</sub> - y|) &lt; A<sub>i</sub>.</p>

<p>Požar koji počinje u obliku romba sa sredi&scaron;tem u (X<sub>i</sub>, Y<sub>i</sub>) ra&scaron;irenosti A<sub>i</sub> obuhvaća sva polja (x, y) za koja vrijedi |X<sub>i</sub> - x| + |Y<sub>i</sub> - y| &lt; A<sub>i</sub>.</p>

<p>Bez obzira na oblik, obje vrste požara &scaron;ire se na isti način. Ako u jednoj minuti &scaron;uma na nekom polju gori, onda će u sljedećoj minuti goriti i &scaron;uma na svim poljima direktno susjednima tom polju. Moguće je da će se početni požari preklapati u nekim poljima &scaron;ume.</p>

<p>U nultoj minuti gorit će samo područja u kojima počinju požari. &Scaron;uma gori jako sporo pa se niti jedno opožareno polje nikada neće ugasiti. Vatrogasce za Q trenutaka zanima koliko će polja &scaron;ume goriti u minuti T<sub>i</sub>.</p>

### 입력

<p>U prvom su retku dva prirodna broja N i M (1 &le; N, M &le; 2000), brojevi iz teksta zadatka.</p>

<p>U sljedećem retku su tri cijela broja: K, R i Q (0 &le; K, R &le; 2000, 1 &le; Q &le; 2000), redom broj kvadratastih požara, broj rombastih požara i broj upita iz teksta zadatka.</p>

<p>U sljedećih K redaka su po tri prirodna broja X<sub>i</sub>, Y<sub>i</sub> i A<sub>i</sub> (1 &le; X<sub>i</sub> &le; N, 1 &le; Y<sub>i</sub> &le; M, 1 &le; A<sub>i</sub> &le; 2000), redak i stupac sredi&scaron;ta te ra&scaron;irenost i-tog požara koji započinje u obliku kvadrata.</p>

<p>U sljedećih R redaka su po tri prirodna broja X<sub>i</sub>, Y<sub>i</sub> i A<sub>i</sub> (1 &le; X<sub>i</sub> &le; N, 1 &le; Y<sub>i</sub> &le; M, 1 &le; A<sub>i</sub> &le; 2000), redak i stupac sredi&scaron;ta te ra&scaron;irenost i-tog požara koji započinje u obliku romba.</p>

<p>U sljedećih Q redaka je po jedan cijeli broj T<sub>i</sub> (0 &le; T<sub>i</sub> &le; 2000) koji odgovara i-tom upitu vatrogasaca.</p>

### 출력

<p>Potrebno je ispisati Q redaka. U i-tom retku treba ispisati koliko polja &scaron;ume će gorjeti u minuti T<sub>i</sub>.</p>

### 힌트

<p>Opis prvog probnog primjera: U nultoj minuti požar će se nalaziti samo na crvenim poljima, kojih je 9+5=14. U sljedećoj minuti gorjet će i narančasta polja pa će ukupno gorjeti 14+15=29 polja, a u minuti nakon i žuta polja će gorjeti &scaron;to je ukupno 29+12=41 polje.</p>

<pre style="text-align: center;">
<span style="color:#f19e39;">&Delta;</span><span style="color:#ea3323;">&Delta;&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>....
<span style="color:#f19e39;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>....
<span style="color:#f19e39;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>....
<span style="color:#ffff55;">&Delta;</span><span style="color:#f19e39;">&Delta;&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>...
.<span style="color:#ffff55;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#ea3323;">&Delta;&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>..
..<span style="color:#ffff55;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ea3323;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>...
...<span style="color:#ffff55;">&Delta;</span><span style="color:#f19e39;">&Delta;</span><span style="color:#ffff55;">&Delta;</span>....
....<span style="color:#ffff55;">&Delta;</span>.....</pre>