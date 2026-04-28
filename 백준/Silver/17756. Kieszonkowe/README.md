# [Silver IV] Kieszonkowe - 17756

[문제 링크](https://www.acmicpc.net/problem/17756)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 48, 맞힌 사람: 34, 정답 비율: 69.388%

### 분류

사칙연산, 그리디 알고리즘, 수학

### 문제 설명

<p>Nadszedł czas wypłaty kieszonkowego. Mama jest zachwycona tym, jak Bajtek i Bajtolina posprzątali pok&oacute;j. Zdecydowała, że przeznaczy na kieszonkowe część banknot&oacute;w ze swojego portfela, ale w taki spos&oacute;b, żeby dzieci były w stanie podzielić się pieniędzmi po r&oacute;wno. Mama nie ma czasu na rozmienianie pieniędzy ani na zbędne dyskusje &ndash; w razie potrzeby dzieci same rozmienią otrzymane banknoty w kiosku.</p>

<p>Oficjalną walutą Bajtocji jest bajtalar. Najmniejszym dostępnym nominałem jest 1 bajtalar. Wobec tego kwotę b bajtalar&oacute;w można rozdzielić po r&oacute;wno między dwie osoby dokładnie wtedy, gdy b jest parzyste.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 1 000 000) oznaczająca liczbę banknot&oacute;w w portfelu mamy. W drugim wierszu znajduje się n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; ai &le; 1000) oznaczających nominały tych banknot&oacute;w.</p>

### 출력

<p>Na wyjście należy wypisać maksymalną sumę nominał&oacute;w banknot&oacute;w, kt&oacute;re mama może przeznaczyć na kieszonkowe, tak aby dzieci mogły się podzielić otrzymaną kwotą po r&oacute;wno.</p>

<p>Jeśli nie da się wybrać z portfela żadnej dodatniej liczby banknot&oacute;w, tak aby ten warunek był spełniony, mama musi niestety udać się do bankomatu. W takim wypadku na wyjście należy wypisać słowo NIESTETY.</p>