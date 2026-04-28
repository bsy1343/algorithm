# [Silver III] Szlaczek - 8773

[문제 링크](https://www.acmicpc.net/problem/8773)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 43, 맞힌 사람: 25, 정답 비율: 51.020%

### 분류

애드 혹, 수학, 재귀

### 문제 설명

<p>Młodsza siostra Hektora, Kornelia (kt&oacute;rą poznaliśmy w zadaniu&nbsp;<a href="/problem/8841">Zgadywanka</a>) z dystansem podchodzi do zajęć prowadzonych w przedszkolu, do kt&oacute;rego uczęszcza. Przykładowo - wychowawcy w przedszkolu oczekują od niej, że będzie ćwiczyć sprawność posługiwania się pi&oacute;rem rysując w specjalnym zeszycie tak zwane &quot;szlaczki&quot; - powtarzające się wzory. Kornelia uważa to zajęcie za mało ambitne, postanowiła więc je urozmaicić, i rysować wymyślone przez siebie &quot;szlaczki rekurencyjne&quot;.</p>

<p>Szlaczki Kornelii zamiast z graficznych wzor&oacute;w,&nbsp;składają się z liczb naturalnych. Kornelia rozpoczyna je od zapisania dowolnego ciągu liczb naturalnych, przykładowo:</p>

<p>1 2 1 1 1</p>

<p>A następnie do woli dopisuje do już zapisanego fragmentu &quot;szlaczka&quot; ten sam fragment od końca (każdorazowo podwajając długość szlaczka). Dla przykładowego szlaczka, w następnym kroku wyglądałby on tak:</p>

<p>1 2 1 1 1&nbsp;<strong>1 1 1 2 1</strong></p>

<p>Natomiast w kolejnym kroku Kornelia uzyskałaby wz&oacute;r:</p>

<p>1 2 1 1 1 1 1 1 2 1&nbsp;<strong>1 2 1 1 1 1 1 1 2 1</strong></p>

<p>Proces konstrukcji szlaczka można kontynuuować bez końca.</p>

<p>Znając ciąg, od kt&oacute;rego Kornelia rozpoczęła tworzenie szlaczka, oblicz jaka liczba znajdzie się na zadanej pozycji wzoru.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera parę liczb naturalnych&nbsp;<strong>N</strong>&nbsp;i&nbsp;<strong>M</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000, 0 &lt;=&nbsp;<strong>M</strong>&nbsp;&lt;= 1000000000), oznaczających kolejno: długość początkowego ciągu oraz pozycję w wynikowym wzorze.</p>

<p>W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N&nbsp;</strong>oddzielonych spacjami liczb naturalnych&nbsp;<strong>c</strong><strong><sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>c</strong><strong><sub>i</sub>&nbsp;</strong>&lt;=<strong>&nbsp;</strong>1000000)&nbsp;oznaczających kolejne liczby w początkowym ciągu.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać liczbę, kt&oacute;ra znajdzie się na&nbsp;<strong>M</strong>-tej pozycji szlaczka Kornelii, przy czym pozycje w ciągu numerujemy począwszy od zera.</p>