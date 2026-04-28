# [Silver IV] Dziadkowie - 7921

[문제 링크](https://www.acmicpc.net/problem/7921)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 267, 정답: 58, 맞힌 사람: 38, 정답 비율: 17.195%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Dziadek i babcia mają łącznie N lat. Dziadek ma dwa razy tyle, ile babcia miała wtedy, kiedy on miał tyle, ile babcia ma teraz. Ile lat ma babcia?</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba T określająca liczbę zestaw&oacute;w testowych. W kolejnych T liniach znajdują się pojedyncze zestawy testowe. Każdy zestaw testowy składa się z dodatniej całkowitej liczby N oznaczającej sumaryczny wiek staruszk&oacute;w. N jest nie większe niż pewien g&oacute;rny limit G.</p>

### 출력

<p>W kolejnych T liniach wyjścia powinien znajdować się zaokrąglony do jedności wiek babci, chyba że numer testu (licząc od 1) jest podzielny przez liczbę X - wtedy należy wypisać &rdquo;AMPPZ 2010&rdquo; (cudzysł&oacute;w podany jest tylko dla wyr&oacute;żnienia tekstu, na wyjściu nie powinien się pojawić).</p>

### 제한

<ul>
	<li>X - największa liczba, kt&oacute;rej kwadrat i sześcian łącznie są złożone ze wszystkich cyfr od 0 do 9, przy czym każda cyfra występuje dokładnie jeden raz</li>
	<li>G - jest r&oacute;wne 2<sup>2<sup>i</sup></sup>, gdzie i to czwarta liczba od lewej dziewiątego w kolejności leksykograficznej ciągu odpowiadającego takiemu wypełnieniu liczbami 0, 1, ..., 8 kwadratu 3x3, by sumy liczb we wszystkich wierszach i kolumnach były sobie r&oacute;wne (ciągowi a<sub>0</sub>, ..., a<sub>8</sub> odpowiada kwadrat <img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7921.%E2%80%85Dziadkowie/7f8de6ab.png" data-original-src="https://upload.acmicpc.net/a3427994-827d-4459-9d0a-6e89649b4e4a/-/crop/177x106/5,6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 89px; height: 53px;" />)</li>
	<li>T - jest nie większe niż największy dzielnik liczby A=1 000 036 000 099, kt&oacute;ry jest mniejszy od A</li>
</ul>