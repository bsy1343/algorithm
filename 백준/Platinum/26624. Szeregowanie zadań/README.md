# [Platinum I] Szeregowanie zadań - 26624

[문제 링크](https://www.acmicpc.net/problem/26624)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>Bajtazar świętuje swoje trzynaste urodziny. Z tej okazji dostał od rodzic&oacute;w nowy komputer. Solenizant bez chwili zastanowienia rozerwał karton i wziął do ręki książeczkę znajdującą się wewnątrz opakowania. Okazało się, że komputer ma m procesor&oacute;w. Bajtazara bardzo ten fakt ucieszył &ndash; wreszcie będzie m&oacute;gł wykonywać wiele zadań jednocześnie.</p>

<p>Na dalszy rozw&oacute;j akcji nie trzeba było długo czekać. Po chwili chłopiec miał już przygotowaną listę n zadań (ponumerowanych od 1 do n), kt&oacute;re planuje wykonać na swoim nowym komputerze. Zadanie numer i zajmuje c<sub>i</sub> sekund i można rozpocząć jego wykonywanie najwcześniej p<sub>i</sub> sekund od otworzenia prezentu. Ponadto, musi ono zostać ukończone najp&oacute;źniej k<sub>i</sub> sekund od otworzenia prezentu. Każde z zadań można dowolnie wiele razy przerywać i przenosić jego wykonywanie z jednego procesora na inny, ale nie można go wykonywać jednocześnie na dw&oacute;ch lub więcej procesorach. Czas przenoszenia zadania jest pomijalnie mały. Czy istnieje uszeregowanie zadań (wraz ze strategią przerywania wykonywania zadań i przenoszenia ich między procesorami), kt&oacute;ra pozwoli wykonać terminowo wszystkie zadania zaplanowane przez Bajtazara?</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n i m (1 &le; n, m &le; 100), określające odpowiednio liczbę zadań do wykonania oraz liczbę procesor&oacute;w. W kolejnych n wierszach wejścia opisano poszczeg&oacute;lne zadania. W i-tym z tych wierszy znajduje się opis zadania numer i: trzy liczby całkowite p<sub>i</sub>, k<sub>i</sub> i c<sub>i</sub> (0 &le; p<sub>i</sub> &lt; k<sub>i</sub> &le; 10<sup>6</sup>; 1 &le; c<sub>i</sub> &le; k<sub>i</sub> &minus; p<sub>i</sub>), oznaczające odpowiednio początek i koniec przedziału czasu (podany w sekundach od otworzenia prezentu), w kt&oacute;rym można wykonać zadanie oraz czas potrzebny na jego wykonanie.</p>

### 출력

<p>W jedynym wierszu standardowego wyjścia należy wypisać <code>TAK</code> albo <code>NIE</code> w zależności od tego, czy istnieje uszeregowanie zadań pozwalające ukończyć wszystkie zadania na czas, czy też nie.</p>