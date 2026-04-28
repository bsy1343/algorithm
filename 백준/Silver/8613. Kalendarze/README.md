# [Silver I] Kalendarze - 8613

[문제 링크](https://www.acmicpc.net/problem/8613)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 15, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>Zajmujesz się kontaktami handlowymi między dwoma plemionami: Arbuzanami i Bananitami. Duży problem stanowi to, że plemiona te posługują się r&oacute;żnymi kalendarzami.</p>

<p>Kalendarz Arbuzan składa się z $n$&nbsp;miesięcy o długościach (wyrażonych w dniach) $a_1, a_2, \dots , a_n$, natomiast kalendarz Bananit&oacute;w - z $m$&nbsp;miesięcy o długościach $b_1, b_2, \dots , b_m$.</p>

<p>Liczba dni w roku według obu kalendarzy jest taka sama, czyli $a_1 + a_2 + \dots + a_n = b_1 + b_2 + \dots + b_m$.</p>

<p>Twoim zadaniem jest napisanie programu służącego do zamiany dat pomiędzy kalendarzami Arbuzan i Bananit&oacute;w.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;i $m$&nbsp;($1 &le; n, m &le; 1\,000\,000$), oddzielone pojedynczym odstępem, oznaczające liczby miesięcy w kalendarzach Arbuzan i Bananit&oacute;w.</p>

<p>W drugim wierszu znajdują się liczby całkowite $a_1, a_2, \dots , a_n$&nbsp;($1 &le; a_i &le; 1\,000$) pooddzielane pojedynczymi odstępami, oznaczające długości kolejnych miesięcy w kalendarzu Arbuzan, zaś w trzecim wierszu znajdują się liczby całkowite&nbsp;$b_1, b_2, \dots , b_m$&nbsp;($1 &le; b_i &le; 1\,000$) pooddzielane pojedynczymi odstępami, oznaczające długości kolejnych miesięcy w kalendarzu Bananit&oacute;w.</p>

<p>W czwartym wierszu znajduje się jedna liczba całkowita $z$&nbsp;($1 &le; z &le; 100\,000$) oznaczająca liczbę zapytań.</p>

<p>W każdym z kolejnych $z$&nbsp;wierszy znajduje się opis jednego zapytania. Składa się on z dw&oacute;ch liczb całkowitych $d_i$, $m_i$&nbsp;oraz jednego znaku $c_i$, pooddzielanych pojedynczymi odstępami, oznaczających odpowiednio dzień i miesiąc oraz kierunek konwersji daty. Jeżeli znak $c_i$&nbsp;jest literą &#39;<code>A</code>&#39;, to liczby $d_i$&nbsp;oraz $m_i$&nbsp;spełniają następujące warunki: $1 &le; m_i &le; n$, $1 &le; d_i &le; a_{m_i}$&nbsp;i oznaczają datę w kalendarzu Arbuzan, kt&oacute;rą Tw&oacute;j program powinien zamienić na datę w kalendarzu Bananit&oacute;w. Jeżeli natomiast znak $c_i$&nbsp;jest literą &#39;<code>B</code>&#39;, to $d_i$&nbsp;oraz $m_i$&nbsp;spełniają następujące warunki: $1 &le; m_i &le; m$, $1 &le; d_i &le; b_{m_i}$&nbsp;i oznaczają datę w kalendarzu Bananit&oacute;w, kt&oacute;rą Tw&oacute;j program powinien zamienić na datę w kalendarzu Arbuzan.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście $z$&nbsp;wierszy. W $i$-tym z nich powinna znaleźć się odpowiedź na $i$-te zapytanie w postaci dw&oacute;ch liczb $d&#39;_i$, $m&#39;_i$&nbsp;oddzielonych pojedynczym odstępem, oznaczających żądany numer miesiąca i dnia w odpowiednim kalendarzu.</p>