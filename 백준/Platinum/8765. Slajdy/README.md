# [Platinum I] Slajdy - 8765

[문제 링크](https://www.acmicpc.net/problem/8765)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 분할 정복, 다차원 세그먼트 트리

### 문제 설명

<p>Hektor i Wiktor realizują wraz ze swym kolegą Sławkiem projekt semestralny z fizyki. Podczas gdy dwaj pierwsi wzięli na siebie przeprowadzenie eksperyment&oacute;w, Sławkowi przypadło zadanie przygotowania slajd&oacute;w do prezentacji wynik&oacute;w.</p>

<p>Sławek przygotował szkic prezentacji&nbsp;<strong>N</strong>&nbsp;kolejno ponumerowanych slajd&oacute;w, a Hektor i Wiktor uszeregowali je od najmniej, do najbardziej ich zdaniem istotnych - każdy z nich osobno. Teraz pozostaje tylko wybrać slajdy do ostatecznej prezentacji. Chłopcy um&oacute;wili się, że slajdy w ostatecznej prezentacji będą podzbiorem slajd&oacute;w z propozycji Sławka i że pokażą je w oryginalnej kolejności. Dodatkowo chcieliby, żeby każdy kolejny slajd w ostatecznej prezentacji był ważniejszy od poprzedniego - i to zar&oacute;wno według klasyfikacji Hektora jak i Wiktora.</p>

<p>Ile r&oacute;żnych zestaw&oacute;w slajd&oacute;w spełnia te warunki?</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii pojedynczego zestawu testowego znajduje się jedna liczba całkowita&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 50 000 ), określająca liczbę slajd&oacute;w przygotowanych przez Sławka. W drugiej i trzeciej linii znajduje się po&nbsp;<strong>N</strong>&nbsp;dodatnich liczb całkowitych nie większych niż&nbsp;<strong>N</strong>, oznaczające kolejności slajd&oacute;w wg Hektora i Wiktora. W każdej z tych dw&oacute;ch linii wszystkie&nbsp;<strong>N</strong>&nbsp;liczb są r&oacute;żne.</p>

### 출력

<p>Dla każdego zestawu testowego należy w jednej linii wypisać jedną liczbę - resztę z dzielenia przez 1 000 000 007 liczby r&oacute;żnych zestaw&oacute;w slajd&oacute;w spełniających nakreślone warunki.</p>

### 힌트

<p>W pierwszym zestawie testowym prawidłowe zestawy slajd&oacute;w to (1), (2), (3), (1,2) i (1,3).</p>