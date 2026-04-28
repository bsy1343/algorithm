# [Silver III] Drzewko - 8680

[문제 링크](https://www.acmicpc.net/problem/8680)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 132, 정답: 72, 맞힌 사람: 48, 정답 비율: 51.064%

### 분류

수학, 트리, 비트마스킹

### 문제 설명

<p>Mamy dane drzewko binarne o wysokości <em>h</em>&nbsp;(jak na rysunku):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8bdfa480-c0f2-4f99-b308-42abd16604fb/-/preview/" /><br />
&nbsp;</p>

<p>Każda krawędź może być zamknięta bądź otwarta. Początkowo otwarte są wszystkie lewe krawędzie (zaznaczone linią przerywaną). Adrianek zrzuca po kolei&nbsp;<em>n</em>&nbsp;piłeczek, poczynając od wierzchołka startowego, kt&oacute;ry jest korzeniem drzewa. Każda piłeczka zawsze leci przez otwartą krawędź, a następnie zmienia ją na zamkniętą oraz otwiera sąsiednią krawędź (gdy otwarta jest lewa krawędź, to zamykamy lewą i otwieramy prawą, a gdy otwarta jest prawa, to zamykamy prawą i otwieramy lewą).</p>

<p>Adrianek zastanawia się, do kt&oacute;rego wierzchołka (ponumerowanego od 0&nbsp;do 2<em><sup>h</sup></em> - 1) spadnie <em>n</em>-ta piłeczka.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite <em>n</em>, <em>h</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>8</sup>, 0 &le; <em>h</em> &le; 30), oznaczające odpowiednio liczbę piłeczek zrzucanych przez Adrianka oraz wysokość drzewka binarnego.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną numerze wierzchołka, do kt&oacute;rego spadnie <em>n</em>-ta piłeczka.</p>

### 힌트

<p>Piłeczki będą spadały kolejno do wierzchołk&oacute;w o numerach: 0, 2, 1, 3.</p>