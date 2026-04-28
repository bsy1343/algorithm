# [Silver II] Sniegas - 30343

[문제 링크](https://www.acmicpc.net/problem/30343)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 15, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

구현, 누적 합

### 문제 설명

<p>Naktį daug snigo, todėl Jonas su draugais nusprendė pažaisti sniego mū&scaron;į. Kiekvienas užėmė tam tikrą poziciją ir mū&scaron;is tuoj prasidės.</p>

<p>Mū&scaron;io lauką apra&scaron;o N sveikųjų skaičių v<sub>i</sub>, kurie žymi sniego pusnių auk&scaron;čius. Kuo v<sub>i</sub> yra didesnis, tuo i-oji pusnis yra auk&scaron;tesnė.</p>

<p>Metęs sniego gniūžtę i&scaron; pozicijos A, Jonas gali pataikyti į draugą, esantį pozicijoje B, jeigu tarp jo ir draugo nėra pusnių, auk&scaron;tesnių už min(v<sub>A</sub>, v<sub>B</sub>).</p>

<p>Žemiau pateiktame pavyzdyje Jonas (pozicija 5, auk&scaron;tis 5) gali pataikyti į Mantą (pozicija 2, auk&scaron;tis 4), bet negali pataikyti į Astą (pozicija 7, auk&scaron;tis 2).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30343.%E2%80%85Sniegas/9776bf94.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30343.%E2%80%85Sniegas/9776bf94.png" data-original-src="https://upload.acmicpc.net/622e91e4-db79-4569-b8aa-2e8641b87008/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 310px; height: 195px;" /></p>

<p>Žinodami, kaip atrodo sniego mū&scaron;io laukas, kur yra Jono bei jo draugų pozicijos, apskaičiuokite, į kelis draugus Jonas gali pataikyti mesdamas sniego gniūžtes.</p>

### 입력

<p>Pirmoje eilutėje pateikti trys sveikieji skaičiai: mū&scaron;io lauko dydis N, Jono draugų skaičius M (neskaičiuojant Jono) ir Jono pozicija A.</p>

<p>Antroje eilutėje yra N sveikųjų skaičių v<sub>i</sub>, nusakančių atitinkamų pusnių auk&scaron;čius.</p>

<p>Trečioje eilutėje yra M skirtingų sveikųjų skaičių B<sub>i</sub>, nusakančių Jono draugų pozicijas didėjimo tvarka.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; į kelis draugus Jonas gali pataikyti mesdamas sniego gniūžtes.</p>

### 제한

<ul>
	<li>1 &le; N, M, v<sub>i</sub> &le; 20 000</li>
	<li>1 &le; A, B<sub>i</sub> &le; N</li>
</ul>