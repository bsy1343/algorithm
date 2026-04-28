# [Bronze III] Internetas - 7281

[문제 링크](https://www.acmicpc.net/problem/7281)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 348, 정답: 283, 맞힌 사람: 256, 정답 비율: 84.768%

### 분류

수학, 구현

### 문제 설명

<p>Tomo internetas veikia prastai &ndash; kartais ry&scaron;ys ima ir pradingsta. Tomas nori sužinoti, kiek jam gali tekti laukti, kol pradingęs interneto ry&scaron;ys vėl atsiras, todėl laikas nuo laiko jis patikrina ir pasižymi ar turi interneto ry&scaron;į tuo momentu.</p>

<p>Tomas prisimena, kad pirmo ir paskutinio matavimo metu jis interneto ry&scaron;į turėjo.</p>

<p>Padėkite Tomui sužinoti, kiek ilgiausiai laiko jis galėjo neturėti interneto.</p>

### 입력

<p>Pirmoje eilutėje yra pateiktas vienas sveikasis skaičius N &ndash; matavimų, kuriuos atliko Tomas, kiekis.</p>

<p>Kiekvienoje i&scaron; N tolimesnių eilučių yra pateikti 2 sveikieji skaičiai: T<sub>i</sub> &ndash; laikas, kuriuo Tomas įvykdė i-tąjį matavimą, ir M<sub>i</sub> &ndash; atlikto matavimo rezultatas. M<sub>i</sub> yra 1, jei matavimo metu interneto ry&scaron;ys buvo, arba 0, jei tuo metu interneto ry&scaron;io Tomas neturėjo.</p>

<p>Matavimai yra pateikti T<sub>i</sub> didėjimo tvarka.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; ilgiausią laiko tarpą, kurio metu Tomas galėjo neturėti interneto.</p>

### 제한

<ul>
	<li>2 &le; N &le; 1 000</li>
	<li>1 &le; T<sub>i</sub> &le; 1 000 000</li>
	<li>T<sub>i</sub> &lt; T<sub>i+1</sub></li>
</ul>