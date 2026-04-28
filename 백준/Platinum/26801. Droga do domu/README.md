# [Platinum III] Droga do domu - 26801

[문제 링크](https://www.acmicpc.net/problem/26801)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 11, 맞힌 사람: 11, 정답 비율: 32.353%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Sieć drogowa Bajtogrodu składa się z n skrzyżowań połączonych m dwukierunkowymi drogami. Każda droga łączy dwa r&oacute;żne skrzyżowania. Każde dwa skrzyżowania połączone są co najwyżej jedną drogą. Drogi mogą prowadzić przez tunele i estakady.</p>

<p>Przy skrzyżowaniu numer 1 znajduje się szkoła, do kt&oacute;rej chodzi Bajtek, a przy skrzyżowaniu numer n jego dom. Rano do szkoły podwożą go rodzice, ale do domu wraca już sam, korzystając z komunikacji miejskiej. Kolejny raz w tym roku zmienił się rozkład jazdy autobus&oacute;w. Ponieważ w Bajtogrodzie obowiązują jedynie bilety jednorazowe kasowane przy każdym wejściu do autobusu, Bajtek postanowił opracować najszybszy plan powrotu do domu, w kt&oacute;rym będzie co najwyżej k przesiadek. Pom&oacute;ż mu!</p>

<p>Każdy autobus danej linii jedzie po ustalonej trasie, przejeżdżając przez pewne skrzyżowania. Na każdym z tych skrzyżowań zatrzymuje się i można do niego wejść lub z niego wyjść. Autobusy danej linii odjeżdżają w r&oacute;wnych odstępach czasu (szczeg&oacute;ły są opisane w sekcji Wejście).</p>

<p>Zakładamy, że czas:</p>

<ul>
	<li>postoju na skrzyżowaniach,</li>
	<li>przesiadki z autobusu do autobusu (o ile nie trzeba na niego czekać),</li>
	<li>przejścia od szkoły do skrzyżowania numer 1 oraz przejścia od skrzyżowania numer n do domu</li>
</ul>

<p>jest pomijalnie mały.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się pięć liczb całkowitych n, m, s, k i t (2 &le; n &le; 10 000, 1 &le; m &le; 50 000, 1 &le; s &le; 25 000, 0 &le; k &le; 100, 0 &le; t &le; 10<sup>9</sup>) oznaczających kolejno: liczbę skrzyżowań, dr&oacute;g i linii autobusowych w Bajtogrodzie, maksymalną liczbę przesiadek, kt&oacute;re może zrobić Bajtek, oraz minutę, w kt&oacute;rej wychodzi ze szkoły. Skrzyżowania numerujemy od 1 do n.</p>

<p>W kolejnych m wierszach znajdują się opisy dr&oacute;g; każdy z nich zawiera trzy liczby całkowite a, b i c (1 &le; a, b &le; n, a &ne; b, 1 &le; c &le; 10<sup>9</sup>) oznaczające, że skrzyżowania o numerach a i b są połączone dwukierunkową drogą, kt&oacute;rej przejechanie (dowolnym autobusem, kt&oacute;ry jeździ tą drogą) zajmuje c minut. Każda para nieuporządkowana {a, b} pojawi się na wejściu co najwyżej raz.</p>

<p>Kolejne 2s wierszy zawiera opisy linii autobusowych; każdy opis w dw&oacute;ch wierszach. Pierwszy wiersz opisu zawiera trzy liczby całkowite ℓ, x i y (2 &le; ℓ &le; n, 0 &le; x &le; 10<sup>9</sup>, 1 &le; y &le; 10<sup>9</sup>), a drugi ciąg parami r&oacute;żnych liczb całkowitych v<sub>1</sub>, v<sub>2</sub>, . . . , v<sub>ℓ</sub> (1 &le; v<sub>i</sub> &le; n). Oznacza to, że autobus danej linii wyrusza ze skrzyżowania numer v<sub>1</sub> w minutach x + j &middot; y dla j = 0, 1, 2, . . ., a następnie jedzie kolejno skrzyżowaniami o numerach v<sub>2</sub>, v<sub>3</sub>, . . . , v<sub>ℓ</sub>.</p>

<p>Suma liczb ℓ dla wszystkich linii autobusowych nie przekracza 50 000.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jeden wiersz zawierający liczbę całkowitą oznaczającą najwcześniejszą minutę, w kt&oacute;rej Bajtek może dotrzeć do domu, jeżeli wyszedł ze szkoły w minucie t. Jeśli Bajtkowi nie uda się w og&oacute;le dotrzeć do domu, należy zamiast tego wypisać tylko jedno słowo <code>NIE</code>.</p>

### 힌트

<p>Wyjaśnienie przykładu: Poniższy rysunek obrazuje sieć drogą Bajtogrodu z testu przykładowego. K&oacute;łka oznaczają skrzyżowania, liczby wewnątrz k&oacute;łek to ich numery. Kreski oznaczają drogi, a liczby przy nich napisane oznaczają czas przejazdu daną drogą. Trasa przejazdu autobusu linii 1 jest oznaczona kolorem czerwonym, natomiast trasa autobusu linii 2 &ndash; kolorem niebieskim.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26801.%E2%80%85Droga%E2%80%85do%E2%80%85domu/ed9107fe.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26801.%E2%80%85Droga%E2%80%85do%E2%80%85domu/ed9107fe.png" data-original-src="https://upload.acmicpc.net/e82ac8e5-74ef-42f6-bd2a-f8075e0d42e1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 186px; height: 100px;" /></p>

<p>Bajtek wychodzi ze szkoły w minucie t = 1, czeka na autobus linii 2, kt&oacute;ry przyjeżdża w minucie 2, jedzie nim do skrzyżowania numer 3, tam przesiada się w minucie 6 na autobus linii 1, kt&oacute;ry przyjeżdża do jego domu w minucie 8.</p>

<p>Dla k = 0 Bajtek musiałby poczekać przy skrzyżowaniu 1 na autobus linii 1, kt&oacute;ry wyruszyłby w minucie 10 i dowi&oacute;zł Bajtka do domu w minucie 18.</p>