# [Bronze I] Pjūklas - 7239

[문제 링크](https://www.acmicpc.net/problem/7239)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 126, 정답: 95, 맞힌 사람: 89, 정답 비율: 75.424%

### 분류

구현, 정렬, 해 구성하기

### 문제 설명

<p>Duota N skirtingų natūraliųjų skaičių, i&scaron; kurių reikia sudaryti pjūklinę seką panaudojant visus skaičius lygiai vieną kartą.</p>

<p>Skaičių seką vadiname pjūkline, jei kas antras narys yra didesnis už greta esančius, o kas antras &ndash; mažesnis.</p>

<p>I&scaron; duotų skaičių sudarykite pjūklo formos seką, t.y. tokią, kuriai galioja viena i&scaron; taisyklių:</p>

<ul>
	<li>a<sub>1</sub> &lt; a<sub>2</sub> &gt; a<sub>3</sub> &lt; a<sub>4</sub> &gt; a<sub>5</sub> &lt; a<sub>6</sub> &gt; a<sub>7</sub>... arba</li>
	<li>a<sub>1</sub> &gt; a<sub>2</sub> &lt; a<sub>3</sub> &gt; a<sub>4</sub> &lt; a<sub>5</sub> &gt; a<sub>6</sub> &lt; a<sub>7</sub>...</li>
</ul>

### 입력

<p>Pirmoje eilutėje pateiktas duotų skaičių kiekis N. Kitoje eilutėje pateikta N skirtingų natūraliųjų skaičių a<sub>i</sub>.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite pjūklo formos seką, sudarytą i&scaron; visų duotųjų skaičių, atskirtų tarpu.</p>

<p>Jei yra keli galimi sprendiniai, pateikite bent kurį.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1000</li>
	<li>1 &le; a<sub>i</sub> &le; 10000</li>
</ul>