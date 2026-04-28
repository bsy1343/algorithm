# [Silver IV] TiM - 25153

[문제 링크](https://www.acmicpc.net/problem/25153)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 31, 맞힌 사람: 31, 정답 비율: 83.784%

### 분류

사칙연산, 구현, 수학, 문자열

### 문제 설명

<p>Til i Maja vježbaju zbrajanje i oduzimanje rje&scaron;avajući zadatke koje si same zadaju uz pomoć jednog posebnog kalkulatora. Taj kalkulator u jednom pokretanju na svoj ekran može ispisati ili znak &bdquo;X&ldquo; (veliko slovo &bdquo;X&ldquo;) ili prirodan broj K između 1 i 9999 ili znak &bdquo;+&ldquo; (plus) ili znak &bdquo;-&ldquo; (minus). Pri tome vrijedi sljedeća pravilnost:</p>

<ul>
	<li>u neparnom pokretanju (prvom, trećem, petom...) kalkulator će na ekran moći ispisati samo ili znak &bdquo;X&ldquo; ili prirodan broj K između 1 i 9999;</li>
	<li>u parnom pokretanju (drugom, četvrtom, &scaron;estom...) kalkulator će na ekran moći ispisati samo znak &bdquo;+&ldquo; ili znak &bdquo;-&ldquo;.</li>
</ul>

<p>Til i Maja će neparan broj puta N pokrenuti kalkulator, a ispise na ekran u svakom od tih N pokretanja će zapisati na papir jedan iza drugog onim redom kako se pojavljuju. Na taj će način kreirati jedan matematički izraz. Npr., izraz može biti sljedećeg oblika: X+2+3+X+1, 235-1+X+7642. Na žalost, curama se kreirani izraz raspao na znakove koje su onda morale zapisale jedan ispod drugog.</p>

<p>Njih dvije sada zanimaju odgovori na sljedeća tri pitanja:</p>

<ol>
	<li>Koliki je zbroj svih znamenki koje su se pojavile na ekranu kalkulatora u svih N pokretanja?</li>
	<li>Koliki je zbroj svih prirodnih brojeva K koje je kalkulator ispisao na ekran?</li>
	<li>Kojim cijelim brojem treba zamijeniti znak &bdquo;X&ldquo; da bi vrijednost izraza bila jednaka nuli? Rje&scaron;enje će uvijek postojati i biti jedinstveno.</li>
</ol>

<p>Napi&scaron;i program koji će na osnovi zadanih podataka ispisati odgovore na postavljena pitanja.</p>

### 입력

<p>U prvom retku nalazi se neparan prirodan broj N (3 &le; N &le; 99), broj pokretanja kalkulatora.</p>

<p>U drugom retku nalazi se prirodan broj M (3 &le; M &le; 250), broj znakova u kreiranom izrazu.</p>

<p>U sljedećih M redaka nalazi se po jedan znak, znakovi iz izraza napisani jedan ispod drugog.</p>

### 출력

<p>U prvi redak treba ispisati odgovor na prvo pitanje.</p>

<p>U drugi redak treba ispisati odgovor na drugo pitanje.</p>

<p>U treći redak treba ispisati odgovor na treće pitanje.</p>

### 힌트

<p>Opis prvog primjera: Kalkulator je u prvom pokretanju na ekranu ispisao X, u drugom &bdquo;+&ldquo; i u trećem 5. Na taj smo način dobili izraz oblika X+5. Zbroj znamenki je 5, zbroj brojeva je 5, a ako X zamijenimo s -5 dobit ćemo da je vrijednost izraza jednaka nuli.</p>

<p>Opis drugog primjera: U ukupno 11 pozivanja kalkulator je redom ispisivao: X, &bdquo;+&ldquo;, 23, &bdquo;-&ldquo;, 5, &bdquo;+&ldquo;, X, &bdquo;+&ldquo;, 12, &bdquo;+&ldquo; i X. Dobiveni izraz je oblika: X+23-5+X+12+X. Zbroj svih znamenki je 13 (2+3+5+1+2), zbroj svih brojeva K je 40 (23+5+12), a ako X zamijenimo s -10 vrijednost izraza će postati nula ((-10)+23-5+(-10)+12+(-10)).</p>