# [Silver I] Spacery po drzewie binarnym - 26784

[문제 링크](https://www.acmicpc.net/problem/26784)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 33, 맞힌 사람: 25, 정답 비율: 96.154%

### 분류

수학, 그래프 이론, 트리, 최소 공통 조상

### 문제 설명

<p>Przypomnijmy jak wygląda drzewo binarne. Węzły tego drzewa będziemy numerowali kolejnymi liczbami naturalnymi od 1, idąc kolejnymi poziomami od g&oacute;ry do dołu poczynając od korzenia (wierzchołka na samej g&oacute;rze), a na każdym poziomie od lewej do prawej:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26784.%E2%80%85Spacery%E2%80%85po%E2%80%85drzewie%E2%80%85binarnym/373e18dc.png" data-original-src="https://upload.acmicpc.net/b47946e7-1262-4f05-8d3e-303f8a3f94c5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 443px; height: 254px;" /></p>

<p style="text-align: center;">Drzewo binarne narysowane do węzła nr 18. Zwr&oacute;ć uwagę, że drzewo ma więcej niż 18 węzł&oacute;w.</p>

<p>W tym zadaniu będziemy rozpatrywali najkr&oacute;tsze ścieżki pomiędzy dwoma węzłami. Przykładowo, najkr&oacute;tsza ścieżka między węzłami numer 8 oraz 5 ma trzy krawędzie i przebiega przez węzły 4 oraz 2.</p>

<p>Napisz program, kt&oacute;ry wczyta zapytania dotyczące ścieżek pomiędzy dwoma węzłami drzewa, dla każdego z nich wyznaczy długość najkr&oacute;tszej ścieżki między tymi węzłami i wypisze wyniki na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna Q (1 &le; Q &le; 100 000), określająca liczbę zapytań. W kolejnych Q wierszach znajdują się zapytania, po jednym w wierszu. Opis każdego zapytania składa się z dw&oacute;ch liczb naturalnych A<sub>i</sub> oraz B<sub>i</sub> (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; 10<sup>18</sup>), oddzielonych pojedynczym odstępem i określających numery węzł&oacute;w, dla kt&oacute;rych należy wyznaczyć ścieżkę.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście Q wierszy. W i-tym z nich powinna się znaleźć liczba całkowita &ndash; liczba krawędzi, kt&oacute;re należy pokonać, aby przedostać się w drzewie z węzła o numerze A<sub>i</sub> do węzła B<sub>i</sub>.</p>