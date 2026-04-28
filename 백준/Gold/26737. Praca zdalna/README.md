# [Gold V] Praca zdalna - 26737

[문제 링크](https://www.acmicpc.net/problem/26737)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 23, 맞힌 사람: 20, 정답 비율: 83.333%

### 분류

수학, 정렬

### 문제 설명

<p>Bajtazar z racji pandemii pracuje zdalnie. Ponieważ wszyscy jego wsp&oacute;łpracownicy pracują ze swoich rodzinnych kraj&oacute;w z r&oacute;żnymi strefami czasowymi, coraz trudniej jest ustalić wsp&oacute;lny termin comiesięcznego spotkania. Spotkanie to powinno rozpocząć się o pełnej godzinie i trwać dokładnie godzinę.</p>

<p>Każdy pracownik ma kalendarz, w kt&oacute;rym jest zaznaczony przedział czasu, w kt&oacute;rym może wziąć udział w spotkaniu: i-ty pracownik zaczyna pracę o godzinie A<sub>i</sub>, a kończy pracę po godzinie B<sub>i</sub>. Oznacza to, że pracownik i może wziąć udział w spotkaniu o dowolnej godzinie od A<sub>i</sub> do B<sub>i</sub> (włącznie).</p>

<p>Każdy z pracownik&oacute;w jest także gotowy zostać po godzinach albo zacząć wcześniej niż to co zadeklarował. Nikt nie zrobi jednak tego za darmo: za każdą godzinę spędzoną dłużej w pracy należy zapłacić pracownikowi bajtodolara.</p>

<p>Wyznacz termin, w kt&oacute;rym można zorganizować spotkanie tak, żeby każdy z pracownik&oacute;w (być może za dodatkową opłatą) m&oacute;gł w nim uczestniczyć, a opłata za nadgodziny była jak najmniejsza.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 100 000) oznaczające liczbę pracownik&oacute;w. Następnie w N wierszach znajdują się dwie liczby całkowite A<sub>i</sub> oraz B<sub>i</sub> (0 &le; A<sub>i</sub> &le; B<sub>i</sub> &le; 10<sup>9</sup>) oznaczające okienko pracy i-tego pracownika, przy czym A<sub>i</sub> to godzina rozpoczęcia pracy, natomiast B<sub>i</sub> to godzina po kt&oacute;rej opuści on pracę.</p>

### 출력

<p>Na standardowe wyjście należy wypisać dwie liczby w pojedynczym wierszu &ndash; liczbę T oznaczającą moment rozpoczęcia spotkania oraz liczbę K oznaczającą sumaryczną opłatę za nadgodziny.</p>

<p>Jeśli istnieje wiele możliwych rozwiązań, Tw&oacute;j program może wypisać dowolne z nich.</p>