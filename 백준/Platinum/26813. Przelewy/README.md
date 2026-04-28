# [Platinum IV] Przelewy - 26813

[문제 링크](https://www.acmicpc.net/problem/26813)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>푁 przyjaci&oacute;ł pojechało na wycieczkę. Podczas wycieczki często trzeba płacić za r&oacute;żne aktywności (taks&oacute;wka, napiwek w hotelu, obiad w restauracji etc.). Przyjaciele policzyli ile kto komu jest winny i powstała z tego macierz A<sub>i,j</sub> określająca ile w sumie bajtalar&oacute;w przyjaciel numer i winny jest przyjacielowi numer j (przyjaci&oacute;ł numerujemy od jedynki). Oczywiście zagwarantowane jest, że: A<sub>i,j</sub> = &minus;A<sub>j,i</sub>.</p>

<p>Nadszedł czas rozliczeń po wycieczce i przyjaciele chcą spłacić wszystkie swoje zobowiązania, żeby wyjść &bdquo;na zero&rdquo;. Najłatwiej oczywiście rozliczyć się przelewem, ale niestety, banki lubią sobie pobierać sowite prowizje za każdy przelew. Przyjaciele postanowili, że rozliczą się sprytnie: każdego przecież interesuje tylko, żeby w sumie dostał/zapłacił tyle ile trzeba, nie ma znaczenia od kogo dostał lub komu zapłacił, byle na końcu bilans wszystkich kont się zgadzał. Ile najmniej przelew&oacute;w należy wykonać?</p>

<p>Napisz program, kt&oacute;ry wczyta N oraz macierz A, wyznaczy minimalną liczbę przelew&oacute;w niezbędnych do uregulowania wszystkich zobowiązań i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 16) określająca liczbę przyjaci&oacute;ł. W kolejnych N wierszach znajduje się po N liczb całkowitych A<sub>i,j</sub> (&minus;10<sup>9</sup> &le; A<sub>i,j</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna liczba całkowita &ndash; minimalna liczba przelew&oacute;w niezbędnych do uregulowania zobowiązań między przyjaci&oacute;łmi.</p>