# [Silver II] PERIOD - 25137

[문제 링크](https://www.acmicpc.net/problem/25137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

유클리드 호제법, 구현, 수학, 정수론, 문자열

### 문제 설명

<p>Ivica je ljubitelj decimalnih brojeva. To su brojevi koji imaju cijeli dio, decimalnu točku i decimalni dio (decimale). Posebno voli one u kojima je cijeli dio nula, a koji imaju beskonačno mnogo decimala od kojih se neke periodički ponavljaju. Npr. u broju 0.333... beskonačno puta se ponavlja decimala 3, u broju 0.252525... decimale 25, a u broju 0.57424242... decimale 42). Nedavno je prona&scaron;ao matematički članak jednog na&scaron;eg studenta s Cambridge-a u kojem je obja&scaron;njeno kako se takvi <strong>decimalni brojevi mogu zapisati u obliku razlomka</strong>. Evo i kako.</p>

<p>Označimo s D decimalni broj, s x broj decimala koje se ne ponavljaju te s y pozitivan broj decimala koje se ponavljaju. Npr, za D=0.064333.. vrijedi da je x=3 i y=1, a za D=0.333.. vrijedi da je x=0 i y=1. Promotrimo dva slučaja.</p>

<p>U prvom slučaju vrijedi da je x=0. Tada:</p>

<ol>
	<li>prvo pomnožimo broj D s 10<sup>y</sup>;</li>
	<li>oduzmimo od lijeve i desne strane broj D;</li>
	<li>brojnik traženog razlomka je broj koji pi&scaron;e na desnoj strani, a nazivnik je broj koji pi&scaron;e uz D;</li>
</ol>

<p>Primjer 1.</p>

<blockquote>
<p>D = 0.333... (x=0, y=1)</p>

<p>10 &bull; D = 3.333... // pomnožimo lijevu i desnu stranu s 10<sup>1</sup>=10</p>

<p>10 &bull; D &ndash; D = 3.333... &ndash; D // oduzmimo D od lijeve i desne strane</p>

<p>9 &bull; D = 3</p>

<p>D = 3/9 = 1/3 (brojnik = 1, nazivnik =3)</p>
</blockquote>

<p>U drugom slučaju vrijedi da je x&gt;0. Tada:</p>

<ol>
	<li>prvo pomnožimo broj D s 10<sup>(x+y)</sup>;</li>
	<li>zatim pomnožimo orginalni broj D i s 10<sup>x</sup>;</li>
	<li>3. oduzmimo lijeve strane tako dobivenih dvaju izraza te njihove desne strane;</li>
	<li>brojnik traženog razlomka je broj koji pi&scaron;e na desnoj strani, a nazivnik je broj koji pi&scaron;e uz D;</li>
</ol>

<p>Primjer 2.</p>

<blockquote>
<p>D = 0.01838383... (x=2, y=2)</p>

<p>1) 10000 &bull; D = 183.838383... // pomnožimo lijevu i desnu stranu s 10<sup>4</sup></p>

<p>2) 100 &bull; D = 1.838383... // pomnožimo orginalni broj D i s 10<sup>2</sup></p>

<p>10000 &bull; D - 100 &bull; D = 183.838383... - 1.838383...//oduzmimo lijeve i desne strane izraza 1) i 2) 9900 &bull; D = 182</p>

<p>D = 182/9900 = 91/4950 (brojnik = 91, nazivnik =4950)</p>
</blockquote>

<p>U oba opisana slučaja razlomak mora biti <strong>skraćen do kraja</strong>. Razlomak je skraćen do kraja ako ne postoji prirodan broj kojim se može bez ostatka podijeliti i brojnik i nazivnik.</p>

<p>U slučaju da za zadani broj postoji vi&scaron;e različitih (x,y) opisanih u gornjem tekstu tada se bira onaj par s <strong>minimalnim y</strong>.</p>

<p>Napi&scaron;i program koji će na osnovu zadanog decimalnog broja <strong>ispisati do kraja skraćen razlomak</strong> koji predstavlja zapis zadanog decimalnog broja.</p>

### 입력

<p>U prvom retku nalazi se realni broj D (0 &lt; D &lt; 1), decimalni broj iz teksta zadatka. Grupa decimala koje se ponavljaju, pojavit će se točno tri puta. Dodatno će vrijediti x+3y &le; 15.</p>

### 출력

<p>U prvi redak izlaza treba ispisati brojnik, a u drugi redak nazivnik razlomka iz teksta zadatka.</p>