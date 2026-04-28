# [Platinum V] Kolejka - 8834

[문제 링크](https://www.acmicpc.net/problem/8834)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 27, 맞힌 사람: 23, 정답 비율: 48.936%

### 분류

자료 구조, 트리, 세그먼트 트리, 집합과 맵, 트리를 사용한 집합과 맵, 스플레이 트리

### 문제 설명

<p>Budowniczy Adrian zatrudniony przy budowie nowego centrum handlowego nie ma dzisiaj zbyt wiele pracy. Dzięki temu może oddać się zbieraniu materiał&oacute;w do jego pracy naukowej poświęconej kolejkom sklepowym.</p>

<p>Adrian obserwuje kolejkę do pobliskiego sklepu i zapisuje jakie miejsce w kolejce zajęła każda z kolejno przychodzących os&oacute;b.&nbsp;Na początku dnia nikt nie stał w kolejce. Kolejne osoby niekoniecznie stawały na końcu. Mogli um&oacute;wić się z kimś, zapłacić komuś, dać komuś coś, lub załatwić to w jeszcze inny spos&oacute;b i wejść w dowolne miejsce w kolejce. Każda osoba, kt&oacute;ra raz stanęła w kolejce, nie wyszła z niej aż do południa, kiedy okazało się, że sklep nie zostanie dzisiaj otwarty i wszyscy się rozeszli.</p>

<p>Adrian zastanawia się, czy używając jego notatek można odtworzyć ustawienie kolejki tuż przed rozejściem się ludzi.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ). Następnie opisywane są kolejne zestawy testowe.</p>

<p>W pierwszej linii opisu zestawu znajduje się liczba naturalna&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 100 000 ) oznaczająca liczbę ludzi, kt&oacute;rzy od rana do południa stanęli w kolejce. W drugiej linii znajduje się N liczb &nbsp;<strong>X</strong><sub><strong>i</strong></sub>&nbsp;( 0 &lt;=&nbsp;<strong>X</strong><sub><strong>i</strong></sub>&nbsp;&lt;&nbsp;<strong>i</strong>, dla 1 &lt;=&nbsp;<strong>i</strong>&nbsp;&lt;=&nbsp;<strong>N</strong>&nbsp;). Jeśli&nbsp;<strong>X</strong><sub><strong>i</strong></sub>&nbsp;jest r&oacute;wne 0, oznacza to, że&nbsp;<strong>i</strong>-ta osoba stanęła na samym początku kolejki, w przeciwnym wypadku&nbsp;<strong>i</strong>-ta osoba stanęła za osobą, kt&oacute;ra w chwili jej przyjścia była&nbsp;<strong>X</strong><sub><strong>i</strong></sub>-tą osobą licząc od początku kolejki.</p>

### 출력

<p>Dla każdego zestawu należy w osobnej linii wypisać ciąg&nbsp;<strong>N</strong>&nbsp;liczb oddzielonych pojedynczymi spacjami.&nbsp;<strong>i</strong>-ta liczba powinna być ostateczną pozycją w kolejce osoby, kt&oacute;ra dołączyła do niej jako&nbsp;<strong>i</strong>-ta.&nbsp;Jeśli osoba stoi na początku kolejki, jej pozycja to 1, pozycja za nią 2, itd.</p>