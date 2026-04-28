# [Platinum III] Robot - 25152

[문제 링크](https://www.acmicpc.net/problem/25152)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 19, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

비트마스킹, 해 구성하기

### 문제 설명

<p>Kre&scaron;o se voli igrati sa svojim robotom. Za robota voli konstruirati labirint i onda pratiti kako se robot kreće po njemu.</p>

<p>On robota postavi u gornji lijevi kut labirinta koji je predstavljen kao ploča s R redaka i S stupaca. Neka polja labirinta su blokirana. Robot se u svakom trenutku može pomaknuti na polje koje se nalazi desno ili dolje od trenutnog polja. Ako je to polje blokirano, robot se na njega ne može pomaknuti. Igra zavr&scaron;ava kada robot stigne u donji desni kut labirinta.</p>

<p>Kre&scaron;o želi konstruirati labirint koji će biti dovoljno težak tako da robotu igra bude zanimljiva. Preciznije, Kre&scaron;o želi da njegov labirint ima točno K različitih puteva kojima se robot može kretati u igri. Pomozi Kre&scaron;i konstruirati takav labirint.</p>

<p>Napomene: Kre&scaron;o može sam odabrati dimenzije labirinta, ali one moraju biti manje ili jednake od 1000.</p>

<p>Dva puta smatramo različitima ako postoji polje kroz koje je robot pro&scaron;ao u jednom putu, ali nije u drugom.</p>

<p>Robot igru počinje na polju koje pripada prvom retku i prvom stupcu, a zavr&scaron;ava na polju koje pripada zadnjem retku i zadnjem stupcu. Nije dozvoljeno blokirati nijedno od tih dvaju polja.</p>

### 입력

<p>U prvom i jedinom retku nalazi se prirodan broj K (1 &le; K &le; 1 000 000 000).</p>

### 출력

<p>U prvi redak ispi&scaron;i dimenzije labirinta R, S (1 &le; R, S &le; 1 000).</p>

<p>U svakom od sljedećih R redaka ispi&scaron;i S znakova &lsquo;0&rsquo; ili &lsquo;1&rsquo;. Ovih R x S znakova opisuju Kre&scaron;in labirint.</p>

<p>Znak &lsquo;1&rsquo; označava da je odgovarajuće polje blokirano, a &lsquo;0&rsquo; da je slobodno.</p>

### 힌트

<p>Poja&scaron;njenje prvog test podatka: Ovo je jedan od mogućih labirinta unutar kojeg postoji samo jedan put opisan u tekstu zadatka. Primjerice, moguće je i sljedeće rje&scaron;enje:</p>

<pre>
4 4
0001
0101
1001
0100</pre>