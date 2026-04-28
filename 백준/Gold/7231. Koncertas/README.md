# [Gold II] Koncertas - 7231

[문제 링크](https://www.acmicpc.net/problem/7231)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bitlandijoje tuoj prasidės visų ilgai lauktas koncertas, kuriame gros žymi vietinė grupė &bdquo;Bitlai&ldquo;. Koncertą susirinko stebėti N žmonių, o koncerto salė tokia, kad žiūrovai vorele stovi vienas už kito. T. y. pirmas žiūrovas stovi prie pat scenos, už jo stovi antras žiūrovas, už antro &ndash; trečias ir t. t. i-to eilėje stovinčio žmogaus ūgis yra u<sub>i</sub> Bitlandijos metrų, o sceną žiūrovai gali matyti tik tuo atveju, jei visi prie&scaron; juos stovintys žmonės griežtai žemesni.</p>

<p>Organizatoriai apie tai nepagalvojo, ir turi tik K vieno Bitlandijos metro auk&scaron;čio kėdučių, kurias gali i&scaron;dalinti žiūrovams. Ant vienos kėdutės gali atsistoti tik vienas žiūrovas ir vienam žiūrovui gali tekti daugiausiai viena kėdutė. Žiūrovui atsistojus ant kėdutės galima tarti, kad jo ūgis padidėja vienu Bitlandijos metru. Tuomet gali būti taip, kad &scaron;is galės matyti sceną, bet ją užstos už jo stovintiems žiūrovams.</p>

<p>Raskite, kiek daugiausiai žiūrovų galės matyti sceną, jei kėdutės bus i&scaron;dalintos optimaliai.</p>

### 입력

<p>Pirmoje eilutėje pateikti du tarpu atskirti sveikieji skaičiai &ndash; žiūrovų skaičius N ir kėdučių skaičius K.</p>

<p>Antroje eilutėje pateikta N tarpais atskirtų sveikųjų skaičių u<sub>i</sub>, žyminčių žiūrovų ūgius jų stovėjimo salėje tvarka.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; kiek daugiausiai žiūrovų galės matyti koncertą optimaliai i&scaron;dalijus kėdutes.</p>

### 제한

<ul>
	<li>1 &le; K &le; N &le; 100 000</li>
	<li>1 &le; u<sub>i</sub> &le; 1 000 000 (1 &le; i &le; N)</li>
</ul>