# [Silver I] Metro - 7277

[문제 링크](https://www.acmicpc.net/problem/7277)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 14, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Metro linijoje važiuoja T traukinių. Idealiu atveju, visi traukiniai būna i&scaron;sidėstę vienodais atstumais &ndash; tokiu atveju sakome, kad eismas yra reguliarus. Tačiau dažnai, dėl įvairių priežasčių, traukiniai priartėja arba nutolsta vieni nuo kitų. Todėl karts nuo karto visų traukinių papra&scaron;oma sustoti ir palaukti kažkiek minučių. &Scaron;is procesas yra vadinamas reguliarizacija.</p>

<p>Jums žinomi atstumai tarp visų traukinių, matuojami minutėmis. Raskite, kiek minučių turi palaukti kiekvienas traukinys, kad eismas taptų reguliarus ir atstumas tarp visų gretimų traukinių būtų lygus lygiai M minučių.</p>

<p>Laikyti traukinius sustabdytus yra brangu, tad jei yra keli galimi atsakymai, i&scaron;veskite tą, kuriame bendra laukiamo laiko suma yra mažiausia.</p>

### 입력

<p>Pirmoje eilutėje pateikti du sveikieji skaičiai: T &ndash; traukinių skaičius, ir M &ndash; pageidaujamas atstumas tarp visų gretimų traukinių.</p>

<p>Antroje eilutėje yra įra&scaron;yti T &minus; 1 skaičių m<sub>1</sub>, m<sub>2</sub>, . . . m<sub>T-1</sub> &ndash; tai atstumai tarp visų gretimų traukinių metro linijoje.</p>

### 출력

<p>I&scaron;veskite T skaičių vienoje eilutėje &ndash; kiek minučių turi palaukti kiekvienas traukinys, kad eismas taptų reguliarus (visi atstumai būtų lygūs M).</p>

### 제한

<ul>
	<li>1 &lt; T &le; 100 000</li>
	<li>1 &le; m<sub>1</sub>, m<sub>2</sub>, . . . m<sub>T-1</sub>, M &le; 1 000</li>
</ul>