# [Silver I] Laivas - 30285

[문제 링크](https://www.acmicpc.net/problem/30285)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 11, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Kostas yra krovininio laivo, kuris jūra transportuoja automobilius, kapitonas. Jo laivo krovininis denis yra stačiakampio formos kurio ilgis yra a metrų, o plotis b metrų. Vienu reisu kapitonas plukdo tik vienos markės automobilius, kurių pločiai yra vienodi ir ilgiai yra vienodi.</p>

<p>Užsakovas papra&scaron;ė Kosto perplukdyti n automobilių, kurių ilgis &ndash; c metrų, o plotis &ndash; d metrų.</p>

<p>Padėkite Kostui suskaičiuoti, ar jam pavyks sutalpinti visus automobilius į laivą. Automobiliai į laivą talpinami eilėmis. Eilės formuojamos tik i&scaron;ilgai arba tik skersai laivo denio (t.y. negali būti, kad laive yra viena eilė yra i&scaron;ilgai denio, o kita &ndash; skersai).</p>

<p>Automobiliai eilėse statomi i&scaron;ilgai arba skersai, tačiau toje pačioje eilėje visi automobiliai statomi viena kryptimi.</p>

### 입력

<p>Pirmojoje eilutėje yra pateikiami du sveikieji skaičiai: a &ndash; krovininio denio ilgis ir b &ndash; denio plotis.</p>

<p>Antrojoje eilutėje pateikiami kiti du sveikieji skaičiai: c &ndash; vieno transportuojamo automobilio ilgis ir d &ndash; transportuojamo automobilio plotis.</p>

<p>Trečiojoje eilutėje pateikiamas vienas skaičius: norimų perplukdyti automobilių kiekis.</p>

### 출력

<p>I&scaron;veskite žodį TAIP jei į Kosto laivą galima sutalpinti visus automobilius. Jei automobilių sutalpinti negalima, i&scaron;veskite kiek daugiausiai automobilių galima sutalpinti į Kosto laivą.</p>

### 제한

<ul>
	<li>1 &le; a, b, c, d &le; 1000</li>
	<li>n &le; 100 000</li>
</ul>