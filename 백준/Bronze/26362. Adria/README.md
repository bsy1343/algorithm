# [Bronze II] Adria - 26362

[문제 링크](https://www.acmicpc.net/problem/26362)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 45, 맞힌 사람: 34, 정답 비율: 91.892%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Josip i Nikola su online igrali tenis. Njihov tenis je igra u kojoj igrači osvajaju gemove, a onaj koji prvi osvoji G gemova osvojio je set. Nikola i Josip su do sada odigrali N online setova.</p>

<p>Sada analiziraju odigrane setove te ih zanima odgovor na sljedeća dva pitanja:</p>

<ol>
	<li>Koliko je gemova u prvom odigranom setu osvojio Nikola?</li>
	<li>Koliko je, od N odigranih setova, osvojio Josip?</li>
</ol>

<p>Sada su odlučili zaigrati tenis i u stvarnosti. Kako Nikola nema kondicije, odlučio je u stvarnosti broj G iz online svijeta zamijeniti novim brojem G1 koji je strogo manji od G. Prvo je analizirao koliko bi osvojio setova u online igri da se i tamo osvajao set za G1 osvojenih gemova te onda odabrao onaj G1 za koji bi osvojio najvi&scaron;e setova. U slučaju da novi G1 nije jedinstven, Nikola će odabrati najmanji mogući. Gemovi koji bi se u online igri u setu odigrali nakon &scaron;to bi Nikola osvojio G1 gemova se zanemaruju i prelazi se na novi set.</p>

<ol start="3">
	<li>Koji je novi broj G1 odabrao Nikola?</li>
</ol>

<p>Napi&scaron;i program koji će za zadane ulazne podatke ispisati odgovore na zadana pitanja.</p>

### 입력

<p>U prvom je retku prirodan broj G (1 &le; G &le; 20), broj iz teksta zadatka.</p>

<p>U drugom je retku prirodan broj N (1 &le; N &le; 100), broj iz teksta zadatka.</p>

<p>Slijedi opis N odigranih setova oblika:</p>

<ul>
	<li>u prvom je retku prirodan broj X, broj odigranih gemova u i-tom setu</li>
	<li>u sljedećih X redaka nalazi se ili prirodan broj jedan koji označava da je Nikola osvojio i-ti odigrani gem ili broj dva koji označava da je Josip osvojio taj gem.</li>
</ul>

### 출력

<p>U prvi redak ispi&scaron;i cijeli broj, odgovor na prvo pitanje iz zadatka.</p>

<p>U drugi redak ispi&scaron;i cijeli broj, odgovor na drugo pitanje iz zadatka.</p>

<p>U treći redak ispi&scaron;i prirodan broj, odgovor na treće pitanje iz zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Tijek igre po setovima prikazan je u tablici. Rezultati su oblika &bdquo;broj_gemova_Nikola:broj_gemova_Josip&ldquo;:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/26362.%E2%80%85Adria/07891723.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/26362.%E2%80%85Adria/07891723.png" data-original-src="https://upload.acmicpc.net/ed4a9455-7891-4b77-a1be-3eed521bcecf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 665px; height: 66px;" /></p>

<p>U prvom setu rezultat je bio 6:3 za Nikolu, u drugom 6:5 za Josipa, a u trećem 6:1 za Nikolu. Nikola je za G1 odabrao vrijednost tri zato &scaron;to bi, da se tijekom online igre osvajao set nakon tri osvojena gema, osvojio sva tri seta. Sva tri seta bi osvojio i za G1=4 dok bi za G1=1 i G1=2 i G1=5 osvojio po dva seta.</p>