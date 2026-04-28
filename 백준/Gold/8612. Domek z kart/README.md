# [Gold II] Domek z kart - 8612

[문제 링크](https://www.acmicpc.net/problem/8612)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Marcel dostał w tym roku na urodziny talię bardzo specyficznych kart. Nie służą one do gry, lecz do budowania domk&oacute;w z kart. Zaraz po rozpakowaniu prezentu niecierpliwy Marcel zbudował ogromną wieżę. Zrobił to w następujący spos&oacute;b: w pierwszej kolejności opierał karty parami o siebie, następnie na powstałych szczytach stawiał kolejne karty, zn&oacute;w opierając je parami o siebie, i tak dalej. Okazało się, że na każdym piętrze, poza ostatnim, liczba szczyt&oacute;w była parzysta, więc zawsze dało się poprawnie zbudować wyższe piętro.</p>

<p>Każda z kart w talii ma swoją wartość. Teraz Marcel żałuje, że nie przemyślał lepiej swojej konstrukcji i zużył zbyt dużo wartościowych kart. Znając wartość każdej karty, chciałby zdjąć nie więcej niż $k$&nbsp;kart z wieży tak, aby suma ich wartości była jak największa. Oczywiście domek z kart nie może się przy tym zawalić!</p>

<p>Aby po wyjęciu kart domek nadal był stabilny, Marcel nie może nigdy zdjąć pojedynczej karty, nie wyjmując zarazem jej pary (tzn. tej karty, z kt&oacute;rą nawzajem się podpierają). Ponadto nigdy nie może zdjąć karty, nie zdjąwszy wcześniej wszystkich kart, kt&oacute;re są wyżej od niej i pośrednio lub bezpośrednio są o nią oparte.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;i $k$, $2 &le; n &le; 17$, $2 &le; k &le; 40$, oznaczające odpowiednio liczbę pięter karcianej wieży i maksymalną liczbę kart, kt&oacute;re Marcel może zdjąć. Ponieważ karty można zdejmować tylko w parach, to $k$&nbsp;będzie zawsze parzyste.</p>

<p>Kolejne $n$&nbsp;wierszy wejścia zawiera opisy poszczeg&oacute;lnych pięter wieży od najwyższego do najniższego. W $(i+1)$-szym wierszu znajduje się $2^i$&nbsp;liczb całkowitych $a_{i,1}$,&nbsp;$a_{i,2}$, ...,&nbsp;$a_{i,2^i}$&nbsp;($1\,000\,000 &le; a_{i,j} &le; 1\,000\,000$), oznaczających wartości kart na $i$-tym piętrze od g&oacute;ry, w kolejności od lewej do prawej.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie jedną liczbę całkowitą - maksymalną sumę wartości kart, jaką Marcel może odzyskać, wyjmując maksymalnie $k$&nbsp;kart z wieży, tak aby ta się nie zawaliła.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8612.%E2%80%85Domek%E2%80%85z%E2%80%85kart/f3bcd1a9.png" data-original-src="https://upload.acmicpc.net/50052176-976d-4c29-8a3a-c1d6cb5b3d8f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p align="center">Karty, kt&oacute;re Marcel powinien wyjąć z wieży, zostały zaznaczone na rysunku liniami przerywanymi. Mają one wartości: $1$, $-3$, $2$, $1$, $-1$, $5$, a więc suma ich wartości to $5$.</p>