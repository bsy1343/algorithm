# [Silver III] Kosminė asamblėja - 7212

[문제 링크](https://www.acmicpc.net/problem/7212)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 17, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

정렬

### 문제 설명

<p>Kosminė kompanija rengia $N$ padalinių vykdomųjų direktorių susitikimą. Kiekvienas direktorius turi po asmeninį vienvietį erdvėlaivį, taip pat žinomos jų visų koordinatės $(x_i , y_i , z_i)$.</p>

<p>Erdvėlaivių kuras yra labai brangus, todėl kompanija nori parinkti tokią susitikimo vietą $(x, y, z)$, kad visų kelionių atstumų suma būtų kuo mažesnė. Kosminio eismo taisyklės liepia kiekvienu momentu judėti tik $x$, $y$, arba $z$ kryptimi, todėl vienos kelionės atstumas apskaičiuojamas taip: $|x_i &minus; x| + |y_i &minus; y| + |z_i &minus; z|$.</p>

<p>Žinomos direktorių koordinatės, raskite tinkamiausią vietą susitikimui. Susitikimo vieta turėtų būti nesunkiai nurodoma žemėlapyje, todėl susitikimo vietos koordinatės privalo būti sveikieji skaičiai.</p>

### 입력

<p>Pirmojoje eilutėje įra&scaron;ytas direktorių skaičius $N$. Kitose $N$ eilučių pateikiama po tris tarpais atskirtus sveikuosius skaičius $x_i$, $y_i$, $z_i$, nurodančius i-tojo direktoriaus buvimo koordinates.</p>

<p>Keli direktoriai pradiniu laiko metu gali būti vienoje vietoje.</p>

### 출력

<p>I&scaron;veskite susitikimo vietos koordinates &ndash; tarpais atskirtus sveikuosius skaičius $x$, $y$, $z$. Jei yra keli galimi sprendiniai, i&scaron;veskite bet kurį.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 100\,000$</li>
	<li>$-10^8 &le; x_i , y_i , z_i &le; 10^8$</li>
</ul>