# [Gold III] Bitocja - 8639

[문제 링크](https://www.acmicpc.net/problem/8639)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 15, 맞힌 사람: 15, 정답 비율: 30.612%

### 분류

데이크스트라, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>W pewnym państwie zwanym Bitocją mieszka bardzo bogaty prezes BitBanku Bitazar. Codziennie dojeżdża on do pracy pokonując drogę z miasta $1$&nbsp;do miasta $n$. Do tej pory w Bitocji istniała sieć dwukierunkowych dr&oacute;g pozwalających Bitazarowi dojechać do celu, lecz podr&oacute;ż w jego mniemaniu trwa zbyt długo. Prezes Bitazar ogłosił wśr&oacute;d firm budowlanych przetarg na budowę nowych połączeń, kt&oacute;re pozwoliłyby mu zminimalizować czas dojazdu do pracy. W odpowiedzi otrzymał oferty. Dla każdej z nich musi rozstrzygnąć, czy dana droga skraca czas przejazdu z miasta $1$&nbsp;do miasta $n$. Jeśli tak, to firma buduje tę drogę, a Bitazar rozważa kolejne propozycje przyjmując, że droga została wybudowana. W przeciwnym wypadku rozważana jest następna oferta, a stan dr&oacute;g nie ulega zmianie. Twoim zadaniem jest pom&oacute;c prezesowi w wyborze nowych dr&oacute;g do budowy.</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis dr&oacute;g istniejących oraz propozycji nowych połączeń,</li>
	<li>dla każdej proponowanej nowej drogi odpowie na pytanie, czy spełnia ona wymagania prezesa Bitazara,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy wiersz zawiera trzy liczby: $n$&nbsp;($1 &le; n &le; 100$), $k$&nbsp;($1 &le; k &le; \frac{n(n-1)}{2}$) i $m$&nbsp;($1 &le; m &le; 10\,000$), czyli kolejno ilość miast (miasta są ponumerowane liczbami całkowitymi z zakresu $[1...n]$), ilość dr&oacute;g już wybudowanych oraz ilość propozycji nowych dr&oacute;g do wybudowania. Kolejne $k$&nbsp;wierszy zawiera opis dr&oacute;g już istniejących, a dalsze m wierszy opis propozycji nowych dr&oacute;g. Opis drogi już istniejącej, jak i propozycja składa się z tr&oacute;jki liczb ($a$, $b$, $w$), gdzie $a$&nbsp;i $b$&nbsp;to numery miast, kt&oacute;re łączy dana droga ($1 &le; a, b &le; n$), oraz $w$&nbsp;- czas przejazdu daną drogą $1 &le; w &le; 1\,000\,000$).</p>

### 출력

<p>Dla każdej propozycji nowej drogi wypisz $1$, jeśli Bitazar powinien ofertę przyjąć, albo $0$&nbsp;jeśli powinien ją odrzucić.</p>