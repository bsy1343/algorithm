# [Bronze I] Kurjeris - 7245

[문제 링크](https://www.acmicpc.net/problem/7245)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 64, 정답: 55, 맞힌 사람: 49, 정답 비율: 85.965%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Bitlandijos maisto pristatymo įmonėje &bdquo;Unter Valgyt&rdquo; dirba N kurjerių. Visi kurjeriai pradeda darbą tuo pačiu laiku &ndash; ryte (Bitlandijos laiku t = 0 minučių). Dienos metu gaunami užsakymai, apie kiekvieną kurių yra žinoma:</p>

<ul>
	<li>Užsakymo gavimo laikas (minutėmis);</li>
	<li>Vertė, kiek kurjeris uždirbs už jo įvykdymą;</li>
	<li>Laikus, kiek užtruktų kiekvienas kurjeris įvykdyti užsakymą (minutėmis). To paties užsakymo įvykdymo laikai yra skirtingi visiems kurjeriams.</li>
</ul>

<p>Užsakymas yra priskiriamas laisvam kurjeriui (tuo metu nevykdančiam jokio užsakymo), kuris jį įvykdytų greičiausiai. Jei tuo metu visi kurjeriai yra užimti, užsakymas dingsta, nes klientas kreipiasi į kitą įmonę.</p>

<p>Kurjeriai baigia dirbti, kai įvykdo visus per dieną gautus užsakymus.</p>

<p>Suskaičiuokite, kiek kiekvienas kurjeris uždirbs per dieną.</p>

### 입력

<p>Pirmoje eilutėje yra pateikti du skaičiai: kurjerių (N) ir užsakymų (M) skaičius. Kitose M eilučių duota užsakymų informacija:</p>

<ul>
	<li>t &ndash; užsakymo gavimo laikas minutėmis nuo darbo dienos pradžios. Visų užsakymų laikai yra skirtingi ir pateikti didėjimo tvarka.</li>
	<li>v &ndash; užsakymo vertė, kurią kurjeris uždirbs jį įvykdęs.</li>
	<li>z<sub>1</sub>, z<sub>2</sub>, z<sub>3</sub>, ...z<sub>n</sub> &ndash; laikai, kurie rei&scaron;kia, kad i-asis kurjeris įvykdyti &scaron;į užsakymą užtruks z<sub>i</sub> minučių. Visi vieno užsakymo laikai yra skirtingi.</li>
</ul>

### 출력

<p>Vienoje eilutėje pateikite N skaičių &ndash; kiek uždirbs kiekvienas kurjeris tą dieną.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100</li>
	<li>1 &le; M &le; 1000</li>
	<li>1 &le; t<sub>1</sub> &lt; t<sub>2</sub> &lt; t<sub>3</sub> &lt; .. &lt; t<sub>m</sub> &le; 1000</li>
	<li>1 &le; v<sub>i</sub> &le; 1000</li>
	<li>1 &le; z<sub>i</sub> &le; 100</li>
</ul>