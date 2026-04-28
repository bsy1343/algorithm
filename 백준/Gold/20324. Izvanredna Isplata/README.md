# [Gold V] Izvanredna Isplata - 20324

[문제 링크](https://www.acmicpc.net/problem/20324)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 11, 맞힌 사람: 10, 정답 비율: 31.250%

### 분류

다이나믹 프로그래밍, 이분 탐색

### 문제 설명

<p>Međunarodne olimpijade nisu prilika samo natjecateljima da pokažu svoje znanje, već i gospodinu Malnaru koji željno i&scaron;čekuje isprobati specijalitete u novoj državi. Kako bi bio spreman na plaćanje skupocjenih večera, odlučio je prije puta pretvoriti dio novca u valutu nadolazeće države.</p>

<p>U toj su državi svi iznosi prirodni brojevi te postoji n različitih vrijednosti kovanica c<sub>1</sub> &lt; c<sub>2</sub> &lt; . . . &lt; c<sub>n</sub> koje se koriste za isplaćivanje iznosa. Novčanik gospodina Malnara možemo zamisliti kao beskonačan izvor novca, gdje on na raspolaganju ima proizvoljno mnogo kovanica svake vrijednosti. Kako bi isplatio iznos, gospodin Malnar izabrat će neki broj kovanica koje u zbroju daju <strong>točan iznos</strong>. Dodatno vrijedi c<sub>1</sub> = 1, &scaron;to osigurava da je svaki iznos moguće isplatiti.</p>

<p>Gospodin Malnar se ne zamara previ&scaron;e s izborom kovanica pa koristi sljedeći pohlepni algoritam za isplaćivanje nekog iznosa &ndash; bira najveću kovanicu koja ne prelazi iznos koji je potrebno isplatiti, a za preostali dio iznosa ponavlja ovaj postupak sve dok ga ne isplati do kraja. Budući da gospodin Malnar ne voli osjećaj prljavog novca u rukama, njemu bi bilo idealno kada bi svaki mogući iznos njegov pohlepni algoritam isplatio koristeći minimalan broj kovanica. Takav sustav kovanica gospodin Malnar smatra <em>izvanrednim</em>.</p>

<p>Gospodin Malnar je zasad bio u t država i za svaku od njih poznaje tamo&scaron;nji sustav kovanica. Ispi&scaron;ite za svaku državu &quot;<code>DA</code>&quot; ili &quot;<code>NE</code>&quot; ovisno o tome je li sustav kovanica u toj državi izvanredan.</p>

### 입력

<p>U prvom je retku prirodan broj t (1 &le; t &le; 100) iz teksta zadatka.</p>

<p>Slijedi t opisa država pri čemu je svaka država opisana s dva retka. U prvom je prirodan broj n (1 &le; n &le; 10 000), a u drugom su prirodni brojevi 1 = c<sub>1</sub> &lt; c<sub>2</sub> &lt; &middot; &middot; &middot; &lt; c<sub>n</sub> &le; 10 000 iz teksta zadatka. Zbroj svih vrijednosti n po svim državama ne prelazi 10 000.</p>

### 출력

<p>Ispi&scaron;ite t redaka, za svaku državu odgovor na pitanje je li sustav kovanica izvanredan.</p>

### 힌트

<p><strong>Poja&scaron;njenje probnog primjera</strong>: u trećoj državi iznos 6 moguće je isplatiti koristeći dvije kovanice (6 = 3 + 3), no pohlepni algoritam koristi tri kovanice (6 = 4 + 1 + 1).</p>