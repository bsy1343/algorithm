# [Silver II] Taśma - 8618

[문제 링크](https://www.acmicpc.net/problem/8618)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 28, 맞힌 사람: 24, 정답 비율: 75.000%

### 분류

애드 혹, 브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Jaś przypadkowo znalazł w domu bardzo długą taśmę. Bez chwili namysłu napisał na taśmie pewien ciąg liczb całkowitych dodatnich. Teraz chciałby znaleźć w tym ciągu dwie najdalej od siebie położone r&oacute;żne liczby. Zakładamy, że odległość między sąsiednimi liczbami to 1, między liczbami posiadającymi wsp&oacute;lnego sąsiada to 2 itd.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $m$&nbsp;($1 &le; m &le; 10$), oznaczającą liczbę przypadk&oacute;w testowych do rozważenia. Każdy przypadek testowy jest opisany w dw&oacute;ch wierszach. Pierwszy z nich zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 100\,000$), oznaczającą długość sekwencji liczb zapisanej przez Jasia na taśmie. Drugi wiersz zawiera ciąg $n$&nbsp;liczb całkowitych $a_i$&nbsp;($1 &le; a_i &le; 1\,000\,000\,000$), pooddzielanych pojedynczymi odstępami.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście $m$&nbsp;wierszy, po jednym dla każdego przypadku testowego. Jeżeli w ciągu odpowiadającym $i$-temu przypadkowi testowemu nie ma żadnej pary r&oacute;żnych liczb, to $i$-ty wiersz powinien zawierać jedno słowo &quot;<code>BRAK</code>&quot;. W przeciwnym przypadku w $i$-tym wierszu powinna znajdować się jedna liczba całkowita, r&oacute;wna odległości między najdalszą parą r&oacute;żnych liczb w ciągu.</p>

### 힌트

<p><b>Wyjaśnienie do pierwszego przykładu:</b>&nbsp;najdalszymi r&oacute;żnymi liczbami w sekwencji są m.in. pierwsza (czyli 2) i si&oacute;dma (czyli 5).</p>