# [Platinum IV] Lektire - 14093

[문제 링크](https://www.acmicpc.net/problem/14093)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Unatoč tome &scaron;to je uzoran učenik, Mirko je uvijek imao problema s čitanjem lektira. Ove godine odlučio je tome stati na kraj. Nabavio je svih N knjiga koje profesorica može odabrati za lektire, označene prirodnim brojevima od 1 do N. Zatim ih je sve smjestio u jedan toranj od najmanje do najveće, tj. knjiga s oznakom 1 je na vrhu tornja.</p>

<p>Svaki put kada mu profesorica zada za lektiru knjigu L<sub>i</sub>, Mirko je mora izvući iz tornja kako bi je pročitao, &scaron;to obavlja tako da podigne sve knjige koje se nalaze iznad knjige L<sub>i</sub>, izvuče knjigu L<sub>i</sub>, te spusti podignute knjige na toranj. Nakon &scaron;to Mirko pročita knjigu L<sub>i</sub>, vraća je na vrh tornja. Knjigu L<sub>i </sub>također smatramo podignutom.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14093.%E2%80%85Lektire/e6596e05.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14093/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.35.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:151px; width:350px" /><br />
Mirko čita lektiru s oznakom 3</p>

<p>Na primjer, pogledajmo toranj na slici. Ako je prva lektira knjiga označena brojem 3, Mirko će podići tri knjige označene brojevima 1, 2 i 3. Zatim će spustiti knjige označene brojevima 1 i 2. Nakon &scaron;to pročita knjigu označenu brojem 3, stavit će je na vrh tornja.</p>

<p>Poznat je niz lektira L koje će profesorica zadati. Izračunajte koliko će knjiga Mirko podići ove &scaron;kolske godine kako bi pročitao sve lektire.&nbsp;</p>

### 입력

<p>U prvom retku nalaze se prirodni brojevi N i Q (1 &le; N, Q &le; 100 000), broj knjiga i broj lektira.</p>

<p>U drugom retku nalazi se niz od Q prirodnih brojeva L (1 &le; L<sub>i </sub>&le; N), zadane lektire.</p>

<p>Napomena: Moguće je da neka knjiga nikad ne bude odabrana za lektiru. Ujedno je moguće da neka knjiga bude odabrana vi&scaron;e puta, u kojem slučaju je Mirko mora ponovo pročitati.&nbsp;</p>

### 출력

<p>U prvom retku ispi&scaron;ite točno jedan prirodan broj, ukupan broj knjiga koje će Mirko podići.&nbsp;</p>

### 힌트

<p>(1,2,3,4) -&gt; (1,2,3,4), podignuta je samo knjiga 1<br />
(1,2,3,4) -&gt; (3,1,2,4), podignute su knjige 1, 2 i 3<br />
(3,1,2,4) -&gt; (2,3,1,4), podignute su knjige 1, 2 i 3<br />
Ukupno je Mirko podigao 1+3+3=7 knjiga.&nbsp;</p>