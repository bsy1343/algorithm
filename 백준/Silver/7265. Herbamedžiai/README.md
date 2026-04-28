# [Silver II] Herbamedžiai - 7265

[문제 링크](https://www.acmicpc.net/problem/7265)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 23, 맞힌 사람: 17, 정답 비율: 65.385%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Ūkininkė Ugnė savo sode pasodino N herbamedžių. Ji juos pasodino tiesia linija ir sunumeravo i&scaron; eilės nuo 1 iki N.</p>

<p>Deja, vos tik pasirodė pirmosios uogų užuomazgos, Ugnė suprato, kad medžiai yra susodinti per tankiai. Jei ji nieko nesigriebs, greta augantys medžiai užgo&scaron; vieni kitus ir ji &scaron;iais metais liks be herbauogių.</p>

<p>Norėdama to i&scaron;vengti, Ugnė planuoja persodinti kai kuriuos medžius &ndash; &scaron;ie medžiai derliaus nebeduos. Jei Ugnė nori palikti medį i, jai būtinai teks persodinti medžius i &minus; 1 ir i + 1.</p>

<p>Kaip Ugnei pasirinkti medžius persodinimui, kad likęs derlius būtų kiek įmanoma didesnis?</p>

### 입력

<p>Pirmoje eilutėje pateikiamas medžių skaičių N. Likusiose N eilučių pateikiama po skaičių A<sub>i</sub> &ndash; užsimezgusių uogų kiekį i-tajame medyje.</p>

### 출력

<p>Jums reikia i&scaron;vesti vieną skaičių &ndash; kiek daugiausiai uogų gali tikėtis Ugnė, jei medžius ji persodins optimaliai.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000</li>
	<li>1 &le; A<sub>i</sub> &le; 1 000</li>
</ul>