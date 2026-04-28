# [Silver V] Akmuo, popierius, žirklės - 7213

[문제 링크](https://www.acmicpc.net/problem/7213)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 49, 맞힌 사람: 38, 정답 비율: 76.000%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>Vilius ir Adomas žaidžia žaidimą &bdquo;Akmuo, popierius, žirklės&ldquo;. Žaidėjai kartu skaičiuoja &bdquo;vienas&hellip; du&hellip; trys&hellip;&ldquo; ir tuo pačiu metu mojuoja kum&scaron;čiais. Sakant &bdquo;trys&ldquo; kiekvienas žaidėjas viena ranka parodo vieną i&scaron; trijų ženklų: akmenį, žirkles ar popierių. Laimėtojas nustatomas taip:</p>

<ul>
	<li>Akmuo laimi prie&scaron; žirkles (akmuo bukina ar laužo žirkles)</li>
	<li>Žirklės laimi prie&scaron; popierių (žirklės karpo popierių)</li>
	<li>Popierius laimi prie&scaron; akmenį (popierius uždengią akmenį)</li>
	<li>Jei žaidėjai parodo vienodus ženklus, tai laikoma lygiosiomis</li>
</ul>

<p>Vilius ir Adomas žais žaidimą daug kartų, tad sugalvojo tokią ta&scaron;kų sistemą:</p>

<ul>
	<li>Abu žaidėjai pradeda su 0 ta&scaron;kų</li>
	<li>Laimėjusio žaidėjo ta&scaron;kų skaičius padidėja vienetu</li>
	<li>Pralaimėjusio žaidėjo ta&scaron;kų skaičius sumažėja vienetu</li>
	<li>Lygiųjų atveju ta&scaron;kų skaičius nesikeičia</li>
</ul>

<p>Vilius ir Adomas sužaidė jau nemažai žaidimų, bet pamir&scaron;o savo turimų ta&scaron;kų kiekį! Kiekvienas jų prisimena, kiek kartų kokį ženklą (akmenį, popierių ir žirkles) rodė, bet neprisimena kokia tvarka. Padėkite jiems nustatyti, kiek daugiausiai bei kiek mažiausiai ta&scaron;kų gali turėti Vilius (žinodami Viliaus ta&scaron;kų kiekį, Adomo ta&scaron;kus suskaičiuos patys).</p>

<p>Nustatykite, kiek daugiausiai bei kiek mažiausiai ta&scaron;kų gali turėti Vilius.</p>

### 입력

<p>Pirmoje eilutėje pateikti 3 sveikieji skaičiai a<sub>1</sub>, p<sub>1</sub>, z<sub>1</sub>, nurodantys, kiek kartų Vilius parodė atitinkamai akmenį, popierių bei žirkles. Antroje eilutėje ta pačia tvarka pateikti Adomo parodytų ženklų kiekiai a<sub>2</sub>, p<sub>2</sub>, z<sub>2</sub>.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite didžiausią galimą, o antroje &ndash; mažiausią galimą Viliaus turimų ta&scaron;kų kiekį.</p>

### 제한

<ul>
	<li>0 &le; a<sub>1</sub>, p<sub>1</sub>, z<sub>1</sub>, a<sub>2</sub>, p<sub>2</sub>, z<sub>2</sub> &le; 1000</li>
	<li>a<sub>1</sub> + p<sub>1</sub> + z<sub>1</sub> = a<sub>2</sub> + p<sub>2</sub> + z<sub>2</sub></li>
</ul>