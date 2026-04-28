# [Platinum III] Wyprzedzanie - 26788

[문제 링크](https://www.acmicpc.net/problem/26788)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 6, 맞힌 사람: 5, 정답 비율: 9.259%

### 분류

이분 탐색, 볼록 껍질을 이용한 최적화, 자료 구조, 분리 집합, 구현, 우선순위 큐, 시뮬레이션, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Bajtazar jedzie nad morze swoim nowym sportowym autem. Jedzie autostradą i jak przystało na porządnego kierowcę, porusza się prawym pasem. Jednak przed nim prawym pasem autostrady jedzie też n ciężar&oacute;wek, kt&oacute;re będzie musiał wyprzedzić.</p>

<p>Ciężar&oacute;wki numerujemy od 1 do n, poczynając od tej najbliższej auta Bajtazara; i-ta z nich porusza się z prędkością v<sub>i</sub>, ma długość d<sub>i</sub> oraz w chwili początkowej znajduje się x<sub>i</sub> przed autem Bajtazara. Dla uproszczenia samochody traktujemy jak prostokąty bez brzegu, a za ich pozycję przyjmujemy przedni bok.</p>

<p>Jeśli z powodu r&oacute;żnicy prędkości prz&oacute;d i-tej ciężar&oacute;wki zr&oacute;wna się z tyłem ciężar&oacute;wki ją poprzedzającej (tej o numerze i + 1), to i-ta ciężar&oacute;wka zwalnia do prędkości (i + 1)-szej ciężar&oacute;wki (czyli ciężar&oacute;wki nie wyprzedzają się nawzajem).</p>

<p>Bajtazar jedzie z prędkością V , szybciej niż każda z ciężar&oacute;wek (V &gt; vi dla każdego i), a jego auto ma długość D. W momencie, gdy prz&oacute;d auta zr&oacute;wna się z tyłem jakiejś ciężar&oacute;wki, Bajtazar momentalnie wykonuje manewr zmiany pasa i kontynuuje jazdę lewym pasem. Gdy tylko będzie możliwa zmiana pasa na prawy, Bajtazar wykonuje ten manewr (nawet gdyby w tym samym momencie musiał zn&oacute;w zmienić pas na lewy).</p>

<p>Bajtazar zastanawia się, ile razy podczas wyprzedzania wszystkich ciężar&oacute;wek wykona manewr zmiany pasa z prawego na lewy. Zakładamy, że w chwili obecnej autostradą nie jedzie żaden inny samoch&oacute;d.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się cztery liczby całkowite n, D, W, M (1 &le; n &le; 100 000, 1 &le; D &le; 10<sup>9</sup>, 1 &le; W, M &le; 1000) oznaczające liczbę ciężar&oacute;wek, długość auta Bajtazara i jego prędkość daną wzorem V = W/M.</p>

<p>W kolejnych n wierszach znajdują się opisy ciężar&oacute;wek; i-ty z nich zawiera cztery liczby całkowite x<sub>i</sub>, d<sub>i</sub>, w<sub>i</sub>, m<sub>i</sub> (1 &le; x<sub>i</sub>, d<sub>i</sub> &le; 10<sup>9</sup>, 1 &le; w<sub>i</sub>, m<sub>i</sub> &le; 1000). Prędkość ciężar&oacute;wki to v<sub>i</sub> = w<sub>i</sub>/m<sub>i</sub>.</p>

<p>Pojazdy nie nachodzą na siebie, czyli 0 &le; x<sub>1</sub> &minus; d<sub>1</sub> oraz x<sub>i</sub> &le; x<sub>i+1</sub> &minus; d<sub>i+1</sub> dla 1 &le; i &lt; n.</p>

<p>Wszystkie długości i położenia wyrażone są w jednostkach odległości, a prędkości w jednostkach odległości na jednostkę czasu.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jeden wiersz zawierający liczbę całkowitą oznaczającą, ile razy Bajtazar wykona manewr zmiany pasa na lewy.</p>

### 힌트

<p>Wyjaśnienie przykładu: Auto Bajtazara porusza się z prędkością 1, a ciężar&oacute;wki z prędkościami 1/4 , 1/2 i 1/4 . W chwili 1+1/3 Bajtazar dojeżdża do pierwszej ciężar&oacute;wki i zmienia pas na lewy, w chwili 5+1/3 z powrotem wraca na prawy pas. W chwili 6 drugi raz zmienia pas na lewy. W chwili 8 druga ciężar&oacute;wka dojeżdża do trzeciej i zmniejsza prędkość do 1/4. W chwili 14+2/3 Bajtazar powraca na prawy pas.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26788.%E2%80%85Wyprzedzanie/9ed40554.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26788.%E2%80%85Wyprzedzanie/9ed40554.png" data-original-src="https://upload.acmicpc.net/7c932418-c6dc-4206-a6fe-00651ce9696b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 552px; height: 239px;" /></p>