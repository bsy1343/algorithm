# [Gold II] Takistusrada - 7186

[문제 링크](https://www.acmicpc.net/problem/7186)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 8, 맞힌 사람: 6, 정답 비율: 30.000%

### 분류

그래프 이론, 그래프 탐색, 기하학, 너비 우선 탐색, 최단 경로, 선분 교차 판정, 물리학

### 문제 설명

<p>Sul on litter, mis v&otilde;ib libiseda m&ouml;&ouml;da j&auml;&auml;d. Kord sekundis saad Sa litrit toksata, kas p&otilde;hjast, l&otilde;unast, idast v&otilde;i l&auml;&auml;nest. Toksamine muudab litri vastavasuunalist kiirust 1 meetri v&otilde;rra sekundis. Alguses on litter punktis koordinaatidega $(0;0)$ ja seisab paigal.</p>

<p>Liikumise n&auml;ide: toksame litrit 5 korda: l&auml;&auml;nest, l&otilde;unast, veel kord l&auml;&auml;nest ja siis kaks korda p&otilde;hjast. Esimese sekundi jooksul liigub litter 1 meetri itta ja j&otilde;uab punkti $(1;0)$. Teise sekundi jooksul liigub litter 1 meetri itta ning 1 meetri p&otilde;hja, j&otilde;udes punkti $(2;1)$. Kolmandal sekundil liigub litter 2 meetrit itta ja 1 meetri p&otilde;hja, j&otilde;udes punkti $(4;2)$. Neljandal sekundil liigub litter 2 meetrit itta, j&otilde;udes punkti $(6;2)$. Viiendal sekundil liigub litter 2 meetrit itta ning &uuml;he meetri l&otilde;unasse, j&otilde;udes punkti $(8;1)$.</p>

<p>Litri liikumine igal sekundil on sirgjooneline, otse algpunktist l&otilde;pp-punkti. Litrit ei pea tingimata toksama, sel juhul j&auml;&auml;vad tema suund ja kiirus samaks. Litri maksimumkiirus nii ida-l&auml;&auml;ne kui p&otilde;hja-l&otilde;una suunas on 7 m/s. Kui litter liigub parajasti n&auml;iteks 7 m/s l&auml;&auml;ne suunas ja 4 m/s p&otilde;hja suunas, siis idast seda enam toksata ei saa, aga teistest suundadest saab.</p>

<p>J&auml;&auml;le on paigutatud ka takistused. Takistusteks on maas pikali asetsevad pulgad, mis &uuml;hendavad t&auml;isarvuliste koordinaatidega punkte ning v&otilde;ivad asetseda kas p&otilde;hja-l&otilde;una v&otilde;i ida-l&auml;&auml;ne suunaliselt.</p>

<p>Eesm&auml;rgiks on liigutada litter v&otilde;imalikult kiiresti etteantud punkti ilma &uuml;htki takistust puudutamata. Lihtsuse m&otilde;ttes eeldame, et nii pulgad kui ka litter on &uuml;hedimensioonilised ning puudutavad &uuml;ksteist siis ja ainult siis, kui nad asuvad t&auml;pselt samas punktis. Puudutamiseks loetakse seda, kui litter l&otilde;petab oma teekonna punktis, kus asub takistus v&otilde;i l&auml;bib oma teel m&otilde;nda sellist punkti.</p>

<p>L&otilde;pp-punktis ei pea litter seisma j&auml;&auml;ma, kuid ta peab vastava sekundi teekonna l&otilde;petama selles punktis.</p>

### 입력

<p>Tekstifaili esimesel real on 3 arvu: sihtpunkti t&auml;isarvulised koordinaadid ning takistuste arv $N$ (maksimaalselt 100). J&auml;rgmisel $N$ real on iga&uuml;hel neli arvu, mis t&auml;histavad takistuseks olevate pulkade algus- ja l&otilde;pp-punktide koordinaate. K&otilde;igi l&auml;hteandmete koordinaadid on t&auml;isarvud $-10 \ldots 10$.</p>

### 출력

<p>Tekstifaili v&auml;ljastada t&auml;pselt &uuml;ks arv: mitme sekundiga on v&otilde;imalik eesm&auml;rgini j&otilde;uda. Kui l&otilde;ppu j&otilde;uda ei saa, v&auml;ljastada $-1$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7186.%E2%80%85Takistusrada/49494020.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7186.%E2%80%85Takistusrada/49494020.png" data-original-src="https://upload.acmicpc.net/7dfc24fe-ce00-4360-85e4-a1188e14b93d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 189px; height: 326px;" /></p>

<p>Lahendus: idast, l&otilde;unast, l&auml;&auml;nest, l&auml;&auml;nest, l&otilde;unast.</p>