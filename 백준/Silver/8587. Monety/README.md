# [Silver II] Monety - 8587

[문제 링크](https://www.acmicpc.net/problem/8587)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 24, 맞힌 사람: 17, 정답 비율: 100.000%

### 분류

조합론, 수학, 정렬

### 문제 설명

<p>Bajtazar jest niezwykle dumny ze swojej kolekcji rzadkich monet. Zbierał je przez wiele lat, dbając o to, by żadne dwie nie były do siebie podobne. Obecnie ma $n$&nbsp;monet ponumerowanych tak, że $i$-ta moneta ma rozmiar dokładnie $i$.</p>

<p>Jako że kolekcja Bajtazara ostatnio się powiększyła, był on zmuszony kupić nowy klaser. Jest w nim dokładnie $n$&nbsp;przegr&oacute;d na monety, każda o określonym rozmiarze. Oczywiście żadnej monety nie można włożyć do zbyt małej przegrody. Nic nie stoi jednak na przeszkodzie, by włożyć ją do przegrody większej.</p>

<p>Bajtazar zastanawia się teraz do kt&oacute;rych przegr&oacute;d włożyć poszczeg&oacute;lne monety. Po sprawdzeniu wielu kombinacji zaintrygowało go r&oacute;wnież pytanie, na ile sposob&oacute;w może zapełnić klaser. Ponieważ liczba ta może być bardzo duża, Bajtazarowi wystarczy jej reszta z dzielenia przez $10^9+7$. Napisz program, kt&oacute;ry zaspokoi jego ciekawość.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą: $n$&nbsp;($1 &le; n &le; 1\,000\,000$). W następnym wierszu znajduje się $n$&nbsp;liczb całkowitych $a_i$&nbsp;($1 &le; a_i &le; n$) pooddzielanych pojedynczymi odstępami. Liczba $a_i$&nbsp;m&oacute;wi, jaką największą monetę można włożyć do $i$-tej przegrody.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście jedną liczbę całkowitą - resztę z dzielenia liczby sposob&oacute;w zapełnienia klasera przez $10^9+7$.</p>