# [Gold III] Gyvūnai - 7243

[문제 링크](https://www.acmicpc.net/problem/7243)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

구현

### 문제 설명

<p>Lukas domisi gamta ir žino, kuriuo paros metu kokie žvėrys ir pauk&scaron;čiai yra aktyvūs. Jis organizuoja žygį su bendraklasiais ir nori pamatyti N gyvūnų. Gyvūną galima pamatyti tik tuo laiku, kai jis aktyvus. Žygeiviai nori visus gyvūnus stebėti vienu metu, t.y. jie nori stebėti tik tokiu metu, kai visi gyvūnai yra aktyvūs.</p>

<p>Padėkite Lukui nuspręsti, kada geriausia vykti į žygį, kad jie pamatytų visus norimus gyvūnus.Kiekvienam gyvūnui duotas paros laiko intervalas, kada tas gyvūnas yra aktyvus, t. y. jį galima stebėti. Nustatykite, ar yra metas, kai visi N gyvūnų yra aktyvūs ir raskite ilgiausią tokį laiko intervalą.</p>

<p>Jeigu du intervalai yra tokie, kad vienas prasideda lygiai tuo pačiu laiku, kai baigėsi kitas, laikoma, kad intervalai nesikerta.</p>

### 입력

<p>Pirmoje pradinių duomenų eilutėje pateiktas gyvūnų, kuriuos nori stebėti mokiniai, skaičius N.</p>

<p>Kiekvienoje tolesnių N eilučių pateikta po keturis skaičius, nusakančius gyvūno aktyvumo periodą paroje valandomis ir minutėmis: h<sub>nuo</sub>, min<sub>nuo</sub>, h<sub>iki</sub>, min<sub>iki</sub>.</p>

<p>Kiekvienas pateiktas intervalas yra netrumpesnis nei 1 minutė ir neilgesnis nei 11 valandų ir 59 minutės.</p>

### 출력

<p>Jei yra paros laikas, kai visi gyvūnai yra aktyvūs, tuomet pirmoje eilutėje i&scaron;veskite <code>TAIP</code>, o antroje &ndash; ilgiausią laiko intervalą nuo kada iki kada galima stebėti visus gyvūnus. Laiko intervalą sudaro keturi skaičiai tokiu pat formatu kaip pradiniuose duomenyse.</p>

<p>Jei bendro laiko, kada gyvūnai būtų aktyvūs, nėra, i&scaron;veskite <code>NE</code>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1000</li>
	<li>0 &le; h<sub>nuo</sub>, h<sub>iki</sub> &le; 23</li>
	<li>0 &le; min<sub>nuo</sub>, min<sub>iki</sub> &le; 59</li>
</ul>