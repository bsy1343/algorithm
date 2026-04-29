# [Platinum II] Gladni Gargamel - 33214

[문제 링크](https://www.acmicpc.net/problem/33214)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 수학, 확률론

### 문제 설명

<p>Čarobnjak Gargamel jako je gladan te se hranu nada pronaći unutar matrice s $N$ redaka i $M$ stupaca u kojoj je svako polje crno ili bijelo.</p>

<p>Gargamel kreće u gornjem lijevom kutu matrice te želi doći do donjeg desnog kuta u kojem se nalaze ćevapi.</p>

<p>U svakom koraku Gargamel se mora pomaknuti na neko susjedno polje u jednom od četiri smjera: gore, dolje, lijevo ili desno. Ako je polje na koje se pomakne bijelo događa se sljedeće: od svih bijelih polja u matrici, jedno se izabire nasumično sa jednakom vjerojatnošću te se Gargamel teleportira na njega (moguće da bude odabrano i polje na kojem se trenutno nalazi).</p>

<p>Nakon toga proces se nastavlja sa idućim korakom. Dakle, u svakom koraku Gargamel se prvo pomakne na susjedno polje, a nakon toga se događa maksimalno jedna teleportacija (ako je polje bijelo).</p>

<p>Gargamelova potraga za hranom završava u trenutku kada dođe do donjeg desnog kuta matrice.</p>

<p>Gargamel vas moli da mu pomognete odrediti očekivani broj koraka koji će napraviti dok dođe do donjeg desnog kuta matrice (u slučaju da se kreće optimalno).</p>

<p>Gornje lijevo te donje desno polje su uvijek crna.</p>

### 입력

<p>U prvom je retku prirodan broj $T$ ($1 ≤ T ≤ 1000$), broj scenarija na koje trebate odgovoriti.</p>

<p>Unutar jednog scenarija u prvom retku nalaze se prirodni brojevi $N$ i $M$ ($1 ≤ N, M ≤ 1000$). U sljedećih $N$ redaka nalazi se $M$ znakova '<code>C</code>' - crno polje ili '<code>B</code>' - bijelo polje koji opisuju redak matrice.</p>

<p>Ukupan broj polja kroz sve scenarije neće biti veći od $10^6$.</p>

### 출력

<p>Za svaki scenarij ispipišite očekivanu vrijednost u obliku potpuno skraćenog razlomka.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera: U prvom scenariju sva polja su crna pa je optimalno direktno krenuti prema donjeg desnom polju. U drugom scenariju postoje dva bijela polja, no na kojem god završili nakon teleportacije, možemo u idućem koraku doći do donjeg desnog polja.</p>