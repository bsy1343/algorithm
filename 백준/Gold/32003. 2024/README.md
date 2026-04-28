# [Gold IV] 2024 - 32003

[문제 링크](https://www.acmicpc.net/problem/32003)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 9, 맞힌 사람: 8, 정답 비율: 29.630%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Pierluigi je upravo otvorio milijunsko pitanje na najpoznatijem kvizu. U pitanju je niz od N riječi na engleskom jeziku i svaka od tih riječi je jedna od znamenki od nula do devet. Prvi ponuđeni odgovor je niz od M znamenki. Za odgovor kažemo da ima smisla ako se može dobiti iz niza riječi tako da riječ predstavlja znamenku ili označava koliko se puta znamenka predstavljena sljedećom riječi uzastopno pojavljuje.</p>

<p>Na primjeru sa slike svi odgovori imaju smisla. Naime, 2024 ima smisla ako &ldquo;Two&rdquo; predstavlja znamenku 2, &ldquo;Zero&rdquo; znamenku 0, &ldquo;Two&rdquo; znamenku 2 i &ldquo;Four&rdquo; znamenku 4. Odgovor 0044 također ima smisla ako &ldquo;Two&rdquo; označava da se znamenka 0, predstavljena sa &ldquo;Zero&rdquo; pojavljuje dva puta i nakon toga &ldquo;Two&rdquo; označava da se znamenka 4, označena s &ldquo;Four&rdquo; pojavljuje dva puta. Slično je i sa 0024, gdje je prvo znamenka 0 dva puta pa po jednom znamenke 2 i 4. U posljednjem slučaju su prvo po jednom znamenke 2 i 0 i nakon toga dva puta znamenka 4.</p>

<p>Prema definiciji i mogući odgovor 24 bi imao smisla jer je u njemu prvo znamenka 2, pa nula puta znamenka 2 pa jednom znamenka 4. S druge strane, 02024 nije dobar odgovor jer bi za to dva puta morali ponoviti znamenke 02, &scaron;to ne odgovara definiciji jer broj pojavljivanja može utjecati samo na znamenku predstavljenu sljedećom riječi.</p>

<p>Pierluigi nije siguran ima li prvi ponuđeni odgovor smisla, no, srećom, ti si mu džoker zovi!</p>

### 입력

<p>U prvom je retku prirodan broj N (1 &le; N &le; 1000), broj iz teksta zadatka.</p>

<p>U drugom retku je N riječi, znamenke na engleskom jeziku. Te riječi mogu redom biti &ldquo;Zero&rdquo;, &ldquo;One&rdquo;, &ldquo;Two&rdquo;, &ldquo;Three&rdquo;, &ldquo;Four&rdquo;, &ldquo;Five&rdquo;, &ldquo;Six&rdquo;, &ldquo;Seven&rdquo;, &ldquo;Eight&rdquo; i &ldquo;Nine&rdquo;.</p>

<p>U trećem retku je prirodan broj M (1 &le; M &le; 1000), broj iz teksta zadatka.</p>

<p>U četvrtom retku je M-znamenkasti broj, s mogućim vodećim nulama.</p>

### 출력

<p>Ako odgovor ima smisla ispi&scaron;i &bdquo;DA&ldquo;, a inače ispi&scaron;i &bdquo;NE&ldquo;.</p>