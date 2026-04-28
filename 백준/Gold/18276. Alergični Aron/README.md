# [Gold I] Alergični Aron - 18276

[문제 링크](https://www.acmicpc.net/problem/18276)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 39, 맞힌 사람: 31, 정답 비율: 91.176%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 분리 집합

### 문제 설명

<p>Nekada&scaron;nji najbolji prijatelj gospodina Malnara, Aron, napustio je domovinu te je bolju budućnost potražio na jedom pustom, dalekom otoku. Zasigurno se pitate za&scaron;to je odabrao ba&scaron; takvu lokaciju, a ne neki velegrad gdje će, pod okriljem neke glomazne korporacije, ostvariti veliku karijeru. Naime, bolju budućnost traži tamo gdje nema malenih paradajzića (tzv. cherry rajčica) niti ambrozije na koju je izuzetno alergičan. Kako bi mu napakostio, gospodin Malnar u svom je uredu uzgojio biljku ambrozije.</p>

<p>Iako ambrozija nije stablo, zanimljivo je da se biljka gospodina Malnara može prikazati kao stablo s n čvorova koji su povezani pomoću (n &minus; 1) grana. Prisjetimo se, stablo je neusmjereni, povezani graf u kojem između svaka dva čvora postoji jedinstven put. Poznato je da su alergeni koncentrirani upravo na granama, ali nisu sve grane jednako potentne. Gospodin Malnar zna da grana koja povezuje čvorove ui i vi ima alergičnost wi . Shodno tome, iz biljke će izrezati povezani podskup grana najveće alergičnosti. Alergičnost podskupa definira se kao umnožak broja grana unutar njega sa alergično&scaron;ću najnealergičnije grane unutar tog podskupa, tj. grane s minimalnom vrijednosti wi . Gospodin Malnar je nepogre&scaron;iv i odmah je prona&scaron;ao podskup s najvećom alergičnosti.</p>

<p>Možete li i vi odrediti alergičnost tog podskupa?</p>

### 입력

<p>U prvom je retku prirodni broj n (2 &le; n &le; 10<sup>5</sup>).</p>

<p>U sljedećih se n &minus; 1 redaka nalaze brojevi u<sub>i</sub>, v<sub>i</sub> i w<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n, u<sub>i</sub> &ne; v<sub>i</sub>, 1 &le; w<sub>i</sub> &le; 10<sup>9</sup>) koji predstavljaju grane stabla kako je opisano u tekstu zadatka.</p>

### 출력

<p>U jedini redak ispi&scaron;ite alergičnost najalergičnijeg povezanog podskupa grana ambrozije.</p>