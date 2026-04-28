# [Gold IV] Kalendar - 14158

[문제 링크](https://www.acmicpc.net/problem/14158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 10, 정답: 10, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Kalendar neke nepoznate godine je zapisan u velikoj matrici znakova. Svaki element matrice je ili veliko slovo engleske abecede ili znamenka ili točka. Kalendar je napravljen na sljedeći način:</p>

<ul>
	<li>Svaki mjesec se nalazi u matrici s točno 8 redaka i 17 stupaca.
	<ul>
		<li>Ime mjeseca (na engleskom jeziku, velikim slovima) je zapisano u prvom retku počev&scaron;i od drugog stupca.</li>
		<li>Svi dani u mjesecu su zapisani u 6 grupa po dva stupca visine 7 redaka, izme&ntilde;u susjednih grupa se nalazi jedan prazan stupac (odnosno popunjen točkama).</li>
		<li>Svaka grupa sadrži uzastopne brojeve dana u jednom tjednu.</li>
		<li>Broj se sastoji od jedne ili dvije znamenke, ako je broj jednoznamenkast onda se nalazi se u desnom stupcu.
		<ul>
			<li>Prvi redak odgovara ponedjeljku.</li>
			<li>Prva grupa stupaca mora sadržavati barem jedan broj dok peta i &scaron;esta grupa stupaca mogu biti prazne (na primjer ako mjesec sadrži 28 dana i počinje ponedjeljkom).</li>
		</ul>
		</li>
	</ul>
	</li>
	<li>Mjeseci godine su podjeljeni u tri reda, odvojenih jedim praznim retkom. U svakom retku se nalaze četiri uzastopna mjeseca odvojena jednim praznim stupcem.</li>
	<li>Na sva četiri ruba kalendara se nalazi prazna margina od jednog retka odnosno stupca.&nbsp;</li>
</ul>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14158.%E2%80%85Kalendar/558eb2ec.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14158/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%204.10.22.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:135px; width:416px" /></p>

<p>Dakle cijeli kalendar se sastoji od točno 28 redaka i 73 stupca. Gornja slika prikazuje donji desni rub kalendara za 2002. godinu.</p>

<p>Arheolozi su prona&scaron;li djelić pravokutnog oblika koji je izrezan iz jednog takvog kalendara, tako&ntilde;er znaju da taj fragment nije rotiran niti na bilo koji drugi način izmjenjen. Napi&scaron;ite program koji će odrediti sve moguće godine izme&ntilde;u 1900 i 2100 uključivo iz kojeg je mogao biti izrezan taj fragment.</p>

<p>Engleska imena mjeseci su redom: JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER.</p>

<p>Godina je prijestupna ako je djeljiva sa 400, ili ako je djeljiva sa 4 i nije djeljiva sa 100. Prvi siječanj 1900-te godine je bio ponedjeljak.</p>

### 입력

<p>U prvom retku nalaze se dva prirodna broja N i M (2 &le; N, M &le; 10) &ndash; broj redaka i stupaca u zadanom fragmentu. U svakom od sljedećih N redova nalazi se po M znakova &ndash; jedan redak fragmenta.&nbsp;</p>

### 출력

<p>Potrebno je ispisati, uzlaznim redosljedom, sve tražene godine, svaku u svoj redak.</p>

<p>Test podaci će biti takvi da će uvijek postojati barem jedno rje&scaron;enje.&nbsp;</p>