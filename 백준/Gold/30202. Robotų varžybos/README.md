# [Gold III] Robotų varžybos - 30202

[문제 링크](https://www.acmicpc.net/problem/30202)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

그래프 이론, 그래프 탐색, 이분 탐색, 누적 합, 너비 우선 탐색, 깊이 우선 탐색, 매개 변수 탐색, 격자 그래프

### 문제 설명

<p>Robotų varžyboms sukonstruota T skirtingo dydžio stačiakampių trasų-labirintų, padalintų į vienetinius kvadratėlius. Ant kai kurių kvadratėlių priklijuotos kvadratėlio dydžio plytelės (sienos) ir &scaron;iais kvadratėliais robotai judėti ar ant jų stovėti negali.</p>

<p>Varžybose dalyvauja kvadrato formos robotai galintys judėti tik keturiomis kryptimis lygiagrečiai trasos kra&scaron;tinėms. Vieno varžybų etapo metu robotas pastatomas starto juostoje i&scaron; kairės, jis turi užvažiuoti ant tam etapui numatytos trasos i&scaron; kairiojo kra&scaron;to, pervažiuoti labirintą (nebūtinai trumpiausiu keliu) ir i&scaron;važiavęs pro de&scaron;inįjį kra&scaron;tą pasiekti fini&scaron;o juostą.</p>

<p>Etapą laimi dalyvis, kurio užduotį įveikęs robotas yra didžiausias (t. y. kurio kvadrato formos roboto kra&scaron;tinė bus ilgiausia).</p>

<p>Varžybų organizatoriai nori prie&scaron; pat varžybas patikrinti trasas ir sužinoti, kokio dydžio robotai turės būti konstruojami varžyboms. Para&scaron;ykite programą, kuri žinodama kiekvienos trasos planą, apskaičiuotų koks turėtų būti didžiausias galimas roboto kra&scaron;tinės ilgis tai trasai.</p>

### 입력

<p>Pirmoje eilutėje pateiktas trasų skaičius T.</p>

<p>Toliau pateikti T trasų duomenys: i-ąįą trasą apra&scaron;ančioje pirmoje eilutėje pateiktas jos plotis ni ir ilgis mi . Tolesnėse ni eilučių pateikiama po mi simbolių, apra&scaron;ančių i-ąją trasą:</p>

<ul>
	<li>. žymi tu&scaron;čią langelį, kuriuo gali judėti robotas,</li>
	<li># žymi užimtą langelį &ndash; sieną.</li>
</ul>

<p>Visų trasų vir&scaron;utinę ir apatinę eiles sudaro tik užimti langeliai.</p>

### 출력

<p>I&scaron;veskite T eilučių, kuriose būtų po vieną sveikąjį skaičių: i-ojoje eilutėje i&scaron;veskite didžiausią kvadrato kra&scaron;tinės ilgį ai , tokį, kad &scaron;io dydžio robotas galėtų įveikti i-ąją trasą.</p>

### 제한

<ul>
	<li>1 &le; T &le; 5</li>
	<li>3 &le; n<sub>i</sub> &le; 500</li>
	<li>1 &le; m<sub>i</sub> &le; 500</li>
	<li>Bendras langelių skaičius (sandaugų nimi suma visiems 1 &le; i &le; T) nevir&scaron;ija 250 000.</li>
</ul>