# [Silver II] HŽ - 25161

[문제 링크](https://www.acmicpc.net/problem/25161)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

구현, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>Na jednoj pruzi postoji N željezničkih postaja označenih brojevima od jedan do N. Zbog obnove, K dijelova pruge je zatvoreno, na njima se ne može prometovati niti u jednom smjeru te se na tim dijelovima putnici prevoze autobusima. Dijelovi pruge koji su zatvoreni zadani su svojim početnim i zavr&scaron;nim postajama.</p>

<p>Zamislimo sada jednu situaciju. Putnik dođe na postaju X te kupi kartu za putovanje do postaje Y. Ako se na putu između postaja X i Y putnici u nekom trenutku prevoze autobusima, to treba obavezno pisati na kupljenoj karti. Zamislimo da proučavamo M takvih situacija.</p>

<p>Odgovori na sljedeća pitanja:</p>

<ol>
	<li>Na koliko je, od M kupljenih karti, pisalo da se dio ili cijeli put putnici prevoze autobusima?</li>
	<li>Koliko najmanje od K dijelova treba otvoriti da na niti jednoj od M karti ne pi&scaron;e upozorenje?</li>
	<li>Koliki je najdulji dio pruge, izražen u broju postaja, na kojem se možemo voziti samo vlakom?</li>
</ol>

### 입력

<p>U prvom je retku prirodan broj N (1 &le; N &le; 1000), broj iz teksta zadatka.</p>

<p>U drugom je retku prirodan broj K (1 &le; K &le; 1000), broj iz teksta zadatka.</p>

<p>U sljedećih K redaka nalaze se po dva prirodna broja P<sub>i</sub> (1 &le; P<sub>i</sub> &le; N) i K<sub>i</sub> (1 &le; K<sub>i</sub> &le; N, P<sub>i</sub> &ne; K<sub>i</sub>), oznake početne i zavr&scaron;ne postaje na i-tom zatvorenom dijelu pruge. Zadani zatvoreni dijelovi se ne sijeku.</p>

<p>U sljedećem je retku prirodan broj M (1 &le; M &le; 1000), broj iz teksta zadatka.</p>

<p>U sljedećih M redaka nalaze se po dva prirodna broja X<sub>i</sub> (1 &le; X<sub>i</sub> &le; N) i Y<sub>i</sub> (1 &le; Y<sub>i</sub> &le; N, X<sub>i</sub> &ne; Y<sub>i</sub>), oznake postaja iz teksta zadatka za i-tu promatranu situaciju.</p>

### 출력

<p>U prvi redak ispi&scaron;i cijeli broj, odgovor na prvo pitanje iz teksta zadatka.</p>

<p>U drugi redak ispi&scaron;i cijeli broj, odgovor na drugo pitanje iz teksta zadatka.</p>

<p>U treći redak ispi&scaron;i cijeli broj, odgovor na treće pitanje iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Zbog radova na dionici pruge od 8. do 11. postaje prvom, drugom i četvrtom putniku će na karti pisati da se prevoze autobusom. Ako bi otvorili navedenu dionicu, svi bi putnici putovali samo vlakom. Najdulja dio pruge na kojem nema radova, tj. putnici se ne prevoze autobusima je od 11. do 18. (može i od 1. do 8.) postaje u duljini od 8 postaja.</p>