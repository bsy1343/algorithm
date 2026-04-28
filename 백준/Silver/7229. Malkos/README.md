# [Silver II] Malkos - 7229

[문제 링크](https://www.acmicpc.net/problem/7229)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 18, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

자료 구조, 덱, 그리디 알고리즘, 구현, 시뮬레이션, 정렬

### 문제 설명

<p>http://vip.latnet.lv/lio/ARHIVS/LIO04/ino17kopa.pdfaAdomas, besiruo&scaron;damas žiemai, nusipirko N malkų. Visos malkos yra vienodo skersmens, tačiau jos gali būti skirtingo ilgio. Adomas nori sukrauti visas malkas savo rūsyje.</p>

<p>Adomas malkas krauna tokiu būdu:</p>

<ol>
	<li>Ant grindų paguldoma pirma malka.</li>
	<li>Ant vir&scaron;aus paguldoma kuo daugiau malkų, statmenai pirmajai. Ant L ilgio malkos galima sukrauti daugiausiai L kitų malkų.</li>
	<li>Tuomet ant vir&scaron;aus vėl guldoma viena malka, statmenai po ja esančioms. Ji turi būti ne ilgesnė negu po ja esančių malkų skaičius.</li>
	<li>Ant vir&scaron;aus vėl paguldoma kuo daugiau malkų, statmenai. Ir taip toliau.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7229.%E2%80%85Malkos/2962a821.png" data-original-src="https://upload.acmicpc.net/cb50894b-26ba-4f6b-bc20-b4f1b6594e6c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 251px; height: 203px;" /></p>

<p style="text-align: center;">1 pav. Malkų krūvos pavyzdys.</p>

<p>Adomas nėra labai auk&scaron;tas. Tad jis nori, kad malkų krūva būtų kuo žemesnė.</p>

<p>Jums žinomi visų malkų ilgiai. Raskite, koks yra mažiausias įmanomas malkų krūvos auk&scaron;tis, jas kraunant nurodytu būdu.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas malkų skaičius N. Antroje eilutėje pateikiama N tarpais atskirtų sveikųjų skaičių L<sub>i</sub>, žyminčių malkų ilgius.</p>

### 출력

<p>I&scaron;veskite vienintelį skaičių &ndash; mažiausią įmanomą malkų krūvos auk&scaron;tį.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000</li>
	<li>1 &le; L<sub>i</sub> &le; 1 000 000 (1 &le; i &le; N)</li>
</ul>