# [Gold II] Szarlotka - 26814

[문제 링크](https://www.acmicpc.net/problem/26814)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Babcia Bitka, Bajtyna, robi najlepszą na świecie szarlotkę (przynajmniej według Bitka). Bitek poprosił ją o przepis i zebrał już wszystkie składniki, poza najważniejszym &ndash; jabłkami. Bitek ma w swoim sadzie N drzew ustawionych w jednej linii i ponumerowane kolejno od 1 do N. Na każdej jabłonce znajduje się dokładnie jedno jabłko, ale każde jest z innego gatunku. Na drzewie o numerze i znajduje się jabłko o poziomie słodkości r&oacute;wnym Ai , przy czym niekt&oacute;re jabłka mogą bardzo kwaśne i mogą mieć ujemny poziom słodkości. Do szarlotki babci Bajtyny potrzebne są jabłka, kt&oacute;re sumarycznie będą dawać poziom słodkości r&oacute;wny K. Bitek zdecydował że wybierze sobie niepusty, sp&oacute;jny podciąg drzew (bez dziur) i zbierze z nich wszystkie jabłka, tak aby suma poziom&oacute;w słodkości S tych jabłek była jak najbliższa K, tj. tak aby wyrażenie |S &minus; K| było jak najmniejsze.</p>

<p>Napisz program, kt&oacute;ry wczyta poziomy słodkości kolejnych jabłek oraz poziom słodkości szarlotki babci Bajtyny, policzy jaka jest minimalna wartość |S &minus; K| oraz wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby: N oraz K (1 &le; N &le; 500 000, &minus;10<sup>18</sup> &le; K &le; 10<sup>18</sup>). W drugim wierszu wejścia znajduje się ciąg N liczb całkowitych A<sub>i</sub> oznaczające kolejno poziom słodkości jabłka na i-tym drzewie (&minus;10<sup>12</sup> &le; A<sub>i</sub> &le; 10<sup>12</sup>).</p>

### 출력

<p>W pierwszym (i jedynym) wierszu wyjścia należy wypisać jedną liczbę całkowitą &ndash; minimalną możliwą do osiągnięcia wartość |S &minus; K|.</p>