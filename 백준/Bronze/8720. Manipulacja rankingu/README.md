# [Bronze I] Manipulacja rankingu - 8720

[문제 링크](https://www.acmicpc.net/problem/8720)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 189, 정답: 103, 맞힌 사람: 76, 정답 비율: 50.000%

### 분류

구현, 애드 혹

### 문제 설명

<p>Dym&oacute;wka włamał się do obozowej sprawdzarki i może teraz manipulować rankingiem. Konkretniej m&oacute;wiąc, może on ustawić wagę każdego zadania. Sumaryczna ilość punkt&oacute;w jest obliczana jako: <em>wagazadania</em><sub>1</sub> * <em>punktyzazadanie</em><sub>1</sub> + ... +&nbsp;<em>wagazadania</em><sub>m</sub>&nbsp;* <em>punktyzazadanie</em><sub>m</sub>. Zadania na obozie są oceniane binarnie: rozwiązanie otrzymuje 0 lub 100 punkt&oacute;w. Waga zadania może być ustawiona na dowolną liczbę całkowitą z przedziału [0, 2000]. Dym&oacute;wka niestety nie umie wyliczyć, na ile opłaca mu się zmiana wag. Pom&oacute;ż mu w tym.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite <em>n</em>, <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 1000), oznaczające odpowiednio liczbę uczestnik&oacute;w obozu oraz liczbę zadań na obozie. W następnych <em>n</em>&nbsp;linijkach wyniki kolejnych uczestnik&oacute;w: w każdej linijce <em>m</em>&nbsp;liczb (każda r&oacute;wna 0&nbsp;lub 100) oznaczające wyniki uczestnika w kolejnych zadaniach. Wynik Dym&oacute;wki jest podany jako pierwszy.</p>

### 출력

<p>W jedynej linijce wyjścia wypisz dwie liczby: pierwsza oznaczająca najlepszą pozycję w rankingu, jaką może zdobyć manipulacją Dym&oacute;wka, oraz druga, oznaczająca minimalną liczbę os&oacute;b, z kt&oacute;rymi będzie on ex aequo na tej najlepszej pozycji. Pozycje w rankingu liczone są od 1.</p>