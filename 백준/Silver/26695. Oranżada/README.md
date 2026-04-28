# [Silver III] Oranżada - 26695

[문제 링크](https://www.acmicpc.net/problem/26695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 32, 맞힌 사람: 19, 정답 비율: 65.517%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bajtabasz lubi siedzieć w domu. W końcu mamy środek pandemii &ndash; należy zachowywać dystans społeczny. Podczas wieczor&oacute;w spędzanych przed komputerem, jego ulubionym zajęciem, zaraz obok grania w Byte Defence 3 i rozwiązywania zadań ze starych edycji Potyczek Algorytmicznych, jest picie oranżady. W piwnicy Bajtabasza znajduje się długa p&oacute;łka, na kt&oacute;rej ułożonych w rzędzie stoi n butelek oranżady. Każda z butelek jest pewnej marki, kt&oacute;re oznaczamy liczbami całkowitymi. Piwnica jest ciasna i ma śliską podłogę, więc nierozważnie byłoby chodzić tam i z powrotem z butelkami w rękach &ndash; jeszcze kt&oacute;raś by się rozbiła. Z tego względu jedyne, co Bajtabasz może robić, to zamieniać miejscami dwie sąsiednie butelki. Każda taka zamiana zajmuje mu jedną sekundę. Czas poruszania się wzdłuż p&oacute;łki jest pomijalny.</p>

<p>Na dzisiejszy wiecz&oacute;r Bajtabasz zaprosił Bajtolinę na wsp&oacute;lną degustację oranżady. Żeby uświetnić to wydarzenie chciałby, żeby k skrajnie lewych butelek na p&oacute;łce było r&oacute;żnych marek.</p>

<p>Bajtabasz ma mało czasu &ndash; musi jeszcze posprzątać cały sw&oacute;j dom &ndash; dlatego chciałby przearanżować oranżadową p&oacute;łkę najszybciej, jak to się tylko da. Pom&oacute;ż mu w tym zadaniu!</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n i k (1 &le; n &le; 5&middot;10<sup>5</sup>; 1 &le; k &le; n)<sup>&lowast;</sup>, oznaczające odpowiednio liczbę butelek na p&oacute;łce oraz liczbę skrajnie lewych butelek, kt&oacute;re muszą być r&oacute;żnych marek, aby uszczęśliwić Bajtabasza.</p>

<p>W drugim wierszu wejścia znajduje się ciąg n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, . . . , a<sub>n</sub>, (1 &le; a<sub>i</sub> &le; n), gdzie a<sub>i</sub> oznacza markę i-tej od lewej butelki znajdującej się na p&oacute;łce w piwnicy Bajtabasza.</p>

<hr />
<p><sup>&lowast;</sup>Tak ogromna liczba butelek może zadziwić tylko tych, kt&oacute;rzy nie wiedzą, że Bajtabasz w czasach swojej młodości był wielokrotnym mistrzem Bajtocji w piciu oranżady na czas.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną liczbę sekund, po kt&oacute;rych pierwsze k butelek będzie parami r&oacute;żne, lub &minus;1, jeśli nie da się doprowadzić do takiej sytuacji.</p>

### 힌트

<p>Wyjaśnienie przykładu: W pierwszym teście przykładowym możliwy ciąg zamian to:</p>

<ul>
	<li>3, 3, 3, 1, 2 &ndash; ustawienie początkowe,</li>
	<li>3, 3, 1, 3, 2 &ndash; zamiana butelek na pozycjach 3 i 4,</li>
	<li>3, 3, 1, 2, 3 &ndash; zamiana butelek na pozycjach 4 i 5,</li>
	<li>3, 1, 3, 2, 3 &ndash; zamiana butelek na pozycjach 2 i 3,</li>
	<li>3, 1, 2, 3, 3 &ndash; zamiana butelek na pozycjach 3 i 4.</li>
</ul>

<p>Nie da się w mniej niż 4 sekundy sprawić, że pierwsze trzy butelki będą r&oacute;żnych marek.</p>

<p>W drugim teście przykładowym wszystkie trzy oranżady są tej samej marki, nie możemy więc sprawić, że pierwsze dwie będą r&oacute;żnych marek.</p>