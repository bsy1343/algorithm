# [Gold II] Domino - 26795

[문제 링크](https://www.acmicpc.net/problem/26795)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 15, 맞힌 사람: 8, 정답 비율: 26.667%

### 분류

애드 혹, 백트래킹, 조합론, 수학

### 문제 설명

<p>Bajtek bawi się w pokrywanie prostokąt&oacute;w o wymiarach 2 &times; n kostkami domina o wymiarach 2 &times; 1. Prostokąt o szerokości n składa się z 2n p&oacute;l (o wymiarach 1 &times; 1), przy czym niekt&oacute;re z p&oacute;l Bajtek może zamalować. Bajtek chce, żeby możliwe było pokrycie wszystkich niezamalowanych p&oacute;l bez nakładania się na siebie kostek domina (kostki można obracać). Co więcej, Bajtek chciałby, żeby można było tego dokonać na dokładnie m sposob&oacute;w. I w końcu chciałby znaleźć najmniejszy prostokąt, kt&oacute;ry można tak pokryć. Dużo tych wymagań, pomożesz mu?</p>

<p>Poniższy rysunek prezentuje prostokąt o szerokości n = 6, w kt&oacute;rym zamalowano dwa pola. Pozostałe 10 p&oacute;l można pokryć kostkami domina na dokładnie 4 sposoby. Dwa ze sposob&oacute;w zostały przedstawione na rysunku (kostki domina zostały nieco pomniejszone jedynie dla lepszego zobrazowania sytuacji):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26795.%E2%80%85Domino/9f0a8a70.png" data-original-src="https://upload.acmicpc.net/ebaf8b0c-1d8c-4393-b0b1-b703838a8d39/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 470px; height: 75px;" /></p>

<p>Nie jest to jednak optymalne rozwiązanie dla m = 4, ponieważ istnieje rozwiązanie, w kt&oacute;rym n = 5.</p>

<p>Napisz program, kt&oacute;ry dla danego m wyznaczy najmniejszą szerokość prostokąta n, w kt&oacute;rym możliwe jest takie zamalowanie p&oacute;l, aby m&oacute;c pokryć pozostałe pola kostkami domina o wymiarach 2 &times; 1 na dokładnie m sposob&oacute;w.</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajduje się jedna liczba naturalna m (1 &le; m &le; 10<sup>18</sup>).</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna znaleźć się liczba naturalna n określająca najmniejszą możliwą szerokość szukanego prostokąta. Jeżeli żaden taki prostokąt nie istnieje, zamiast tego należy wypisać tylko jedno słowo <code>NIE</code>.</p>