# [Silver II] Próg kwalifikacyjny - 26776

[문제 링크](https://www.acmicpc.net/problem/26776)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 27, 맞힌 사람: 24, 정답 비율: 82.759%

### 분류

이분 탐색, 그리디 알고리즘, 누적 합, 정렬

### 문제 설명

<p>Bajtazar startuje w Bajtockiej Olimpiadzie Informatycznej Junior&oacute;w (BOIJ). Zasady tej olimpiady nieco r&oacute;żnią się od OIJ: do rozwiązania na pierwszym etapie jest pewna liczba zadań, a za każde z nich można uzyskać ustaloną liczbę punkt&oacute;w (być może r&oacute;żną dla r&oacute;żnych zadań), kt&oacute;ra jest przyznawana tylko, jeśli zadanie zostanie w pełni poprawnie rozwiązane. W innym przypadku rozwiązanie otrzymuje zawsze zero punkt&oacute;w.</p>

<p>Bajtazar jest dość leniwy, dlatego zamiast zabrać się do rozwiązywania zadań, zastanawia się ile zadań będzie wystarczające, żeby dostać się do drugiego etapu. Co roku, po zawodach, Komitet Gł&oacute;wny BOIJ publikuje pr&oacute;g kwalifikacyjny do drugiego etapu zawod&oacute;w. Każdy zawodnik, kt&oacute;ry będzie miał przynajmniej tyle punkt&oacute;w, ile wynosi pr&oacute;g, zostanie zakwalifikowany. Niestety, sytuację utrudnia fakt, że Bajtazar nie zna progu w trakcie zawod&oacute;w. Każdej nocy jednak ma sen, w kt&oacute;rym dowiaduje się ile wynosi wartość progu &ndash; co rano zastanawia się wtedy, ile zadań wystarczyłoby w takim wypadku zrobić. Napisałby program odpowiadający mu na to pytanie, jednak, no właśnie, jest trochę leniwy. Dlatego poprosił Cię o pomoc.</p>

<p>Napisz program, kt&oacute;ry wczyta wartości punktowe poszczeg&oacute;lnych zadań oraz potencjalne progi kwalifikacyjne, dla każdego progu wyznaczy minimalną liczbę rozwiązanych zadań niezbędnych do przejścia do drugiego etapu i wypisze wyniki na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 200 000), określająca liczbę zadań na pierwszym etapie zawod&oacute;w. W drugim wierszu wejścia znajduje się ciąg N liczb naturalnych V<sub>i</sub> (1 &le; V<sub>i</sub> &le; 10<sup>9</sup>), pooddzielanych pojedynczymi odstępami &ndash; i-ta liczba określa liczbę punkt&oacute;w za poprawne rozwiązanie i-tego zadania.</p>

<p>W trzecim wierszu wejścia znajduje się jedna liczba naturalna Q (1 &le; Q &le; 200 000), określająca liczbę sn&oacute;w Bajtazara. W kolejnych Q wierszach znajduje się opis tych sn&oacute;w, po jednym w wierszu. Opis każdego snu składa się z jednej liczby naturalnej P<sub>i</sub>, 1 &le; P<sub>i</sub> &le; V<sub>1</sub> + V<sub>2</sub> + &middot;&middot;&middot; + V<sub>N</sub>, określającej wyśniony pr&oacute;g do drugiego etapu zawod&oacute;w podczas i-tego snu Bajtazara.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście dokładnie Q wierszy: po jednym dla każdego snu Bajtazara. W i-tym wierszu powinna się znaleźć jedna liczba naturalna &ndash; minimalna liczba zadań do rozwiązania, wystarczająca do kwalifikacji do drugiego etapu przy założeniu wyśnionego progu z i-tego snu.</p>