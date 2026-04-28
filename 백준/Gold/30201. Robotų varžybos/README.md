# [Gold III] Robotų varžybos - 30201

[문제 링크](https://www.acmicpc.net/problem/30201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

너비 우선 탐색, 이분 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 격자 그래프, 매개 변수 탐색, 누적 합

### 문제 설명

<p>Robotų varžyboms yra sukonstruota trasa-labirintas, padalinta į vienetinius kvadratėlius. Ant kai kurių kvadratėlių priklijuotos kvadratėlio dydžio plytelės (sienos) ir &scaron;iais kvadratėliais robotai judėti ar ant jų stovėti negali.</p>

<p>Varžybose dalyvauja kvadrato formos robotai galintys judėti tik keturiomis kryptimis lygiagrečiai trasos kra&scaron;tinėms. Vieno varžybų etapo metu robotas pastatomas starto juostoje i&scaron; kairės, jis turi užvažiuoti ant tam etapui numatytos trasos i&scaron; kairiojo kra&scaron;to, pervažiuoti labirintą (nebūtinai trumpiausiu keliu) ir i&scaron;važiavęs pro de&scaron;inįjį kra&scaron;tą pasiekti fini&scaron;o juostą.</p>

<p>Etapą laimi dalyvis, kurio užduotį įveikęs robotas yra didžiausias (t. y. kurio kvadrato formos roboto kra&scaron;tinė bus ilgiausia).</p>

<p>Varžybų organizatoriai nori prie&scaron; pat varžybas patikrinti sukonstruotą trasą ir sužinoti, kokio dydžio robotai turės būti konstruojami varžyboms. Para&scaron;ykite programą, kuri žinodama trasos planą, apskaičiuotų koks turėtų būti didžiausias galimas roboto kra&scaron;tinės ilgis tai trasai.</p>

### 입력

<p>Pirmoje eilutėje pateikti trasos duomenys: jos plotis n ir ilgis m. Tolesnėse n eilučių pateikiama po m simbolių, apra&scaron;ančių trasą:</p>

<ul>
	<li>. žymi tu&scaron;čią langelį, kuriuo gali judėti robotas,</li>
	<li># žymi užimtą langelį &ndash; sieną.</li>
</ul>

<p>Visų trasų vir&scaron;utinę ir apatinę eiles sudaro tik užimti langeliai.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių: didžiausią kvadrato kra&scaron;tinės ilgį a<sub>m</sub>, tokį, kad &scaron;io dydžio robotas galėtų įveikti duotąją trasą.</p>

<p>Pradiniai duomenys yra tokie, kad didžiausi kvadratų dydžiai a<sub>m</sub> bus nedidesni negu 20.</p>

### 제한

<ul>
	<li>3 &le; n &le; 500</li>
	<li>1 &le; m &le; 500</li>
	<li>0 &le; a<sub>m</sub> &le; 20</li>
</ul>