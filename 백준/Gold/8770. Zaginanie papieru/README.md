# [Gold II] Zaginanie papieru - 8770

[문제 링크](https://www.acmicpc.net/problem/8770)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Hektor bardzo nudzi się na lekcjach, dlatego wymyślił sobie grę, kt&oacute;ra ma zapewnić mu zajęcie. Wyciął pasek papieru i napisał na nim ciąg zer i jedynek (np. 10000101011). Teraz planuje zaginać pasek pomiędzy kolejnymi symbolami tak, aby dało się dopasować zagiętą część do części na kt&oacute;rą się ją zagina. Zasada jest taka, że zera i jedynki z nakładających się fragment&oacute;w muszą się zgadzać. Można więc zagiąć przykładowy pasek 10000101011 pomiędzy trzecim i czwartym symbolem i uzyskać pasek 00101011, lub zagiąć pasek pomiędzy przedostatnim i ostatnim symbolem i uzyskać pasek 1010100001. Zauważmy, że Hektor zawsze zagina pasek z lewej na prawą stronę.&nbsp;</p>

<p>Hektor pragnie zaginać pasek tak (być może wielokrotnie), aby w rezultacie uzyskać jak najkr&oacute;tszy pasek. Na przykład z paska 10011001 można uzyskać pasek 01 zginając najpierw pomiędzy czwartym i piątym symbolem (uzyskujemy 1001), po czym między drugim i trzecim.</p>

<p>Hektor zastanawia się jaka jest najkr&oacute;tsza osiągalna długość paska. Czy potrafisz mu pom&oacute;c?</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba całkowita&nbsp;<strong>t</strong>&nbsp;- liczba zestaw&oacute;w testowych (1 &lt;=&nbsp;<strong>t</strong>&nbsp;&lt;= 20). Następuje&nbsp;<strong>t</strong>&nbsp;opis&oacute;w kolejnych zestaw&oacute;w testowych</p>

<p>Opis pojedynczego zestawu testowego składa się z jednej linii zawierającej opis paska papieru Hektora. Będzie to ciąg zer i jedynek nieoddzielonych żadnymi znakami. Ciąg będzie składał się z co najmniej jednego symbolu i będzie nie dłuższy niż 100.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać jedną liczbę całkowitą - długość najkr&oacute;tszego paska, jaki można uzyskać za pomocą (być może wielokrotnego) zaginania.</p>