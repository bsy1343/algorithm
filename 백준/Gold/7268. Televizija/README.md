# [Gold III] Televizija - 7268

[문제 링크](https://www.acmicpc.net/problem/7268)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 스위핑

### 문제 설명

<p>Kitą sezoną bus pradedama rodyti N naujų serialų. &Scaron;iandien bus rodoma po vieną kiekvieno serialo seriją: i-tojo serialo serija prasidės laiko momentu a<sub>i</sub>, o baigsis laiko momentu b<sub>i</sub>. Visi serialai rodomi skirtinguose kanaluose, tad jų laikai gali persidengti.</p>

<p>Jūs planuojate žiūrėti TV visą dieną ir i&scaron;sirinkti, kuriuos serialus bus verta sekti likusį sezoną. &Scaron;į laiką norite i&scaron;naudoti optimaliai &ndash; kiekvienu laiko momentu, kuriuo rodomi serialai, jūs norite žiūrėti vieną i&scaron; jų. Jūs taip norėtumėte peržiūrėti kiek įmanoma mažiau skirtingų serialų &ndash; sekti per daug skirtingų dalykų visą sezoną būtų labai sunku.</p>

<p>Žinant &scaron;iuos apribojimus, kuriuos serialus verta žiūrėti?</p>

### 입력

<p>Pirmoje eilutėje pateikiamas serialų skaičius N. Likusiose N eilučių pateikiama po du sveikuosius skaičius a<sub>i</sub> ir b<sub>i</sub> (a<sub>i</sub> &lt; b<sub>i</sub>).</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite vieną sveikąjį skaičių &ndash; kiek serialų verta žiūrėti.</p>

<p>Antroje eilutėje i&scaron;veskite tarpais atskirtus serialų, kuriuos verta žiūrėti, numerius.</p>

<p>Jeigu yra keli atsakymo variantai, i&scaron;veskite bet kurį.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000</li>
	<li>1 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; 1 000 000</li>
</ul>