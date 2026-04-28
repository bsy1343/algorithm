# [Gold IV] Trokut - 14153

[문제 링크](https://www.acmicpc.net/problem/14153)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 40, 정답: 31, 맞힌 사람: 19, 정답 비율: 70.370%

### 분류

구현, 재귀

### 문제 설명

<p>Nakon duljeg razmi&scaron;ljanja i traženja smisla života, mali Adrijan je odlučio postati umjetnik. Nažalost, nakon dugogodi&scaron;njeg uživanja u matematičkim porocima, kao svoje prvo umjetničko djelo naslikao je primjerak trokuta. No jako se izenadio kada mu ravnatelj galerije, stanoviti Mirko, nije želio izložiti sliku. Misleći kako je problem u nedostatku detalja, mali Adrijan sada želi ukrasiti sliku te ponovno isprobati svoju sreću u umjetničkim galerijama.</p>

<p>Adrijan će ukrasiti sliku tako da na početku odabere neki prirodni broj N, te trokut kojeg je originalno nacrtao proglasi zanimljivim.</p>

<p>Nakon toga Adrijan N-1 puta ponovi sljedeći postupak: svakom trokutu kojeg je proglasio zanimljivim on spoji polovi&scaron;ta stranica. Na taj će način svaki zanimljivi trokut biti podijeljen na četiri manja trokuta: tri rubna i jedan sredi&scaron;nji. Adrijan će zatim zanimljivim proglasiti sve rubne trokute.</p>

<p>Va&scaron; zadatak je pomoći malom Adrijanu tako da napravite simulaciju izgleda njegovog konačnog remek dijela. Za detalje oko formata slike pogledajte izlazne podatke i priložene test primjere.&nbsp;</p>

### 입력

<p>U prvom i jedinom redu se nalazi prirodni broj N (1 &le; N &le; 10) iz teksta zadatka.&nbsp;</p>

### 출력

<p>Potrebno je nacrtati Adrijanovu sliku nakon ukra&scaron;avanja.</p>

<p>Napomene:</p>

<ul>
	<li>Jedini znakovi koje smijete koristiti u izlazu su: &#39;/&#39; (slash), &#39;\&#39; (backslash), &#39;_&#39; (podvlaka), te &#39;.&#39; (točka).</li>
	<li>Izlaz va&scaron;eg programa mora točno odgovarati donjim primjerima. Najmanji trokut na izlazu mora sadržavati točno dva znaka na svojim &bdquo;kosim&ldquo; stranicama i točno 4 znaka na horizontalnoj stranici (tj. treba biti točno onih dimenzija kao rje&scaron;enje za N = 1).</li>
	<li>Nemojte ostavljati vi&scaron;ak razmaka (ili točaka) na kraju bilo kojeg retka. Dakle, zadnji znak u svakom retku mora biti &#39;\&#39;.</li>
	<li>Nemojte ostavljati prazne redove.&nbsp;</li>
</ul>