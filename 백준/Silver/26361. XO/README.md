# [Silver V] XO - 26361

[문제 링크](https://www.acmicpc.net/problem/26361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 41, 맞힌 사람: 29, 정답 비율: 65.909%

### 분류

구현, 시뮬레이션, 많은 조건 분기

### 문제 설명

<p>Zaigrajmo igru Križić-kružić. Za one koji ne znaju &scaron;to je to, slijedi kratko predstavljanje pravila. Igru igraju dva igrača koji, svaki svojim znakom, popunjavaju tablicu koja u početku ima devet praznih polja podijeljenih u tri reda i tri stupca. Igrač X upisuje slovo &bdquo;X&ldquo; &ndash; križić, a igrač O upisuje slovo &bdquo;O&ldquo; &ndash; kružić. Počev&scaron;i od onog koji upisuje križić, igrači naizmjenično odabiru prazna polja i unutar njih upisuju svoj znak. Igra zavr&scaron;ava pobjedom jednog od njih kada upi&scaron;e tri svoja znaka uzastopno u nekom retku, stupcu, na glavnoj ili na sporednoj dijagonali. Ako to ne uspije niti jednom igraču, a sva polja su popunjena, igra zavr&scaron;ava bez pobjednika. Npr, na slici je prikazan slijed od sedam odigranih poteza koji je doveo do pobjede prvog igrača.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26361.%E2%80%85XO/860f04ad.png" data-original-src="https://upload.acmicpc.net/3521d414-0c57-4e45-a0fd-bfafa2763033/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 634px; height: 76px;" /></p>

<p>Neka je zadan slijed od N odigranih poteza u jednoj realno odigranoj igri. Napi&scaron;i program koji će odrediti i ispisati &scaron;to slijedi nakon N-tog odigranog poteza. Na raspolaganju su nam sljedeće mogućnosti:</p>

<ol>
	<li>mogućnost: Igru nastavlja igrač X postavljanjem svog znaka u prazno polje.</li>
	<li>mogućnost: Igru nastavlja igrač O postavljanjem svog znaka u prazno polje.</li>
	<li>mogućnost: Igra je zavr&scaron;ila pobjedom igrača X.</li>
	<li>mogućnost: Igra je zavr&scaron;ila pobjedom igrača O.</li>
	<li>mogućnost: Igra je zavr&scaron;ila jer vi&scaron;e nema praznih polja, a nitko nije pobijedio.</li>
</ol>

### 입력

<p>U prvom je retku cijeli broj N (0 &le; N &le; 9), broj odigranih poteza.</p>

<p>U sljedećih N redaka je prirodan broj P (1 &le; P &le; 9), oznaka polja na koji je igrač na potezu upisao svoj znak. Gornje lijevo polje ima oznaku 1, a dolje desno polje ima oznaku 9. Vidi sliku iz teksta zadatka.</p>

### 출력

<p>U jedini redak ispi&scaron;i prirodan broj između jedan i pet, redni broj mogućnosti iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Kako je vidljivo na slici iz teksta zadatka, nakon tri odigrana poteza na redu je igrač O.</p>

<p>Opis drugog probnog primjera: Kako je vidljivo na slici iz teksta zadatka, nakon sedam odigranih poteza igra je zavr&scaron;ila pobjedom igrača X.</p>

<p>Opis trećeg probnog primjera: Kako je vidljivo sa slike koja slijedi, nakon devet odigranih poteza igra je zavr&scaron;ila jer vi&scaron;e nema praznih polja, a nitko nije pobijedio.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26361.%E2%80%85XO/c04d0ab1.png" data-original-src="https://upload.acmicpc.net/412ff40d-cbbe-4fb8-bf5b-e4bcbb00b206/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 627px; height: 69px;" /></p>