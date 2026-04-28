# [Silver III] Zvimbalius - 30286

[문제 링크](https://www.acmicpc.net/problem/30286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 19, 맞힌 사람: 18, 정답 비율: 69.231%

### 분류

사칙연산, 구현, 수학

### 문제 설명

<p>Vytis turi naują žaislą &ndash; nuotoliniu būdu valdoma bepilotę skraidyklę, dar žinomą kaip dronas arba zvimbalius. Dronas yra bepilotis sragtasparnis, kuris skrenda vykdydamas jam duotas komandas.</p>

<p>Vyčio dronas supranta keturias komandas &ndash; S, P, R, V &ndash; kurios atitinkamai liepia jam skristi vieną metrą į &scaron;iaurę, pietus, rytus ar vakarus.</p>

<p>Vytis nusprendė i&scaron;bandyti savo žaislą ir įvedė į jį N komandų, tačiau jas įvedęs suprato, kad dronas, įvykdęs tas komandas, gali nesugrįžti į pradinį ta&scaron;ką. Deja, komandas taisyti sunku, nes drono programinė įranga neleidžia nei pridėti, nei i&scaron;trinti jau įvestų komandų, o jas pakeisti galima tik po vieną. Vytis nori pakeisti kuo mažiau komandų taip, kad įvykdęs visas komandas dronas grįžtų į pradinį ta&scaron;ką.</p>

<p>Suskaičiuokite kiek mažiausiai komandų Vyčiui reikės pakeisti, kad dronas sugrįžtų į pradinį ta&scaron;ką.</p>

### 입력

<p>Pirmoje eilutėje yra pateiktas skaičius N &ndash; įvestų komandų kiekis. Antroje eilutėje yra pateiktas N komandų eilutė be tarpų k<sub>1</sub>k<sub>2</sub>...k<sub>N</sub>, kuriame k<sub>i</sub> yra i-toji komanda, užkoduota taip, kaip nurodyta sąlygoje.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; kiek komandų reikia pakeisti, norint, kad dronas sugrįžtųį pradinį ta&scaron;ką.</p>

<p>Jei neįmanoma pakeisti komandų taip, kad dronas sugrįžtų į pradinį ta&scaron;ką, i&scaron;veskite <code>NEGALIMA</code>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000</li>
</ul>