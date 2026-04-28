# [Silver IV] Žvejyba - 7224

[문제 링크](https://www.acmicpc.net/problem/7224)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 100, 정답: 45, 맞힌 사람: 40, 정답 비율: 47.059%

### 분류

누적 합, 슬라이딩 윈도우

### 문제 설명

<p>Martynas planuoja i&scaron;vykti į žvejybą ir žvejodamas praleisti k dienų. Žinodamas, kad žuvys geriausiai kimba lietingomis dienomis, Martynas nori pasirinkti tokias k nuoseklių dienų, i&scaron; kurių būtų kiek įmanoma daugiau lietingų dienų.</p>

### 입력

<p>Pirmojoje įvesties eilutėje pateikti du sveikieji skaičiai: N &ndash; dienų, kuriomis gali prasidėti i&scaron;vyka, skaičius, ir k &ndash; kiek nuoseklių dienų truks i&scaron;vyka.</p>

<p>Antroji eilutė nusako N + k &minus; 1 dienų orų prognozes. Joje pateikiami simboliai c<sub>i</sub> (1 &le; i &le; N + k &minus; 1):</p>

<ul>
	<li>c<sub>i</sub> = L, jei i-toji diena yra lietinga;</li>
	<li>c<sub>i</sub> = S, jei i-toji diena yra saulėta.</li>
</ul>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; pirmos i&scaron;vykos dienos numerį. Martynas nori i&scaron;vykti žvejoti kuo greičiau, todėl jei yra keli galimi sprendiniai i&scaron;veskite tą, kurio pirmos dienos numeris yra mažiausias.</p>

### 제한

<ul>
	<li>1 &le; k, N &le; 1 000 000.</li>
</ul>