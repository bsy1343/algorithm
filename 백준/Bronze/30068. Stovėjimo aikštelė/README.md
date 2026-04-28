# [Bronze II] Stovėjimo aikštelė - 30068

[문제 링크](https://www.acmicpc.net/problem/30068)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 105, 맞힌 사람: 96, 정답 비율: 89.720%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>&Scaron;iuolaikinėse automobilių aik&scaron;telėse dažnai įrengiamos sistemos užfiksuoti įvažiuojančių ir i&scaron;važiuojančių automobilių numerius. Tokiu būdu galima apmokestinti automobilių savininkus pagal tikslų laiką, kurį automobiliai praleido aik&scaron;telėje.</p>

<p>&Scaron;iame uždavinyje panagrinėsime vieną i&scaron; tokios sistemos komponentų.</p>

<p>Jums pateiktas sąra&scaron;as įra&scaron;ų, kuriuos sudaro du sveikieji skaičiai:</p>

<ol>
	<li>$T_i$ &ndash; laiko momentas (matuojamas sekundėmis),</li>
	<li>$N_i$ &ndash; automobilio numeris.</li>
</ol>

<p>Pirmas sutiktas įra&scaron;as su numeriu $N_i$ rei&scaron;kia, kad &scaron;is automobilis įvažiavo į stovėjimo aik&scaron;telę. Antras &ndash; kad &scaron;is automobilis i&scaron;važiavo. Galite laikyti, kad nei vienas numeris nebus pateiktas sąra&scaron;e daugiau nei du kartus.</p>

<p>Suskaičiuokite, kiek laiko kiekvienas automobilis praleido stovėjimo aik&scaron;telėje.</p>

### 입력

<p>Pirmoje eilutėje pateiktas vienas sveikasis skaičius $M$ &ndash; įra&scaron;ų skaičius. Toliau seka $M$ įra&scaron;ų, po vieną eilutėje, kuriuos sudaro auk&scaron;čiau apra&scaron;yti du sveikieji skaičiai $T_i$ ir $N_i$. Visi įra&scaron;ai yra pateikti $T_i$ didėjimo tvarka.</p>

### 출력

<p>Jūsų programa turi i&scaron;vesti po vieną eilutę kiekvienam automobiliui, kuris i&scaron;važiavo i&scaron; stovėjimo aik&scaron;telės. Eilutėje turi būti pateikti du skaičiai: automobilio numeris $N_i$ ir sekundžių, kurias automobilis praleido aik&scaron;telėje, skaičius $s_i$. Rezultatus programa turi i&scaron;vesti ta tvarka, kuria automobiliai i&scaron;važiavo i&scaron; stovėjimo aik&scaron;telės.</p>

### 제한

<ul>
	<li>$1 &le; M, N_i &le; 1000$</li>
	<li>$1 &le; T_i &le; 1\,000\,000$</li>
</ul>