# [Gold V] Bracia - 8590

[문제 링크](https://www.acmicpc.net/problem/8590)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>W szeregu ustawiło się $n$&nbsp;chłopc&oacute;w. Wielu z nich jest braćmi z tych samych rodzin. Z szeregu możemy wyprosić pewne osoby, dążąc do tego, aby bracia z każdego rodzeństwa stali obok siebie. Jednak osoby stojące w szeregu są bardzo solidarne ze swoimi braćmi - jeżeli usunięta zostanie dowolna osoba, to wszyscy jej bracia obrażają się i r&oacute;wnież odchodzą z szeregu.</p>

<p>Oblicz, jaka jest największa liczba rodzeństw, kt&oacute;re mogą pozostać w szeregu w wyniku takich zmian, tak aby bracia z każdego pozostałego w szeregu rodzeństwa stali obok siebie. Uwaga: jedynak liczy się jak całe rodzeństwo!</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczającą liczbę os&oacute;b ustawionych w szeregu. Drugi wiersz wejścia zawiera $n$&nbsp;liczb całkowitych $l_1, l_2, \dots , l_n$&nbsp;($1 &le; l_i &le; 1\,000\,000$) pooddzielanych pojedynczymi odstępami, przy czym $l_i$&nbsp;oznacza numer rodzeństwa, do kt&oacute;rego należy $i$-ty chłopiec.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą r&oacute;wną maksymalnej liczbie rodzeństw, jakie mogą pozostać w szeregu.</p>