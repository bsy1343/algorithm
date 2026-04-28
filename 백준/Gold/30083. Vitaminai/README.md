# [Gold III] Vitaminai - 30083

[문제 링크](https://www.acmicpc.net/problem/30083)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 11, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Žiemos laikotarpiu svarbu pasirūpinti, kad organizmas gautų pakankamai vitaminų. Adomas, tą suprasdamas, užėjo į vaistinę &bdquo;Vitaminų Pasaulis&ldquo;. &Scaron;i vaistinė parduoda įvairiausias multivitaminų tabletes. Kadangi nesaikingai vartojant vitaminus galima pakenkti, vaistinė vienam pirkėjui parduoda ne daugiau kaip vieną tos pačios rū&scaron;ies tabletę.</p>

<p>Adomą labiausiai domina vitaminas C, kuris stiprina imunitetą, ir vitaminas D, kuris labai svarbus kaulams ir dantims. Tačiau parduotuvė turi tiek daug įvairių tablečių, kad Adomas pasimetė.</p>

<p>Žinoma koks kiekis vitamino C ir vitamino D yra kiekvienoje tabletėje, bei nurodyta kiekvienos tabletės kaina. Raskite, kiek mažiausiai turės sumokėti Adomas, kad įsigytų bent $C$ miligramų vitamino C ir bent $D$ miligramų vitamino D.</p>

### 입력

<p>Pirmojoje eilutėje įra&scaron;yti trys sveikieji skaičiai: tablečių skaičius $N$ ir Adomo norimas vitaminų kiekis $C$ ir $D$.</p>

<p>Tolimesnėse $N$ eilučių apra&scaron;ytos tabletės. Kiekvienoje eilutėje įra&scaron;ytas vitamino $C$ kiekis $c_i$, vitamino $D$ kiekis $d_i$ (miligramais), ir tabletės kaina centais $k_i$. Visi skaičiai yra sveikieji.</p>

### 출력

<p>Pirmojoje eilutėje i&scaron;veskite vieną sveikąjį skaičių: kiek mažiausiai centų turės i&scaron;leisti Adomas, kad įsigytų bent $C$ miligramų vitamino C, ir bent $D$ miligramų vitamino D.</p>

<p>Sprendinys visada egzistuos: nusipirkęs visas tabletes, Adomas visuomet gaus norimą kiekį vitaminų.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 100$</li>
	<li>$0 &le; c_i , C &le; 10\,000$</li>
	<li>$0 &le; d_i , D &le; 500$
	<ul>
		<li>$1 &le; k_i &le; 1000$</li>
	</ul>
	</li>
</ul>