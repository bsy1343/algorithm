# [Gold III] Mosty - 8798

[문제 링크](https://www.acmicpc.net/problem/8798)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

그래프 이론, 그리디 알고리즘, 위상 정렬, 방향 비순환 그래프

### 문제 설명

<p>W dwuwymiarowym kr&oacute;lestwie Płaszczak&oacute;w wszystkie ważne&nbsp;miejsca znajdują się w punktach postaci (<strong>X</strong>,0), gdzie&nbsp;<strong>X</strong>&nbsp;jest dodatnią liczbą całkowitą.</p>

<p>Niedawno kr&oacute;l zarządził połączenie mostami&nbsp;<strong>N</strong>&nbsp;par ważnych miejsc. Most między punktami (<strong>A</strong>,0) i (<strong>B</strong>,0) to łamana składająca się z trzech odcink&oacute;w: (<strong>A</strong>,0)-(<strong>A</strong>,<strong>P</strong>), (<strong>A</strong>,<strong>P</strong>)-(<strong>B</strong>,<strong>P</strong>), (<strong>B</strong>,<strong>P</strong>)-(<strong>B</strong>,0), gdzie&nbsp;<strong>P</strong>&nbsp;jest pewną dodatnią liczbą całkowitą nazywaną poziomem mostu. Wszystkie mosty muszą mieć r&oacute;żne poziomy będące liczbami od 1 do&nbsp;<strong>N</strong>.&nbsp;</p>

<p>Mosty mogą się przecinać, ale jest to sytuacja kłopotliwa technicznie. Jak przyporządkować poziomy do poszczeg&oacute;lnych most&oacute;w, aby zminimalizować liczbę przecięć?&nbsp;Każde miejsce występuje na liście par co najwyżej raz.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;(&nbsp;<strong>Z</strong>&nbsp;= 1 ) oznaczająca liczbę zestaw&oacute;w testowych. W kolejnych liniach opisywane są kolejne zestawy.</p>

<p>W pierwszej linii zestawu znajduje się jedna liczba naturalna&nbsp;<strong>N&nbsp;</strong>( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 5 000 ) oznaczająca liczbę par miejsc, kt&oacute;re trzeba połączyć mostami. W kolejnych&nbsp;<strong>N&nbsp;</strong>liniach znajdują się po dwie liczby całkowite&nbsp;<strong>A</strong>&nbsp;i&nbsp;<strong>B</strong><strong>&nbsp;</strong>( 1 &lt;=&nbsp;<strong>A</strong><strong>&nbsp;</strong>&lt;&nbsp;<strong>B</strong>&nbsp;&lt;= 2<strong>N</strong><strong>&nbsp;</strong>) oznaczające, że miejsca o wsp&oacute;łrzędnych (<strong>A</strong>,0), (<strong>B</strong>,0) należy połączyć mostem.</p>

### 출력

<p>W jednej linii należy wypisać, pooddzielane spacjami, numery kolejnych most&oacute;w posortowanych rosnąco według ich poziom&oacute;w ( pierwszy ma być numer mostu o najmniejszym poziomie itd. ), minimalizujące liczbę przecięć. Numery most&oacute;w odpowiadają kolejności podanej na wejściu. W przypadku istnienia wielu rozwiązań minimalizujących liczbę przecięć należy podać leksykograficznie najmniejsze ( a więc to kt&oacute;re minimalizuje numer mostu na poziomie 1, pośr&oacute;d tych rozwiązań to kt&oacute;re minimalizuje numer mostu poziomie 2 itd., por. przykład ).</p>

### 힌트

<p>(<strong>x<sub>1</sub></strong>,<strong>x<sub>2</sub></strong>,<strong>x<sub>3</sub></strong>) oznacza ustawienie z mostem nr&nbsp;<strong>x<sub>i</sub></strong>&nbsp;na poziomie&nbsp;<strong>i</strong>.</p>

<p>W przypadku ustawień (2,3,1) oraz (3,2,1) liczba przecięć most&oacute;w jest r&oacute;wna 0 i jest oczywiście najmniejsza z możliwych. Spośr&oacute;d tych ustawień najmniejsze leksykograficznie jest ustawienie (2,3,1).</p>