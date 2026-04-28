# [Gold II] Górnicy - 8859

[문제 링크](https://www.acmicpc.net/problem/8859)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 정렬, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 두 포인터

### 문제 설명

<p>SBP (Super Bogate Państwo) swoje bogactwo zawdzięcza między innymi własnym złożom złota. Chcąc zwiększyć poziom wydobycia kruszca władze państwa postanowiły wprowadzić na stałe przydział g&oacute;rnik&oacute;w do odpowiednich tuneli.</p>

<p>Wszystkie kopalnie SBP są zbudowane według tego samego schematu. Każda kopalnia ma dokładnie jedno wejście i składa się z kom&oacute;r oraz łączących je tuneli. Do każdej z kom&oacute;r prowadzi dokładnie jedna trasa (być może przechodząca wieloma tunelami poprzez inne komory) z wejścia do kopalni. Wydobycie złota odbywa się w tylko komorach połączonych z dokładnie jedną inną komorą. Wiadomo także, że złota nie wydobywa się w komorze wejściowej (nawet jeśli ta łączy się z tylko jedną inną komorą.) Tunele, kt&oacute;rymi połączone są komory mają r&oacute;żne wysokości. G&oacute;rnicy obładowani sprzętem nie mogą się schylać, dlatego też nie zawsze wiadomo czy dany g&oacute;rnik może dojść do wyznaczonej dla niego komory.</p>

<p>Twoim zadaniem jest pom&oacute;c władzom SBP poprzez napisanie programu, kt&oacute;ry wczyta rozkład kom&oacute;r i tuneli w kopalniach, wzrost każdego z g&oacute;rnik&oacute;w i poda ilu maksymalnie g&oacute;rnik&oacute;w jest w stanie wydobywać złoto jednocześnie. W pojedynczej komorze może pracować tylko jeden g&oacute;rnik.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się pojedyncza liczba&nbsp;<strong>T&nbsp;</strong>(1&lt;=<strong>T</strong>&lt;=5) oznaczająca liczbę zestaw&oacute;w danych. W kolejnych liniach znajdują się opisy zestaw&oacute;w danych. Pierwsza linia opisu zestawu danych zawiera dwie liczby całkowite&nbsp;<strong>n</strong>,&nbsp;<strong>k</strong>&nbsp;(3&lt;=<strong>n</strong>&lt;=200000, 1&lt;=<strong>k</strong>&lt;=<strong>n</strong>) oznaczające liczbę kom&oacute;r w kopalni (komory są ponumerowane od 1 do&nbsp;<strong>n</strong>) oraz numer komory wejściowej. W kolejnych&nbsp;<strong>n</strong>-1 liniach znajdują się opisy tuneli. Pojedynczy opis tunelu składa z trzech liczb całkowitych&nbsp;<strong>a</strong>,<strong>b</strong>,<strong>c</strong>&nbsp;(1&lt;=<strong>a</strong>&lt;<strong>b</strong>&lt;=<strong>n</strong>, 1&lt;=<strong>c</strong>&lt;=1000). Liczby te oznaczają, że komory o numerach<strong>&nbsp;a</strong>&nbsp;i&nbsp;<strong>b</strong>&nbsp;są połączone tunelem o wysokości&nbsp;<strong>c</strong>. Żadna para nie pojawi się na wejściu więcej niż jeden raz. Kolejny wiersz opisu danych zawiera jedną liczbę całkowitą&nbsp;<strong>m</strong>&nbsp;(1&lt;=<strong>m</strong>&lt;=200000) oznaczającą liczbę g&oacute;rnik&oacute;w pracujących dla tej kopalni. Następny wiersz zawiera&nbsp;<strong>m</strong>&nbsp;liczb dodatnich nie większych od 1000 oznaczających wzrosty kolejnych g&oacute;rnik&oacute;w.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać&nbsp;<strong>T</strong>&nbsp;linii. W i-tej z nich powinna znajdować się odpowiedź dla i-tego zestawu danych - maksymalna liczba g&oacute;rnik&oacute;w, kt&oacute;ra może jednocześnie pracować w kopalni. G&oacute;rnicy mogą przechodzić tylko tunelami o wysokości większej lub r&oacute;wnej swojemu wzrostowi.</p>