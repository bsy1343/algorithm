# [Gold II] ZEMLJA - 32006

[문제 링크](https://www.acmicpc.net/problem/32006)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

자료 구조, 기하학, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Farmer Lasagna je kupio zemlji&scaron;te svojih snova na kojem će prebivati njegove krave i na kojima će uzgajati svoje kukuruze. Svi znamo da krave vole jesti kukuruze i da će uni&scaron;titi sve usjeve do kojih mogu doći. Stoga je Lasagna odlučio izgraditi dugačke zidove koji su dovoljno visoki i čvrsti da njegove krave ne mogu preći preko njih. Kako je Lasagna zauzet nastupom u &Scaron;vedskoj, pozvao te je da mu pomogne&scaron; oko organizacije njegovog zemlji&scaron;ta.</p>

<p>Njegovo zemlji&scaron;te možemo zamisliti kao koordinatnu ravninu, a svaki zid kao pravac na toj ravnini. Najavio je da će će&scaron; dobiti Q upita, koji mogu biti jedan od dvije različite vrste:</p>

<ol>
	<li>Izgradi zid zadan formulom ax + by = c, tj. pravac koji će činiti sve točke (x, y) koje zadovoljavaju tu jednadžbu. Lasagna garantira da će a i b biti cijeli brojevi od -1 do 1.</li>
	<li>Promatrajući do sada postavljene zidove, ako je krava u točki (x1, y1) i usjev kukuruza je zasađen u točki (x2, y2), može li ta krava doći do točke (x2, y2) i uni&scaron;titi usjev?</li>
</ol>

<p>Može&scaron; li mu pomoći i odgovoriti na sve njegove upite?</p>

### 입력

<p>U prvom je retku prirodan broj Q (1 &le; Q &le; 300 000), broj upita.</p>

<p>U idućih Q redaka će biti u jednom od dva moguća formata:</p>

<ol>
	<li>&bdquo;1 a b c&ldquo;, gdje a, b i c (-1 &le; a, b &le; 1, a &ne; 0 ili b &ne; 0, -3∙10<sup>8</sup> &le; c &le; 3∙10<sup>8</sup>) cijeli brojevi koji redom predstavljaju brojeve navedene u tekstu iznad. U test primjerima je zagarantirano da u trenutku izgradnje nema zida koji se preklapa s novim zidom u svim točkama.</li>
	<li>&bdquo;2 x1 y1 x2 y2&ldquo;, gdje x1, y1, x2 i y2 (-10<sup>8</sup> &le; x1, y1, x2, y2 &le; 10<sup>8</sup>) su redom cjelobrojne koordinate pozicije krave (x1, y1) i usjeva (x2, y2). U testnim podacima će vrijediti da u tom trenutku navedene točke neće ležati na jednom od zidova i da su (x1, y1) i (x2, y2) različite točke.</li>
</ol>

### 출력

<p>Za svaki upit druge vrste, redom u zaseban redak, ispi&scaron;i &bdquo;DA&ldquo; (bez navodnika) ako krava može doći do usjeva ili &bdquo;NE&ldquo; (bez navodnika) inače.</p>

### 힌트

<p>Opis prvog probnog primjera: Prvi pravac prolazi osi apscisa (x-os) i odvaja sve točke s pozitivnom y-koordinatom od onih s negativnom. Drugi pravac prolazi osi ordinata (y-os) i konačno odvaja sve točke po kvadrantima.</p>

<p>Opis trećeg probnog primjera: Ispod je skica na kojoj su pravci koji odgovaraju svim zidovima i sve točke koje smo promatrali.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32006.%E2%80%85ZEMLJA/cc195568.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/32006.%E2%80%85ZEMLJA/cc195568.png" data-original-src="https://upload.acmicpc.net/8f022a28-d121-482b-a643-40e1c40ab124/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 365px; height: 350px;" /></p>