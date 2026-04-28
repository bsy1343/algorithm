# [Gold IV] HODOŠAN - 28390

[문제 링크](https://www.acmicpc.net/problem/28390)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 11, 맞힌 사람: 11, 정답 비율: 42.308%

### 분류

다이나믹 프로그래밍, 스위핑

### 문제 설명

<p>Ima jedan mali krug velikih ljudi koji je nedavno proslavio ulazak u bračne vode jednoga od nas. Dio tog kruga i proslave bile su Martina i Paula koje su koristile svaku priliku za ples. Večer ćemo pamtiti i po bendu Romulus koji je tijekom proslave odsvirao ukupno $N$ pjesama. Svaka je pjesma pripadala nekoj od $K$ različitih vrsta glazbe.</p>

<p>Iako vole ples, Martina i Paula su plesale samo ako su obje znale plesati na vrstu glazbe kojoj pripada pjesma koju je trenutno svirao bend. Ako barem jedna od njih nije znala plesati na vrstu glazbe koja trenutno svira, prestale bi plesati i malo odmorile.</p>

<p>Ako znamo na kojih $M$ vrste glazbe zna plesati Martina, a na kojih $P$ Paula te kojoj vrsti glazbe pripada svaka od $N$ odsviranih pjesama redom kojim ih je bend svirao, ispi&scaron;i odgovore na sljedeća pitanja:</p>

<ol>
	<li>Uz koliko od $N$ odsviranih pjesama su plesale Martina i Paula?</li>
	<li>Koliki je bio najdulji niz pjesama uz koje su njih dvije plesale bez prestanka?</li>
</ol>

<p>Sljedeće je jutro Ana, novi član na&scaron;eg kruga, Martini i Pauli počela postavljati pitanja sljedećeg oblika: &bdquo;Prijateljice $O$, da si sinoć znala plesati na $X$-tu vrstu glazbe, koliki bi bio najdulji niz pjesama uz koje bi vas dvije plesale bez prestanka?&ldquo;</p>

<p>Ako je Ana postavila $Q$ pitanja, ispi&scaron;i tražene odgovore.</p>

### 입력

<p>U prvom retku su prirodni brojevi $N$, $K$, $M$ ($1 &le; M &le; K$) i $P$ ($1 &le; P &le; K$), brojevi iz teksta zadatka.</p>

<p>U drugom je retku niz od $M$ prirodnih brojeva $M_i$ ($1 &le; M_i &le; K$), oznake vrste glazbe na koju Martina zna plesati.</p>

<p>U trećem je retku niz od $P$ prirodnih brojeva $P_i$ ($1 &le; P_i &le; K$), oznake vrste glazbe na koju Paula zna plesati.</p>

<p>U četvrtom je retku niz od $N$ prirodnih brojeva $R_i$ ($1 &le; R_i &le; K$), oznaka vrste glazbe kojoj pripada $i$-ta pjesma koju je bend Romulus odsvirao na proslavi.</p>

<p>U petom je retku cijeli broj $Q$, broj Aninih upita iz teksta zadatka.</p>

<p>U sljedećih $Q$ redaka nalazi se znak $O$ ($O$ je &bdquo;M&ldquo; i ili &bdquo;P&ldquo;) i prirodan broj $X$ ($1 &le; X &le; K$), podaci iz teksta Aninog pitanja.</p>

<p>Napomena: za dodatna ograničenja obratite pozornost na sekciju bodovanje!</p>

### 출력

<p>U prvi redak ispi&scaron;i odgovor na prvo pitanje iz teksta zadatka.</p>

<p>U drugi redak ispi&scaron;i odgovor na drugo pitanje iz teksta zadatka.</p>

<p>U sljedećih $Q$ redaka ispi&scaron;i odgovor na $Q_i$-to Anino pitanje.</p>

### 힌트

<p>Opis prvog probnog primjera: Martina zna plesati na prvu i drugu, a Paula na prvu i treću vrstu glazbe. Na svadbi su plesale uz tri pjesme: prvu, petu i osmu odsviranu pjesmu. Zato je duljina najduljeg niza pjesama uz koje su plesale jednaka jedan. Kad bi Martina znala plesati uz treću vrstu glazbe, ona i Paula bi mogle plesati uz četiri uzastopne pjesme &ndash; od pete do osme. Isto tako, kad bi Paula znala plesati na drugu vrstu glazbe, mogle bi plesati uz pet uzastopnih pjesmi. Na svadbi nije bila odsvirana nijedna pjesma četvrte vrste tako da su odgovori na posljednja dva Anina pitanja jednaki jedan.</p>