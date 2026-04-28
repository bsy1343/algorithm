# [Bronze I] KHL - 25146

[문제 링크](https://www.acmicpc.net/problem/25146)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 45, 맞힌 사람: 39, 정답 비율: 75.000%

### 분류

수학, 구현, 문자열, 사칙연산, 파싱

### 문제 설명

<p>Medve&scaron;čak je hrvatski profesionalni hokeja&scaron;ki klub iz Zagreba koji trenutačno nastupa u međunarodnoj KHL hokeja&scaron;koj ligi. Poznati su pod nadimkom Medvjedi, a navijači ih prate povicima &quot;Zig-zag, Medve&scaron;-čak!&quot;.</p>

<p>Jedna hokeja&scaron;ka utakmica dijeli se na tri trećine. Pobjednik je onaj tim koji u tri trećine ukupno postigne vi&scaron;e golova. Za pobjedu nakon tri trećine dobivaju se tri boda, dok se za poraz ne dobivaju bodovi.</p>

<p>U slučaju neodlučenog rezultata nakon tri trećine, igra se produžetak. Tim koji u produžetku postigne vi&scaron;e golova je pobjednik i dobiva dva boda, a poraženi dobiva jedan bod.</p>

<p>Ako je rezultat nakon produžetka i dalje nerije&scaron;en, pristupa se izvođenju kaznenih udaraca. Tim koji pogodi vi&scaron;e kaznenih udaraca, pobjednik je meča i dobiva jedan bod, a poraženi ne dobiva bodove.</p>

<p>Ako znamo da Medve&scaron;čak naizmjence igra jednu utakmicu kod kuće, a sljedeću u gostima i da je prvu u sezoni odigrao kod kuće, odredi i ispi&scaron;i koliko je ukupno bodova osvojio nakon N odigranih utakmica.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 60), broj odigranih utakmica iz teksta zadatka.</p>

<p>U narednih N redaka nalazi se rezultat svake od N odigranih utakmica redom od prve do posljednje u sezoni. Rezultat utakmice zadan je u obliku stringa &bdquo;D1:G1/D2:G2/D3:G3/Dp:Gp/Dk:Gk&ldquo; pri čemu su:</p>

<ul>
	<li>cijeli brojevi D1, G1, D2, G2, D3, G3 (0 &le; D1, G1, D2, G2, D3, G3 &le; 99), broj golova domaćina i gosta u prvoj, drugoj i trećoj trećini.</li>
</ul>

<p>Ako bude potrebno bit će zadani i:</p>

<ul>
	<li>cijeli brojevi Dp i Gp (0 &le; Dp, Gp &le; 99), broj golova domaćina i gosta u produžetku,</li>
</ul>

<p>a ako bude potrebno bit će zadani i:</p>

<ul>
	<li>cijeli brojevi Dk i Gk (0 &le; Dk &ne; Gk &le; 99), broj pogođenih kaznenih udaraca domaćina i gosta.</li>
</ul>

### 출력

<p>U jednom retku treba ispisati prirodan broj, traženi broj bodova iz teksta zadatka.</p>

### 힌트

<p>Opis prvog test podatka: Medve&scaron;čak je prvu utakmicu odigrao kod kuće i pobijedio nakon tri trećine ukupnim rezultatom 7:4 (3 boda za pobjedu). Drugu utakmicu je igrao u gostima. Nakon tri trećine rezultat je bio nerije&scaron;en (4:4), pobjedu je u produžetku odnio protivnik/domaćin pa je Medve&scaron;čak dobio jedan bod. U trećem meču igranom kod kuće, Medve&scaron;čak je odnio pobjedu nakon izvođenja kaznenih udaraca i dobio 1 bod za pobjedu.</p>