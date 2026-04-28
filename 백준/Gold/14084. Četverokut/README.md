# [Gold IV] Četverokut - 14084

[문제 링크](https://www.acmicpc.net/problem/14084)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

브루트포스 알고리즘, 기하학, 다각형의 넓이

### 문제 설명

<p>Mirko je veliki obožavatelj tratinčica. Svaki put kada organizira piknik, on sebi izradi novi pokrivač u obliku četverokuta. Kada stavlja svoj pokrivač na livadu, Mirko želi da se vrhovi četverokuta nalaze točno na pozicijama tratinčica koje tamo rastu. Mirkovo je dru&scaron;tvo veliko tako da on nastoji izraditi pokrivač &scaron;to veće povr&scaron;ine kako bi na njega svi stali, koristeći najvi&scaron;e L m<sup>2</sup> platna kojeg ima na raspolaganju.</p>

<p>Napomena: Pokrivač nije nužno konveksan četverokut, ali je uvijek pozitivne povr&scaron;ine. Mirko je vrstan krojač pa platno može proizvoljno rezati i lijepiti kako bi dobio oblik četverokuta. Nadalje, pokrivač smije sadržavati kolinearne točke.&nbsp;</p>

### 입력

<p>U prvome retku nalaze se prirodan broj N (4 &le; N &le; 300) i cijeli broj L (1 &le; L &le; 10<sup>9</sup>), koji predstavljaju broj tratinčica na livadi te ukupnu povr&scaron;inu platna kojeg Mirko ima na raspolaganju (u m<sup>2</sup>).</p>

<p>Svaki od sljedećih N redaka sadrži dva cijela broja -10 000 &le; x, y &le; 10 000, koordinate tratinčica na livadi. Nijedne dvije tratinčice neće rasti jedna iz druge, tj. neće se nalaziti na istim koordinatama.&nbsp;</p>

### 출력

<p>Potrebno je ispisati maksimalnu povr&scaron;inu pokrivača, zaokruženu na 2 decimalna mjesta. Ukoliko ne postoji pokrivač prema Mirkovim željama, potrebno je ispisati &quot;0.00&quot; (bez navodnika).&nbsp;</p>