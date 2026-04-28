# [Platinum I] Zachody Słońca 2 - 8533

[문제 링크](https://www.acmicpc.net/problem/8533)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 3, 맞힌 사람: 3, 정답 비율: 6.667%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>Mieszkańcy Bajtogrodu uwielbiają oglądać zachody Słońca z dach&oacute;w swoich dom&oacute;w mieszkalnych. Jeśli zach&oacute;d jest wyjątkowo spektakularny, niekt&oacute;rzy wybierają się nawet na dachy pobliskich budynk&oacute;w, jeśli mogą mieć stamtąd lepszy widok.</p>

<p>Miasto jest rozmieszczone na planie kwadratu o boku n, budynki znajdują się w punktach kratowych. Odległość między dwoma punktami wyraża się przez metrykę miejską.</p>

<p>Jan zamierza kupić nowe mieszkanie. Jest on wielkim miłośnikiem zachod&oacute;w Słońca i jest got&oacute;w chodzić do budynk&oacute;w położonych nie dalej niż k jednostek od swojego lokum.</p>

<p>Pom&oacute;ż Janowi podjąć trudną decyzję o wyborze lokalizacji mieszkania. Mając dany plan Bajtogrodu z podanymi wysokościami budynk&oacute;w utw&oacute;rz nowy plan, w kt&oacute;rym przy każdym budynku będzie podana wysokość najwyższego wieżowca, do kt&oacute;rego może dotrzeć Jan jeśli w tym budynku zamieszka.</p>

<p>- Zadanie</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis planu miasta,</li>
	<li>obliczy zmodyfikowany plan miasta, w kt&oacute;rym w każdym punkcie kratowym znajdzie się wysokość najwyższego budynku, oddalonego od tego punktu co najwyżej o k jednostek w metryce miejskiej i wypisze sumę tych wartości modulo 2<sup>28</sup>.</li>
</ul>

<p>Dla przypomnienia, odległość miejska dw&oacute;ch punkt&oacute;w (a<sub>x</sub>, a<sub>y</sub>) i (b<sub>x</sub>, b<sub>y</sub>) to</p>

<p>p((a<sub>x</sub>,a<sub>y</sub>),(b<sub>x</sub>,b<sub>y</sub>)) = |a<sub>x</sub> - b<sub>x</sub>| + |a<sub>y</sub> - b<sub>y</sub>|</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby naturalne n, k oraz seed(1 &le; n &le; 3000, 1 &le; k &le; 1000, 1 &le; seed &le; 1000), pooddzielane pojedynczymi odstępami. seed służy do wygenerowania planu miasta. Budynek stojący w wierszu i i kolumnie j ma wysokość (3<sup>i</sup> + 5<sup>i</sup> &middot;&nbsp;seed)mod2<sup>28</sup>.</p>

<p>&nbsp;</p>

### 출력

<p>W jedynym wierszu wyjścia ma się znaleźć jedna liczba naturalna: suma (po wszystkich domach) wysokości najwyższych budynk&oacute;w leżących w odległości co najwyżej k, modulo 2<sup>28</sup>.</p>

<p>&nbsp;</p>