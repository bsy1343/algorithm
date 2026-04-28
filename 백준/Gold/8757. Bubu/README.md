# [Gold III] Bubu - 8757

[문제 링크](https://www.acmicpc.net/problem/8757)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 22, 맞힌 사람: 14, 정답 비율: 35.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Bubu wyszło z jaskini szukać piknik&oacute;w, jednak zauważyli je strażnicy parku Jellystone. Strażnicy pr&oacute;bują zagrodzić drogę Bubu, kt&oacute;re ucieka do jaskini. Strażnik złapie Bubu, jeśli znajdzie się w tym samym czasie na polanie, na kt&oacute;rej jest Bubu. Strażnik może odpoczywać na polanach.</p>

### 입력

<p>W pierwszej linii znajdują się trzy liczby całkowite <em>n</em>, <em>m</em>, <em>s</em>, (1 &le; <em>n</em> &le; 10<sup>5</sup>, 0 &le; <em>m</em> &le; 2&nbsp;&middot; 10<sup>5</sup>, 0 &le; <em>s</em> &le; 3&nbsp;&middot; 10<sup>4</sup>)&nbsp;oznaczające odpowiednio liczbę polan w lesie, liczbę przesiek między tymi polanami oraz liczbę strażnik&oacute;w. W następnych <em>m</em>&nbsp;liniach znajdują się opisy (dwukierunkowych) przesiek w postaci trzech liczb całkowitych <em>a</em>, <em>b</em>, <em>w</em>, (1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>, 1 &le; <em>w</em> &le; 10<sup>9</sup>), gdzie <em>a</em>, <em>b</em>&nbsp;oznaczają numery polan, zaś <em>w</em>&nbsp;oznacza czas w sekundach, jaki zajmuje strażnikowi lub Bubu przebycie tej przesieki. W następnych <em>s</em>&nbsp;liniach podane są numery polan, na kt&oacute;rych stoją kolejni strażnicy. W ostatniej linii podany jest numer polany, na kt&oacute;rej znajduje się Bubu. Jaskinia Bubu jest na polanie 1.</p>

### 출력

<p>Jeżeli Bubu może dotrzeć do jaskini niezłapany przez strażnik&oacute;w, należy wypisać minimalny czas dotarcia Bubu do jaskini, w innym przypadku należy wypisać -1. Zakładamy, że istnieje ścieżka między jaskinią Bubu a polaną, gdzie się ono znajduje.</p>