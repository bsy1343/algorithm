# [Platinum IV] Indiana Jones wśród zombie 2 - 8800

[문제 링크](https://www.acmicpc.net/problem/8800)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 5, 맞힌 사람: 4, 정답 비율: 10.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 최단 경로, 트리

### 문제 설명

<p>W zadaniu &quot;Indiana Jones wśr&oacute;d zombie&quot; przekonaliśmy się jak dla Indiany skończyło się odnalezienie niedziałającego <em>Amuletu Kontroli Ciała i Umysłu</em>. Jak potoczyłyby się jednak losy naszego bohatera, gdyby odnaleziony amulet działał?</p>

<p>Rozważamy labirynt analogiczny do tego w poprzednim zadaniu:</p>

<p><em>Labirynt w kt&oacute;rym znajduje się Indiana ma <strong>N</strong> komnat numerowanych od 1 do <strong>N</strong>. W komnacie numer 1 znajduje się Indiana. W każdej z pozostałych komnat znajduje się początkowo jeden nieumarły. Komnaty połączone są dwukierunkowymi korytarzami.</em></p>

<p><em>Każdej tury każdy z pozostałych przy życiu zombie przesuwa się korytarzem do kolejnej komnaty leżącej na najkr&oacute;tszej drodze łączącej jego aktualną komnatę z komnatą Indiany. Jeśli z komnaty danego zombie nie da się dojść do komnaty Indiany, stoi on w miejscu i jest mu przykro. Jeśli z danej komnaty wychodzi wiele najkr&oacute;tszych dr&oacute;g do komnaty Indiany, znajdujące się tam zombie wybierają ten korytarz, kt&oacute;ry na wejściu został wymieniony jako pierwszy.</em></p>

<p>Tym razem jednak Indiana dysponuje amuletem, kt&oacute;rego właściwości chce wykorzystać do zajęcia nieumarłych walką między sobą (w ramach rywalizacji o możliwość zjedzenia Indiany). Amulet pozwala Indianie wybrać na samym początku dowolną liczbę rozłącznych par nieumarłych i uczynić każdą z par <em>rywalami</em>.</p>

<p>Kiedy tylko w labiryncie dojdzie do sytuacji, w kt&oacute;rej jeden z rywali danej pary stoi w komnacie, w kt&oacute;rej w następnej turze ma się znaleźć drugi rywal danej pary dochodzi do walki (w tym samym momencie, nie w następnej turze). Zombie, kt&oacute;ry jest bardziej oddalony od Indiany orientuje się, że jego rywal prowadzi w wyścigu do zjedzenia Indiany i rzuca się na przeciwnika przez dzielący ich korytarz. Obaj zderzają się głowami i umierają.  </p>

<p>Oblicz maksymalną liczbę rozłącznych par nieumarłych, kt&oacute;re może wybrać Indiana tak, aby pomiędzy każdą z par doszło do walki w opisanej wyżej sytuacji.</p>

<p>Zombie trafiający do komnaty Indiany są natychmiast zabijane uderzeniem amuletem w głowę (i od tego momentu nie mogą walczyć ze swoim rywalem).</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna <strong>Z</strong> ( <strong>Z</strong> = 1 ) oznaczająca liczbę zestaw&oacute;w testowych. W kolejnych liniach opisywane są kolejne zestawy.</p>

<p>W pierwszej linii pojedynczego zestawu testowego znajdują się dwie oddzielone spacjami liczby naturalne <strong>N </strong>i <strong>M </strong>( 1 &lt;= <strong>N</strong>, <strong>M </strong>&lt;= 10<sup>6</sup> ). <strong>N</strong> oznacza liczbę komat w labiryncie, <strong>M</strong> - liczbę korytarzy.</p>

<p>W kolejnych M liniach zestawu znajdują się opisy korytarzy w labiryncie, po jednym na linię. Każdy opis ma postać pary r&oacute;żnych liczb naturalnych <strong>A</strong> i <strong>B</strong> ( 1 &lt;= <strong>A</strong>, <strong>B</strong> &lt;= <strong>N</strong> ), co oznacza istnienie dwukierunkowego korytarza łączącego komnaty <strong>A</strong> i <strong>B</strong>. Każda para komnat jest połączona co najwyżej jednym korytarzem.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać maksymalną liczbę sprowokowanych do walki par zombie.</p>