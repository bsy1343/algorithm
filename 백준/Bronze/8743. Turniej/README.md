# [Bronze II] Turniej - 8743

[문제 링크](https://www.acmicpc.net/problem/8743)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 221, 정답: 84, 맞힌 사람: 71, 정답 비율: 37.566%

### 분류

수학, 사칙연산

### 문제 설명

<p>W Bajtockim Turnieju Programistycznym bierze udział <em>n</em>&nbsp;zawodnik&oacute;w. Każdy zawodnik ma pewną siłę i wiadomo, że dw&oacute;ch r&oacute;żnych zawodnik&oacute;w nie posiada takiej samej siły.</p>

<p>Codziennie odbywane są zawody z udziałem zawodnik&oacute;w, kt&oacute;rzy zakwalifikowali się z dnia poprzedniego. W jednym dniu zawodnicy dzieleni są losowo na pewną liczbę grup po <em>k</em>&nbsp;os&oacute;b, spośr&oacute;d kt&oacute;rych odpada zawsze osoba z najmniejszą siłą (pozostałych <em>k</em> - 1&nbsp;os&oacute;b zostaje zwycięzcami w danej grupie). Może się zdarzyć, że jedna grupa nie będzie posiadała <em>k</em>&nbsp;os&oacute;b. W tym wypadku wszystkie osoby z danej grupy przechodzą automatycznie do zawod&oacute;w następnego dnia. Turniej się kończy, jeśli nie można już podzielić os&oacute;b na co najmniej jedną grupę o liczbie os&oacute;b&nbsp;<em>k</em>. W całym turnieju szukamy więc <em>k</em> - 1&nbsp;zwycięzc&oacute;w.</p>

<p>Zastanawiamy się, ile r&oacute;żnych os&oacute;b może zwyciężyć w tym turnieju.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>z</em>&nbsp;(1 &le; <em>z</em> &le; 10<sup>6</sup>), oznaczającą liczbę zestaw&oacute;w danych. Każdy zestaw danych zawiera po dwie liczby całkowite <em>n<sub>i</sub></em>&nbsp;i <em>k<sub>i</sub></em>&nbsp;(2 &le; <em>k<sub>i</sub></em>, <em>n<sub>i</sub></em> &le; 10<sup>9</sup>), oznaczające odpowiednio liczbę os&oacute;b biorących udział w turnieju oraz liczbę os&oacute;b, na kt&oacute;re dzielone są grupy.</p>

### 출력

<p>Dla każdego zapytania w osobnym wierszu powinna znaleźć się jedna liczba całkowita oznaczająca liczbę r&oacute;żnych os&oacute;b, kt&oacute;re mogą być zwycięzcami w całym turnieju.</p>