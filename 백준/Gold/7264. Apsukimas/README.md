# [Gold V] Apsukimas - 7264

[문제 링크](https://www.acmicpc.net/problem/7264)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 19, 맞힌 사람: 17, 정답 비율: 65.385%

### 분류

문자열

### 문제 설명

<p>Mokslininkas Glenas mėgsta nagrinėti įvairias tekstų transformacijas. &Scaron;iuo laiku jis domisi vadinamaisiais &bdquo;apsukimais&ldquo;. Tai tokia teksto transformacija, kai tam tikra teksto dalis, sudaryta i&scaron; dviejų ar daugiau simbolių, para&scaron;oma atbulai, o likusi dalis &ndash; nekeičiama. Paprastumo dėlei Glenas nagrinėja tik tekstus, kurie sudaryti i&scaron; didžiųjų lotyni&scaron;kų raidžių.</p>

<p>Kaip pavyzdį pateiksime keletą teksto LABASRYTAS apsukimo transformacijų (apsuktos dalys pabrauktos):</p>

<ul>
	<li>LA<u>BAS</u>RYTAS &rarr; LA<u>SAB</u>RYTAS</li>
	<li><u>LABASRYTAS</u> &rarr; <u>SATYRSABAL</u></li>
	<li><u>LA</u>BASRYTAS &rarr; <u>AL</u>BASRYTAS</li>
</ul>

<p>Glenas ką tik gavo du skirtingus tekstus ir yra įsitikinęs, kad antrasis tekstas yra gautas i&scaron; pirmo atlikus vieną apsukimo operaciją. Tačiau Glenui nepavyksta tiksliai pasakyti, kuri dalis buvo apsukta.</p>

<p>Ar galėtumėte padėti Glenui rasti apsuktą dalį?</p>

### 입력

<p>Pirmoje eilutėje pateiktas pirminio (ir transformuoto) teksto ilgis N. Antroje eilutėje pateiktas pirminis tekstas, o trečioje &ndash; transformuotas tekstas.</p>

<p>Abu tekstai sudaryti vien i&scaron; didžiųjų lotyni&scaron;kų raidžių.</p>

<p>Pradiniai duomenys visada bus tokie, kad sprendinys egzistuotų, ir kad pradinis tekstas ir tekstas po apsukimo būtų skirtingi.</p>

### 출력

<p>Jums reikia i&scaron;vesti du skaičius: apsuktos teksto dalies pirmo ir paskutinio simbolio numerius. Teksto simboliai numeruojami i&scaron; kairės į de&scaron;inę nuo 1 iki N. Jeigu yra keli galimi atsakymo variantai, i&scaron;veskite tą, kurio pirmo simbolio numeris yra mažiausias. Jei vis dar yra keli galimi atsakymo variantai, i&scaron;veskite tą, kurio paskutinio simbolio numeris yra mažiausias.</p>

### 제한

<ul>
	<li>2 &le; N &le; 100 000</li>
</ul>