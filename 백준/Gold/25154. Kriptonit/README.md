# [Gold IV] Kriptonit - 25154

[문제 링크](https://www.acmicpc.net/problem/25154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Malog Vedrana oteli su izvanzemaljci i zarobili ga u labirint. Labirint možemo zamisliti kao tablicu s N redaka i M stupaca. Tuđinci su Vedrana spustili na gornje lijevo polje s oznakom (1,1) te mu dozvolili kretanje po labirintu u dva smjera: dolje i desno.</p>

<p>Labirint je poseban po tome &scaron;to se na svakom polju (x,y) nalazi P[x][y] kilograma mistične tvari. Ta tvar djeluje na čovjeka i oduzima mu energiju.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25154.%E2%80%85Kriptonit/9344590d.png" data-original-src="https://upload.acmicpc.net/bcdcc713-74c2-48be-8abd-08179bcbecf1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 114px; height: 139px; float: right;" />Svaki put kada Vedran stupi na neko polje (x,y), na njega djeluje sva mistična tvar koja se nalazi u poljima do kojih je moguće doći u K ili manje koraka od polja (x,y) krećući se u osam smjerova: gorelijevo, gore, gore-desno, lijevo, desno, dolje-lijevo, dolje, dolje-desno. Jedan kilogram mistične tvari Vedranu oduzme jednu jedinicu energije.</p>

<p>Npr. ako Vedran stane na polje (2, 3) i ako je K=1, tada će na njega djelovati tvar iz polja koja su na slici osjenčana.</p>

<p>Vedran je u velikoj panici, želi pobjeći i raditi JHIO zadatke i moli tebe da mu pronađe&scaron; i ispi&scaron;e&scaron; put koji vodi od polja (1,1) do nekog polja na desnom rubu (zadnji stupac) ili donjem rubu (zadnji redak) tablice tako da mu mistična tvar tijekom putovanja oduzme &scaron;to manje energije.</p>

### 입력

<p>U prvom retku nalaze se prirodni brojevi N, M i K (3 &le; N, M &le; 1000, 0 &le; K &le; min(N, M)).</p>

<p>U sljedećih N redaka nalazi se po M brojeva P[i][j] (0 &le; P[i][j] &le; 1 000 000 000), broj kilograma mistične tvari na polju (i,j) u tablici.</p>

### 출력

<p>Ako se put sastoji od A polja, u prvom retku ispi&scaron;i broj A i zatim u A redaka ispi&scaron;i oznake polja (redak i stupac) kroz koja će Vedran prolaziti na putu koji si mu odredio.</p>

### 힌트

<p>Opis prvog primjera: Na polju (1,1) Vedran je izgubio 23 jedinice energije, na (2,1) 33 jedinice, na (3,1) 22, na (3,2) 37, na (3,3) 38, na (4,3) 28 i na (5,3) 13 jedinica energije. Na ovom putu je izgubio 194 jedinica energije &scaron;to je najmanje &scaron;to je mogao izgubiti na putu prema rubu. S ovim putem bi dobili sve bodove za taj test podatak.</p>

<p>Opis drugog primjera: Za dani ispis, dobio bi 0.96*T, gdje je T broj bodova za taj test primjer jer na tom putu mistična tvar Vedranu oduzme 6 jedinica energije. Najbolje bi bilo da je Vedran i&scaron;ao (1,1)- &gt;(1,2)-&gt;(2,2)-&gt;(3,2). U tom slučaju mistična tvar bi Vedranu oduzela 5 jedinica energije.</p>