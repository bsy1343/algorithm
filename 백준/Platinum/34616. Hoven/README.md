# [Platinum III] Hoven - 34616

[문제 링크](https://www.acmicpc.net/problem/34616)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 덱, 덱을 이용한 구간 최댓값 트릭, 덱을 이용한 다이나믹 프로그래밍, 매개 변수 탐색, 역추적, 이분 탐색, 자료 구조

### 문제 설명

<p><em>"U srcu Veldhovena pulsira neumorni ritam inovacija, potičući svakoga da se otisne na put otkrića i ostvari svoje najveće ambicije."</em></p>

<p>Grad Veldhoven možemo prikazati kao $n$ kuća poredanih u niz. Kuće označavamo brojevima od $1$ do $n$, a udaljenost kuća $i$ i $j$ iznosi $|i − j|$.</p>

<p>Mr. Malnar, gradonačelnik Veldhovena, odlučio je ispred nekih kuća posaditi cvijeće. Za svaku kuću $i$ znamo cijenu $c_i$ sađenja cvijeća ispred te kuće u eurima. <em>Razočaranost</em> pojedine kuće definiramo kao njenu udaljenost do najbliže kuće ispred koje je posađeno cvijeće. Razočaranost cijelog grada definiramo kao maksimalnu razočaranost svih kuća.</p>

<p>Mr. Malnar raspolaže budžetom od $k$ eura. Budžet će biti takav da će on moći priuštiti sađenje cvijeća ispred barem jedne kuće. Mr. Malnar sada želi znati kolika je minimalna razočaranost grada koju može postići ako optimalno odabere kuće ispred kojih će posaditi cvijeće. Dodatno, zanima ga ispred kojih kuća treba posaditi cvijeće kako bi postigao minimalnu razočaranost.</p>

### 입력

<p>U prvom su retku brojevi $n$ i $k$ ($1 ≤ n ≤ 10^6$, $1 ≤ k ≤ 10^9$), broj kuća u Veldhovenu i budžet kojim Mr. Malnar raspolaže.</p>

<p>U drugom se retku nalazi $n$ brojeva $c_1, c_2, \dots , c_n$ ($1 ≤ c_i ≤ 10^9$), cijene sađenja cvijeća. Cvijeće će se uvijek moći posaditi ispred barem jedne kuće.</p>

### 출력

<p>U prvi redak ispišite minimalnu razočaranost grada.</p>

<p>U drugi redak ispišite broj odabranih kuća. Označimo taj broj s $q$.</p>

<p>U treći redak ispišite $q$ brojeva $b_1, b_2, \dots , b_q$ ($1 ≤ b_i ≤ n$), indekse odabranih kuća. Indeksi moraju biti međusobno različiti. Poredak indeksa u izlazu nije bitan.</p>

<p>Ako postoji više različitih odabira kuća, ispišite bilo koje.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera: Ako Mr. Malnar posadi cvijeće ispred $3$. i $7$. kuće, potrošit će točno $3$ eura. Razočaranosti kuća tada su redom $2$, $1$, $0$, $1$, $2$, $1$, $0$, $1$, $2$ pa razočaranost grada iznosi $2$.</p>

<p>Pojašnjenje drugog probnog primjera: Mr. Malnar može istu razočaranost postići i ako posadi cvijeće ispred $2$. i $4$. kuće.</p>

<p>Pojašnjenje trećeg probnog primjera: Još jedno valjano rješenje je posaditi cvijeće ispred $1$. i $3$. kuće. Tada je razočaranost $7$. kuće jednako $4$.</p>