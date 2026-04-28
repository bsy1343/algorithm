# [Silver III] EGIPAT - 28389

[문제 링크](https://www.acmicpc.net/problem/28389)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 18, 정답 비율: 78.261%

### 분류

그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>Senzacionalna vijest! U Egiptu je otkrivena nova piramida! Najzanimljiviji dio znanstvenicima su crteži na zidovima piramide. Velik dio unutra&scaron;njih zidova prekriven je nekim čudnim crtežima kocaka i tablica brojeva. Čini se kao da su crteži i tablice nekako povezani, no znanstvenici jo&scaron; nisu sigurni kako. Tako dugo dok oni ne pronađu vezu, najbitniji crtež će biti onaj koji se nalazio u jednom mračnom kutku piramide. Naime, njegova važnost proizlazi iz toga da nam on ukazuje kako su već drevni Egipćani posjedovali robote.</p>

<p>Taj crtež je u obliku tablice znakova i na njemu je prikazano kretanje robota. Pretpostavlja se da je faraon robotu izdavao naredbe u obliku &ldquo;POMAKNI SE DOLJE/GORE/LIJEVO/DESNO&rdquo;, a njegovi pomoćnici su crtali gdje se robot kretao.</p>

<p>Znanstvenici bi sada htjeli iz crteža odrediti naredbe koje je izgovarao faraon pa mole tebe da napi&scaron;e&scaron; program za taj problem. Također, oni znaju da robot nikada nije stao na neko polje dvaput.</p>

### 입력

<p>U prvom se retku nalaze prirodni brojevi $N$ i $M$ ($1 &le; N, M &le; 10$), broj redaka i stupaca tablice.</p>

<p>U sljedećih $N$ redaka nalazi se po $M$ znakova. Jedini znakovi koji će se pojavljivati su &lsquo;P&rsquo;, &lsquo;.&rsquo; i &lsquo;x&rsquo;. &lsquo;P&rsquo; će se pojaviti jednom i označava početnu poziciju robota, &lsquo;.&rsquo; označava slobodno polje, dok &lsquo;x&rsquo; označava polje na koje je robot nekad stao. Samo jedan &lsquo;x&rsquo; će biti susjedan &lsquo;P&rsquo; i najvi&scaron;e dva &lsquo;x&rsquo; će biti susjedna nekom trećem &lsquo;x&rsquo;-u. U tablici će se sigurno pojaviti barem jedan &lsquo;x&rsquo;.</p>

### 출력

<p>Za svaki pomak robota, tj. za svaki &lsquo;x&rsquo; ispi&scaron;i u kojem se smjeru (gore/dolje/lijevo/desno) pomaknuo robot. Svaka naredba treba biti ispisana u svom retku.</p>