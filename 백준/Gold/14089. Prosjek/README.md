# [Gold III] Prosjek - 14089

[문제 링크](https://www.acmicpc.net/problem/14089)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

수학, 많은 조건 분기

### 문제 설명

<p>Niz brojeva najče&scaron;će zbrajamo tako da najprije zbrojimo prva dva broja, potom zbrojimo rezultat i treći broj, pa novi rezultat i četvrti broj, i tako dalje. Mirko je pomislio da na isti način može računati i prosjek niza brojeva. On dakle uzme prosjek prvih dvaju brojeva, pa prosjek rezultata i trećega broja, pa prosjek novog rezultata i četvrtoga broja, i tako dalje.</p>

<p>Na primjer, za niz 1, 5, 9, 7 Mirko računa (1 + 5) / 2 = 3, potom (3 + 9) / 2 = 6 i konačno (6 + 7) / 2 = 6.5. (Stvarni prosjek ovog niza nije 6.5, nego 5.5.)</p>

<p>Budući da je nedavno pogledao sve epizode Dextera i True Detectiva, Mirku nema druge nego se zabavljati s prosjecima. On ponekad promijeni dva elementa svojega niza brojeva i poku&scaron;ava pogoditi je li se prosjek niza (dobiven njegovim algoritmom) smanjio, povećao ili možda ostao isti. Pomozite Mirku i napi&scaron;ite program koji na ova pitanja odgovara!&nbsp;</p>

### 입력

<p>U prvome retku nalaze se prirodan broj N (2 &le; N &le; 100 000), duljina niza</p>

<p>U sljedećem retku nalazi se Mirkov niz: N cijelih brojeva iz intervala [1, 10<sup>9</sup>].</p>

<p>U sljedećem retku nalazi se prirodan broj M (1 &le; M &le; 100 000), broj promjena niza.</p>

<p>Svaki od sljedećih M redaka ima oblik &quot;p A q B&quot; i opisuje promjenu: postavi p-ti element niza na A, a q-ti element na B. Pritom je 1 &le; p, q &le; N, p&ne;q i 1 &le; A, B &le; 10<sup>9</sup> . Promjene su kumulativne, tj. niz ostaje promijenjen.&nbsp;</p>

### 출력

<p>Za svaku promjenu u zaseban redak ispi&scaron;ite znak &quot;&lt;&quot; ako se prosjek smanjio, &quot;&gt;&quot; ako se povećao, te &quot;=&quot; ako je ostao isti.&nbsp;</p>

### 힌트

<p>20, 40, 50, 60, 100, 25 -&gt; 50.0<br />
55, 5, 50, 60, 100, 25 -&gt; 50.0<br />
135, 5, 50, 60, 100, 10 -&gt; 45.0<br />
135, 5, 50, 20, 100, 20 -&gt; 45.0<br />
135, 5, 100, 83, 100, 20 -&gt; 56.0&nbsp;</p>