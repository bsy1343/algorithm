# [Bronze II] Taikinys - 30349

[문제 링크](https://www.acmicpc.net/problem/30349)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 143, 정답: 65, 맞힌 사람: 48, 정답 비율: 40.336%

### 분류

수학, 구현, 브루트포스 알고리즘

### 문제 설명

<p>Už stačiakampės &scaron;audymo angos stovi stačiakampio formos taikinys. Abu stačiakampiai sudalinti į 1 &times; 1 dydžio langelius.</p>

<p>Tiesė, einanti per apatinius kairiuosius stačiakampių kampus, yra statmena jų plok&scaron;tumoms, bei apatinės abiejų stačiakampių kra&scaron;tinės yra lygiagrečios.</p>

<p>Susitarsime, kad abiejų stačiakampių apatinio kairiojo langelio koordinatės yra (0, 0).</p>

<p>omas gali paleisti strėlę i&scaron; bet kurio angos langelio (X<sub>p</sub>, Y<sub>p</sub>). Deja, vėjas nupūs strėlę į &scaron;oną per (X, Y) langelių. T. y. i&scaron;&scaron;ovus i&scaron; langelio (X<sub>p</sub>, Y<sub>p</sub>), strėlė pataikys į langelį (X<sub>p</sub> + X, Y<sub>p</sub> + Y ).</p>

<p>Reikia pataikyti strėlę į taikinio langelį (0, 0). Jeigu strėlė pataiko į taikinio langelį (T<sub>X</sub>, T<sub>Y</sub>), yra skaičiuojami baudos ta&scaron;kai B = T<sub>X</sub> + T<sub>Y</sub>.</p>

<p>Įmanoma, kad strėlė apskritai nepataikys į taikinį.</p>

<p>Padėkite Adomui suskaičiuoti, ar jis gali apskritai pataikyti į taikinį ir jei taip &ndash; kiek mažiausiai baudos ta&scaron;kų jis gali gauti.</p>

### 입력

<p>Pirmoje eilutėje pateiktas angos plotis M ir auk&scaron;tis N. Antroje eilutėje pateiktas taikinio plotis A ir auk&scaron;tis B. Trečioje eilutėje yra vėjo poslinkį nusakantys skaičiai X ir Y . Visi pateikti skaičiai yra sveikieji.</p>

### 출력

<p>Rezultatas yra vienas sveikasis skaičius &ndash; minimali galima baudos vertė, kurią Adomas galėtų gauti paleidęs strėlę i&scaron; &scaron;audymo angos.</p>

<p>Jeigu dėl vėjo neįmanoma pataikyti į taikinį, i&scaron;veskite žodį <code>NEPATAIKYS</code>.</p>

### 제한

<ul>
	<li>1 &le; N, M, A, B &le; 1000</li>
	<li>&minus;2000 &le; X, Y &le; 2000</li>
</ul>