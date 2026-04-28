# [Silver III] Badmintonas - 30071

[문제 링크](https://www.acmicpc.net/problem/30071)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 20, 맞힌 사람: 18, 정답 비율: 47.368%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Bitlandijos badmintono komanda Bitai žaidžia finalines rungtynes prie&scaron; Baitlandijos komandą Baitus. Kadangi Baitai žaidžia namuose, jie savąją komandos sudėtį paskelbė i&scaron; anksto.</p>

<p>Kiekvieną komandą sudaro trys poros žaidėjų:</p>

<ul>
	<li>Kiekvienas žaidėjas turi savo <em>stiprumo</em> indeksą $s_i$;</li>
	<li>Jei žaidėjai $i$ ir $j$ sudaro porą, tai <em>poros stiprumo indeksas</em> $P = s_i + s_j$;</li>
	<li>Jei dvi poros žaidžia tarpusavyje, laimi ta, kurios stiprumo indeksas didesnis.</li>
</ul>

<p>Bitai, pasinaudodami paskelbta informacija, nori sudaryti komandą taip, kad nugalėtų Baitus. Kiekviena Bitų pora sužaidžia su kiekviena Baitų pora, i&scaron; viso vyksta $9$ rungtynės. Ar įmanoma Bitams laimėti?</p>

<p>Sudarykite $3$ komandas i&scaron; Bitų žaidėjų taip, kad &scaron;ie laimėtų kuo daugiau rungtynių. Duomenys pateikti tokie, kad lygiosios neįmanomos.</p>

### 입력

<p>Pirmoje eilutėje pateikti Baitų <strong>žaidėjų porų</strong> stiprumo indeksai $B_1$, $B_2$, $B_3$. Tolimesnėse &scaron;e&scaron;iose eilutėse &ndash; Bitų <strong>atskirų žaidėjų</strong> stiprumo indeksai $S_i$.</p>

### 출력

<p>I&scaron;veskite sveikąjį skaičių $M$, nurodantį, kiek žaidimų pavyks laimėti Bitams. Tolimesnėse trijose eilutėse i&scaron;veskite bet kokią galimą komandos sudėtį, nurodydami žaidėjų stiprumo indeksus, kuri pasieks geriausią rezultatą.</p>

### 제한

<ul>
	<li>$1 &le; B_i &le; 200\,000$</li>
	<li>$1 &le; S_i &le; 100\,000$</li>
</ul>