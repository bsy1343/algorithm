# [Silver V] Przegrody - 8670

[문제 링크](https://www.acmicpc.net/problem/8670)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 106, 정답: 73, 맞힌 사람: 65, 정답 비율: 68.421%

### 분류

구현, 애드 혹

### 문제 설명

<p>Jaś wypisał na kartce wszystkie liczby od 1&nbsp;do <em>n</em>&nbsp;w pewnej losowej kolejności, tworzącej pewien ciąg. Chciałby teraz wstawić jak najwięcej przegr&oacute;d do tej listy.</p>

<p>Przegrody może wstawiać tylko wtedy, gdy pomiędzy wstawianą przegrodą, ustawioną za <em>k</em>-tym elementem ciągu a początkiem ciągu, występuje każda z liczb od 1&nbsp;do <em>k</em>. W szczeg&oacute;lności ostatnią przegrodę Jaś może zawsze wstawić za <em>n</em>-tym elementem ciągu, bowiem będzie to permutacja liczb od 1&nbsp;do <em>n</em>.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę element&oacute;w w ciągu.</p>

<p>Kolejny wiersz zawiera permutację <em>n</em>&nbsp;liczb całkowitych <em>p</em><sub>1</sub>, <em>p</em><sub>2</sub>, ..., <em>p<sub>n</sub></em>&nbsp;(1 &le; <em>p<sub>i</sub></em> &le; <em>n</em>), gdzie <em>p<sub>i</sub></em>&nbsp;oznacza <em>i</em>-tą liczbę w ciągu.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną maksymalnej liczbie przegr&oacute;d, jakie może wstawić Jaś.</p>

### 힌트

<p>Jaś może ustawić przegrody w następujący spos&oacute;b: 2 1 | 3 | 6 5 4 | 9 10 8 7 |.</p>