# [Gold III] Kubeliai - 30084

[문제 링크](https://www.acmicpc.net/problem/30084)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Turime dvi detales, sudarytas i&scaron; mažų kubelių. Abi detalės yra $1$ kubelio pločio ir $2$ kubelių auk&scaron;čio. Pirmosios detalės vir&scaron;utinioji eilė ir antrosios detalės apatinioji eilė yra pilnai užpildytos, pavyzdžiui:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d80bdef4-2c2d-4714-a9e5-ffad419fc6f6/-/preview/" style="width: 258px; height: 166px;" /></p>

<p>Keliais būdais &scaron;ias detales galima pastatyti vieną ant kitos taip, kad detalės liestųsi ir bendras auk&scaron;tis būtų ne daugiau kaip $3$?</p>

<p>Detalių negalima vartyti ir sukioti, ir bent vienas antros detalės kubelis turi būti po pirma detale.</p>

<p>Paveiksliuke matome pavyzdį, kur vir&scaron;utinę detalę galime tiesiai nuleisti ant apatinės, taip gaudami galimą konfigūraciją.</p>

### 입력

<p>Pirmojoje eilutėje pateikti keturi sveikieji skaičiai &ndash; pirmosios detalės ilgis $M$, antrosios detalės ilgis $L$, pirmosios detalės apatinės eilės kubelių skaičius $N$ ir antrosios detalės vir&scaron;utinės eilės kubelių skaičius $K$.</p>

<p>Antrojoje eilutėje pateikiama $N$ tarpu atskirtų sveikųjų skaičių $a_i$ &ndash; pirmosios detalės apatinės eilės kubelių pozicijos.</p>

<p>Trečiojoje eilutėje pateikiama $K$ tarpu atskirtų sveikųjų skaičių $b_i$ &ndash; antrosios detalės vir&scaron;utinės eilės kubelių pozicijos.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; kiek yra būdų &scaron;ias detales sustatyti vieną ant kitos taip, kad detalės liestųsi ir bendras auk&scaron;tis būtų ne daugiau kaip $3$.</p>

### 제한

<ul>
	<li>$1 &le; M, L &le; 10^9$</li>
	<li>$1 &le; N, K &le; 1\,000$</li>
	<li>$1 &le; a_i &lt; a_j &le; M$ ($1 &le; i &lt; j &le; N$)</li>
	<li>$1 &le; b_i &lt; b_j &le; L$ ($1 &le; i &lt; j &le; K$)</li>
</ul>