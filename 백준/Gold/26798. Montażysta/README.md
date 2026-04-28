# [Gold III] Montażysta - 26798

[문제 링크](https://www.acmicpc.net/problem/26798)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Bajtazar podjął się zmontowania n film&oacute;w z om&oacute;wieniami zadań z Olimpiady Informatycznej. Wiadomo, że zmontowanie i-tego filmu zajmie t<sub>i</sub> kolejnych dni oraz że należy go opublikować do końca d<sub>i</sub>-tego dnia. Bajtazar ma dostęp do światłowodu, więc zmontowany film właściwie natychmiast jest publikowany na serwerze Olimpiady. Jednak montaż jest bardzo wymagający sprzętowo, a Bajtazar ma tylko jeden komputer, więc jednocześnie montowany może być tylko jeden film.</p>

<p>Film&oacute;w jest sporo i Bajtazar martwi się, że nie dotrzyma wszystkich termin&oacute;w. Pom&oacute;ż mu i wyznacz, ile maksymalnie film&oacute;w Bajtazar jest w stanie opublikować na czas, zakładając, że pierwszy montaż może najwcześniej ruszyć dnia numer 1. Aby Bajtazar czuł się pewniej, zaplanuj r&oacute;wnież, jak ten wynik osiągnąć.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita n (1 &le; n &le; 500 000) oznaczająca liczbę film&oacute;w do zmontowania.</p>

<p>W kolejnych n wierszach znajdują się opisy film&oacute;w; i-ty z tych wierszy zawiera dwie liczby całkowite t<sub>i</sub> i d<sub>i</sub> (1 &le; t<sub>i</sub>, d<sub>i</sub> &le; 10<sup>9</sup>) oznaczające czas montowania i termin publikacji i-tego filmu.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym wierszu wyjścia jedną liczbę całkowitą m oznaczającą maksymalną liczbę film&oacute;w, kt&oacute;re Bajtazar może zmontować w terminie.</p>

<p>W kolejnych m wierszach należy zapisać plan pracy; w i-tym z tych wierszy należy wypisać dwie liczby całkowite f<sub>i</sub> i k<sub>i</sub> (1 &le; f<sub>i</sub> &le; n, 1 &le; k<sub>i</sub>) oznaczające, że film o numerze f<sub>i</sub> należy rozpocząć montować dnia k<sub>i</sub>. Jeśli istnieje więcej niż jedno rozwiązanie o maksymalnym m, Tw&oacute;j program może wypisać dowolne z nich.</p>