# [Gold V] SUDOKU - 32005

[문제 링크](https://www.acmicpc.net/problem/32005)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 11, 맞힌 사람: 10, 정답 비율: 21.739%

### 분류

구현

### 문제 설명

<p>Zadana je prazna tablica s N*N redaka i N*N stupaca. Toni M puta upisuje broj u tablicu na način da prvo odabere neko polje u tablici te:</p>

<ul>
	<li>ako je polje prazno, u njega upi&scaron;e broj,</li>
	<li>a ako se tamo već nalazi neki broj, obri&scaron;e postojeći i onda u prazno polje upi&scaron;e broj.</li>
</ul>

<p>Broj koji upisuje je neki broj između 1 i N*N.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/0b4d898e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/0b4d898e.png" data-original-src="https://upload.acmicpc.net/a34acfe2-202e-46de-956c-d468139e5c39/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 201px; float: right;" />Za tablicu kažemo da je ispravna ako se u svakom retku, stupcu i posebnom kvadratu svaki od brojeva nalazi točno jednom i niti jedno polje tablice nije prazno, tj. u svako je upisan neki broj.</p>

<p>Posebne kvadrate definiramo na sljedeći način - prvi posebni kvadrat čine polja iz presjeka prvih N redaka i prvih N stupaca. Drugi posebni kvadrat čine polja iz presjeka prvih N redaka i drugih N stupaca. Treći posebni kvadrat čine polja iz presjeka prvih N redaka i trećih N stupaca, i tako dalje.</p>

<p>Vizualni prikaz pored predstavlja tablicu za N=3. Uoči da su kvadrati s boldanim stranicama s devet polja posebni kvadrati.</p>

<p>Tvoj zadatak je nakon svakog upisa broja ispisati je li tablica ispravna ili nije.</p>

### 입력

<p>U prvom su retku prirodni brojevi N i M (2 &le; N &le; 60, 1 &le; M &le; 1000000), brojevi iz teksta zadatka.</p>

<p>U sljedećih M redaka nalaze se tri prirodna broja A, B i C (1 &le; A, B, C &le; N*N) koji predstavljaju da je Toni u polje koje se nalazi u A-tom retku i B-tom stupcu upisao broj C.</p>

### 출력

<p>U M redaka ispi&scaron;i 1 ako je tablica bila ispravna nakon i-tog upisivanja broja ili 0 ako nije.</p>

### 힌트

<p>Opis drugog probnog primjera: Stanje tablice nakon prvog, drugog i trećeg upisa. Primijetite da je treći upis prebrisao prvi.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/75fd092a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/75fd092a.png" data-original-src="https://upload.acmicpc.net/671790af-6d67-47c0-8041-2c9bb8d2e650/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 199px; height: 200px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/b260815b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/b260815b.png" data-original-src="https://upload.acmicpc.net/9401cdb8-d335-43db-b4fb-e230eaba7c61/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 201px; height: 200px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/733bf07b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/32005.%E2%80%85SUDOKU/733bf07b.png" data-original-src="https://upload.acmicpc.net/b1eb9e63-83e0-4bdc-b906-d10347ccb5fe/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 202px; height: 200px;" /></p>