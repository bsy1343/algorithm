# [Silver II] Kaustad - 29832

[문제 링크](https://www.acmicpc.net/problem/29832)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Jukul on superarvuti. Ainult kursor liigub sellel arvutil vaevaliselt. Juku tahab avada mingit kindlat faili. Ta teab t&auml;pselt k&otilde;igi oma arvutis olevate kaustade sisu, aga kuna ta k&auml;surida kasutada ei oska, siis l&auml;bib ta failipuud j&auml;rjest kaustu lahti klikkides. Navigaatori aknas on kaustas olevad alamkaustad ja failid &uuml;ksteise all loeteluna. Mingi alamkausta lahti klikkimisel asendab alamkausta sisukord aknas enne olnud loetelu.</p>

<p>Otsitava failini j&otilde;udmiseks peab Juku avama $N$ kausta ja navigeerima igas kaustas &otilde;igele alamkaustale v&otilde;i failile. Algul on kursor ekraanil loetelu esimese elemendi peal. Jukul v&otilde;tab kursori &uuml;he koha v&otilde;rra alla v&otilde;i &uuml;les liigutamine &uuml;he sekundi. Klikkimine ja kausta v&otilde;i faili avanemine &otilde;nneks aega ei v&otilde;ta. Kursor klikkimise ajal ei liigu. See t&auml;hendab, et kui Juku klikkis loetelus kolmandal kohal oleval alamkaustal, siis p&auml;rast selle avanemist on kursor ka uues loetelus kolmanda elemendi peal.</p>

<p>Lisaks on loetelu esimesest elemendist &uuml;he koha v&otilde;rra k&otilde;rgemal nupp, millel klikkimine p&ouml;&ouml;rab parajasti avatud loetelus elementide j&auml;rjekorra vastupidiseks. Nupu efekt on &uuml;hekordne, uus kaust avaneb j&auml;lle p&ouml;&ouml;ramata j&auml;rjekorras.</p>

<p>Aita Jukul leida minimaalne aeg, mis tal kulub soovitud faili avamiseks.</p>

### 입력

<p>Sisendi esimesel real on t&auml;isarv $N$ ($1 \le N \le 10^5$), otsitava faili s&uuml;gavus failipuus. J&auml;rgneb $N$ rida, kus $i$-ndal real on t&auml;isarvuud $M_i$ ja $K_i$ ($1 \le K_i \le M_i \le 10^9$), mis n&auml;itavad, et $i$-nda taseme kaustas on kokku $M_i$ alamkausta ja faili ning Juku peab avama nende hulgas kohal $K_i$ oleva.</p>

### 출력

<p>V&auml;ljastada &uuml;ks t&auml;isarv, Jukul faili avamiseks kuluvate sekundite arv.</p>