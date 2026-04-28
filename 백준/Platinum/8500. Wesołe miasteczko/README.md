# [Platinum V] Wesołe miasteczko - 8500

[문제 링크](https://www.acmicpc.net/problem/8500)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 최장 공통 부분 수열 문제

### 문제 설명

<p>Bajtazar i Bajtoni wybrali się do wesołego miasteczka. Odwiedzali to miejsce już wiele razy i dobrze znają wszystkie atrakcje, dlatego każdy z nich przygotował zawczasu listę swoich ulubionych atrakcji, kt&oacute;re chciałby po kolei odwiedzić. Listy r&oacute;żniły się od siebie, dlatego przyjaciele zdecydowali się wykreślić z nich niekt&oacute;re pozycje, tak, by stały się one identyczne. Nie chcą przy tym zmieniać oryginalnej kolejności z każdej z list. Dodatkowo, chcieliby, aby uzgodniony plan był najdłuższy możliwy. Ile r&oacute;żnych plan&oacute;w mogą w ten spos&oacute;b uzyskać?</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n1 i n2 (1 &le; n1,n2 &le; 10000), oznaczające długości plan&oacute;w Bajtazara i Bajtoniego. Kolejne dwa wiersze zawierają listy atrakcji zaproponowane przez każdego z nich. Są to listy liczb całkowitych z przedziału [1,10000] pooddzielanych pojedynczymi odstępami, długości odpowiednio n1 i n2. Każda liczba określa jedną atrakcję w wesołym miasteczku.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia wypisz jedną liczbę całkowitą. Powinna to być liczba r&oacute;żnych plan&oacute;w zwiedzania wesołego miasteczka, kt&oacute;re mogą utworzyć przyjaciele poprzez wykreślanie pozycji z zaproponowanych przez siebie list atrakcji modulo 1000000007.</p>