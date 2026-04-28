# [Gold I] Kometi - 25481

[문제 링크](https://www.acmicpc.net/problem/25481)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>NASA želi postaviti u svemir novu postaju. Za potrebe ovog zadatka, svemir ćemo prikazati kao matricu s $N \times M$ polja raspoređenih u $N$ redaka i $M$ stupaca. Postaja je <strong>kvadratnog</strong> oblika veličine $K$ redaka i $K$ stupaca. Postaju treba postaviti tako da joj stranice budu <strong>paralelne</strong> sa stranicama svemira te da u potpunosti bude <strong>unutar njega</strong>.</p>

<p>U svemiru postoje kometi od kojih se svaki <strong>kreće</strong> u jednom od četiri smjera: gore, dolje, lijevo i desno. Na svakom polju matrice može se na početku nalaziti najvi&scaron;e jedan komet. Svaki komet se kreće brzinom od <strong>jednog polja u sekundi</strong>. Kometi nikada neće promijeniti smjer kretanja.</p>

<p>Ako se komet u nekom trenutku nađe na polju kojeg zauzima postaja, kažemo da je taj komet udario u postaju. Ako se komet u nekom trenutku nađe izvan matrice, on nestane. U nekom trenutku, nakon početnog, vi&scaron;e kometa smije biti na istom polju te se oni mimoilaze.</p>

<p>Postaju ne možemo postaviti u svemir na način da postoji polje na kojem su istovremeno i postaja i komet. Garantirano je da će se postaja uvijek moći postaviti barem na jednu poziciju. <strong>Poziciju</strong> postaje definiramo <strong>poljem</strong> koje zauzima <strong>gornji lijevi kut postaje</strong>.</p>

<p>Kako bi NASA mogla izabrati najbolju poziciju, zanima ju gdje treba postaviti postaju tako da komet prvi put u nju udari &scaron;to je kasnije moguće (možda nikada). Ako takva pozicija nije jednoznačna, uzimamo ono polje koje ima najmanji indeks retka i najmanji indeks stupca.</p>

### 입력

<p>U prvom su retku dva prirodna broja $N$ i $M$ ($1 &le; N, M &le; 1000$) iz teksta zadatka.</p>

<p>U drugom je retku prirodan broj $K$ ($1 &le; K &le; \min{(N, M)}$) iz teksta zadatka.</p>

<p>U svakom od sljedećih $N$ redaka je po $M$ znakova koji predstavljaju početni izgled matrice. Na svakom polju nalazit će se jedan od znakova: &lsquo;<code>.</code>&rsquo;, &lsquo;<code>U</code>&rsquo;, &lsquo;<code>D</code>&rsquo;, &lsquo;<code>L</code>&rsquo;, &lsquo;<code>R</code>&rsquo;. Znak &lsquo;<code>.</code>&rsquo; označava da se na tom polju na početku ne nalazi komet, a ostali znakovi označavaju da se na tom polju nalazi komet. Znak &lsquo;<code>U</code>&rsquo; označava komet koji je usmjeren prema gore, &lsquo;<code>D</code>&rsquo; označava komet usmjeren prema dolje, &lsquo;<code>L</code>&rsquo; prema lijevo i &lsquo;<code>R</code>&rsquo; prema desno.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i dva prirodna broja odvojena razmakom koji predstavljaju redak i stupac polja matrice na koje treba postaviti gornji lijevi kut postaje.</p>

### 힌트

<p>Opis prvog probnog primjera: Postaju postavljenu na polje u trećem retku i drugom stupcu nikada neće udariti komet.</p>

<p>Opis trećeg probnog primjera: Ako postaju postavimo na polje u drugom retku i trećem stupcu ili na polje u trećem retku i drugom stupcu, prvi komet će u nju udariti nakon tri sekunde. Za sva ostala polja na koja možemo postaviti postaju je to vrijeme kraće. Kako tražimo najgornje najlijevije polje, odabrat ćemo polje u drugom retku i trećem stupcu.</p>