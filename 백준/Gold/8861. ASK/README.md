# [Gold V] ASK - 8861

[문제 링크](https://www.acmicpc.net/problem/8861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 20, 맞힌 사람: 17, 정답 비율: 56.667%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Na zajęciach z Architektury System&oacute;w Komputerowych, Paweł przygotował nowy model pamięci operacyjnej, kt&oacute;ry wspiera szybkie operacje bitowe wykonywane na całej zawartości pamięci. W modelu Pawła, bity stanowią pojedynczy ciąg zerojedynkowy. Zmiana zawartości pamięci realizowana jest poprzez użycie specjalnej elektrody. Jej działanie polega na wybraniu pojedynczego bitu oraz kierunku działania (lewo lub prawo), a następnie zanegowaniu każdej wartości bitu idąc w odpowiednią stronę, aż do końca lub początku pamięci. Przykładowo, jeżeli zawartość pamięci to 0010, to wybierając drugi bit i prawy kierunek elektroda zmieni ją na 0101 - drugi bit zmieniany jest z 0 na 1, trzeci bit z 1 na zero, czwarty bit z 0 na 1.</p>

<p>Paweł chce przetestować skuteczność swojego rozwiązania. W tym celu potrzebuje programu, kt&oacute;ry mając jako dane początkową i końcową zawartość pamięci, policzy minimalną liczbę operacji potrzebnych do przekształcenia jednej zawartości pamięci w drugą. Twoim zadaniem jest pom&oacute;c Pawłowi i napisać dla niego odpowiedni program.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba całkowita&nbsp;<strong>n</strong>&nbsp;(1&lt;=<strong>n</strong>&lt;=1000000). W drugiej linii znajduje się binarny,&nbsp;<strong>n</strong>-elementowy ciąg - jest to początkowa zawartość pamięci. W trzeciej linii znajduje się binarny,&nbsp;<strong>n</strong>-elementowy ciąg - jest to docelowa zawartość pamięci.</p>

### 출력

<p>W pierwszej i jedynej linii Tw&oacute;j program powinien wypisać jedną liczbę - minimalną liczbę operacji potrzebną do zamiany początkowej zawartości pamięci w docelową.</p>

### 힌트

<p>Możliwe 4 operacje to: 10010000 -&gt;&nbsp;<strong>0110</strong>0000 -&gt;&nbsp;<strong>10</strong>100000 -&gt;&nbsp;<strong>0</strong>0100000 -&gt; 00100<strong>111</strong></p>