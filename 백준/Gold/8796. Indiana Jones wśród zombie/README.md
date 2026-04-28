# [Gold V] Indiana Jones wśród zombie - 8796

[문제 링크](https://www.acmicpc.net/problem/8796)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 128 MB

### 통계

제출: 64, 정답: 39, 맞힌 사람: 28, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Indiana Jones z mieszanym szczęściem zakończył poszukiwania&nbsp;<em>Amuletu Kontroli Ciała i Umysłu</em>. Szczęście polega na tym, że udało mu się odnaleźć amulet. Nieszczęście polega na tym, że labirynt w kt&oacute;rym się znajduje jest pełen zombie a amulet, kt&oacute;rego planował użyć do ich pokonania, nie działa. Indiana będzie musiał skorzystać ze starej metody walki z nieumarłymi - strzelania do nich z bliskiej odległości z rewolweru Smith and Wesson.</p>

<p>Labirynt w kt&oacute;rym znajduje się Indiana ma&nbsp;<strong>N</strong>&nbsp;komnat numerowanych od 1 do&nbsp;<strong>N</strong>. W komnacie numer 1 znajduje się Indiana. W każdej z pozostałych komnat znajduje się początkowo jeden nieumarły. Komnaty połączone są dwukierunkowymi korytarzami.</p>

<p>Każdej tury każdy z pozostałych przy życiu zombie przesuwa się korytarzem do kolejnej komnaty leżącej na najkr&oacute;tszej drodze łączącej jego aktualną komnatę z komnatą Indiany. Jeśli z komnaty danego zombie nie da się dojść do komnaty Indiany, stoi on w miejscu i jest mu przykro. Jeśli z danej komnaty wychodzi wiele najkr&oacute;tszych dr&oacute;g do komnaty Indiany, znajdujące się tam zombie wybierają ten korytarz, kt&oacute;ry na wejściu został wymieniony jako pierwszy.</p>

<p>Rewolwer Indiany ma bębenek mieszczący&nbsp;<strong>K</strong>&nbsp;naboj&oacute;w. Jeśli danej tury w komnacie Indiany pojawi się co najwyżej&nbsp;<strong>K</strong>&nbsp;zombie, Indiana je zastrzeli. W przeciwnym wypadku zostanie zjedzony i będzie mu przykro.</p>

<p>Sprawdź, czy Indiana wyjdzie cało z tej przygody a jeśli nie - oblicz w kt&oacute;rej minucie zostanie zjedzony.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. W kolejnych liniach opisywane są kolejne zestawy.</p>

<p>W pierwszej linii pojedynczego zestawu testowego znajdują się trzy oddzielone spacjami liczby naturalne&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>&nbsp;i&nbsp;<strong>K</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>,&nbsp;<strong>K</strong>&nbsp;&lt;= 10<sup>6</sup>&nbsp;).&nbsp;<strong>N</strong>&nbsp;oznacza liczbę komat w labiryncie,&nbsp;<strong>M</strong>&nbsp;- liczbę korytarzy,&nbsp;<strong>K</strong>&nbsp;- pojemność bębenka rewolweru Indiany.</p>

<p>W kolejnych M liniach zestawu znajdują się opisy korytarzy w labiryncie, po jednym na linię. Każdy opis ma postać pary r&oacute;żnych liczb naturalnych&nbsp;<strong>A</strong>&nbsp;i&nbsp;<strong>B</strong>&nbsp;( 1 &lt;=&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>&nbsp;&lt;=&nbsp;<strong>N</strong>&nbsp;), co oznacza istnienie dwukierunkowego korytarza łączącego komnaty&nbsp;<strong>A</strong>&nbsp;i&nbsp;<strong>B</strong>. Każda para komnat jest połączona co najwyżej jednym korytarzem.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać w kt&oacute;rej turze Indiana zostanie zjedzony ( zombie wykonują pierwszy ruch w turze 1 ), lub napis &quot;hurray!&quot;, jeśli Indiana przeżyje.</p>