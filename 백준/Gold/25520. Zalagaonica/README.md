# [Gold II] Zalagaonica - 25520

[문제 링크](https://www.acmicpc.net/problem/25520)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Dođe Stjepan jednog utorka kod Ricka u Pawn Stars zalagaonicu držeći papirić u ruci na kojem pi&scaron;e jedna riječ i pita Ricka koliko kuna može dobiti za taj papirić. Kaže mu Rick: &ldquo;Za taj papirić, kao i za svaki drugi koji donese&scaron;, može&scaron; dobiti C[x] kuna gdje je x broj različitih slova napisanih na papiriću.&rdquo;</p>

<p>Nakon &scaron;to je to čuo, Stjepan brzo shvati da može zaraditi mnogo novca ako svojim &scaron;karama, koje uvijek nosi sa sobom, razreže papirić na vi&scaron;e dijelova i onda proda svaki dio posebno. Jedino &scaron;to je važno poslije rezanja je da svaki papirić sadržava barem jedno slovo i da svaki papirić sadržava uzastopna slova riječi koja je bila napisana na početku. Od svog tog ushićenja, on nije sposoban izračunati koliko <strong>najvi&scaron;e novaca</strong> može zaraditi pa moli tebe da napi&scaron;e&scaron; program koji to ispisuje.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($1 &le; N &le; 26$), broj različitih slova napisanih na papiriću.</p>

<p>U drugom retku je niz $C$ koji sadrži $N$ prirodnih brojeva manjih od $10^9$.</p>

<p>U trećem retku je riječ $S$ ($1 &le; |S| &le; 10^6$) koja je na početku napisana na papiriću. Riječ će sadržavati samo mala slova engleske abecede.</p>

### 출력

<p>U prvi redak ispi&scaron;i prirodan broj, odgovor na pitanje iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Optimalno je razrezati papirić na pola riječi (abc|bca). Tako se dobiju dva papirića koja će Stjepan odnijeti Ricku.</p>

<p>Opis drugog probnog primjera: Optimalno je razrezati papirić na (a|a|ab|b|ba|a|ab|b|ba|a|a)</p>

<p>Opis trećeg probnog primjera: Optimalno je razrezati papirić na (ab|ab|ab|ab|a).</p>