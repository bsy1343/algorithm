# [Gold III] Komputery trzybitowe - 8505

[문제 링크](https://www.acmicpc.net/problem/8505)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

애드 혹

### 문제 설명

<p>Naukowcy w Kr&oacute;lestwie Bajtlandii postanowili stworzyć nowy rodzaj komputer&oacute;w, a mianowice komputery trzybitowe (KTB). Powszechnie uważa się, że ten nowy rodzaj komputer&oacute;w pozwoli rozwiązać wiele problem&oacute;w zbyt trudnych dla klasycznych komputer&oacute;w. Niestety, w trakcie prac naukowcy napotkali wiele trudności technicznych. Twoim zadaniem jest pom&oacute;c im w przezwyciężeniu jednej z nich.</p>

<p>Naukowcy zajmują się aktualnie procedurami inicjalizacji pamięci komputera. Komputer KTB posiada n bit&oacute;w pamięci ponumerowanych liczbami 1,&hellip;,n. Każdy bit może przyjmować jedną z trzech wartości a,b,c lub być w stanie niezainicjalizowanym. Komputer KTB udostępnia następujące operacje inicjalizujące:</p>

<ul>
	<li>dw&oacute;m kolejnym niezainicjalizowanym bitom można przypisać dwie r&oacute;żne wartości,</li>
	<li>dw&oacute;m kolejnym bitom, z kt&oacute;rych jeden jest niezainicjalizowany, a drugi ma wartość x, można przypisać dwie r&oacute;żne wartości, przy czym obie muszą być r&oacute;żne od x.</li>
</ul>

<p>Oto przykładowa sekwencja inicjalizacji pamięci dla n=4: uuuu -&gt; uuab -&gt; ucbb -&gt; babb, gdzie u oznacza bit niezainicjalizowany.</p>

<p>Zadanie</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta wartości, kt&oacute;rymi ma być zainicjalizowana pamięć,</li>
	<li>sprawdzi czy taka inicjalizacja jest możliwa,</li>
	<li>wypisze znalezioną odpowiedź.</li>
</ul>

### 입력

<p>Standardowe wejście może zawierać opisy od 1 do 10 konfiguracji pamięci, kt&oacute;re chcemy uzyskać. Pierwszy wiersz wejścia zawiera pojedynczą liczbę całkowitą - liczbę konfiguracji. W kolejnych wierszach znajdują się opisy konfiguracji. Opis jednej konfiguracji składa się z dw&oacute;ch wierszy. Pierwszy wiersz zawiera pojedynczą liczbę całkowitą &nbsp;l<sub>i</sub>, (1 &le; l<sub>i</sub> &le; 100000), rozmiar pamięci dla i-tej konfiguracji. Drugi wiersz zawiera ciąg długości l<sub>i</sub> składający się z liter a,b,c - ciąg ten opisuje konfigurację, kt&oacute;rą chcemy uzyskać.</p>

<p>&nbsp;</p>

### 출력

<p>Standardowe wyjście powinno zawierać N wierszy, po jednym dla każdej konfiguracji pamięci. i-ty wiersz powinien zawierać pojedyncze słowo TAK, jeśli inicjalizacja jest możliwa, w przeciwnym przypadku NIE.</p>

<p>&nbsp;</p>