# [Gold II] Hilbert - 25474

[문제 링크](https://www.acmicpc.net/problem/25474)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 매개 변수 탐색

### 문제 설명

<p>Priprema se jedan od najvećih događaja u svemiru. Riječ je, pogodili ste, o intergalaktičkom natjecanju u plesu parova između mu&scaron;ko-ženskih blizanaca.</p>

<p>Natjecanje se odvija na konzervativnom rubu svemira pa su mu&scaron;karci iz svakog para blizanaca smje&scaron;teni u jedan hotel, a žene u drugi. Kako je riječ o natjecanju na razini cijelog svemira, natjecatelja naravno ima <strong>beskonačno</strong>.</p>

<p>Hoteli o kojima je riječ su takozvani <em>Hilbertovi</em> hoteli, odnosno hoteli s beskonačno katova. Katovi su označeni prirodnim brojevima počev&scaron;i od jedan. Na svakom katu je po jedna soba u kojoj se nalazi <strong>točno jedan</strong> gost. (<em>Digresija: Hilbertovi hoteli su praktični za beskonačno gostiju jer kada dođe novi gost možemo samo sve pomaknuti jedan kat iznad, a njega smjestiti na prvi kat.</em>)</p>

<p>Antonija i Antonije su jedan takav par blizanaca. Antonija se nalazi na katu s oznakom $X$ u ženskom hotelu, a Antonije u mu&scaron;kom hotelu na katu s oznakom $Y$.</p>

<p>Da tijekom dolaska na večeru ne bi nastao stampedo kao pro&scaron;le godine, svakom paru blizanaca pridružuje se <strong>prioritetni broj</strong> koji je jednak <strong>umno&scaron;ku oznaka</strong> pripadnih katova. Primjerice, za Antoniju i Antonija je to broj $X \times Y$.</p>

<p><strong>Antoniju i Antonija sada zanima sljedeće:</strong> Koliko najvi&scaron;e moguće parova blizanaca može postojati sa <strong>strogo manjim</strong> prioritetnim brojem od njihovog?</p>

<p>U zadatku će biti zadano <strong>Q nezavisnih</strong> scenarija. Za svaki ispi&scaron;i odgovor na traženo pitanje.</p>

<p><strong>Napomena:</strong> Pomno prouči sekciju bodovanje za ograničenja te opis prvog probnog primjera za dodatna poja&scaron;njenja.</p>

### 입력

<p>U prvom je retku prirodan broj $Q$, broj scenarija iz teksta zadatka.</p>

<p>U sljedećih $Q$ redaka nalaze se prirodni brojevi $X$ i $Y$ iz teksta zadatka.</p>

### 출력

<p>Ispi&scaron;i $Q$ redaka. U svaki redak ispi&scaron;i odgovor za odgovarajući scenarij.</p>

### 힌트

<p>Opis prvog probnog primjera: U prvom scenariju par blizanaca na katovima $(2, 1)$ jedini može imati prioritetni broj strogo manji od $4$.</p>

<p>U drugom scenariju mogu postojati blizanci smje&scaron;teni na katovima $(2, 2)$ i $(3, 1)$.</p>

<p>U trećem scenariju makar je prioritetni broj Antonije i Antonija opet $4$ sada mogu postojati blizanci smje&scaron;teni na katovima $(3, 1)$ i $(1, 3)$ sa strogo manjim prioritetnim brojem.</p>