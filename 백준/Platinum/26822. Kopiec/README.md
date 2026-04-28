# [Platinum II] Kopiec - 26822

[문제 링크](https://www.acmicpc.net/problem/26822)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

수학, 자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Bajtek, podczas swoich przygotowań do Bajtockiej Olimpiady Informatycznej Junior&oacute;w, natknął się na nową strukturę danych: kopiec binarny.</p>

<p>Kopiec binarny rozmiaru N może być reprezentowany przez tablicę<sup>1</sup> (ciąg) długości N. Kolejne elementy tej tablicy umieszczone są na kolejnych poziomach drzewa binarnego. Węzły tego drzewa numerowane są kolejnymi liczbami naturalnymi od 1 do N włącznie. Węzeł i-ty jest rodzicem węzł&oacute;w o numerach 2i oraz 2i + 1 (o ile te węzły istnieją, czyli o ile ich numer nie przekracza N). Każdy węzeł zawiera element tablicy T: w węźle o numerze i umieszczony jest i-ty element tablicy T. W kopcu musi być zachowana własność, że wartość zapisana w rodzicu węzła nie jest większa od wartości w jego dzieciach.</p>

<p>Poniższy rysunek przedstawia kopiec rozmiaru 6 reprezentowany ciągiem: (1, 2, 4, 6, 3, 5):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/55ebe00a-c792-4526-93d9-43ddd547780f/-/preview/" style="width: 128px; height: 182px;" /></p>

<p>Bajtek zastanawia się czy jego tablica T reprezentuje kopiec. Co więcej, często dokonuje w tablicy zmian: każda taka zmiana polega na wybraniu dw&oacute;ch pozycji x i y w tablicy (x &le; y) oraz wartości z i zwiększeniu każdej z kom&oacute;rek T[x], T[x + 1], . . ., T[y] o z. Wartość z może być ujemna, co efektywnie oznacza zmniejszenie wartości kom&oacute;rek. Bajtek chciałby wiedzieć, po kt&oacute;rych operacjach jego tablica reprezentuje kopiec. Pom&oacute;ż mu.</p>

<p>Napisz program, kt&oacute;ry wczyta zawartość początkową tablicy Bajtka T oraz operacje jakie Bajtek wykonuje na tablicy, wyznaczy po każdej operacji czy zawartość tablicy reprezentuje kopiec i wypisze wyniki na standardowe wyjście.</p>

<hr />
<p><sup>1</sup>Na potrzeby tego zadania zakładamy, że tablice indeksowane są kolejnymi liczbami naturalnymi od 1 do N.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 300 000), określająca rozmiar tablicy. W drugim wierszu znajduje się ciąg N liczb całkowitych T[i] (&minus;10<sup>9</sup> &le; T[i] &le; 10<sup>9</sup>) pooddzielanych pojedynczymi odstępami, oznaczają one kolejne elementy tablicy T. Elementy tablicy są numerowane jak węzły od 1 do N. W trzecim wierszu wejścia znajduje się jedna liczba naturalna Q (0 &le; Q &le; 300 000) określająca liczbę operacji Bajtka na tablicy. W kolejnych Q wierszach znajduje się opis każdej operacji: każda z operacji opisywana jest trzema liczbami x, y oraz z (1 &le; x &le; y &le; N, &minus;10<sup>9</sup> &le; z &le; 10<sup>9</sup>) pooddzielanymi pojedynczymi odstępami. Oznaczają one zwiększenie kom&oacute;rek tablicy o indeksach w przedziale domkniętym [x, y] o z.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście Q + 1 wierszy. W i-tym z nich powinna się znaleźć odpowiedź <code>TAK</code> lub <code>NIE</code>, w zależności od tego, czy po wykonaniu i &minus; 1 pierwszych operacji z wejścia tablica Jasia reprezentuje kopiec.</p>