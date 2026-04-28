# [Gold II] Joško - 25145

[문제 링크](https://www.acmicpc.net/problem/25145)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 3, 맞힌 사람: 3, 정답 비율: 23.077%

### 분류

값 / 좌표 압축, 다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>Mladi Jo&scaron;ko igra novu igricu. U igrici on kontrolira čovječuljka koji mora &scaron;to prije doći od početka do kraja nivoa. Nivo koji Jo&scaron;ko prelazi izgleda ovako:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25145.%E2%80%85Jo%C5%A1ko/e2ef10a0.png" data-original-src="https://upload.acmicpc.net/925aac87-a13a-4c86-9bad-4889ec3a9a33/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 104px;" /></p>

<p>Dakle, on mora doći od početka do kraja, gdje je početak najljevija pozicija na najvi&scaron;oj dužini, a kraj je najdesnija pozicija na najnižoj dužini. Jo&scaron;ko se po dužinama kreće slijeva na desno. U bilo kojem trenutku Jo&scaron;ko može odlučiti &ldquo;propasti&rdquo; kroz trenutnu dužinu sve dok se ne zaustavi na prvoj dužini ispod njega. Taj postupak može ponoviti koliko god puta želi jer na njega ne tro&scaron;i vrijeme! Zato &scaron;to su dužine različito obojene nije uvijek jednaka brzina kretanja po svim dužinama! Po nekim dužinama Jo&scaron;ko se kreće sporije, a po nekima brže.</p>

<p>Jedan način, ne nužno najbolji, obilaženja gore navedenog primjera izgledao bi otprilike ovako.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25145.%E2%80%85Jo%C5%A1ko/361c840b.png" data-original-src="https://upload.acmicpc.net/05cdc768-4f0b-45ac-907d-90aeea4ca33b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 331px; height: 113px;" /></p>

<p>Tvoj je zadatak pomoći Jo&scaron;ku i pronaći najkraće vrijeme potrebno kako bi Jo&scaron;ko doveo čovječuljka od početka do kraja, koristeći gore navedena pravila kretanja. Napomena: Rje&scaron;enje će uvijek postojati.</p>

### 입력

<p>U prvom redu nalaze se dva prirodna broja N i M (1 &le; N &le; 100, 1 &le; M &le; 100 000) koji označavaju broj razina (dužina) i horizontalnu (vodoravnu) udaljenost najljevije točke neke dužine i najdesnije točke neke dužine.</p>

<p>U sljedećih N redova nalaze se po tri cijela broja L, D, T (0 &le; L &le; D &le; M, 1 &le; T &le; 10 000) koji predstavljaju jednu dužinu, poretkom od najvi&scaron;e do najniže razine. Brojevi L i D predstavljaju horizontalnu (vodoravnu) udaljenost lijeve i desne točke dužine od lijeve točke najljevije dužine. Broj T predstavlja vrijeme potrebno za prelazak jedinične duljine ove dužine.</p>

<p>Npr., ukoliko je T = 3, utoliko će vrijeme potrebno za prolaz dužine duljine 4 biti jednako 3*4 = 12.</p>

### 출력

<p>U prvi red ispi&scaron;i najmanji broj jedinica vremena koje će Jo&scaron;kovom čovječuljku biti potrebne kako bi do&scaron;ao od početka do kraja nivoa.</p>

### 힌트

<p>Opis prvog test podatka: Približan primjer onome sa slike u tekstu zadatka. Minimalno rje&scaron;enje se postiže na sljedećem prolazu: 0 -&gt; 5 na prvoj razini (5 * 3 = 15 jedinica vremena), prelazak na razinu ispod, 5 -&gt; 6 na drugoj razini (1 * 4 = 4 jedinica vremena), prelazak na posljednju razinu, 6 -&gt; 10 (4*3=12 jedinica vremena). Ukupno je to 15+4+12=31 jedinica vremena.</p>

<p>Opis drugog test podatka: Primjer gdje vrijedi prvo ograničenje iz sekcije bodovanja.</p>

<p>Opis trećeg test podatka: Primjer gdje vrijedi drugo ograničenje iz sekcije bodovanja.</p>