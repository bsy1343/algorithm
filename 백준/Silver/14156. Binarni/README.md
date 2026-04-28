# [Silver I] Binarni - 14156

[문제 링크](https://www.acmicpc.net/problem/14156)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 41, 정답: 35, 맞힌 사람: 26, 정답 비율: 86.667%

### 분류

해 구성하기, 비트마스킹

### 문제 설명

<p>Mali Nikola je nepresu&scaron;nim nizom pitanja upravo natjerao svoju profesoricu matematike u ludilo. Posve iznervirana, ona za kaznu zadaje cijelom razredu sljedeći zadatak:</p>

<p>&quot;Promotrimo sve različite NIZOVE (eto ti sad niza, Nikola!) koji se sastoje od N binarnih znamenki (tih nizova ima 2N ). Na&ntilde;ite permutaciju nizova u kojoj je udaljenost svaka dva uzastopna niza jednaka jedan&quot;.</p>

<p>Učiteljica je jo&scaron; napomenula da se udaljenost izme&ntilde;u dva binarna niza definira kao broj pozicija na kojima se odgovarajući elementi nizova razlikuju. Na primjer:</p>

<p>Udaljenost( 111, 000 ) = 3 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/nizovi se razlikuju na prvoj, drugoj i trećoj poziciji/<br />
Udaljenost( 111100, 101010 ) = 3 &nbsp; &nbsp; &nbsp;&nbsp; /nizovi se razlikuju na drugoj, četvrtoj i petoj poziciji/<br />
Udaljenost( 110011, 110011 ) = 0</p>

<p>Pomozite Nikoli da prona&ntilde;e traženu permutaciju.&nbsp;</p>

### 입력

<p>U prvom i jedinom retku nalazi se prirodni broj N &le; 16, duljina binarnih nizova.&nbsp;</p>

### 출력

<p>Ispi&scaron;ite traženu permutaciju tako da ispi&scaron;ete 2N različitih binarnih nizova, svaki u svojoj liniji. Svaki niz se mora sastojati od točno N znamenki &#39;0&#39; ili &#39;1&#39;. Udaljenost izme&ntilde;u svaka dva susjedna niza mora biti točno jedan.</p>

<p>Možete pretpostaviti da će uvijek postojati barem jedno rje&scaron;enje.</p>