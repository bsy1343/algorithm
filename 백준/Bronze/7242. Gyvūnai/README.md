# [Bronze II] Gyvūnai - 7242

[문제 링크](https://www.acmicpc.net/problem/7242)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 105, 정답: 84, 맞힌 사람: 78, 정답 비율: 80.412%

### 분류

수학, 구현

### 문제 설명

<p>Lukas domisi gamta ir žino, kuriuo paros metu kokie žvėrys ir pauk&scaron;čiai yra aktyvūs. Jis organizuoja žygį su bendraklasiais ir nori pamatyti N gyvūnų. Gyvūną galima pamatyti tik tuo dienos (nuo 9:00 iki 20:59) laiku, kai jis yra aktyvus. Žygeiviai nori visus gyvūnus stebėti vienu metu, t.y. tokiu metu, kai visi gyvūnai yra aktyvūs.</p>

<p>Padėkite Lukui nuspręsti, kada geriausia vykti į žygį, kad jie pamatytų visus norimus gyvūnus.</p>

<p>Kiekvienam gyvūnui duotas dienos laiko intervalas, kada tas gyvūnas yra aktyvus, t. y. kada jį galima stebėti. Nustatykite, ar yra laikas, kai visi N gyvūnų yra aktyvūs ir raskite ilgiausią tokį laiko intervalą. Jeigu du intervalai yra tokie, kad vienas prasideda lygiai tuo pačiu laiku, kai baigėsi kitas, laikoma, kad intervalai nesikerta.</p>

### 입력

<p>Pirmoje pradinių duomenų eilutėje pateiktas gyvūnų, kuriuos nori stebėti mokiniai, skaičius N.</p>

<p>Kiekvienoje tolesnių N eilučių pateikta po keturis skaičius, nusakančius gyvūno aktyvumo periodą dienoje valandomis ir minutėmis: h<sub>nuo</sub>, min<sub>nuo</sub>, h<sub>iki</sub>, min<sub>iki</sub>.</p>

<p>Kiekvienas pateiktas intervalas yra netrumpesnis nei 1 minutė.</p>

### 출력

<p>Jei yra dienos laikas, kai visi gyvūnai yra aktyvūs, tuomet pirmoje eilutėje i&scaron;veskite <code>TAIP</code>, o antroje &ndash; ilgiausią laiko intervalą, nuo kada anksčiausiai ir iki kada vėliausiai galima pamatyti visus gyvūnus. Laiko intervalą sudaro keturi skaičiai tokiu pat formatu kaip pradiniuose duomenyse.</p>

<p>Jei bendro laiko, kada gyvūnai būtų aktyvūs, nėra, i&scaron;veskite <code>NE</code>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1000</li>
	<li>9 &le; h<sub>nuo</sub>, h<sub>iki</sub> &le; 20, 0 &le; min<sub>nuo</sub>, min<sub>iki</sub> &le; 59</li>
</ul>