# [Gold II] Japanski Junak - 26302

[문제 링크](https://www.acmicpc.net/problem/26302)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Akihise Wada budistički je svečenik iz Yokohame. Ova rečenica na prvu loptu zvuči tipično, međutim Aki je također i vatreni navijač splitskog Hajduka, dugogodi&scaron;nji član Torcide i ljubitelj hrvatske kulture. U splitskim se nogometnim kuloarima &scaron;u&scaron;ka da je i u direktnom kontaktu s Markom Livajom nakon svake utakmice. Ovaj je zadatak inspiriran sljedećim (potpuno autentičnim) nizom poruka koje su razmijenili preko Instagrama.</p>

<p><strong>Marko:</strong> &ldquo;Alo Aki, eli bi mi moga objasnit kako se igra oni va&scaron; sudoku, ja ti to ni&scaron;ta ne razumin. . . &rdquo;</p>

<p><strong>Aki:</strong> &ldquo;Marko-san, rje&scaron;avanje sudoku zagonetki drevna je umjetnost, tome valja posvetiti cijeli život.&rdquo;</p>

<p><strong>Marko:</strong> &ldquo;Ma nisan ja mislija postat neki velemajstor, samo da mogu maznit ove iz 24 sata posli treninga, to moja baba zna ri&scaron;it.&rdquo;</p>

<p><strong>Aki:</strong> &ldquo;Te je dosta napast cross-hatchingom i dobar si.&rdquo;</p>

<p><strong>Marko:</strong> &ldquo;Cross &scaron;ta? Na centar&scaron;utima sam najjači.&rdquo;</p>

<p>Vjerojatno ste shvatili, potrebno je napisati program koji rje&scaron;ava sudoku zagonetku primjenom metode unakrsnog križanja (engl. <em>cross-hatching</em>).</p>

<p>Cilj sudoku zagonetke je postaviti brojeve između 1 i 9 na kvadratnu ploču dimenzija 9 &times; 9 tako da se u svakom retku, stupcu i 3 &times; 3 bloku nalazi svaki od devet brojeva.</p>

<p>Metoda unakrsnog križanja radi na način da najprije izaberemo jedan od devet brojeva te, za svako njegovo pojavljivanje na ploči, prekrižimo odgovarajući redak, stupac i 3 &times; 3 blok. Nakon toga tražimo 3 &times; 3 blok u kojem taj broj jo&scaron; ne pojavljuje te u bloku postoji točno jedno moguće mjesto za taj broj. Tada taj broj zapi&scaron;emo na to mjesto.</p>

<p>Zadana je djelomično ispunjena ploča. Va&scaron; je zadatak ponavljanjem unakrsnog križanja ispravno popuniti &scaron;to vi&scaron;e praznih polja.</p>

<p>Pritom, početni raspored brojeva na ploči može biti ilegalan, odnosno neki se broj može vi&scaron;e puta ponavljati u retku, stupcu ili 3 &times; 3 bloku. Također je moguće da za vrijeme rje&scaron;avanja naiđete na situaciju da u neki blok uopće nije moguće postaviti broj. U oba slučaja potrebno je prijaviti gre&scaron;ku.</p>

### 입력

<p>U svakom od devet redaka ulaza nalazi se točno devet znakova koji predstavljaju sudoku zagonetku. Svi će znakovi biti znamenke od 1 do 9 ili točka (&rsquo;.&rsquo;), koja označava prazno polje.</p>

### 출력

<p>Ako je početni raspored ilegalan ili usred rje&scaron;avanja naiđete na kontradikciju, ispi&scaron;ite riječ GRESKA.</p>

<p>Inače, ispi&scaron;ite ploču u istom obliku u kojem je zadana, s popunjenim poljima čiju je vrijednost moguće odrediti ponavljanjem metode unakrsnog križanja.</p>