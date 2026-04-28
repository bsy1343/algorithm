# [Silver III] Wina - 26662

[문제 링크](https://www.acmicpc.net/problem/26662)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

구현

### 문제 설명

<p>Mamy rok 2019. Kiedyś było lepiej, a przynajmniej tak uważa bajtocki podczaszy Bajtosław. Przecież im starsze wino, tym lepsze, więc widocznie kiedyś produkowano zacniejsze trunki.</p>

<p>Bajtosław ma teraz nowy pow&oacute;d do narzekania. Wino zawsze składował w wielkich drewnianych beczkach, ale najnowsze trendy winiarskie nakazują używać jedynie szklanych butelek. Jednak przechowywanie wielu butelek w kr&oacute;lewskiej piwniczce okazało się niemałym problemem dla podczaszego. Stojaki na wino tanie nie są, a jedyną sensowną alternatywą jest ułożenie butelek w piramidę pod ścianą: n butelek w najniższym rzędzie, na nich n &minus; 1 kolejnych butelek, potem n &minus; 2 itd. aż do jednej butelki w najwyższym rzędzie. Daje to łącznie n &middot; (n + 1)/2 butelek. Taka piramida jest stabilna, bo każda butelka leży na podłodze lub na dw&oacute;ch innych butelkach.</p>

<p>Bajtosław ułożył już butelki i na każdą nakleił etykietę z rokiem produkcji wina znajdującego się w butelce. Wtem do piwniczki wpadł zdyszany posłaniec i oznajmił, że kr&oacute;l wydał właśnie spontaniczną ucztę i natychmiast potrzebuje k butelek wina. Bajtosław k razy poda posłańcowi jakąś butelkę z piramidy, a jedną z podanych butelek oznaczy jako najprzedniejszy trunek dla samego kr&oacute;la. Podczaszy musi tak wybierać butelki, by piramida w każdym momencie była stabilna, a kr&oacute;l dostał jak najstarsze wino. Jaki to będzie rocznik?</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite n i k (1 &le; n &le; 2000, 1 &le; k &le; n &middot;(n + 1)/2), oznaczające wysokość piramidy oraz liczbę butelek potrzebnych na ucztę.</p>

<p>Następne n wierszy opisuje kolejne rzędy piramidy; i-ty z tych wierszy zawiera ciąg i liczb całkowitych a<sub>i,1</sub>, a<sub>i,2</sub>, . . . , a<sub>i,i</sub> (1 &le; a<sub>i,j</sub> &le; 2019). Liczba a<sub>i,j</sub> oznacza rok produkcji wina z j-tej butelki w i-tym rzędzie. Rzędy numerujemy od g&oacute;ry, a w każdym rzędzie butelki od lewej do prawej.</p>

### 출력

<p>Na wyjściu należy wypisać jedną liczbę całkowitą &ndash; najmniejszy możliwy rok pochodzenia wina, kt&oacute;re dostanie kr&oacute;l.</p>

### 힌트

<p>Wyjaśnienie przykładu: Rysunek po lewej przedstawia początkową piramidę o wysokości 5; każde k&oacute;łko symbolizuje jedną butelkę, a liczba oznacza rok produkcji wina.</p>

<p>Rysunek po prawej przedstawia przykładową kolejność, w jakiej podczaszy m&oacute;gł wybierać butelki: wybrane butelki oznaczone są przerywanymi k&oacute;łkami, a liczba oznacza jako kt&oacute;ra z kolei dana butelka została wybrana (zauważ, że po każdym wyborze piramida jest stabilna). Kolejno wybrane butelki mają roczniki 1999, 2010, 2019, 1500, 1600, 710 i 850; kr&oacute;lowi przypadnie w udziale rocznik 710.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4bdbb82f-7fd6-460f-9d37-186d74d40db6/-/preview/" style="width: 382px; height: 154px;" /></p>