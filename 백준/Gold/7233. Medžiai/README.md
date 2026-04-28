# [Gold II] Medžiai - 7233

[문제 링크](https://www.acmicpc.net/problem/7233)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 7, 정답 비율: 31.818%

### 분류

자료 구조, 집합과 맵, 우선순위 큐, 슬라이딩 윈도우

### 문제 설명

<p>Girininkas Linas prižiūri mi&scaron;ką, kuriame auga N medžių. Medžiai mi&scaron;ke pasodinti vienoje tiesėje. &Scaron;ioje tiesėje atstumas tarp dviejų gretimų medžių visada yra 1 metras.</p>

<p>Linui nepatinka, kad kai kurie medžiai yra &bdquo;užgožti&rdquo; kitų medžių, todėl jis nori &scaron;iuos užgožtus medžius patrę&scaron;ti, kad jie augtų geriau. i-tasis medis yra užgožtas, jei jo auk&scaron;tis h<sub>i</sub> yra bent per M mažesnis už auk&scaron;čiausio kito medžio, augančio K metrų spinduliu aplink i-tąjį medį, auk&scaron;tį.</p>

<p>Pvz.: N = 6, K = 1, M = 2</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7233.%E2%80%85Med%C5%BEiai/0a1f3fb5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7233.%E2%80%85Med%C5%BEiai/0a1f3fb5.png" data-original-src="https://upload.acmicpc.net/b51c90dd-cb7c-499c-a2e0-e20658e4f273/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 390px; height: 296px;" /></p>

<p style="text-align: center;">1 pav.</p>

<ul>
	<li>5-as medis yra užgožtas. Atstumu K = 1 aplink jį auga du medžiai: 4-as ir 6-as. Skirtumas tarp auk&scaron;tesniojo 4-o medžio auk&scaron;čio (3) ir 5-o medžio auk&scaron;čio (1) yra 2 &ge; M = 2.</li>
	<li>6-as medis nėra užgožtas. Atstumu K = 1 aplink jį auga tik vienas 5-as medis. Skirtumas tarp jų auk&scaron;čių yra 0 ≱ M = 2.</li>
</ul>

<p>Raskite visus užgožtus medžius.</p>

### 입력

<p>Pirmoje eilutėje pateikti trys tarpu atskirti sveikieji skaičiai &ndash; medžių skaičius N, Liną dominantis spindulys K ir auk&scaron;čių skirtumas M.</p>

<p>Antroje eilutėje pateikta N tarpais atskirtų sveikųjų skaičių h<sub>i</sub>, žyminčių medžių auk&scaron;čius.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite vieną sveikąjį skaičių &ndash; kiek užgožtų medžių yra Lino mi&scaron;ke. Antroje eilutėje i&scaron;veskite tarpu atskirtus užgožtų medžių numerius. Numerius i&scaron;veskite didėjimo tvarka &ndash; pradedant mažiausiu ir baigiant didžiausiu.</p>

### 제한

<ul>
	<li>1 &le; N, K, M, h<sub>i</sub> &le; 200 000 (1 &le; i &le; N)</li>
</ul>