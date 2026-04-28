# [Gold V] Samochody dostawcze - 26682

[문제 링크](https://www.acmicpc.net/problem/26682)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Bajtazar jest logistykiem w firmie dostarczającej zapasy do sklep&oacute;w. W mieście, w kt&oacute;rym operuje jego firma, sieć drogowa składa się z poziomych ulic (biegnących z zachodu na wsch&oacute;d) oraz pionowych alei (biegnących z południa na p&oacute;łnoc). Każda sąsiednia para ulic oraz alei oddalona jest od siebie o jeden kilometr. Ulice numerujemy liczbami całkowitymi w kolejności z południa na p&oacute;łnoc, a aleje numerujemy w kolejności z zachodu na wsch&oacute;d. Skrzyżowanie i-tej alei i j-tej ulicy możemy opisać jako (i, j). Możesz założyć, że dla dowolnej liczby całkowitej istnieje zar&oacute;wno ulica jak i aleja z takim numerem.</p>

<p>Bajtazar zaplanował na jutro n dostaw; i-tą dostawę będzie realizował samoch&oacute;d, kt&oacute;ry wyjedzie z garażu w chwili t<sub>i</sub> i pojedzie ulicą lub aleją ze stałą prędkością kilometra na jednostkę czasu. Dostawa może być jednego z dw&oacute;ch typ&oacute;w: dla dostawy typu pierwszego garaż znajduje się przy skrzyżowaniu (w<sub>i</sub>, 0), a samoch&oacute;d jedzie aleją w<sub>i</sub> na p&oacute;łnoc; dla dostawy typu drugiego garaż jest przy skrzyżowaniu (0, w<sub>i</sub>), a samoch&oacute;d jedzie ulicą w<sub>i</sub> na wsch&oacute;d. Wedle planu z każdego garażu w każdym momencie wyjeżdża co najwyżej jeden samoch&oacute;d.</p>

<p>Samochody nie muszą się zatrzymywać &ndash; przejeżdżając obok odpowiednich budynk&oacute;w, kierowcy po prostu wyrzucają pożądaną paczkę. Jest jednak pewien problem &ndash; jeśli dwa samochody dostawcze znajdą się w tym samym momencie na tym samym skrzyżowaniu, to zapewne dojdzie do stłuczki. Bajtazar bardzo chciałby tego uniknąć. Niestety, jedyne co może zrobić, to całkowite odwołanie niekt&oacute;rych dostaw. Chciałby zatem wybrać jak najmniej samochod&oacute;w do odwołania tak, aby spośr&oacute;d pozostałych żadne dwa nie znalazły się w tym samym czasie na tym samym skrzyżowaniu.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 5 &middot; 10<sup>5</sup>), oznaczająca liczbę zaplanowanych dostaw.</p>

<p>W kolejnych n wierszach znajdują się opisy zaplanowanych dostaw; i-ty z tych wierszy składa się z trzech liczb całkowitych r<sub>i</sub>, w<sub>i</sub> i t<sub>i</sub> (r<sub>i</sub> &isin; {1, 2}; 1 &le; w<sub>i</sub> &le; 10<sup>6</sup>; 0 &le; t<sub>i</sub> &le; 10<sup>6</sup>), oznaczających typ i-tej dostawy, położenie garażu i czas wyjazdu.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną możliwą liczbę dostaw, kt&oacute;re należy odwołać.</p>

### 힌트

<p>Wyjaśnienie przykładu: Pr&oacute;ba zrealizowania wszystkich czterech dostaw spowoduje kolizję pierwszego i drugiego samochodu na skrzyżowaniu (5, 3) w chwili 5. Po odwołaniu pierwszej dostawy, nadal będziemy mieli kolizję drugiego i czwartego samochodu na skrzyżowaniu (7, 3) w chwili 7. Z kolei po odwołaniu drugiej dostawy żadne z pozostałych samochod&oacute;w się nie zderzą.</p>