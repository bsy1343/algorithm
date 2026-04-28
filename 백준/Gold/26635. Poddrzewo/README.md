# [Gold III] Poddrzewo - 26635

[문제 링크](https://www.acmicpc.net/problem/26635)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

애드 혹, 트리, 해 구성하기

### 문제 설명

<p>Gdy uciekasz przed niedźwiedziem, kt&oacute;ry chce się z Tobą pobawić i/lub skonsumować Cię na kolację, bardzo ważne jest rozpoznać jego gatunek:</p>

<ul>
	<li>jeśli biegniesz i biegniesz, znajdujesz drzewo i wdrapujesz się na nie, a niedźwiedź za Tobą, to jest to niedźwiedź brunatny,</li>
	<li>jeśli biegniesz i biegniesz, znajdujesz drzewo i wdrapujesz się na nie, a niedźwiedź strząsa Cię z niego, to jest to niedźwiedź grizzly,</li>
	<li>jeśli biegniesz i biegniesz i nie możesz znaleźć drzewa, to jest to niedźwiedź polarny.</li>
</ul>

<p>Skupmy się zatem na znalezieniu drzewa. W informatyce drzewo to po prostu zbi&oacute;r k wierzchołk&oacute;w oraz k &minus; 1 krawędzi, z kt&oacute;rych każda łączy pewne dwa wierzchołki. Połączenia muszą gwarantować, że z każdego wierzchołka da się osiągnąć każdy inny, idąc wyłącznie po krawędziach. Liczbę krawędzi, kt&oacute;re wychodzą z wierzchołka nazywamy stopniem tego wierzchołka.</p>

<p>Dany jest ciąg n liczb a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>. Podejrzewasz, że jest to lista stopni wszystkich wierzchołk&oacute;w pewnego drzewa. Niestety, do ciągu zaplątały się pewne przypadkowe liczby, a w dodatku niekt&oacute;re inne zostały po drodze błędnie przepisane. Usuń niepotrzebne liczby z ciągu i zmień niekt&oacute;re inne tak, aby faktycznie była to prawidłowa lista stopni.</p>

<p>Formalnie, możesz zmienić kolejność element&oacute;w danego ciągu n liczb, usunąć niekt&oacute;re z nich, po czym zmienić niekt&oacute;re z pozostałych element&oacute;w. Dla uzyskanego ciągu liczb d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>k</sub> musisz podać drzewo o k &ge; 2 wierzchołkach (ponumerowanych od 1 do k) takie, że d<sub>i</sub> to stopień i-tego wierzchołka. Zar&oacute;wno liczba usuniętych, jak i zmienionych wierzchołk&oacute;w może być dowolna (także r&oacute;wna 0) &ndash; Twoim zadaniem jest znaleźć rozwiązanie o minimalnej liczbie zmienionych wierzchołk&oacute;w.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera liczbę całkowitą n (2 &le; n &le; 10<sup>6</sup>) &ndash; liczbę element&oacute;w ciągu. Kolejny wiersz zawiera ciąg n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; n &minus; 1).</p>

### 출력

<p>W pierwszym wierszu wypisz liczbę zmienionych element&oacute;w x (tę wartość masz zminimalizować). W drugim wierszu wypisz rozmiar drzewa k (2 &le; k &le; n). W każdym z kolejnych k &minus; 1 wierszy wypisz po dwie liczby u<sub>i</sub> oraz v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; k), opisujące krawędź między wierzchołkami u<sub>i</sub> i v<sub>i</sub>. Wypisane krawędzie muszą tworzyć drzewo.</p>

<p>Jeśli istnieje wiele rozwiązań, wypisz dowolne z nich. Nie musisz minimalizować ani maksymalizować wartości k.</p>